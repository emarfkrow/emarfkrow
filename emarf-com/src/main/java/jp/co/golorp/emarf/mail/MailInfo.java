package jp.co.golorp.emarf.mail;

import java.util.LinkedHashMap;
import java.util.Map;

public class MailInfo {

    /** TO */
    private Map<String, String> to = new LinkedHashMap<String, String>();

    /** CC */
    private Map<String, String> cc = new LinkedHashMap<String, String>();

    /** BCC */
    private Map<String, String> bcc = new LinkedHashMap<String, String>();

    /** 件名 */
    private String subject;

    /** 本文 */
    private Map<String, Boolean> contents = new LinkedHashMap<String, Boolean>();

    /**
     * @return TO
     */
    public Map<String, String> getTo() {
        return to;
    }

    /**
     * @param p
     *            TO
     */
    public void setTo(final Map<String, String> p) {
        this.to = p;
    }

    /**
     * @param address
     *            address
     * @param personal
     *            personal
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
     * @param p
     *            CC
     */
    public void setCc(final Map<String, String> p) {
        this.cc = p;
    }

    /**
     * @param address
     *            address
     * @param personal
     *            personal
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
     * @param p
     *            BCC
     */
    public void setBcc(final Map<String, String> p) {
        this.bcc = p;
    }

    /**
     * @param address
     *            address
     * @param personal
     *            personal
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
     * @param p
     *            件名
     */
    public void setSubject(final String p) {
        this.subject = p;
    }

    /**
     * @return 本文
     */
    public Map<String, Boolean> getContents() {
        return contents;
    }

    /**
     * @param p
     *            本文
     */
    public void setContents(final Map<String, Boolean> p) {
        this.contents = p;
    }

    /**
     * @param text
     *            text
     */
    public void addText(final String text) {
        this.contents.put(text, false);
    }

    /**
     * @param filePath
     *            filename
     */
    public void addFile(final String filePath) {
        this.contents.put(filePath, true);
    }
}
