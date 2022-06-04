SELECT
      a.*
FROM
    MFG_KANBAN_FORM_HED a 
WHERE
    1 = 1 
    AND a."KANBAN_FORM_DEF_NAME" LIKE '%' || :kanban_form_def_name || '%' 
    AND a."KANBAN_TEMPLATE_NAME" LIKE '%' || :kanban_template_name || '%' 
    AND CASE WHEN a."SELF_PROC_AFTER_TUNNEL_FLG" IS NULL THEN '0' ELSE TO_CHAR (a."SELF_PROC_AFTER_TUNNEL_FLG") END IN (:self_proc_after_tunnel_flg) 
    AND a."OUTPUT_PER_PAGE" = :output_per_page 
    AND CASE WHEN a."AUTO_SHAPE_FLG" IS NULL THEN '0' ELSE TO_CHAR (a."AUTO_SHAPE_FLG") END IN (:auto_shape_flg) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."KANBAN_FORM_DEF_NAME"
