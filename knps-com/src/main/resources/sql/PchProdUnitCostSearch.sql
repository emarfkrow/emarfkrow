SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a."WC_CODE") AS WC_NAME
FROM
    PCH_PROD_UNIT_COST a 
WHERE
    1 = 1 
    AND TRIM (a."CLOSE_DATE") = TRIM (:close_date) 
    AND a."CLOSE_DATE" >= :close_date_1 
    AND a."CLOSE_DATE" <= :close_date_2 
    AND a."PRO_GROUP_NO" = :pro_group_no 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ROUTING" = :routing 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND a."PROPRIETARY_TOTAL_COUNTS" = :proprietary_total_counts 
    AND a."PROPRIETARY_TOTAL_COUNTS" >= :proprietary_total_counts_1 
    AND a."PROPRIETARY_TOTAL_COUNTS" <= :proprietary_total_counts_2 
    AND a."PROPRIETARY_TOTAL_COST" = :proprietary_total_cost 
    AND a."LAST_PRCH_UNIT_COST" = :last_prch_unit_cost 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."CLOSE_DATE", a."PRO_GROUP_NO", a."HINBAN", a."ROUTING"
