SELECT
      a.*
FROM
    PRD_TEHAI_IRAI a 
WHERE
    1 = 1 
    AND TRIM (a."PRD_TEHAI_NO") = TRIM (:prd_tehai_no) 
    AND a."TEHAI_JOKYO_KB" IN (:tehai_jokyo_kb) 
    AND a."KAITEI_JOKYO_KB" IN (:kaitei_jokyo_kb) 
    AND a."IRAI_BUSHO_CD" = :irai_busho_cd 
    AND a."DAIRITEN_MEI" LIKE '%' || :dairiten_mei || '%' 
    AND a."NONYUSAKI_MEI" LIKE '%' || :nonyusaki_mei || '%' 
    AND a."KIHYOSHA_CD" = :kihyosha_cd 
    AND a."KIHYO_DT" = :kihyo_dt 
    AND a."KIHYO_DT" >= :kihyo_dt_1 
    AND a."KIHYO_DT" <= :kihyo_dt_2 
    AND a."SHINSEISHA_CD" = :shinseisha_cd 
    AND a."SHINSEI_DT" = :shinsei_dt 
    AND a."SHINSEI_DT" >= :shinsei_dt_1 
    AND a."SHINSEI_DT" <= :shinsei_dt_2 
    AND a."SHINSEI_CMT" = :shinsei_cmt 
    AND a."SHINSEISAKI_CD" = :shinseisaki_cd 
    AND a."SHONINSHA_CD" = :shoninsha_cd 
    AND a."SHONIN_DT" = :shonin_dt 
    AND a."SHONIN_DT" >= :shonin_dt_1 
    AND a."SHONIN_DT" <= :shonin_dt_2 
    AND a."UKETSUKESHA_CD" = :uketsukesha_cd 
    AND a."UKETSUKE_DT" = :uketsuke_dt 
    AND a."UKETSUKE_DT" >= :uketsuke_dt_1 
    AND a."UKETSUKE_DT" <= :uketsuke_dt_2 
    AND a."KAITOSHA_CD" = :kaitosha_cd 
    AND a."KAITO_DT" = :kaito_dt 
    AND a."KAITO_DT" >= :kaito_dt_1 
    AND a."KAITO_DT" <= :kaito_dt_2 
    AND a."JUCHUNO_CSV" = :juchuno_csv 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."PRD_TEHAI_NO"
