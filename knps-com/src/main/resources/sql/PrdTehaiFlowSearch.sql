SELECT
      a.*
FROM
    PRD_TEHAI_FLOW a 
WHERE
    1 = 1 
    AND TRIM (a.prd_tehai_no) = TRIM (:prd_tehai_no) 
    AND a.tehai_flow_seq = :tehai_flow_seq 
    AND a.tehai_jokyo_kb IN (:tehai_jokyo_kb) 
    AND a.kaitei_jokyo_kb IN (:kaitei_jokyo_kb) 
    AND a.shorisha_cd = :shorisha_cd 
    AND a.shori_dt = :shori_dt 
    AND a.shori_dt >= :shori_dt_1 
    AND a.shori_dt <= :shori_dt_2 
    AND a.shori_cmt = :shori_cmt 
    AND a.aitesaki_cd = :aitesaki_cd 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.PRD_TEHAI_NO, a.TEHAI_FLOW_SEQ
