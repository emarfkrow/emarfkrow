SELECT
      a.*
FROM
    INV_INOUT_HISTORY a 
WHERE
    1 = 1 
    AND a.action_date = :action_date 
    AND a.action_date >= :action_date_1 
    AND a.action_date <= :action_date_2 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.in_out_counts = :in_out_counts 
    AND a.in_out_counts >= :in_out_counts_1 
    AND a.in_out_counts <= :in_out_counts_2 
    AND a.in_out_kbn IN (:in_out_kbn) 
    AND TRIM (a.from_pay) = TRIM (:from_pay) 
    AND TRIM (a.to_pay) = TRIM (:to_pay) 
    AND a.req_name LIKE '%' || :req_name || '%' 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.ACTION_DATE, a.HINBAN, a.IN_OUT_COUNTS, a.IN_OUT_KBN
