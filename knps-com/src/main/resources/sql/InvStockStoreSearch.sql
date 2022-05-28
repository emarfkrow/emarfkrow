SELECT
      a.*
FROM
    INV_STOCK_STORE a 
WHERE
    1 = 1 
    AND a.hinban = :hinban 
    AND a.store_no = :store_no 
    AND a.counts = :counts 
    AND a.hako_su = :hako_su 
    AND a.stock = :stock 
    AND a.total_sum_cost = :total_sum_cost 
    AND a.amount = :amount 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.HINBAN, a.STORE_NO
