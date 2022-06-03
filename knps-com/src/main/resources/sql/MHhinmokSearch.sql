SELECT
      a.*
FROM
    M_HHINMOK a 
WHERE
    1 = 1 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND a.lvcd = :lvcd 
    AND a.dltflg = :dltflg 
    AND TRIM (a.hincd) = TRIM (:hincd) 
    AND TRIM (a.hinmei) = TRIM (:hinmei) 
    AND TRIM (a.setkbn) = TRIM (:setkbn) 
    AND TRIM (a.sshinkbn) = TRIM (:sshinkbn) 
    AND TRIM (a.jukinkbn) = TRIM (:jukinkbn) 
    AND TRIM (a.tenkinkbn) = TRIM (:tenkinkbn) 
    AND TRIM (a.nyukokinkbn) = TRIM (:nyukokinkbn) 
    AND TRIM (a.seihinkbn) = TRIM (:seihinkbn) 
    AND TRIM (a.sijikbn) = TRIM (:sijikbn) 
    AND a.shohin_bunrui = :shohin_bunrui 
    AND a.kijunzaiko = :kijunzaiko 
    AND a.sei_tanju = :sei_tanju 
    AND a.locationno = :locationno 
    AND a.hosocd = :hosocd 
    AND a.hosotani = :hosotani 
    AND TRIM (a.hosokepin) = TRIM (:hosokepin) 
    AND TRIM (a.konpokbn) = TRIM (:konpokbn) 
    AND TRIM (a.klkbn) = TRIM (:klkbn) 
    AND TRIM (a.jiskbn) = TRIM (:jiskbn) 
    AND a.setkijunh = :setkijunh 
    AND a.kimatu_genka = :kimatu_genka 
    AND a.hyojun_genka = :hyojun_genka 
    AND a.niji_genka = :niji_genka 
    AND a.hyojun_baika = :hyojun_baika 
    AND a.tourokubi = :tourokubi 
    AND a.hatubaibi = :hatubaibi 
    AND TRIM (a.tojitukbn) = TRIM (:tojitukbn) 
    AND a.sin_seihin_bunrui = :sin_seihin_bunrui 
    AND TRIM (a.dteibankbn) = TRIM (:dteibankbn) 
    AND TRIM (a.zaijuckbn) = TRIM (:zaijuckbn) 
    AND a.stantocd = :stantocd 
    AND TRIM (a.torifukbn) = TRIM (:torifukbn) 
    AND TRIM (a.prdendkbn) = TRIM (:prdendkbn) 
    AND a.bunrui4 = :bunrui4 
    AND TRIM (a.zaishukbn) = TRIM (:zaishukbn) 
    AND a.barcode = :barcode 
    AND CASE WHEN a.data_flg IS NULL THEN '0' ELSE TO_CHAR (a.data_flg) END IN (:data_flg) 
    AND TRIM (a.filler3) = TRIM (:filler3) 
    AND TRIM (a.upccd) = TRIM (:upccd) 
    AND a.zaikosu_h1 = :zaikosu_h1 
    AND a.zaikosu_h2 = :zaikosu_h2 
    AND a.zaikosu_h3 = :zaikosu_h3 
    AND a.zaikosu_h4 = :zaikosu_h4 
    AND a.zaikosu_h5 = :zaikosu_h5 
    AND a.sijisu_h1 = :sijisu_h1 
    AND a.sijisu_h2 = :sijisu_h2 
    AND a.sijisu_h3 = :sijisu_h3 
    AND a.sijisu_h4 = :sijisu_h4 
    AND a.hikiate_h1 = :hikiate_h1 
    AND a.hikiate_h2 = :hikiate_h2 
    AND a.hikiate_h3 = :hikiate_h3 
    AND a.hikiate_h4 = :hikiate_h4 
    AND a.schuzansu1 = :schuzansu1 
    AND a.schuzansu2 = :schuzansu2 
    AND a.schuzansu3 = :schuzansu3 
    AND a.uchuzansu1 = :uchuzansu1 
    AND a.uchuzansu2 = :uchuzansu2 
    AND a.uchuzansu3 = :uchuzansu3 
    AND a.dchuzansu1 = :dchuzansu1 
    AND a.dchuzansu2 = :dchuzansu2 
    AND a.dchuzansu3 = :dchuzansu3 
    AND a.nyukoyote_h1 = :nyukoyote_h1 
    AND a.nyukoyote_h2 = :nyukoyote_h2 
    AND a.nyukoyote_h3 = :nyukoyote_h3 
    AND a.nyukoyote_h4 = :nyukoyote_h4 
    AND a.sapporozaiko = :sapporozaiko 
    AND a.sendaizaiko = :sendaizaiko 
    AND a.tokyozaiko = :tokyozaiko 
    AND a.kantozaiko = :kantozaiko 
    AND a.kanazawazaiko = :kanazawazaiko 
    AND a.nagoyazaiko = :nagoyazaiko 
    AND a.kinkizaiko = :kinkizaiko 
    AND a.hirosimazaiko = :hirosimazaiko 
    AND a.fukuokazaiko = :fukuokazaiko 
    AND a.gyomuzaiko = :gyomuzaiko 
    AND a.boekizaiko = :boekizaiko 
    AND a.hiteczaiko = :hiteczaiko 
    AND a.boekiitaku = :boekiitaku 
    AND a.sktchszaiko = :sktchszaiko 
    AND a.hosozaiko = :hosozaiko 
    AND a.sendyoteibi = :sendyoteibi 
    AND a.sendbi = :sendbi 
    AND TRIM (a.hincdalt1) = TRIM (:hincdalt1) 
    AND TRIM (a.hincdalt2) = TRIM (:hincdalt2) 
    AND TRIM (a.noukifukakbn) = TRIM (:noukifukakbn) 
    AND TRIM (a.chokuhinkbn) = TRIM (:chokuhinkbn) 
    AND TRIM (a.kokusaicd) = TRIM (:kokusaicd) 
    AND TRIM (a.kunicd) = TRIM (:kunicd) 
    AND TRIM (a.chokukakbn) = TRIM (:chokukakbn) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HHINBAN
