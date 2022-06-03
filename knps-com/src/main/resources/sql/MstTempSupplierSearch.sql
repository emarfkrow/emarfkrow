SELECT
      a.*
FROM
    MST_TEMP_SUPPLIER a 
WHERE
    1 = 1 
    AND a."TEMP_SUP_CODE" IN (:temp_sup_code) 
    AND a."TEMP_SUP_NAME" LIKE '%' || :temp_sup_name || '%' 
    AND a."TEMP_SUP_STAFF_NAME" LIKE '%' || :temp_sup_staff_name || '%' 
    AND a."TEMP_SUP_TEL_NO" = :temp_sup_tel_no 
    AND a."TEMP_SUP_FAX_NO" = :temp_sup_fax_no 
    AND TRIM (a."TEMP_SUP_DIV_CODE") IN (:temp_sup_div_code) 
    AND a."TEMP_KOZA_NO" = :temp_koza_no 
    AND a."TEMP_KOZA_MEIGI" = :temp_koza_meigi 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."TEMP_SUP_CODE"
