package jp.co.golorp.emarf.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * フォームに追加する参照名のアノテーション
 *
 * @author golorp
 */
@Retention(RetentionPolicy.RUNTIME) // 実行時に利用可能
@Target({ ElementType.FIELD }) // 適用対象
public @interface ReferMei {
}
