SELECT
      a.*
FROM
    PRD_TEHAI_IRAI_DET a 
WHERE
    1 = 1 
    AND TRIM (a.prd_tehai_no) = TRIM (:prd_tehai_no) 
    AND a.irai_det_seq = :irai_det_seq 
    AND a.id = :id 
    AND a.parent_id = :parent_id 
    AND a.irai_hinban = :irai_hinban 
    AND a.irai_qt = :irai_qt 
    AND a.irai_qt >= :irai_qt_1 
    AND a.irai_qt <= :irai_qt_2 
    AND CASE WHEN a.shinsetsuhin_f IS NULL THEN '0' ELSE TO_CHAR (a.shinsetsuhin_f) END IN (:shinsetsuhin_f) 
    AND CASE WHEN a.sethin_f IS NULL THEN '0' ELSE TO_CHAR (a.sethin_f) END IN (:sethin_f) 
    AND CASE WHEN a.hanmokugai_f IS NULL THEN '0' ELSE TO_CHAR (a.hanmokugai_f) END IN (:hanmokugai_f) 
    AND CASE WHEN a.chumon_nyuryoku_zumi_f IS NULL THEN '0' ELSE TO_CHAR (a.chumon_nyuryoku_zumi_f) END IN (:chumon_nyuryoku_zumi_f) 
    AND TRIM (a.kibo_noki_ymd) = TRIM (:kibo_noki_ymd) 
    AND a.kibo_noki_ymd >= :kibo_noki_ymd_1 
    AND a.kibo_noki_ymd <= :kibo_noki_ymd_2 
    AND CASE WHEN a.shukka_zumi_f IS NULL THEN '0' ELSE TO_CHAR (a.shukka_zumi_f) END IN (:shukka_zumi_f) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
    AND a.irai_inzu_qt = :irai_inzu_qt 
    AND a.irai_inzu_qt >= :irai_inzu_qt_1 
    AND a.irai_inzu_qt <= :irai_inzu_qt_2 
ORDER BY
    a.PRD_TEHAI_NO, a.IRAI_DET_SEQ
