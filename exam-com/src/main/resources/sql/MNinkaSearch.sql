SELECT
      a.*
    , (SELECT r1.BUSHO_MEI FROM m_busho r1 WHERE r1.BUSHO_ID = a.BUSHO_ID) AS BUSHO_MEI
    , (SELECT r2.SHOKUI_MEI FROM m_shokui r2 WHERE r2.SHOKUI_ID = a.SHOKUI_ID) AS SHOKUI_MEI
FROM
    m_ninka a 
WHERE
    1 = 1 
    AND a.busho_id = :busho_id 
    AND a.shokui_id = :shokui_id 
    AND a.gamen_nm = :gamen_nm 
    AND a.kengen_kb = :kengen_kb 
    AND a.kaishi_ymd = :kaishi_ymd 
    AND a.kaishi_ymd >= :kaishi_ymd_1 
    AND a.kaishi_ymd <= :kaishi_ymd_2 
    AND a.shuryo_ymd = :shuryo_ymd 
    AND a.shuryo_ymd >= :shuryo_ymd_1 
    AND a.shuryo_ymd <= :shuryo_ymd_2 
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
    a.BUSHO_ID, a.SHOKUI_ID, a.GAMEN_NM
