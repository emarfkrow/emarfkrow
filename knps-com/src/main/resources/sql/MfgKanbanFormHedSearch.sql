SELECT
      a.*
FROM
    MFG_KANBAN_FORM_HED a 
WHERE
    1 = 1 
    AND a.kanban_form_def_name LIKE '%' || :kanban_form_def_name || '%' 
    AND a.kanban_template_name LIKE '%' || :kanban_template_name || '%' 
    AND CASE WHEN a.self_proc_after_tunnel_flg IS NULL THEN '0' ELSE TO_CHAR (a.self_proc_after_tunnel_flg) END IN (:self_proc_after_tunnel_flg) 
    AND a.output_per_page = :output_per_page 
    AND CASE WHEN a.auto_shape_flg IS NULL THEN '0' ELSE TO_CHAR (a.auto_shape_flg) END IN (:auto_shape_flg) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.KANBAN_FORM_DEF_NAME
