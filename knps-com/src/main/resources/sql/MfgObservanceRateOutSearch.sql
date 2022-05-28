SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    MFG_OBSERVANCE_RATE_OUT a 
WHERE
    1 = 1 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND a.observance_rate = :observance_rate 
    AND a.late_m5_over = :late_m5_over 
    AND a.late_m5 = :late_m5 
    AND a.late_m4 = :late_m4 
    AND a.late_m3 = :late_m3 
    AND a.late_m2 = :late_m2 
    AND a.late_m1 = :late_m1 
    AND a.late_0 = :late_0 
    AND a.late_p1 = :late_p1 
    AND a.late_p2 = :late_p2 
    AND a.late_p3 = :late_p3 
    AND a.late_p4 = :late_p4 
    AND a.late_p5 = :late_p5 
    AND a.late_p6 = :late_p6 
    AND a.late_p7 = :late_p7 
    AND a.late_p8 = :late_p8 
    AND a.late_p9 = :late_p9 
    AND a.late_p10 = :late_p10 
    AND a.late_p11 = :late_p11 
    AND a.late_p12 = :late_p12 
    AND a.late_p13 = :late_p13 
    AND a.late_p14 = :late_p14 
    AND a.late_p15 = :late_p15 
    AND a.late_p16 = :late_p16 
    AND a.late_p17 = :late_p17 
    AND a.late_p18 = :late_p18 
    AND a.late_p19 = :late_p19 
    AND a.late_p20 = :late_p20 
    AND a.late_p20_over = :late_p20_over 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.YYYY, a.MM, a.WC_CODE
