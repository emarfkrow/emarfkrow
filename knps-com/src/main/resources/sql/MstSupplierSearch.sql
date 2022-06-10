SELECT
      a.*
FROM
    MST_SUPPLIER a 
WHERE
    1 = 1 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."SUP_KBN" IN (:sup_kbn) 
    AND a."SUP_NAME" LIKE '%' || :sup_name || '%' 
    AND a."SUP_RYAKU" = :sup_ryaku 
    AND TRIM (a."ZIP_CODE") IN (:zip_code) 
    AND a."ADDRESS1" = :address1 
    AND a."ADDRESS2" = :address2 
    AND a."TEL_NO" = :tel_no 
    AND a."FAX_NO" = :fax_no 
    AND a."DIV_NAME" LIKE '%' || :div_name || '%' 
    AND a."SUP_OPE_NAME" LIKE '%' || :sup_ope_name || '%' 
    AND a."SUP_OPE_MAIL_ADD" = :sup_ope_mail_add 
    AND TRIM (a."SUP_PERIOD_DAY") = TRIM (:sup_period_day) 
    AND TRIM (a."PAY_DAY") = TRIM (:pay_day) 
    AND TRIM (a."TAX_CODE") IN (:tax_code) 
    AND a."TAX_CAL_CODE" IN (:tax_cal_code) 
    AND a."TAX_DISP_CODE" IN (:tax_disp_code) 
    AND a."FRACTION_KBN" IN (:fraction_kbn) 
    AND a."YOSHINGENDO" = :yoshingendo 
    AND TRIM (a."COMPANY_OPE_CODE") IN (:company_ope_code) 
    AND a."ORDER_ACCEPT_KBN" IN (:order_accept_kbn) 
    AND a."LIST_OUTPUT_KBN" IN (:list_output_kbn) 
    AND TRIM (a."PCH_COST_RATE_CODE") IN (:pch_cost_rate_code) 
    AND a."SEND_SUP_KBN" IN (:send_sup_kbn) 
    AND a."SEND_SUP_NAME" LIKE '%' || :send_sup_name || '%' 
    AND a."SEND_SUP_RYAKU" = :send_sup_ryaku 
    AND TRIM (a."SEND_ZIP_CODE") IN (:send_zip_code) 
    AND a."SEND_ADDRESS1" = :send_address1 
    AND a."SEND_ADDRESS2" = :send_address2 
    AND a."SEND_TEL_NO" = :send_tel_no 
    AND a."SEND_FAX_NO" = :send_fax_no 
    AND a."SEND_INSPECT_LIST" = :send_inspect_list 
    AND a."COMPANY_DIV_NAME" LIKE '%' || :company_div_name || '%' 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
    AND TRIM (a."NOHIN_YOBI_SUN") = TRIM (:nohin_yobi_sun) 
    AND TRIM (a."NOHIN_YOBI_MON") = TRIM (:nohin_yobi_mon) 
    AND TRIM (a."NOHIN_YOBI_TUE") = TRIM (:nohin_yobi_tue) 
    AND TRIM (a."NOHIN_YOBI_WED") = TRIM (:nohin_yobi_wed) 
    AND TRIM (a."NOHIN_YOBI_THU") = TRIM (:nohin_yobi_thu) 
    AND TRIM (a."NOHIN_YOBI_FRI") = TRIM (:nohin_yobi_fri) 
    AND TRIM (a."NOHIN_YOBI_SAT") = TRIM (:nohin_yobi_sat) 
    AND TRIM (a."NOHIN_SEND_YOHI_KBN") IN (:nohin_send_yohi_kbn) 
    AND CASE WHEN a."BUNKATSU_MAIL_F" IS NULL THEN '0' ELSE TO_CHAR (a."BUNKATSU_MAIL_F") END IN (:bunkatsu_mail_f) 
    AND CASE WHEN a."CHUMON_MAIL_F" IS NULL THEN '0' ELSE TO_CHAR (a."CHUMON_MAIL_F") END IN (:chumon_mail_f) 
    AND TRIM (a."CHUMON_MAIL_HM") = TRIM (:chumon_mail_hm) 
    AND a."CHUMON_MAIL_HM" >= :chumon_mail_hm_1 
    AND a."CHUMON_MAIL_HM" <= :chumon_mail_hm_2 
    AND CASE WHEN a."KENSHU_MAIL_F" IS NULL THEN '0' ELSE TO_CHAR (a."KENSHU_MAIL_F") END IN (:kenshu_mail_f) 
    AND TRIM (a."KENSHU_MAIL_HM") = TRIM (:kenshu_mail_hm) 
    AND a."KENSHU_MAIL_HM" >= :kenshu_mail_hm_1 
    AND a."KENSHU_MAIL_HM" <= :kenshu_mail_hm_2 
    AND CASE WHEN a."MAIL_BCC_F" IS NULL THEN '0' ELSE TO_CHAR (a."MAIL_BCC_F") END IN (:mail_bcc_f) 
ORDER BY
    a."SUP_CODE"
