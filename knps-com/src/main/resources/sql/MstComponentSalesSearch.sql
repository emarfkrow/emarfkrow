SELECT
      a.*
FROM
    MST_COMPONENT_SALES a 
WHERE
    1 = 1 
    AND TRIM (a.comp_hinban_parent) = TRIM (:comp_hinban_parent) 
    AND TRIM (a.comp_hinban_child) = TRIM (:comp_hinban_child) 
    AND a.set_number = :set_number 
    AND CASE WHEN a.bottom_flag IS NULL THEN '0' ELSE TO_CHAR (a.bottom_flag) END IN (:bottom_flag) 
    AND a.provisions_kbn IN (:provisions_kbn) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.COMP_HINBAN_PARENT, a.COMP_HINBAN_CHILD
