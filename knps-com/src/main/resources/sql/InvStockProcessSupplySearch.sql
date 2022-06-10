SELECT
      a.*
FROM
    INV_STOCK_PROCESS_SUPPLY a 
WHERE
    1 = 1 
    AND a."SUP_CODE" IN (:sup_code) 
    AND a."HINBAN" = :hinban 
    AND a."SHIKYU_QT" = :shikyu_qt 
    AND a."SHIKYU_QT" >= :shikyu_qt_1 
    AND a."SHIKYU_QT" <= :shikyu_qt_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."SUP_CODE", a."HINBAN"
