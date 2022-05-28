SELECT
      a.*
    , (SELECT r1.LOCATION_NAME FROM MST_LOCATION r1 WHERE r1.LOCATION_CODE = a.LOCATION_CODE) AS LOCATION_NAME
FROM
    INV_SURVEY_RESULT_LOC a 
WHERE
    1 = 1 
    AND TRIM (a.location_code) IN (:location_code) 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.stock = :stock 
    AND a.decision_kbn IN (:decision_kbn) 
    AND a.entry_date = :entry_date 
    AND a.entry_date >= :entry_date_1 
    AND a.entry_date <= :entry_date_2 
    AND TRIM (a.registrant) = TRIM (:registrant) 
    AND a.output_status = :output_status 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND a.shukei_tani_mei LIKE '%' || :shukei_tani_mei || '%' 
ORDER BY
    a.LOCATION_CODE
