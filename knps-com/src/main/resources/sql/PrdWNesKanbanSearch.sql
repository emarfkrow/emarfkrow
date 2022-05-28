SELECT
      a.*
FROM
    PRD_W_NES_KANBAN a 
WHERE
    1 = 1 
    AND TRIM (a.pro_hinban) = TRIM (:pro_hinban) 
    AND TRIM (a.store_wc) = TRIM (:store_wc) 
    AND a.routing = :routing 
    AND a.routing_def_group = :routing_def_group 
    AND TRIM (a.store_ope_detail) = TRIM (:store_ope_detail) 
    AND a.pro_nes_counts = :pro_nes_counts 
    AND a.pro_nes_counts >= :pro_nes_counts_1 
    AND a.pro_nes_counts <= :pro_nes_counts_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND a.lot_size = :lot_size 
    AND a.acc_counts = :acc_counts 
    AND a.acc_counts >= :acc_counts_1 
    AND a.acc_counts <= :acc_counts_2 
    AND a.counts = :counts 
ORDER BY
    a.PRO_HINBAN, a.ROUTING, a.ROUTING_DEF_GROUP
