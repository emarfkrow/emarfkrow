SELECT
      a.*
    , (SELECT r1.CODE_MEI FROM m_code r1 WHERE r1.CODE_NM = a.CODE_NM) AS CODE_MEI
FROM
    m_code_value a 
WHERE
    1 = 1 
    AND a.code_nm = :code_nm 
    AND a.code_value = :code_value 
    AND a.code_value_mei LIKE CONCAT ('%', :code_value_mei, '%') 
    AND a.hyoji_jun = :hyoji_jun 
    AND a.criteria = :criteria 
    AND a.insert_dt = :insert_dt 
    AND a.insert_dt >= :insert_dt_1 
    AND a.insert_dt <= :insert_dt_2 
    AND a.insert_by = :insert_by 
    AND a.update_dt = :update_dt 
    AND a.update_dt >= :update_dt_1 
    AND a.update_dt <= :update_dt_2 
    AND a.update_by = :update_by 
    AND CASE WHEN a.delete_f IS NULL THEN '0' ELSE TO_CHAR (a.delete_f) END IN (:delete_f) 
ORDER BY
    a.CODE_NM, a.CODE_VALUE
