SELECT
      a.*
FROM
    M_HHINMOK a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND a."LVCD" = :lvcd 
    AND a."DLTFLG" = :dltflg 
    AND TRIM (a."HINCD") = TRIM (:hincd) 
    AND TRIM (a."HINMEI") = TRIM (:hinmei) 
    AND TRIM (a."SETKBN") = TRIM (:setkbn) 
    AND TRIM (a."SSHINKBN") = TRIM (:sshinkbn) 
    AND TRIM (a."JUKINKBN") = TRIM (:jukinkbn) 
    AND TRIM (a."TENKINKBN") = TRIM (:tenkinkbn) 
    AND TRIM (a."NYUKOKINKBN") = TRIM (:nyukokinkbn) 
    AND TRIM (a."SEIHINKBN") = TRIM (:seihinkbn) 
    AND TRIM (a."SIJIKBN") = TRIM (:sijikbn) 
    AND a."SHOHIN-BUNRUI" = :shohin_bunrui 
    AND a."KIJUNZAIKO" = :kijunzaiko 
    AND a."SEI-TANJU" = :sei_tanju 
    AND a."LOCATIONNO" = :locationno 
    AND a."HOSOCD" = :hosocd 
    AND a."HOSOTANI" = :hosotani 
    AND TRIM (a."HOSOKEPIN") = TRIM (:hosokepin) 
    AND TRIM (a."KONPOKBN") = TRIM (:konpokbn) 
    AND TRIM (a."KLKBN") = TRIM (:klkbn) 
    AND TRIM (a."JISKBN") = TRIM (:jiskbn) 
    AND a."SETKIJUNH" = :setkijunh 
    AND a."KIMATU-GENKA" = :kimatu_genka 
    AND a."HYOJUN-GENKA" = :hyojun_genka 
    AND a."NIJI-GENKA" = :niji_genka 
    AND a."HYOJUN-BAIKA" = :hyojun_baika 
    AND a."TOUROKUBI" = :tourokubi 
    AND a."HATUBAIBI" = :hatubaibi 
    AND TRIM (a."TOJITUKBN") = TRIM (:tojitukbn) 
    AND a."SIN-SEIHIN-BUNRUI" = :sin_seihin_bunrui 
    AND TRIM (a."DTEIBANKBN") = TRIM (:dteibankbn) 
    AND TRIM (a."ZAIJUCKBN") = TRIM (:zaijuckbn) 
    AND a."STANTOCD" = :stantocd 
    AND TRIM (a."TORIFUKBN") = TRIM (:torifukbn) 
    AND TRIM (a."PRDENDKBN") = TRIM (:prdendkbn) 
    AND a."BUNRUI4" = :bunrui4 
    AND TRIM (a."ZAISHUKBN") = TRIM (:zaishukbn) 
    AND a."BARCODE" = :barcode 
    AND CASE WHEN a."DATA-FLG" IS NULL THEN '0' ELSE TO_CHAR (a."DATA-FLG") END IN (:data_flg) 
    AND TRIM (a."FILLER3") = TRIM (:filler3) 
    AND TRIM (a."UPCCD") = TRIM (:upccd) 
    AND a."ZAIKOSU-H1" = :zaikosu_h1 
    AND a."ZAIKOSU-H2" = :zaikosu_h2 
    AND a."ZAIKOSU-H3" = :zaikosu_h3 
    AND a."ZAIKOSU-H4" = :zaikosu_h4 
    AND a."ZAIKOSU-H5" = :zaikosu_h5 
    AND a."SIJISU-H1" = :sijisu_h1 
    AND a."SIJISU-H2" = :sijisu_h2 
    AND a."SIJISU-H3" = :sijisu_h3 
    AND a."SIJISU-H4" = :sijisu_h4 
    AND a."HIKIATE-H1" = :hikiate_h1 
    AND a."HIKIATE-H2" = :hikiate_h2 
    AND a."HIKIATE-H3" = :hikiate_h3 
    AND a."HIKIATE-H4" = :hikiate_h4 
    AND a."SCHUZANSU1" = :schuzansu1 
    AND a."SCHUZANSU2" = :schuzansu2 
    AND a."SCHUZANSU3" = :schuzansu3 
    AND a."UCHUZANSU1" = :uchuzansu1 
    AND a."UCHUZANSU2" = :uchuzansu2 
    AND a."UCHUZANSU3" = :uchuzansu3 
    AND a."DCHUZANSU1" = :dchuzansu1 
    AND a."DCHUZANSU2" = :dchuzansu2 
    AND a."DCHUZANSU3" = :dchuzansu3 
    AND a."NYUKOYOTE-H1" = :nyukoyote_h1 
    AND a."NYUKOYOTE-H2" = :nyukoyote_h2 
    AND a."NYUKOYOTE-H3" = :nyukoyote_h3 
    AND a."NYUKOYOTE-H4" = :nyukoyote_h4 
    AND a."SAPPOROZAIKO" = :sapporozaiko 
    AND a."SENDAIZAIKO" = :sendaizaiko 
    AND a."TOKYOZAIKO" = :tokyozaiko 
    AND a."KANTOZAIKO" = :kantozaiko 
    AND a."KANAZAWAZAIKO" = :kanazawazaiko 
    AND a."NAGOYAZAIKO" = :nagoyazaiko 
    AND a."KINKIZAIKO" = :kinkizaiko 
    AND a."HIROSIMAZAIKO" = :hirosimazaiko 
    AND a."FUKUOKAZAIKO" = :fukuokazaiko 
    AND a."GYOMUZAIKO" = :gyomuzaiko 
    AND a."BOEKIZAIKO" = :boekizaiko 
    AND a."HITECZAIKO" = :hiteczaiko 
    AND a."BOEKIITAKU" = :boekiitaku 
    AND a."SKTCHSZAIKO" = :sktchszaiko 
    AND a."HOSOZAIKO" = :hosozaiko 
    AND a."SENDYOTEIBI" = :sendyoteibi 
    AND a."SENDBI" = :sendbi 
    AND TRIM (a."HINCDALT1") = TRIM (:hincdalt1) 
    AND TRIM (a."HINCDALT2") = TRIM (:hincdalt2) 
    AND TRIM (a."NOUKIFUKAKBN") = TRIM (:noukifukakbn) 
    AND TRIM (a."CHOKUHINKBN") = TRIM (:chokuhinkbn) 
    AND TRIM (a."KOKUSAICD") = TRIM (:kokusaicd) 
    AND TRIM (a."KUNICD") = TRIM (:kunicd) 
    AND TRIM (a."CHOKUKAKBN") = TRIM (:chokukakbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HHINBAN"
