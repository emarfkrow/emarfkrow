SELECT
      a.*
FROM
    PCH_TEMP_ORDER_DET a 
WHERE
    1 = 1 
    AND TRIM (a."TEMP_ORDER_NO") = TRIM (:temp_order_no) 
    AND a."TEMP_ORDER_SEQ" = :temp_order_seq 
    AND TRIM (a."ORDER_NO") = TRIM (:order_no) 
    AND TRIM (a."KBN2") = TRIM (:kbn2) 
    AND a."ITEM" = :item 
    AND a."MATERIAL" = :material 
    AND a."ORDER_COUNTS_1" = :order_counts_1 
    AND a."UNIT_NAME" LIKE '%' || :unit_name || '%' 
    AND a."ORDER_COUNTS_2" = :order_counts_2 
    AND a."UNIT_NAME_2" = :unit_name_2 
    AND CASE WHEN a."ISSHIKI_F" IS NULL THEN '0' ELSE TO_CHAR (a."ISSHIKI_F") END IN (:isshiki_f) 
    AND CASE WHEN a."FUTAI_F" IS NULL THEN '0' ELSE TO_CHAR (a."FUTAI_F") END IN (:futai_f) 
    AND TRIM (a."IKKATSU_ORDER_NO") = TRIM (:ikkatsu_order_no) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."TEMP_ORDER_NO", a."TEMP_ORDER_SEQ"
