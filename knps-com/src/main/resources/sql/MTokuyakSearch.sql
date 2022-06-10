SELECT
      a.*
FROM
    M_TOKUYAK a 
WHERE
    1 = 1 
    AND a."TOKUYAKUCD" = :tokuyakucd 
    AND a."TOKUCD" = :tokucd 
    AND TRIM (a."HTOKUYAKUCD") = TRIM (:htokuyakucd) 
    AND TRIM (a."EIGYOKBN") IN (:eigyokbn) 
    AND TRIM (a."YURYOKUKBN") IN (:yuryokukbn) 
    AND TRIM (a."GYOSHU-KBN") IN (:gyoshu_kbn) 
    AND TRIM (a."RTOKUYAKUMEI") = TRIM (:rtokuyakumei) 
    AND TRIM (a."TOKUYAKUMEI1") = TRIM (:tokuyakumei1) 
    AND TRIM (a."TOKUYAKUMEI2") = TRIM (:tokuyakumei2) 
    AND TRIM (a."TOKUYAKU_JUSHO1") = TRIM (:tokuyaku_jusho1) 
    AND TRIM (a."TOKUYAKU_JUSHO2") = TRIM (:tokuyaku_jusho2) 
    AND TRIM (a."KTOKUYAKUMEI") = TRIM (:ktokuyakumei) 
    AND TRIM (a."UBINNO") = TRIM (:ubinno) 
    AND TRIM (a."TELNO") = TRIM (:telno) 
    AND TRIM (a."FAXNO") = TRIM (:faxno) 
    AND a."TOUROKUBI" = :tourokubi 
    AND a."TOUROKUBI" >= :tourokubi_1 
    AND a."TOUROKUBI" <= :tourokubi_2 
    AND TRIM (a."TORIHIKI-KBN") IN (:torihiki_kbn) 
    AND a."KON_NPJUCHUKIN" = :kon_npjuchukin 
    AND a."KON_NPSHUKKA" = :kon_npshukka 
    AND a."ZEN_NPJUCHUKIN" = :zen_npjuchukin 
    AND a."ZEN_NPSHUKKA" = :zen_npshukka 
    AND TRIM (a."SICHOCD") = TRIM (:sichocd) 
    AND TRIM (a."FAXKBN") IN (:faxkbn) 
    AND TRIM (a."UNSOCD") = TRIM (:unsocd) 
    AND TRIM (a."TIKUCD") = TRIM (:tikucd) 
    AND TRIM (a."TODOFUKENCD") = TRIM (:todofukencd) 
ORDER BY
    a."TOKUYAKUCD"
