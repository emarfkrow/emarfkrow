SELECT
      a.*
FROM
    t_oya a 
WHERE
    1 = 1 
    AND a.`SOSEN_ID` = :sosen_id 
    AND a.`OYA_SN` = :oya_sn 
    AND a.`OYA_MEI` LIKE CONCAT ('%', :oya_mei, '%') 
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
    a.`SOSEN_ID`, a.`OYA_SN`
