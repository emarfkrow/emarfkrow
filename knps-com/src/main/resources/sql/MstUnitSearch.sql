SELECT
      a.*
FROM
    MST_UNIT a 
WHERE
    1 = 1 
    AND TRIM (a.unit_code) IN (:unit_code) 
    AND a.unit_name LIKE '%' || :unit_name || '%' 
    AND a.stan_unit_kbn IN (:stan_unit_kbn) 
    AND TRIM (a.stan_unit_code) IN (:stan_unit_code) 
    AND a.exchange_rate = :exchange_rate 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.UNIT_CODE
