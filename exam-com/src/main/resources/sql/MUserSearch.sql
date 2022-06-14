SELECT
      a.*
FROM
    m_user a 
WHERE
    1 = 1 
    AND a.`USER_ID` = :user_id 
    AND a.`USER_SEI` = :user_sei 
    AND a.`USER_MEI` LIKE CONCAT ('%', :user_mei, '%') 
    AND a.`EMAIL` = :email 
    AND a.`PASSWORD` = :password 
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
    a.`USER_ID`
