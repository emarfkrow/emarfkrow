SELECT
      a.*
FROM
    MST_BTN_PERMISSION a 
WHERE
    1 = 1 
    AND a.comp_code IN (:comp_code) 
    AND a.gamen_id = :gamen_id 
    AND a.button_id = :button_id 
    AND a.permission = :permission 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.COMP_CODE, a.GAMEN_ID, a.BUTTON_ID
