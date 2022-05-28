SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    INV_SURVEY_RESULT_HIS_HALF a 
WHERE
    1 = 1 
    AND TRIM (a.discrimination_id) = TRIM (:discrimination_id) 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.stock = :stock 
    AND a.decision_kbn IN (:decision_kbn) 
    AND a.pro_group_no = :pro_group_no 
    AND a.routing = :routing 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND a.entry_date = :entry_date 
    AND a.entry_date >= :entry_date_1 
    AND a.entry_date <= :entry_date_2 
    AND TRIM (a.registrant) = TRIM (:registrant) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND a.shukei_tani_mei LIKE '%' || :shukei_tani_mei || '%' 
ORDER BY
    a.DISCRIMINATION_ID, a.YYYY, a.MM
