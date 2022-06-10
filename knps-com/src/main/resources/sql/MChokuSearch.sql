SELECT
      a.*
FROM
    M_CHOKU a 
WHERE
    1 = 1 
    AND a."CHOKUCD" = :chokucd 
    AND TRIM (a."CHOKUMEI1") = TRIM (:chokumei1) 
    AND TRIM (a."CHOKUMEI2") = TRIM (:chokumei2) 
    AND TRIM (a."RCHOKUMEI") = TRIM (:rchokumei) 
    AND TRIM (a."CHOKU-JUSHO1") = TRIM (:choku_jusho1) 
    AND TRIM (a."CHOKU-JUSHO2") = TRIM (:choku_jusho2) 
    AND TRIM (a."UBINNO") = TRIM (:ubinno) 
    AND TRIM (a."TELNO") = TRIM (:telno) 
    AND a."TOUROKUBI" = :tourokubi 
    AND a."TOUROKUBI" >= :tourokubi_1 
    AND a."TOUROKUBI" <= :tourokubi_2 
    AND TRIM (a."KCHOKUMEI") = TRIM (:kchokumei) 
    AND TRIM (a."SICHOCD") = TRIM (:sichocd) 
    AND TRIM (a."FAXNO") = TRIM (:faxno) 
    AND TRIM (a."TORIKESI-KBN") IN (:torikesi_kbn) 
    AND TRIM (a."UNSOCD") = TRIM (:unsocd) 
    AND TRIM (a."TIKUCD") = TRIM (:tikucd) 
    AND TRIM (a."TODOFUKENCD") = TRIM (:todofukencd) 
    AND TRIM (a."UPDNKINKBN") IN (:updnkinkbn) 
ORDER BY
    a."CHOKUCD"
