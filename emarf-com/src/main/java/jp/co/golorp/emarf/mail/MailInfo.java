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

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * メール内容
 *
 * @author golorp
 */
public class MailInfo {

    /** TO */
    private Map<String, String> to = new LinkedHashMap<String, String>();

    /** CC */
    private Map<String, String> cc = new LinkedHashMap<String, String>();

    /** BCC */
    private Map<String, String> bcc = new LinkedHashMap<String, String>();

    /** 件名 */
    private String subject;

    /** メール内容 */
    private Map<String, Boolean> contents = new LinkedHashMap<String, Boolean>();

    /**
     * @return TO
     */
    public Map<String, String> getTo() {
        return to;
    }

    /**
     * @param p TO
     */
    public void setTo(final Map<String, String> p) {
        this.to = p;
    }

    /**
     * @param address メールアドレス
     * @param personal 送信先名称
     */
    public void addTo(final String address, final String personal) {
        this.to.put(address, personal);
    }

    /**
     * @return CC
     */
    public Map<String, String> getCc() {
        return cc;
    }

    /**
     * @param p CC
     */
    public void setCc(final Map<String, String> p) {
        this.cc = p;
    }

    /**
     * @param address メールアドレス
     * @param personal 送信先名称
     */
    public void addCc(final String address, final String personal) {
        this.cc.put(address, personal);
    }

    /**
     * @return BCC
     */
    public Map<String, String> getBcc() {
        return bcc;
    }

    /**
     * @param p BCC
     */
    public void setBcc(final Map<String, String> p) {
        this.bcc = p;
    }

    /**
     * @param address メールアドレス
     * @param personal 送信先名称
     */
    public void addBcc(final String address, final String personal) {
        this.bcc.put(address, personal);
    }

    /**
     * @return 件名
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param p 件名
     */
    public void setSubject(final String p) {
        this.subject = p;
    }

    /**
     * @return メール内容
     */
    public Map<String, Boolean> getContents() {
        return contents;
    }

    /**
     * @param p メール内容
     */
    public void setContents(final Map<String, Boolean> p) {
        this.contents = p;
    }

    /**
     * メール内容に本文を設定
     * @param text 本文
     */
    public void addText(final String text) {
        this.contents.put(text, false);
    }

    /**
     * メール内容に添付ファイルを設定
     * @param filePath 添付ファイルパス
     */
    public void addFile(final String filePath) {
        this.contents.put(filePath, true);
    }

}
