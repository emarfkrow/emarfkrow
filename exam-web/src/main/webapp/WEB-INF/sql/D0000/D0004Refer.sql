SELECT
      * 
FROM
    m_sansho1 s1 
WHERE
    1 = 1 
    AND s1.sansho1_id = :sansho1_id 
    AND s1.sansho1_mei LIKE CONCAT ('%', :sansho1_mei, '%')

