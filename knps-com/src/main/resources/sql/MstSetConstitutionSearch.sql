SELECT
      a.*
FROM
    MST_SET_CONSTITUTION a 
WHERE
    1 = 1 
    AND TRIM (a."SET_HINBAN") = TRIM (:set_hinban) 
    AND TRIM (a."SET_CHILD_HINBAN") = TRIM (:set_child_hinban) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
    AND CASE WHEN a."BOTTOM_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.BOTTOM_FLAG) END IN (:bottom_flag) 
    AND a."SET_COUNT" = :set_count 
    AND TRIM (a."GRATIS_SUPPLY_KBN") IN (:gratis_supply_kbn) 
ORDER BY
    a."SET_HINBAN", a."SET_CHILD_HINBAN"
