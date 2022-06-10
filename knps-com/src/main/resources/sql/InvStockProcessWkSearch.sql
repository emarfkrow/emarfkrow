SELECT
      a.*
FROM
    INV_STOCK_PROCESS_WK a 
WHERE
    1 = 1 
    AND a."HINBAN" = :hinban 
    AND a."ITEM" = :item 
    AND a."ITEM_KBN" IN (:item_kbn) 
    AND a."HINBAN_OPE_CODE" IN (:hinban_ope_code) 
    AND a."ROUTING_GROUP" = :routing_group 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND a."WC_NAME" LIKE '%' || :wc_name || '%' 
    AND a."OPE_DETAIL" = :ope_detail 
    AND a."LAST_IN_OUT_DATE" = :last_in_out_date 
    AND a."LAST_IN_OUT_DATE" >= :last_in_out_date_1 
    AND a."LAST_IN_OUT_DATE" <= :last_in_out_date_2 
    AND a."STOCK" = :stock 
    AND TRIM (a."PRO_NO") = TRIM (:pro_no) 
    AND a."NEXT_ROUTING" = :next_routing 
    AND TRIM (a."NEXT_WC") = TRIM (:next_wc) 
    AND a."NEXT_DETAIL" = :next_detail 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
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
