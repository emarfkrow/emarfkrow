SELECT
      a.*
FROM
    INV_STK_PLAN a 
WHERE
    1 = 1 
    AND TRIM (a.pro_hinban) = TRIM (:pro_hinban) 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND a.pap_kan_amt_sch = :pap_kan_amt_sch 
    AND a.pap_kan_amt_sch_fst = :pap_kan_amt_sch_fst 
    AND a.pap_kan_amt_sch_mid = :pap_kan_amt_sch_mid 
    AND a.pap_kan_amt_sch_lst = :pap_kan_amt_sch_lst 
    AND a.pap_kan_amt_act_fst = :pap_kan_amt_act_fst 
    AND a.pap_kan_amt_act_mid = :pap_kan_amt_act_mid 
    AND a.pap_kan_amt_act_lst = :pap_kan_amt_act_lst 
    AND a.pap_kan_amt_act = :pap_kan_amt_act 
    AND a.req_counts = :req_counts 
    AND a.req_counts >= :req_counts_1 
    AND a.req_counts <= :req_counts_2 
    AND a.req_nes_counts = :req_nes_counts 
    AND a.req_nes_counts >= :req_nes_counts_1 
    AND a.req_nes_counts <= :req_nes_counts_2 
    AND a.req_pap_kan_amt_sch = :req_pap_kan_amt_sch 
    AND a.req_pap_kan_amt_sch_fst = :req_pap_kan_amt_sch_fst 
    AND a.req_pap_kan_amt_sch_mid = :req_pap_kan_amt_sch_mid 
    AND a.req_pap_kan_amt_sch_lst = :req_pap_kan_amt_sch_lst 
    AND a.req_pap_kan_amt_act_fst = :req_pap_kan_amt_act_fst 
    AND a.req_pap_kan_amt_act_mid = :req_pap_kan_amt_act_mid 
    AND a.req_pap_kan_amt_act_lst = :req_pap_kan_amt_act_lst 
    AND a.req_pap_kan_amt_act = :req_pap_kan_amt_act 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.PRO_HINBAN, a.YYYY, a.MM
