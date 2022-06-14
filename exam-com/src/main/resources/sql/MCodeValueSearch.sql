SELECT
      a.*
FROM
    m_code_value a 
WHERE
    1 = 1 
    AND a.`CODE_NM` = :code_nm 
    AND a.`CODE_VALUE` = :code_value 
    AND a.`CODE_VALUE_MEI` LIKE CONCAT ('%', :code_value_mei, '%') 
    AND a.`HYOJI_JUN` = :hyoji_jun 
    AND a.`CRITERIA` = :criteria 
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
    a.`CODE_NM`, a.`CODE_VALUE`
