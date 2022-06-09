SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
    , (SELECT r2."WC_NAME" FROM MST_WC r2 WHERE r2."WC_CODE" = a."WC_CODE") AS "WC_NAME"
FROM
    INV_SURVEY_RESULT_HIS_HALF a 
WHERE
    1 = 1 
    AND TRIM (a."DISCRIMINATION_ID") = TRIM (:discrimination_id) 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."STOCK" = :stock 
    AND a."DECISION_KBN" IN (:decision_kbn) 
    AND a."PRO_GROUP_NO" = :pro_group_no 
    AND a."ROUTING" = :routing 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND a."ENTRY_DATE" = :entry_date 
    AND a."ENTRY_DATE" >= :entry_date_1 
    AND a."ENTRY_DATE" <= :entry_date_2 
    AND TRIM (a."REGISTRANT") = TRIM (:registrant) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND a."SHUKEI_TANI_MEI" LIKE '%' || :shukei_tani_mei || '%' 
ORDER BY
    a."DISCRIMINATION_ID", a."YYYY", a."MM"
