SELECT
      a.*
FROM
    M_YURYOKU a 
WHERE
    1 = 1 
    AND a.yuryocd = :yuryocd 
    AND TRIM (a.ryuryokumei) = TRIM (:ryuryokumei) 
    AND TRIM (a.yuryomei1) = TRIM (:yuryomei1) 
    AND TRIM (a.yuryomei2) = TRIM (:yuryomei2) 
    AND TRIM (a.yuryoku_jusho1) = TRIM (:yuryoku_jusho1) 
    AND TRIM (a.yuryoku_jusho2) = TRIM (:yuryoku_jusho2) 
    AND TRIM (a.ubinno) = TRIM (:ubinno) 
    AND TRIM (a.telno) = TRIM (:telno) 
    AND TRIM (a.faxno) = TRIM (:faxno) 
    AND TRIM (a.yuryokukbn) = TRIM (:yuryokukbn) 
    AND a.tourokubi = :tourokubi 
    AND TRIM (a.kyuryokumei) = TRIM (:kyuryokumei) 
    AND a.ki = :ki 
    AND a.kami_konyu = :kami_konyu 
    AND a.kami_siharai = :kami_siharai 
    AND a.kami_yuboritu = :kami_yuboritu 
    AND TRIM (a.kami_tasseikbn) = TRIM (:kami_tasseikbn) 
    AND a.simo_konyu = :simo_konyu 
    AND a.simo_siharai = :simo_siharai 
    AND a.simo_yuboritu = :simo_yuboritu 
    AND TRIM (a.simo_tasseikbn) = TRIM (:simo_tasseikbn) 
    AND TRIM (a.yutenkaikbn) = TRIM (:yutenkaikbn) 
    AND TRIM (a.torihiki_kbn) IN (:torihiki_kbn) 
    AND TRIM (a.gyoshu_kbn) IN (:gyoshu_kbn) 
    AND TRIM (a.sichocd) = TRIM (:sichocd) 
    AND a.faxkbn = :faxkbn 
    AND TRIM (a.ritukbn) = TRIM (:ritukbn) 
    AND TRIM (a.unsocd) = TRIM (:unsocd) 
    AND TRIM (a.tikucd) = TRIM (:tikucd) 
    AND TRIM (a.todofukencd) = TRIM (:todofukencd) 
    AND TRIM (a.eigyokbn) = TRIM (:eigyokbn) 
    AND TRIM (a.yuryoku_rank) = TRIM (:yuryoku_rank) 
    AND TRIM (a.stkbn) = TRIM (:stkbn) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.YURYOCD
