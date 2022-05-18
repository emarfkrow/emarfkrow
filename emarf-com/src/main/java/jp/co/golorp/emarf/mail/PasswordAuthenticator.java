package jp.co.golorp.emarf.mail;

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;

public class PasswordAuthenticator extends Authenticator {

    /***/
    private String userName;

    /***/
    private String password;

    /**
     * @param p1
     *            userName
     * @param p2
     *            password
     */
    public PasswordAuthenticator(final String p1, final String p2) {
        this.userName = p1;
        this.password = p2;
    }

    /**
     *
     */
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.userName, this.password);
    }

}
