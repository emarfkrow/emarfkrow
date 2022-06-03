SELECT
      a.*
FROM
    M_TOKUI a 
WHERE
    1 = 1 
    AND a."TOKUCD" = :tokucd 
    AND TRIM (a."TOKUMEI1") = TRIM (:tokumei1) 
    AND TRIM (a."TOKUMEI2") = TRIM (:tokumei2) 
    AND TRIM (a."RTOKUMEI") = TRIM (:rtokumei) 
    AND TRIM (a."UBINNO") = TRIM (:ubinno) 
    AND TRIM (a."TOKU-JUSHO1") = TRIM (:toku_jusho1) 
    AND TRIM (a."TOKU-JUSHO2") = TRIM (:toku_jusho2) 
    AND TRIM (a."TELNO") = TRIM (:telno) 
    AND a."SEIKYUCD" = :seikyucd 
    AND a."MAILCD" = :mailcd 
    AND a."SHUKINCD" = :shukincd 
    AND a."HONSHACD" = :honshacd 
    AND a."SHUKEICD" = :shukeicd 
    AND TRIM (a."TANKAKBN") = TRIM (:tankakbn) 
    AND TRIM (a."BONUSKBN") = TRIM (:bonuskbn) 
    AND TRIM (a."NOHINKBN") = TRIM (:nohinkbn) 
    AND TRIM (a."HAKKOKBN") = TRIM (:hakkokbn) 
    AND TRIM (a."NOHINFORMKBN") = TRIM (:nohinformkbn) 
    AND TRIM (a."SIMUKEKBN") = TRIM (:simukekbn) 
    AND TRIM (a."EIGYOKBN") = TRIM (:eigyokbn) 
    AND TRIM (a."FILLER1") = TRIM (:filler1) 
    AND TRIM (a."KINLESSKBN") = TRIM (:kinlesskbn) 
    AND TRIM (a."SEIKYOKBN") = TRIM (:seikyokbn) 
    AND a."TIKUSIMEBI" = :tikusimebi 
    AND a."MISESIMEBI" = :misesimebi 
    AND a."TOUROKUBI" = :tourokubi 
    AND TRIM (a."JUKINKBN") = TRIM (:jukinkbn) 
    AND TRIM (a."TENKINKBN") = TRIM (:tenkinkbn) 
    AND TRIM (a."URISUMKBN") = TRIM (:urisumkbn) 
    AND TRIM (a."DIYKBN") = TRIM (:diykbn) 
    AND TRIM (a."KTOKUMEI") = TRIM (:ktokumei) 
    AND TRIM (a."ZEIKBN") = TRIM (:zeikbn) 
    AND a."EI-TANTOCD" = :ei_tantocd 
    AND TRIM (a."SICHOCD") = TRIM (:sichocd) 
    AND TRIM (a."FAXNO") = TRIM (:faxno) 
    AND TRIM (a."TOKUIKBN1") = TRIM (:tokuikbn1) 
    AND TRIM (a."TOKUIKBN2") = TRIM (:tokuikbn2) 
    AND TRIM (a."TOKUIKBN3") = TRIM (:tokuikbn3) 
    AND TRIM (a."FAXKBN") = TRIM (:faxkbn) 
    AND TRIM (a."UNSOCD") = TRIM (:unsocd) 
    AND TRIM (a."URISUMKBNM") = TRIM (:urisumkbnm) 
    AND TRIM (a."TIKUCD") = TRIM (:tikucd) 
    AND TRIM (a."TODOFUKENCD") = TRIM (:todofukencd) 
    AND TRIM (a."KOKUSAICD") = TRIM (:kokusaicd) 
    AND TRIM (a."KUNICD") = TRIM (:kunicd) 
    AND TRIM (a."EIGYOAREACD") = TRIM (:eigyoareacd) 
    AND a."KENSYUKIKAN" = :kensyukikan 
    AND TRIM (a."E-SEIKYUKBN") = TRIM (:e_seikyukbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."TOKUCD"
