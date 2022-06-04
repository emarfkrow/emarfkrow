SELECT
      a.*
FROM
    HKTC_PRD_DAILY_PRO_PLAN a 
WHERE
    1 = 1 
    AND TRIM (a."PLAN_NO") = TRIM (:plan_no) 
    AND TRIM (a."ARRANGE_KBN") IN (:arrange_kbn) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."DETAIL_PLAN_COUNTS" = :detail_plan_counts 
    AND a."DETAIL_PLAN_COUNTS" >= :detail_plan_counts_1 
    AND a."DETAIL_PLAN_COUNTS" <= :detail_plan_counts_2 
    AND a."PLAN_COMMENT" = :plan_comment 
    AND a."PLAN_STATUS" = :plan_status 
    AND a."PERIOD" = :period 
    AND a."PERIOD_CHG" = :period_chg 
    AND a."PERIOD_CHG_COUNTS" = :period_chg_counts 
    AND a."PERIOD_CHG_COUNTS" >= :period_chg_counts_1 
    AND a."PERIOD_CHG_COUNTS" <= :period_chg_counts_2 
    AND a."PLAN_DATE_APPOINT" = :plan_date_appoint 
    AND a."BEG_DATE" = :beg_date 
    AND a."BEG_DATE" >= :beg_date_1 
    AND a."BEG_DATE" <= :beg_date_2 
    AND a."END_DATE" = :end_date 
    AND a."END_DATE" >= :end_date_1 
    AND a."END_DATE" <= :end_date_2 
    AND a."START_DATE" = :start_date 
    AND a."START_DATE" >= :start_date_1 
    AND a."START_DATE" <= :start_date_2 
    AND a."COMP_DATE" = :comp_date 
    AND a."COMP_DATE" >= :comp_date_1 
    AND a."COMP_DATE" <= :comp_date_2 
    AND a."SHORT_NO" = :short_no 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
    AND a."ITEM" = :item 
    AND a."UPDATE_DATE" = :update_date 
    AND a."UPDATE_DATE" >= :update_date_1 
    AND a."UPDATE_DATE" <= :update_date_2 
ORDER BY
    a."PLAN_NO"
