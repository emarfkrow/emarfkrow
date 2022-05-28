SELECT
      a.*
FROM
    PCH_TEMP_ORDER_DET a 
WHERE
    1 = 1 
    AND TRIM (a.temp_order_no) = TRIM (:temp_order_no) 
    AND a.temp_order_seq = :temp_order_seq 
    AND TRIM (a.order_no) = TRIM (:order_no) 
    AND TRIM (a.kbn2) = TRIM (:kbn2) 
    AND a.item = :item 
    AND a.material = :material 
    AND a.order_counts_1 = :order_counts_1 
    AND a.unit_name LIKE '%' || :unit_name || '%' 
    AND a.order_counts_2 = :order_counts_2 
    AND a.unit_name_2 = :unit_name_2 
    AND CASE WHEN a.isshiki_f IS NULL THEN '0' ELSE TO_CHAR (a.isshiki_f) END IN (:isshiki_f) 
    AND CASE WHEN a.futai_f IS NULL THEN '0' ELSE TO_CHAR (a.futai_f) END IN (:futai_f) 
    AND TRIM (a.ikkatsu_order_no) = TRIM (:ikkatsu_order_no) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.TEMP_ORDER_NO, a.TEMP_ORDER_SEQ
