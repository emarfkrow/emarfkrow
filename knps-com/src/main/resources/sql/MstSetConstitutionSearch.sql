SELECT
      a.*
FROM
    MST_SET_CONSTITUTION a 
WHERE
    1 = 1 
    AND TRIM (a.set_hinban) = TRIM (:set_hinban) 
    AND TRIM (a.set_child_hinban) = TRIM (:set_child_hinban) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND CASE WHEN a.bottom_flag IS NULL THEN '0' ELSE TO_CHAR (a.bottom_flag) END IN (:bottom_flag) 
    AND a.set_count = :set_count 
    AND a.gratis_supply_kbn IN (:gratis_supply_kbn) 
ORDER BY
    a.SET_HINBAN, a.SET_CHILD_HINBAN
