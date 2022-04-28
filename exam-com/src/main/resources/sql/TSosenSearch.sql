SELECT
      a.*
FROM
    t_sosen a 
WHERE
    1 = 1 
    AND a.sosen_id = :sosen_id 
    AND a.sosen_mei LIKE CONCAT ('%', :sosen_mei, '%') 
    AND a.insert_dt = :insert_dt 
    AND a.insert_dt >= :insert_dt_1 
    AND a.insert_dt <= :insert_dt_2 
    AND a.insert_by = :insert_by 
    AND a.update_dt = :update_dt 
    AND a.update_dt >= :update_dt_1 
    AND a.update_dt <= :update_dt_2 
    AND a.update_by = :update_by 
    AND CASE WHEN a.delete_f IS NULL THEN '0' ELSE a.delete_f END IN (:delete_f) 
ORDER BY
    a.SOSEN_ID
