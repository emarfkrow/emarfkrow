SELECT
      a.*
FROM
    m_shokui a 
WHERE
    1 = 1 
    AND a.`SHOKUI_ID` = :shokui_id 
    AND a.`SHOKUI_MEI` LIKE CONCAT ('%', :shokui_mei, '%') 
    AND a.`ORDER_ID` = :order_id 
    AND TRIM (a.`KAISHI_YMD`) = TRIM (:kaishi_ymd) 
    AND a.`KAISHI_YMD` >= :kaishi_ymd_1 
    AND a.`KAISHI_YMD` <= :kaishi_ymd_2 
    AND TRIM (a.`SHURYO_YMD`) = TRIM (:shuryo_ymd) 
    AND a.`SHURYO_YMD` >= :shuryo_ymd_1 
    AND a.`SHURYO_YMD` <= :shuryo_ymd_2 
    AND a.`INSERT_DT` = :insert_dt 
    AND a.`INSERT_DT` >= :insert_dt_1 
    AND a.`INSERT_DT` <= :insert_dt_2 
    AND a.`INSERT_BY` = :insert_by 
    AND a.`UPDATE_DT` = :update_dt 
    AND a.`UPDATE_DT` >= :update_dt_1 
    AND a.`UPDATE_DT` <= :update_dt_2 
    AND a.`UPDATE_BY` = :update_by 
    AND CASE WHEN a.`DELETE_F` IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
ORDER BY
    a.`SHOKUI_ID`
