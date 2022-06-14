SELECT
      a.*
FROM
    m_busho a 
WHERE
    1 = 1 
    AND a.`BUSHO_ID` = :busho_id 
    AND a.`BUSHO_MEI` LIKE CONCAT ('%', :busho_mei, '%') 
    AND TRIM (a.`KAISHI_YMD`) = TRIM (:kaishi_ymd) 
    AND a.`KAISHI_YMD` >= :kaishi_ymd_1 
    AND a.`KAISHI_YMD` <= :kaishi_ymd_2 
    AND TRIM (a.`SHURYO_YMD`) = TRIM (:shuryo_ymd) 
    AND a.`SHURYO_YMD` >= :shuryo_ymd_1 
    AND a.`SHURYO_YMD` <= :shuryo_ymd_2 
    AND a.`OYA_BUSHO_ID` = :oya_busho_id 
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
    a.`BUSHO_ID`
