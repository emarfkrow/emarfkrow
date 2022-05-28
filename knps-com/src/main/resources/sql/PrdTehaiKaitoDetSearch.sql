SELECT
      a.*
FROM
    PRD_TEHAI_KAITO_DET a 
WHERE
    1 = 1 
    AND TRIM (a.prd_tehai_no) = TRIM (:prd_tehai_no) 
    AND a.kaito_det_seq = :kaito_det_seq 
    AND a.irai_det_seq = :irai_det_seq 
    AND a.id = :id 
    AND a.parent_id = :parent_id 
    AND a.kaito_hinban = :kaito_hinban 
    AND a.kaito_qt = :kaito_qt 
    AND a.kaito_qt >= :kaito_qt_1 
    AND a.kaito_qt <= :kaito_qt_2 
    AND CASE WHEN a.fumeihin_f IS NULL THEN '0' ELSE TO_CHAR (a.fumeihin_f) END IN (:fumeihin_f) 
    AND CASE WHEN a.sethin_f IS NULL THEN '0' ELSE TO_CHAR (a.sethin_f) END IN (:sethin_f) 
    AND TRIM (a.kibo_noki_ymd) = TRIM (:kibo_noki_ymd) 
    AND a.kibo_noki_ymd >= :kibo_noki_ymd_1 
    AND a.kibo_noki_ymd <= :kibo_noki_ymd_2 
    AND a.hinban_tantosha_cd = :hinban_tantosha_cd 
    AND CASE WHEN a.set_noki_tuchi_f IS NULL THEN '0' ELSE TO_CHAR (a.set_noki_tuchi_f) END IN (:set_noki_tuchi_f) 
    AND TRIM (a.kaito_noki_ymd) = TRIM (:kaito_noki_ymd) 
    AND a.kaito_noki_ymd >= :kaito_noki_ymd_1 
    AND a.kaito_noki_ymd <= :kaito_noki_ymd_2 
    AND a.kaito_noki_cmt = :kaito_noki_cmt 
    AND a.noki_kaitosha_cd = :noki_kaitosha_cd 
    AND a.noki_kaito_dt = :noki_kaito_dt 
    AND a.noki_kaito_dt >= :noki_kaito_dt_1 
    AND a.noki_kaito_dt <= :noki_kaito_dt_2 
    AND CASE WHEN a.kaito_noki_hinin_f IS NULL THEN '0' ELSE TO_CHAR (a.kaito_noki_hinin_f) END IN (:kaito_noki_hinin_f) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.PRD_TEHAI_NO, a.KAITO_DET_SEQ
