SELECT
      a.*
FROM
    m_user a 
WHERE
    1 = 1 
    AND a.user_id = :user_id 
    AND a.user_sei = :user_sei 
    AND a.user_mei LIKE CONCAT ('%', :user_mei, '%') 
    AND a.email = :email 
    AND a.password = :password 
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
    a.USER_ID
