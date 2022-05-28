SELECT
      a.*
FROM
    PRD_TEHAI_IRAI a 
WHERE
    1 = 1 
    AND TRIM (a.prd_tehai_no) = TRIM (:prd_tehai_no) 
    AND a.tehai_jokyo_kb IN (:tehai_jokyo_kb) 
    AND a.kaitei_jokyo_kb IN (:kaitei_jokyo_kb) 
    AND a.irai_busho_cd = :irai_busho_cd 
    AND a.dairiten_mei LIKE '%' || :dairiten_mei || '%' 
    AND a.nonyusaki_mei LIKE '%' || :nonyusaki_mei || '%' 
    AND a.kihyosha_cd = :kihyosha_cd 
    AND a.kihyo_dt = :kihyo_dt 
    AND a.kihyo_dt >= :kihyo_dt_1 
    AND a.kihyo_dt <= :kihyo_dt_2 
    AND a.shinseisha_cd = :shinseisha_cd 
    AND a.shinsei_dt = :shinsei_dt 
    AND a.shinsei_dt >= :shinsei_dt_1 
    AND a.shinsei_dt <= :shinsei_dt_2 
    AND a.shinsei_cmt = :shinsei_cmt 
    AND a.shinseisaki_cd = :shinseisaki_cd 
    AND a.shoninsha_cd = :shoninsha_cd 
    AND a.shonin_dt = :shonin_dt 
    AND a.shonin_dt >= :shonin_dt_1 
    AND a.shonin_dt <= :shonin_dt_2 
    AND a.uketsukesha_cd = :uketsukesha_cd 
    AND a.uketsuke_dt = :uketsuke_dt 
    AND a.uketsuke_dt >= :uketsuke_dt_1 
    AND a.uketsuke_dt <= :uketsuke_dt_2 
    AND a.kaitosha_cd = :kaitosha_cd 
    AND a.kaito_dt = :kaito_dt 
    AND a.kaito_dt >= :kaito_dt_1 
    AND a.kaito_dt <= :kaito_dt_2 
    AND a.juchuno_csv = :juchuno_csv 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.PRD_TEHAI_NO
