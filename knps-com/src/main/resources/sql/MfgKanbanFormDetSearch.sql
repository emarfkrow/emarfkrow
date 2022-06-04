SELECT
      a.*
FROM
    MFG_KANBAN_FORM_DET a 
WHERE
    1 = 1 
    AND a."KANBAN_FORM_DEF_NAME" LIKE '%' || :kanban_form_def_name || '%' 
    AND a."EXCEL_CELL_NAME" LIKE '%' || :excel_cell_name || '%' 
    AND CASE WHEN a."BASIC_OR_TUNNNEL_FLG" IS NULL THEN '0' ELSE TO_CHAR (a."BASIC_OR_TUNNNEL_FLG") END IN (:basic_or_tunnnel_flg) 
    AND a."DISP_ORDER" = :disp_order 
    AND TRIM (a."ITEM_CODE") IN (:item_code) 
    AND CASE WHEN a."VALID_FLG" IS NULL THEN '0' ELSE TO_CHAR (a."VALID_FLG") END IN (:valid_flg) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."KANBAN_FORM_DEF_NAME", a."EXCEL_CELL_NAME"
