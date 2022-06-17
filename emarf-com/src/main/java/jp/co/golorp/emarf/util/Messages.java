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

import java.util.Map;

import jp.co.golorp.emarf.messageresolver.MessageResolver;

/**
 * メッセージ管理クラス
 *
 * @author golorp
 */
public final class Messages {

    /** プライベートコンストラクタ */
    private Messages() {
    }

    /**
     * メッセージ取得
     * @param msgId メッセージID
     * @param args 置換文字列
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
