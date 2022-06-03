SELECT
      a.*
FROM
    M_TOKUYAK a 
WHERE
    1 = 1 
    AND a.tokuyakucd = :tokuyakucd 
    AND a.tokucd = :tokucd 
    AND TRIM (a.htokuyakucd) = TRIM (:htokuyakucd) 
    AND TRIM (a.eigyokbn) = TRIM (:eigyokbn) 
    AND TRIM (a.yuryokukbn) = TRIM (:yuryokukbn) 
    AND TRIM (a.gyoshu_kbn) IN (:gyoshu_kbn) 
    AND TRIM (a.rtokuyakumei) = TRIM (:rtokuyakumei) 
    AND TRIM (a.tokuyakumei1) = TRIM (:tokuyakumei1) 
    AND TRIM (a.tokuyakumei2) = TRIM (:tokuyakumei2) 
    AND TRIM (a.tokuyaku_jusho1) = TRIM (:tokuyaku_jusho1) 
    AND TRIM (a.tokuyaku_jusho2) = TRIM (:tokuyaku_jusho2) 
    AND TRIM (a.ktokuyakumei) = TRIM (:ktokuyakumei) 
    AND TRIM (a.ubinno) = TRIM (:ubinno) 
    AND TRIM (a.telno) = TRIM (:telno) 
    AND TRIM (a.faxno) = TRIM (:faxno) 
    AND a.tourokubi = :tourokubi 
    AND TRIM (a.torihiki_kbn) IN (:torihiki_kbn) 
    AND a.kon_npjuchukin = :kon_npjuchukin 
    AND a.kon_npshukka = :kon_npshukka 
    AND a.zen_npjuchukin = :zen_npjuchukin 
    AND a.zen_npshukka = :zen_npshukka 
    AND TRIM (a.sichocd) = TRIM (:sichocd) 
    AND TRIM (a.faxkbn) = TRIM (:faxkbn) 
    AND TRIM (a.unsocd) = TRIM (:unsocd) 
    AND TRIM (a.tikucd) = TRIM (:tikucd) 
    AND TRIM (a.todofukencd) = TRIM (:todofukencd) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.TOKUYAKUCD
