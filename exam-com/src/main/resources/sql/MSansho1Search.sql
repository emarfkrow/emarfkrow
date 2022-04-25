SELECT
      * 
FROM
    m_sansho1 a 
WHERE
    1 = 1 
    AND a.sansho1_id = :sansho1_id 
    AND a.sansho1_mei LIKE CONCAT ('%', :sansho1_mei, '%') 
    AND a.insert_dt = :insert_dt 
    AND a.insert_dt >= :insert_dt_1 
    AND a.insert_dt <= :insert_dt_2 
    AND a.insert_by = :insert_by 
    AND a.update_dt = :update_dt 
    AND a.update_dt >= :update_dt_1 
    AND a.update_dt <= :update_dt_2 
    AND a.update_by = :update_by 
    AND CASE WHEN a.delete_f IS NULL THEN '0' ELSE a.delete_f END = :delete_f 
ORDER BY
    a.SANSHO1_ID
