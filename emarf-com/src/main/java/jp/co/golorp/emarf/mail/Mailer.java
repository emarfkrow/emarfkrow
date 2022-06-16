/*
Copyright 2022 golorp

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package jp.co.golorp.emarf.mail;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.activation.DataHandler;
import jakarta.activation.FileDataSource;
import jakarta.mail.Authenticator;
import jakarta.mail.Folder;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Multipart;
import jakarta.mail.Session;
import jakarta.mail.Store;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMessage.RecipientType;
import jakarta.mail.internet.MimeMultipart;
import jakarta.mail.internet.MimeUtility;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.time.LocalDateTime;

/**
 * メール送受信
 *
 * @author golorp
 */
public final class Mailer {

    /** ロガー */
    private static final Logger LOG = LoggerFactory.getLogger(Mailer.class);

    /** メール設定 */
    private static final ResourceBundle MAILER = ResourceBundle.getBundle(Mailer.class.getSimpleName());

    /** アカウント */
    private static final String USERNAME = MAILER.getString("username");

    /** パスワード */
    private static final String PASSWORD = MAILER.getString("password");

    /*
     * 送信用設定
     */

    /** 文字コード */
    private static final String CHARSET = MAILER.getString("charset");

    /** 送信者名 */
    private static final String PERSONAL = MAILER.getString("personal");

    /** 送信用プロパティ */
    private static final Properties SEND_PROPERTIES = new Properties();
    static {
        try {
            SEND_PROPERTIES.load(Mailer.class.getResourceAsStream("/" + Mailer.class.getSimpleName() + ".properties"));
            SEND_PROPERTIES.put("mail.smtp.debug", LOG.isDebugEnabled());
        } catch (IOException e) {
            throw new SysError(e);
        }
    }

    /*
     * 受信用設定
     */

    /** 受信プロトコル */
    private static final String STORE = MAILER.getString("mail.store.protocol");

    /** 受信サーバのフォルダ名 */
    private static final String FOLDER = MAILER.getString("folder");

    /** 受信用プロパティ */
    private static final Properties RECV_PROPERTIES = new Properties();
    static {
        try {
            RECV_PROPERTIES.load(Mailer.class.getResourceAsStream("/" + Mailer.class.getSimpleName() + ".properties"));
        } catch (IOException e) {
            throw new SysError(e);
        }
    }

    /** プライベートコンストラクタ */
    private Mailer() {
    }

    /**
     * メール送信
     * @param mi MailInfo
     */
    public static void send(final MailInfo mi) {

        Session session = Session.getInstance(SEND_PROPERTIES, getAuthenticator());
        session.setDebug(LOG.isDebugEnabled());

        try {

            /*
             * MailInfoをjavax.mailの部品にコピー
             */

            MimeMessage m = new MimeMessage(session);

            // 送信者
            m.setFrom(new InternetAddress(Mailer.USERNAME, Mailer.PERSONAL));

            // 送信先
            m.setRecipients(RecipientType.TO, toArrayAddress(mi.getTo()));

            // CCアドレス
            if (mi.getCc() != null) {
                m.setRecipients(RecipientType.CC, toArrayAddress(mi.getCc()));
            }

            // BCCアドレス
            if (mi.getBcc() != null) {
                m.setRecipients(RecipientType.BCC, toArrayAddress(mi.getBcc()));
            }

            // 送信日
            m.setSentDate(LocalDateTime.date());

            // タイトル
            m.setSubject(mi.getSubject(), CHARSET);

            // 内容・添付ファイル
            Multipart mp = new MimeMultipart();
            for (Entry<String, Boolean> content : mi.getContents().entrySet()) {
                String s = content.getKey();
                Boolean isFile = content.getValue();
                if (isFile) {
                    mp.addBodyPart(getFileMimeBodyPart(s));
                } else {
                    mp.addBodyPart(getTextMimeBodyPart(s));
                }
            }
            m.setContent(mp);

            // メール送信
            Transport.send(m);

        } catch (MessagingException | UnsupportedEncodingException e) {
            LOG.warn(e.getMessage());
        }
    }

    /**
     * メール受信（調整中）
     */
    public static void recv() {

        Session session = Session.getInstance(RECV_PROPERTIES, getAuthenticator());
        session.setDebug(LOG.isDebugEnabled());

        try {

            Store store = session.getStore(STORE);
            store.connect();

            Folder folder = store.getFolder(FOLDER);
            folder.open(Folder.READ_ONLY);

            Message[] msgs = folder.getMessages();
            for (Message msg : msgs) {
                System.out.println("---------------------------------");
                System.out.println("Email Number " + msg.getMessageNumber());
                System.out.println("Subject: " + msg.getSubject());
                System.out.println("From: " + msg.getFrom()[0]);
                System.out.println("Text: " + msg.getContent().toString());
                System.out.println("Date: " + msg.getSentDate());
            }

        } catch (MessagingException | IOException e) {
            LOG.warn(e.getMessage());
        }
    }

    /**
     * @return メールサーバー用の認証情報
     */
    private static Authenticator getAuthenticator() {
        return new PasswordAuthenticator(Mailer.USERNAME, Mailer.PASSWORD);
    }

    /**
     * @param addressMap メールアドレス：送信先名のマップ
     * @return InternetAddress[]に変換
     */
    private static InternetAddress[] toArrayAddress(final Map<String, String> addressMap) {

        InternetAddress[] addresses = new InternetAddress[addressMap.size()];

        int i = 0;

        for (Entry<String, String> sendto : addressMap.entrySet()) {

            String address = sendto.getKey();
            String personal = sendto.getValue();

            try {
                addresses[i] = new InternetAddress(address, personal);
            } catch (UnsupportedEncodingException e) {
                LOG.warn(e.getMessage());
            }
            i++;
        }

        return addresses;
    }

    /**
     * @param filePath 添付ファイルのサーバ上パス
     * @return 添付ファイルを設定したMimeBodyPart
     */
    private static MimeBodyPart getFileMimeBodyPart(final String filePath) {

        MimeBodyPart mbp = new MimeBodyPart();

        FileDataSource fds = new FileDataSource(filePath);

        try {

            mbp.setDataHandler(new DataHandler(fds));

            mbp.setFileName(MimeUtility.encodeWord(fds.getName()));

        } catch (MessagingException | UnsupportedEncodingException e) {
            throw new SysError(e);
        }

        return mbp;
    }

    /**
     * @param text メール本文
     * @return 本文を設定したMimeBodyPart
     */
    private static MimeBodyPart getTextMimeBodyPart(final String text) {

        MimeBodyPart mbp = new MimeBodyPart();

        try {
            mbp.setText(text, CHARSET);
        } catch (MessagingException e) {
            throw new SysError(e);
        }

        return mbp;
    }

}
