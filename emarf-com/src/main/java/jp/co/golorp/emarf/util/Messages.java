package jp.co.golorp.emarf.util;

import java.util.Map;

import jp.co.golorp.emarf.messageresolver.MessageResolver;

/**
 * @author toshiyuki
 *
 */
public final class Messages {

    private Messages() {
    }

    /**
     * メッセージ取得
     *
     * @param msgId
     * @param args
     * @return 置換済みメッセージ文字列
     */
    public static String get(final String msgId, final String... args) {

        Map<String, String> msgs = MessageResolver.getMessages();

        String msg = msgs.get(msgId);

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            msg = msg.replaceAll("\\{" + i + "\\}", arg);
        }

        return msg;
    }

}
