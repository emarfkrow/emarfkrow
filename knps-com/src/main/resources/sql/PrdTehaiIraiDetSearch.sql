SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."IRAI_HINBAN") AS "IRAI_ITEM"
FROM
    PRD_TEHAI_IRAI_DET a 
WHERE
    1 = 1 
    AND TRIM (a."PRD_TEHAI_NO") = TRIM (:prd_tehai_no) 
    AND a."IRAI_DET_SEQ" = :irai_det_seq 
    AND a."ID" = :id 
    AND a."PARENT_ID" = :parent_id 
    AND a."IRAI_HINBAN" = :irai_hinban 
    AND a."IRAI_QT" = :irai_qt 
    AND a."IRAI_QT" >= :irai_qt_1 
    AND a."IRAI_QT" <= :irai_qt_2 
    AND CASE WHEN a."SHINSETSUHIN_F" IS NULL THEN '0' ELSE TO_CHAR (a."SHINSETSUHIN_F") END IN (:shinsetsuhin_f) 
    AND CASE WHEN a."SETHIN_F" IS NULL THEN '0' ELSE TO_CHAR (a."SETHIN_F") END IN (:sethin_f) 
    AND CASE WHEN a."HANMOKUGAI_F" IS NULL THEN '0' ELSE TO_CHAR (a."HANMOKUGAI_F") END IN (:hanmokugai_f) 
    AND CASE WHEN a."CHUMON_NYURYOKU_ZUMI_F" IS NULL THEN '0' ELSE TO_CHAR (a."CHUMON_NYURYOKU_ZUMI_F") END IN (:chumon_nyuryoku_zumi_f) 
    AND TRIM (a."KIBO_NOKI_YMD") = TRIM (:kibo_noki_ymd) 
    AND a."KIBO_NOKI_YMD" >= :kibo_noki_ymd_1 
    AND a."KIBO_NOKI_YMD" <= :kibo_noki_ymd_2 
    AND CASE WHEN a."SHUKKA_ZUMI_F" IS NULL THEN '0' ELSE TO_CHAR (a."SHUKKA_ZUMI_F") END IN (:shukka_zumi_f) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
    AND a."IRAI_INZU_QT" = :irai_inzu_qt 
    AND a."IRAI_INZU_QT" >= :irai_inzu_qt_1 
    AND a."IRAI_INZU_QT" <= :irai_inzu_qt_2 
ORDER BY
    a."PRD_TEHAI_NO", a."IRAI_DET_SEQ"
