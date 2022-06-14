SELECT
      a.*
FROM
    t_entity2 a 
WHERE
    1 = 1 
    AND a.`SOSEN_ID` = :sosen_id 
    AND a.`OYA_SN` = :oya_sn 
    AND a.`ENTITY_SN` = :entity_sn 
    AND a.`NULL_ENTITY2_MEI` LIKE CONCAT ('%', :null_entity2_mei, '%') 
    AND a.`ENTITY2_MEI` LIKE CONCAT ('%', :entity2_mei, '%') 
    AND CASE WHEN a.`CHECK_F` IS NULL THEN '0' ELSE TO_CHAR (a.`CHECK_F`) END IN (:check_f) 
    AND a.`RADIO_KB` IN (:radio_kb) 
    AND a.`PULLDOWN_KB` IN (:pulldown_kb) 
    AND a.`MEMO_TX` = :memo_tx 
    AND TRIM (a.`HIDUKE_YMD`) = TRIM (:hiduke_ymd) 
    AND a.`HIDUKE_YMD` >= :hiduke_ymd_1 
    AND a.`HIDUKE_YMD` <= :hiduke_ymd_2 
    AND TRIM (a.`NENGETSU_YM`) = TRIM (:nengetsu_ym) 
    AND a.`NENGETSU_YM` >= :nengetsu_ym_1 
    AND a.`NENGETSU_YM` <= :nengetsu_ym_2 
    AND TRIM (a.`SAMPLE_Y`) = TRIM (:sample_y) 
    AND a.`SAMPLE_Y` >= :sample_y_1 
    AND a.`SAMPLE_Y` <= :sample_y_2 
    AND TRIM (a.`SAMPLE_M`) = TRIM (:sample_m) 
    AND a.`SAMPLE_M` >= :sample_m_1 
    AND a.`SAMPLE_M` <= :sample_m_2 
    AND a.`NICHIJI_DT` = :nichiji_dt 
    AND a.`NICHIJI_DT` >= :nichiji_dt_1 
    AND a.`NICHIJI_DT` <= :nichiji_dt_2 
    AND a.`JIKOKU_HM` = :jikoku_hm 
    AND a.`JIKOKU_HM` >= :jikoku_hm_1 
    AND a.`JIKOKU_HM` <= :jikoku_hm_2 
    AND a.`JIKAN_TM` = :jikan_tm 
    AND a.`JIKAN_TM` >= :jikan_tm_1 
    AND a.`JIKAN_TM` <= :jikan_tm_2 
    AND a.`SURYO_QT` = :suryo_qt 
    AND a.`SURYO_QT` >= :suryo_qt_1 
    AND a.`SURYO_QT` <= :suryo_qt_2 
    AND a.`TANKA_AM` = :tanka_am 
    AND a.`TANKA_AM` >= :tanka_am_1 
    AND a.`TANKA_AM` <= :tanka_am_2 
    AND a.`KINGAKU_AM` = :kingaku_am 
    AND a.`KINGAKU_AM` >= :kingaku_am_1 
    AND a.`KINGAKU_AM` <= :kingaku_am_2 
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
    a.`SOSEN_ID`, a.`OYA_SN`, a.`ENTITY_SN`
