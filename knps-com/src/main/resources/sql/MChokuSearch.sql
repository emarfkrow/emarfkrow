SELECT
      a.*
FROM
    M_CHOKU a 
WHERE
    1 = 1 
    AND a.chokucd = :chokucd 
    AND TRIM (a.chokumei1) = TRIM (:chokumei1) 
    AND TRIM (a.chokumei2) = TRIM (:chokumei2) 
    AND TRIM (a.rchokumei) = TRIM (:rchokumei) 
    AND TRIM (a.choku_jusho1) = TRIM (:choku_jusho1) 
    AND TRIM (a.choku_jusho2) = TRIM (:choku_jusho2) 
    AND TRIM (a.ubinno) = TRIM (:ubinno) 
    AND TRIM (a.telno) = TRIM (:telno) 
    AND a.tourokubi = :tourokubi 
    AND TRIM (a.kchokumei) = TRIM (:kchokumei) 
    AND TRIM (a.sichocd) = TRIM (:sichocd) 
    AND TRIM (a.faxno) = TRIM (:faxno) 
    AND TRIM (a.torikesi_kbn) IN (:torikesi_kbn) 
    AND TRIM (a.unsocd) = TRIM (:unsocd) 
    AND TRIM (a.tikucd) = TRIM (:tikucd) 
    AND TRIM (a.todofukencd) = TRIM (:todofukencd) 
    AND TRIM (a.updnkinkbn) = TRIM (:updnkinkbn) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.CHOKUCD
