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

import java.util.LinkedHashMap;
import java.util.Map;

import jp.co.golorp.emarf.util.Messages;

/**
 * アプリケーションエラー
 *
 * @author golorp
 */
public class AppError extends RuntimeException {

    /** エラー内容 */
    private Map<String, String> errors = new LinkedHashMap<String, String>();

    /**
     * @return エラー内容
     */
    public Map<String, String> getErrors() {
        return errors;
    }

    /**
     * @param map エラー内容
     */
    public void setErrors(final Map<String, String> map) {
        this.errors = map;
    }

    /**
     * @param map エラー内容
     */
    public AppError(final Map<String, String> map) {
        super();
        this.errors = map;
    }

    /**
     * @param msgId メッセージID
     */
    public AppError(final String msgId) {
        super(Messages.get(msgId));
    }

    /**
     * @param msgId メッセージID
     * @param e 例外
     */
    public AppError(final String msgId, final Throwable e) {
        super(Messages.get(msgId), e);
    }

    /**
     * @param msgId メッセージID
     * @param args 置換文字列
     */
    public AppError(final String msgId, final String... args) {
        super(Messages.get(msgId, args));
    }

}
