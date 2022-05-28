SELECT
      a.*
FROM
    MFG_KANBAN_FORM_DET a 
WHERE
    1 = 1 
    AND a.kanban_form_def_name LIKE '%' || :kanban_form_def_name || '%' 
    AND a.excel_cell_name LIKE '%' || :excel_cell_name || '%' 
    AND CASE WHEN a.basic_or_tunnnel_flg IS NULL THEN '0' ELSE TO_CHAR (a.basic_or_tunnnel_flg) END IN (:basic_or_tunnnel_flg) 
    AND a.disp_order = :disp_order 
    AND TRIM (a.item_code) IN (:item_code) 
    AND CASE WHEN a.valid_flg IS NULL THEN '0' ELSE TO_CHAR (a.valid_flg) END IN (:valid_flg) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.KANBAN_FORM_DEF_NAME, a.EXCEL_CELL_NAME
