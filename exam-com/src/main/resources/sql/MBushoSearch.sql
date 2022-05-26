SELECT
      a.*
FROM
    m_busho a 
WHERE
    1 = 1 
    AND a.busho_id = :busho_id 
    AND a.busho_mei LIKE CONCAT ('%', :busho_mei, '%') 
    AND TRIM (a.kaishi_ymd) = TRIM (:kaishi_ymd) 
    AND a.kaishi_ymd >= :kaishi_ymd_1 
    AND a.kaishi_ymd <= :kaishi_ymd_2 
    AND TRIM (a.shuryo_ymd) = TRIM (:shuryo_ymd) 
    AND a.shuryo_ymd >= :shuryo_ymd_1 
    AND a.shuryo_ymd <= :shuryo_ymd_2 
    AND a.oya_busho_id = :oya_busho_id 
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
    a.BUSHO_ID
