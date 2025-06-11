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

/**
 * 楽観ロック排他エラー
 *
 * @author golorp
 */
public class OptLockError extends AppError {

    /**
     * @param msgId メッセージID
     */
    public OptLockError(final String msgId) {
        super(msgId);
    }

    /**
     * @param msgId メッセージID
     * @param e 例外
     */
    public OptLockError(final String msgId, final Throwable e) {
        super(msgId, e);
    }

}
