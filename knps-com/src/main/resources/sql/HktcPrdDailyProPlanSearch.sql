SELECT
      a.*
FROM
    HKTC_PRD_DAILY_PRO_PLAN a 
WHERE
    1 = 1 
    AND TRIM (a.plan_no) = TRIM (:plan_no) 
    AND TRIM (a.arrange_kbn) IN (:arrange_kbn) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.detail_plan_counts = :detail_plan_counts 
    AND a.detail_plan_counts >= :detail_plan_counts_1 
    AND a.detail_plan_counts <= :detail_plan_counts_2 
    AND a.plan_comment = :plan_comment 
    AND a.plan_status = :plan_status 
    AND a.period = :period 
    AND a.period_chg = :period_chg 
    AND a.period_chg_counts = :period_chg_counts 
    AND a.period_chg_counts >= :period_chg_counts_1 
    AND a.period_chg_counts <= :period_chg_counts_2 
    AND a.plan_date_appoint = :plan_date_appoint 
    AND a.beg_date = :beg_date 
    AND a.beg_date >= :beg_date_1 
    AND a.beg_date <= :beg_date_2 
    AND a.end_date = :end_date 
    AND a.end_date >= :end_date_1 
    AND a.end_date <= :end_date_2 
    AND a.start_date = :start_date 
    AND a.start_date >= :start_date_1 
    AND a.start_date <= :start_date_2 
    AND a.comp_date = :comp_date 
    AND a.comp_date >= :comp_date_1 
    AND a.comp_date <= :comp_date_2 
    AND a.short_no = :short_no 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND a.item = :item 
    AND a.update_date = :update_date 
    AND a.update_date >= :update_date_1 
    AND a.update_date <= :update_date_2 
ORDER BY
    a.PLAN_NO
