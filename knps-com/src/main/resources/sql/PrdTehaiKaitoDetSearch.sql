SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."KAITO_HINBAN") AS "KAITO_ITEM"
FROM
    PRD_TEHAI_KAITO_DET a 
WHERE
    1 = 1 
    AND TRIM (a."PRD_TEHAI_NO") = TRIM (:prd_tehai_no) 
    AND a."KAITO_DET_SEQ" = :kaito_det_seq 
    AND a."IRAI_DET_SEQ" = :irai_det_seq 
    AND a."ID" = :id 
    AND a."PARENT_ID" = :parent_id 
    AND a."KAITO_HINBAN" = :kaito_hinban 
    AND a."KAITO_QT" = :kaito_qt 
    AND a."KAITO_QT" >= :kaito_qt_1 
    AND a."KAITO_QT" <= :kaito_qt_2 
    AND CASE WHEN a."FUMEIHIN_F" IS NULL THEN '0' ELSE TO_CHAR (a."FUMEIHIN_F") END IN (:fumeihin_f) 
    AND CASE WHEN a."SETHIN_F" IS NULL THEN '0' ELSE TO_CHAR (a."SETHIN_F") END IN (:sethin_f) 
    AND TRIM (a."KIBO_NOKI_YMD") = TRIM (:kibo_noki_ymd) 
    AND a."KIBO_NOKI_YMD" >= :kibo_noki_ymd_1 
    AND a."KIBO_NOKI_YMD" <= :kibo_noki_ymd_2 
    AND a."HINBAN_TANTOSHA_CD" = :hinban_tantosha_cd 
    AND CASE WHEN a."SET_NOKI_TUCHI_F" IS NULL THEN '0' ELSE TO_CHAR (a."SET_NOKI_TUCHI_F") END IN (:set_noki_tuchi_f) 
    AND TRIM (a."KAITO_NOKI_YMD") = TRIM (:kaito_noki_ymd) 
    AND a."KAITO_NOKI_YMD" >= :kaito_noki_ymd_1 
    AND a."KAITO_NOKI_YMD" <= :kaito_noki_ymd_2 
    AND a."KAITO_NOKI_CMT" = :kaito_noki_cmt 
    AND a."NOKI_KAITOSHA_CD" = :noki_kaitosha_cd 
    AND a."NOKI_KAITO_DT" = :noki_kaito_dt 
    AND a."NOKI_KAITO_DT" >= :noki_kaito_dt_1 
    AND a."NOKI_KAITO_DT" <= :noki_kaito_dt_2 
    AND CASE WHEN a."KAITO_NOKI_HININ_F" IS NULL THEN '0' ELSE TO_CHAR (a."KAITO_NOKI_HININ_F") END IN (:kaito_noki_hinin_f) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."PRD_TEHAI_NO", a."KAITO_DET_SEQ"
