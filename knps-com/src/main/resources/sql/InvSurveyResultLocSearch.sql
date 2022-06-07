SELECT
      a.*
FROM
    INV_SURVEY_RESULT_LOC a 
WHERE
    1 = 1 
    AND TRIM (a."LOCATION_CODE") IN (:location_code) 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."STOCK" = :stock 
    AND a."DECISION_KBN" IN (:decision_kbn) 
    AND a."ENTRY_DATE" = :entry_date 
    AND a."ENTRY_DATE" >= :entry_date_1 
    AND a."ENTRY_DATE" <= :entry_date_2 
    AND TRIM (a."REGISTRANT") = TRIM (:registrant) 
    AND a."OUTPUT_STATUS" = :output_status 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND a."SHUKEI_TANI_MEI" LIKE '%' || :shukei_tani_mei || '%' 
ORDER BY
    a."LOCATION_CODE"
