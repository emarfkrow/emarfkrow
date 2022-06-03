SELECT
      a.*
FROM
    INV_STK_PLAN_BK a 
WHERE
    1 = 1 
    AND TRIM (a."PRO_HINBAN") = TRIM (:pro_hinban) 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND a."PAP_KAN_AMT_SCH" = :pap_kan_amt_sch 
    AND a."PAP_KAN_AMT_SCH_FST" = :pap_kan_amt_sch_fst 
    AND a."PAP_KAN_AMT_SCH_MID" = :pap_kan_amt_sch_mid 
    AND a."PAP_KAN_AMT_SCH_LST" = :pap_kan_amt_sch_lst 
    AND a."PAP_KAN_AMT_ACT_FST" = :pap_kan_amt_act_fst 
    AND a."PAP_KAN_AMT_ACT_MID" = :pap_kan_amt_act_mid 
    AND a."PAP_KAN_AMT_ACT_LST" = :pap_kan_amt_act_lst 
    AND a."PAP_KAN_AMT_ACT" = :pap_kan_amt_act 
    AND a."REQ_COUNTS" = :req_counts 
    AND a."REQ_COUNTS" >= :req_counts_1 
    AND a."REQ_COUNTS" <= :req_counts_2 
    AND a."REQ_NES_COUNTS" = :req_nes_counts 
    AND a."REQ_NES_COUNTS" >= :req_nes_counts_1 
    AND a."REQ_NES_COUNTS" <= :req_nes_counts_2 
    AND a."REQ_PAP_KAN_AMT_SCH" = :req_pap_kan_amt_sch 
    AND a."REQ_PAP_KAN_AMT_SCH_FST" = :req_pap_kan_amt_sch_fst 
    AND a."REQ_PAP_KAN_AMT_SCH_MID" = :req_pap_kan_amt_sch_mid 
    AND a."REQ_PAP_KAN_AMT_SCH_LST" = :req_pap_kan_amt_sch_lst 
    AND a."REQ_PAP_KAN_AMT_ACT_FST" = :req_pap_kan_amt_act_fst 
    AND a."REQ_PAP_KAN_AMT_ACT_MID" = :req_pap_kan_amt_act_mid 
    AND a."REQ_PAP_KAN_AMT_ACT_LST" = :req_pap_kan_amt_act_lst 
    AND a."REQ_PAP_KAN_AMT_ACT" = :req_pap_kan_amt_act 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    1
    , 2
    , 3
    , 4
    , 5
    , 6
    , 7
    , 8
    , 9
    , 10
    , 11
    , 12
    , 13
    , 14
    , 15
    , 16
    , 17
    , 18
    , 19
    , 20
    , 21
    , 22
    , 23
    , 24
    , 25
