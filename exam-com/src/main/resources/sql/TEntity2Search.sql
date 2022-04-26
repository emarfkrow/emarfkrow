SELECT
      a.*
    , (SELECT r1.SOSEN_MEI FROM t_sosen r1 WHERE r1.SOSEN_ID = a.SOSEN_ID) AS SOSEN_MEI
FROM
    t_entity2 a 
WHERE
    1 = 1 
    AND a.sosen_id = :sosen_id 
    AND a.oya_sn = :oya_sn 
    AND a.entity_sn = :entity_sn 
    AND a.null_entity2_mei LIKE CONCAT ('%', :null_entity2_mei, '%') 
    AND a.entity2_mei LIKE CONCAT ('%', :entity2_mei, '%') 
    AND CASE WHEN a.check_f IS NULL THEN '0' ELSE a.check_f END = :check_f 
    AND a.radio_kb = :radio_kb 
    AND a.pulldown_kb = :pulldown_kb 
    AND a.memo_tx = :memo_tx 
    AND a.hiduke_ymd = :hiduke_ymd 
    AND a.hiduke_ymd >= :hiduke_ymd_1 
    AND a.hiduke_ymd <= :hiduke_ymd_2 
    AND a.nengetsu_ym = :nengetsu_ym 
    AND a.nengetsu_ym >= :nengetsu_ym_1 
    AND a.nengetsu_ym <= :nengetsu_ym_2 
    AND a.sample_y = :sample_y 
    AND a.sample_y >= :sample_y_1 
    AND a.sample_y <= :sample_y_2 
    AND a.sample_m = :sample_m 
    AND a.sample_m >= :sample_m_1 
    AND a.sample_m <= :sample_m_2 
    AND a.nichiji_dt = :nichiji_dt 
    AND a.nichiji_dt >= :nichiji_dt_1 
    AND a.nichiji_dt <= :nichiji_dt_2 
    AND a.jikoku_hm = :jikoku_hm 
    AND a.jikoku_hm >= :jikoku_hm_1 
    AND a.jikoku_hm <= :jikoku_hm_2 
    AND a.jikan_tm = :jikan_tm 
    AND a.jikan_tm >= :jikan_tm_1 
    AND a.jikan_tm <= :jikan_tm_2 
    AND a.suryo_qt = :suryo_qt 
    AND a.suryo_qt >= :suryo_qt_1 
    AND a.suryo_qt <= :suryo_qt_2 
    AND a.tanka_am = :tanka_am 
    AND a.tanka_am >= :tanka_am_1 
    AND a.tanka_am <= :tanka_am_2 
    AND a.kingaku_am = :kingaku_am 
    AND a.kingaku_am >= :kingaku_am_1 
    AND a.kingaku_am <= :kingaku_am_2 
    AND a.insert_dt = :insert_dt 
    AND a.insert_dt >= :insert_dt_1 
    AND a.insert_dt <= :insert_dt_2 
    AND a.insert_by = :insert_by 
    AND a.update_dt = :update_dt 
    AND a.update_dt >= :update_dt_1 
    AND a.update_dt <= :update_dt_2 
    AND a.update_by = :update_by 
    AND CASE WHEN a.delete_f IS NULL THEN '0' ELSE a.delete_f END = :delete_f 
ORDER BY
    a.SOSEN_ID, a.OYA_SN, a.ENTITY_SN
