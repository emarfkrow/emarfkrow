SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    PRD_STORE_MAINTE_RETSU_DET a 
WHERE
    1 = 1 
    AND TRIM (a.retsu_no) = TRIM (:retsu_no) 
    AND a.retsu_pos = :retsu_pos 
    AND a.wc_code IN (:wc_code) 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.RETSU_NO, a.RETSU_POS
