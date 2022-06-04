SELECT
      a.*
FROM
    MST_COMPONENT_SALES a 
WHERE
    1 = 1 
    AND TRIM (a."COMP_HINBAN_PARENT") = TRIM (:comp_hinban_parent) 
    AND TRIM (a."COMP_HINBAN_CHILD") = TRIM (:comp_hinban_child) 
    AND a."SET_NUMBER" = :set_number 
    AND CASE WHEN a."BOTTOM_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."BOTTOM_FLAG") END IN (:bottom_flag) 
    AND a."PROVISIONS_KBN" IN (:provisions_kbn) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."COMP_HINBAN_PARENT", a."COMP_HINBAN_CHILD"
