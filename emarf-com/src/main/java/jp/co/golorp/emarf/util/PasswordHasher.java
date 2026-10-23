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
package jp.co.golorp.emarf.util;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

/**
 * パスワードハッシュ
 */
public final class PasswordHasher {

    /***/
    private static final int ITERATIONS = 3;
    /***/
    private static final int MEMORY_KB = 65536; // 64 MiB
    /***/
    private static final int PARALLELISM = 1;

    /***/
    private PasswordHasher() {
    }

    /**
     * パスワードをArgon2idでハッシュ化する。
     * @param password パスワード
     * @return ハッシュ化されたパスワード
     */
    public static String hash(final String password) {

        if (password == null) {
            throw new IllegalArgumentException("password must not be null");
        }

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

        char[] passwordChars = password.toCharArray();

        try {
            return argon2.hash(ITERATIONS, MEMORY_KB, PARALLELISM, passwordChars);
        } finally {
            argon2.wipeArray(passwordChars);
        }
    }

    /**
     * 入力されたパスワードと保存済みハッシュを比較する。
     * @param encodedHash 保存済みハッシュ
     * @param password 入力されたパスワード
     * @return true:一致 false:不一致
     */
    public static boolean verify(final String encodedHash, final String password) {

        if (encodedHash == null || password == null) {
            return false;
        }

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

        char[] passwordChars = password.toCharArray();

        try {
            return argon2.verify(encodedHash, passwordChars);
        } finally {
            argon2.wipeArray(passwordChars);
        }
    }
}
