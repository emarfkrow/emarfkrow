SELECT
      a.*
FROM
    MST_TEMP_SUPPLIER a 
WHERE
    1 = 1 
    AND a.temp_sup_code IN (:temp_sup_code) 
    AND a.temp_sup_name LIKE '%' || :temp_sup_name || '%' 
    AND a.temp_sup_staff_name LIKE '%' || :temp_sup_staff_name || '%' 
    AND a.temp_sup_tel_no = :temp_sup_tel_no 
    AND a.temp_sup_fax_no = :temp_sup_fax_no 
    AND TRIM (a.temp_sup_div_code) IN (:temp_sup_div_code) 
    AND a.temp_koza_no = :temp_koza_no 
    AND a.temp_koza_meigi = :temp_koza_meigi 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.TEMP_SUP_CODE
