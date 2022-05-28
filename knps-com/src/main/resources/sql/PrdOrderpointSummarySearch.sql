SELECT
      a.*
FROM
    PRD_ORDERPOINT_SUMMARY a 
WHERE
    1 = 1 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.pro_nes_counts = :pro_nes_counts 
    AND a.pro_nes_counts >= :pro_nes_counts_1 
    AND a.pro_nes_counts <= :pro_nes_counts_2 
    AND a.issue_nes_counts = :issue_nes_counts 
    AND a.issue_nes_counts >= :issue_nes_counts_1 
    AND a.issue_nes_counts <= :issue_nes_counts_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.HINBAN
