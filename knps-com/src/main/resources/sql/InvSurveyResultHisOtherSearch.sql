SELECT
      a.*
    , (SELECT r1.LOCATION_NAME FROM MST_LOCATION r1 WHERE r1.LOCATION_CODE = a."LOCATION_CODE") AS LOCATION_NAME
FROM
    INV_SURVEY_RESULT_HIS_OTHER a 
WHERE
    1 = 1 
    AND TRIM (a."LOCATION_CODE") IN (:location_code) 
    AND a."RESULT_BRANCH_NO" = :result_branch_no 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."STOCK" = :stock 
    AND a."DECISION_KBN" IN (:decision_kbn) 
    AND a."ENTRY_DATE" = :entry_date 
    AND a."ENTRY_DATE" >= :entry_date_1 
    AND a."ENTRY_DATE" <= :entry_date_2 
    AND TRIM (a."REGISTRANT") = TRIM (:registrant) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND a."SHUKEI_TANI_MEI" LIKE '%' || :shukei_tani_mei || '%' 
    AND a."DENPYO_NO" = :denpyo_no 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
ORDER BY
    a."LOCATION_CODE", a."RESULT_BRANCH_NO", a."YYYY", a."MM"
