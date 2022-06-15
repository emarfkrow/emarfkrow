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

package jp.co.golorp.emarf.exception;

import jp.co.golorp.emarf.util.Messages;

/**
 * システムエラー
 *
 * @author golorp
 */
public class SysError extends RuntimeException {

    /**
     * @param msgId メッセージID
     */
    public SysError(final String msgId) {
        super(Messages.get(msgId));
    }

    /**
     * @param msgId メッセージID
     * @param args 置換文字列
     */
    public SysError(final String msgId, final String... args) {
        super(Messages.get(msgId, args));
    }

    /**
     * @param e 起源となるシステムエラー
     */
    public SysError(final Exception e) {
        super(e);
    }

}
