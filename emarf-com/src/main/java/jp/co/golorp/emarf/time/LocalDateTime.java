package jp.co.golorp.emarf.time;

import java.time.format.DateTimeFormatter;

/**
 * LocalDateTimeのラッパ（テスト用の日時を使用するため）
 *
 * @author toshiyuki
 *
 */
public final class LocalDateTime {

    private LocalDateTime() {
    }

    /**
     * @return 現在日時
     */
    public static java.time.LocalDateTime now() {
        return java.time.LocalDateTime.now();
    }

    /**
     * @param format
     * @return String
     */
    public static String format(final String format) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
    }

}
