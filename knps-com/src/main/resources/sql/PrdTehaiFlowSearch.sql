SELECT
      a.*
FROM
    PRD_TEHAI_FLOW a 
WHERE
    1 = 1 
    AND TRIM (a."PRD_TEHAI_NO") = TRIM (:prd_tehai_no) 
    AND a."TEHAI_FLOW_SEQ" = :tehai_flow_seq 
    AND a."TEHAI_JOKYO_KB" IN (:tehai_jokyo_kb) 
    AND a."KAITEI_JOKYO_KB" IN (:kaitei_jokyo_kb) 
    AND a."SHORISHA_CD" = :shorisha_cd 
    AND a."SHORI_DT" = :shori_dt 
    AND a."SHORI_DT" >= :shori_dt_1 
    AND a."SHORI_DT" <= :shori_dt_2 
    AND a."SHORI_CMT" = :shori_cmt 
    AND a."AITESAKI_CD" = :aitesaki_cd 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."PRD_TEHAI_NO", a."TEHAI_FLOW_SEQ"
