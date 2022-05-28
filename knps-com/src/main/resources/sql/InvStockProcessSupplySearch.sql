SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    INV_STOCK_PROCESS_SUPPLY a 
WHERE
    1 = 1 
    AND a.sup_code IN (:sup_code) 
    AND a.hinban = :hinban 
    AND a.shikyu_qt = :shikyu_qt 
    AND a.shikyu_qt >= :shikyu_qt_1 
    AND a.shikyu_qt <= :shikyu_qt_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.SUP_CODE, a.HINBAN
