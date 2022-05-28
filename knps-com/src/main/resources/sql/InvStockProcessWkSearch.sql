SELECT
      a.*
    , (SELECT r1.HINBAN_OPE_NAME FROM MST_HINBAN_EMP r1 WHERE r1.HINBAN_OPE_CODE = a.HINBAN_OPE_CODE) AS HINBAN_OPE_NAME
FROM
    INV_STOCK_PROCESS_WK a 
WHERE
    1 = 1 
    AND a.hinban = :hinban 
    AND a.item = :item 
    AND a.item_kbn IN (:item_kbn) 
    AND a.hinban_ope_code IN (:hinban_ope_code) 
    AND a.routing_group = :routing_group 
    AND a.wc_code IN (:wc_code) 
    AND a.wc_name LIKE '%' || :wc_name || '%' 
    AND a.ope_detail = :ope_detail 
    AND a.last_in_out_date = :last_in_out_date 
    AND a.last_in_out_date >= :last_in_out_date_1 
    AND a.last_in_out_date <= :last_in_out_date_2 
    AND a.stock = :stock 
    AND TRIM (a.pro_no) = TRIM (:pro_no) 
    AND a.next_routing = :next_routing 
    AND TRIM (a.next_wc) = TRIM (:next_wc) 
    AND a.next_detail = :next_detail 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
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
