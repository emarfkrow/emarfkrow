SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    INV_Y_STK_AMOUNT_PROG a 
WHERE
    1 = 1 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.routing = :routing 
    AND a.wc_code IN (:wc_code) 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND a.nes_counts = :nes_counts 
    AND a.nes_counts >= :nes_counts_1 
    AND a.nes_counts <= :nes_counts_2 
    AND a.rou_amount = :rou_amount 
    AND a.rou_amount >= :rou_amount_1 
    AND a.rou_amount <= :rou_amount_2 
    AND a.rou_lt = :rou_lt 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.YYYY, a.MM, a.HINBAN, a.ROUTING
