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

package jp.co.golorp.emarf.lang;

import java.lang.reflect.Field;

import jp.co.golorp.emarf.exception.SysError;

/**
 * クラス操作ユーティリティ
 *
 * @author golorpi
 */
public final class ReflectUtil {

    /** プライベートコンストラクタ */
    private ReflectUtil() {
    }

    /**
     * @param obj 対象オブジェクト
     * @param name フィールド名
     * @return フィールド値
     */
    public static Object get(final Object obj, final String name) {
        Field field = getField(obj, name);
        try {
            return field.get(obj);
        } catch (Exception e) {
            throw new SysError(e);
        }
    }

    /**
     * @param obj
     * @param name
     * @param value
     */
    public static void set(final Object obj, final String name, final Object value) {
        Field field = getField(obj, name);
        try {
            field.set(obj, value);
        } catch (Exception e) {
            throw new SysError(e);
        }
    }

    /**
     * @param obj 対象オブジェクト
     * @param name フィールド名
     * @return 対象オブジェクトのフィールド
     */
    private static Field getField(final Object obj, final String name) {

        Field field = null;
        try {
            field = obj.getClass().getDeclaredField(name);
        } catch (Exception e) {
            throw new SysError(e);
        }

        field.setAccessible(true);
        return field;
    }

}
