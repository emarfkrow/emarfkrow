SELECT
      a.*
FROM
    M_YURYOKU a 
WHERE
    1 = 1 
    AND a."YURYOCD" = :yuryocd 
    AND TRIM (a."RYURYOKUMEI") = TRIM (:ryuryokumei) 
    AND TRIM (a."YURYOMEI1") = TRIM (:yuryomei1) 
    AND TRIM (a."YURYOMEI2") = TRIM (:yuryomei2) 
    AND TRIM (a."YURYOKU-JUSHO1") = TRIM (:yuryoku_jusho1) 
    AND TRIM (a."YURYOKU-JUSHO2") = TRIM (:yuryoku_jusho2) 
    AND TRIM (a."UBINNO") = TRIM (:ubinno) 
    AND TRIM (a."TELNO") = TRIM (:telno) 
    AND TRIM (a."FAXNO") = TRIM (:faxno) 
    AND TRIM (a."YURYOKUKBN") = TRIM (:yuryokukbn) 
    AND a."TOUROKUBI" = :tourokubi 
    AND TRIM (a."KYURYOKUMEI") = TRIM (:kyuryokumei) 
    AND a."KI" = :ki 
    AND a."KAMI-KONYU" = :kami_konyu 
    AND a."KAMI-SIHARAI" = :kami_siharai 
    AND a."KAMI-YUBORITU" = :kami_yuboritu 
    AND TRIM (a."KAMI-TASSEIKBN") = TRIM (:kami_tasseikbn) 
    AND a."SIMO-KONYU" = :simo_konyu 
    AND a."SIMO-SIHARAI" = :simo_siharai 
    AND a."SIMO-YUBORITU" = :simo_yuboritu 
    AND TRIM (a."SIMO-TASSEIKBN") = TRIM (:simo_tasseikbn) 
    AND TRIM (a."YUTENKAIKBN") = TRIM (:yutenkaikbn) 
    AND TRIM (a."TORIHIKI-KBN") IN (:torihiki_kbn) 
    AND TRIM (a."GYOSHU-KBN") IN (:gyoshu_kbn) 
    AND TRIM (a."SICHOCD") = TRIM (:sichocd) 
    AND a."FAXKBN" = :faxkbn 
    AND TRIM (a."RITUKBN") = TRIM (:ritukbn) 
    AND TRIM (a."UNSOCD") = TRIM (:unsocd) 
    AND TRIM (a."TIKUCD") = TRIM (:tikucd) 
    AND TRIM (a."TODOFUKENCD") = TRIM (:todofukencd) 
    AND TRIM (a."EIGYOKBN") = TRIM (:eigyokbn) 
    AND TRIM (a."YURYOKU-RANK") = TRIM (:yuryoku_rank) 
    AND TRIM (a."STKBN") = TRIM (:stkbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."YURYOCD"
