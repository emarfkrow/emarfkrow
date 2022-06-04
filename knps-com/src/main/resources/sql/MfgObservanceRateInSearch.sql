SELECT
      a.*
    , (SELECT r1."WC_NAME" FROM MST_WC r1 WHERE r1."WC_CODE" = a."WC_CODE") AS "WC_NAME"
FROM
    MFG_OBSERVANCE_RATE_IN a 
WHERE
    1 = 1 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND a."OBSERVANCE_RATE" = :observance_rate 
    AND a."LATE_M5OVER" = :late_m5_over 
    AND a."LATE_M5" = :late_m5 
    AND a."LATE_M4" = :late_m4 
    AND a."LATE_M3" = :late_m3 
    AND a."LATE_M2" = :late_m2 
    AND a."LATE_M1" = :late_m1 
    AND a."LATE_0" = :late_0 
    AND a."LATE_P1" = :late_p1 
    AND a."LATE_P2" = :late_p2 
    AND a."LATE_P3" = :late_p3 
    AND a."LATE_P4" = :late_p4 
    AND a."LATE_P5" = :late_p5 
    AND a."LATE_P6" = :late_p6 
    AND a."LATE_P7" = :late_p7 
    AND a."LATE_P8" = :late_p8 
    AND a."LATE_P9" = :late_p9 
    AND a."LATE_P10" = :late_p10 
    AND a."LATE_P11" = :late_p11 
    AND a."LATE_P12" = :late_p12 
    AND a."LATE_P13" = :late_p13 
    AND a."LATE_P14" = :late_p14 
    AND a."LATE_P15" = :late_p15 
    AND a."LATE_P16" = :late_p16 
    AND a."LATE_P17" = :late_p17 
    AND a."LATE_P18" = :late_p18 
    AND a."LATE_P19" = :late_p19 
    AND a."LATE_P20" = :late_p20 
    AND a."LATE_P20OVER" = :late_p20_over 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."YYYY", a."MM", a."WC_CODE"
