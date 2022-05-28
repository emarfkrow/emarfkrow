SELECT
      a.*
    , (SELECT r2.TAX_NAME FROM MST_TAX r2 WHERE r2.TAX_CODE = a.TAX_CODE) AS TAX_NAME
FROM
    MST_SUPPLIER_BK a 
WHERE
    1 = 1 
    AND TRIM (a.yy) = TRIM (:yy) 
    AND TRIM (a.sup_code) IN (:sup_code) 
    AND a.sup_kbn IN (:sup_kbn) 
    AND a.sup_name LIKE '%' || :sup_name || '%' 
    AND a.sup_ryaku = :sup_ryaku 
    AND TRIM (a.zip_code) IN (:zip_code) 
    AND a.address1 = :address1 
    AND a.address2 = :address2 
    AND a.tel_no = :tel_no 
    AND a.fax_no = :fax_no 
    AND a.div_name LIKE '%' || :div_name || '%' 
    AND a.sup_ope_name LIKE '%' || :sup_ope_name || '%' 
    AND a.sup_ope_mail_add = :sup_ope_mail_add 
    AND TRIM (a.sup_period_day) = TRIM (:sup_period_day) 
    AND TRIM (a.pay_day) = TRIM (:pay_day) 
    AND TRIM (a.tax_code) IN (:tax_code) 
    AND a.tax_cal_code IN (:tax_cal_code) 
    AND a.tax_disp_code IN (:tax_disp_code) 
    AND a.fraction_kbn IN (:fraction_kbn) 
    AND a.yoshingendo = :yoshingendo 
    AND TRIM (a.company_ope_code) IN (:company_ope_code) 
    AND a.order_accept_kbn IN (:order_accept_kbn) 
    AND a.list_output_kbn IN (:list_output_kbn) 
    AND TRIM (a.pch_cost_rate_code) IN (:pch_cost_rate_code) 
    AND a.send_sup_kbn IN (:send_sup_kbn) 
    AND a.send_sup_name LIKE '%' || :send_sup_name || '%' 
    AND a.send_sup_ryaku = :send_sup_ryaku 
    AND TRIM (a.send_zip_code) IN (:send_zip_code) 
    AND a.send_address1 = :send_address1 
    AND a.send_address2 = :send_address2 
    AND a.send_tel_no = :send_tel_no 
    AND a.send_fax_no = :send_fax_no 
    AND a.send_inspect_list = :send_inspect_list 
    AND a.company_div_name LIKE '%' || :company_div_name || '%' 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND TRIM (a.nohin_yobi_sun) = TRIM (:nohin_yobi_sun) 
    AND TRIM (a.nohin_yobi_mon) = TRIM (:nohin_yobi_mon) 
    AND TRIM (a.nohin_yobi_tue) = TRIM (:nohin_yobi_tue) 
    AND TRIM (a.nohin_yobi_wed) = TRIM (:nohin_yobi_wed) 
    AND TRIM (a.nohin_yobi_thu) = TRIM (:nohin_yobi_thu) 
    AND TRIM (a.nohin_yobi_fri) = TRIM (:nohin_yobi_fri) 
    AND TRIM (a.nohin_yobi_sat) = TRIM (:nohin_yobi_sat) 
    AND TRIM (a.nohin_send_yohi_kbn) IN (:nohin_send_yohi_kbn) 
    AND CASE WHEN a.bunkatsu_mail_f IS NULL THEN '0' ELSE TO_CHAR (a.bunkatsu_mail_f) END IN (:bunkatsu_mail_f) 
    AND CASE WHEN a.chumon_mail_f IS NULL THEN '0' ELSE TO_CHAR (a.chumon_mail_f) END IN (:chumon_mail_f) 
    AND TRIM (a.chumon_mail_hm) = TRIM (:chumon_mail_hm) 
    AND a.chumon_mail_hm >= :chumon_mail_hm_1 
    AND a.chumon_mail_hm <= :chumon_mail_hm_2 
    AND CASE WHEN a.kenshu_mail_f IS NULL THEN '0' ELSE TO_CHAR (a.kenshu_mail_f) END IN (:kenshu_mail_f) 
    AND TRIM (a.kenshu_mail_hm) = TRIM (:kenshu_mail_hm) 
    AND a.kenshu_mail_hm >= :kenshu_mail_hm_1 
    AND a.kenshu_mail_hm <= :kenshu_mail_hm_2 
    AND CASE WHEN a.mail_bcc_f IS NULL THEN '0' ELSE TO_CHAR (a.mail_bcc_f) END IN (:mail_bcc_f) 
ORDER BY
    a.SUP_CODE, a.YY
