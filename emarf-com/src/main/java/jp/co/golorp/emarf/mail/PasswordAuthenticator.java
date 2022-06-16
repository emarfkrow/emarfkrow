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

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;

/**
 * メールサーバの認証情報
 *
 * @author golorp
 */
public final class PasswordAuthenticator extends Authenticator {

    /** ログインID */
    private String userName;

    /** パスワード */
    private String password;

    /**
     * @param p1 ログインID
     * @param p2 パスワード
     */
    public PasswordAuthenticator(final String p1, final String p2) {
        this.userName = p1;
        this.password = p2;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.userName, this.password);
    }

}
