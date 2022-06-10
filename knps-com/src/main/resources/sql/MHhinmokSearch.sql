SELECT
      a.*
FROM
    M_HHINMOK a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND a."LVCD" = :lvcd 
    AND CASE WHEN a."DLTFLG" IS NULL THEN '0' ELSE TO_CHAR (a."DLTFLG") END IN (:dltflg) 
    AND TRIM (a."HINCD") = TRIM (:hincd) 
    AND TRIM (a."HINMEI") = TRIM (:hinmei) 
    AND TRIM (a."SETKBN") IN (:setkbn) 
    AND TRIM (a."SSHINKBN") IN (:sshinkbn) 
    AND TRIM (a."JUKINKBN") IN (:jukinkbn) 
    AND TRIM (a."TENKINKBN") IN (:tenkinkbn) 
    AND TRIM (a."NYUKOKINKBN") IN (:nyukokinkbn) 
    AND TRIM (a."SEIHINKBN") IN (:seihinkbn) 
    AND TRIM (a."SIJIKBN") IN (:sijikbn) 
    AND a."SHOHIN-BUNRUI" IN (:shohin_bunrui) 
    AND a."KIJUNZAIKO" = :kijunzaiko 
    AND a."KIJUNZAIKO" >= :kijunzaiko_1 
    AND a."KIJUNZAIKO" <= :kijunzaiko_2 
    AND a."SEI-TANJU" = :sei_tanju 
    AND a."SEI-TANJU" >= :sei_tanju_1 
    AND a."SEI-TANJU" <= :sei_tanju_2 
    AND a."LOCATIONNO" = :locationno 
    AND a."HOSOCD" = :hosocd 
    AND a."HOSOTANI" = :hosotani 
    AND TRIM (a."HOSOKEPIN") = TRIM (:hosokepin) 
    AND TRIM (a."KONPOKBN") IN (:konpokbn) 
    AND TRIM (a."KLKBN") IN (:klkbn) 
    AND TRIM (a."JISKBN") IN (:jiskbn) 
    AND a."SETKIJUNH" = :setkijunh 
    AND a."KIMATU-GENKA" = :kimatu_genka 
    AND a."KIMATU-GENKA" >= :kimatu_genka_1 
    AND a."KIMATU-GENKA" <= :kimatu_genka_2 
    AND a."HYOJUN-GENKA" = :hyojun_genka 
    AND a."HYOJUN-GENKA" >= :hyojun_genka_1 
    AND a."HYOJUN-GENKA" <= :hyojun_genka_2 
    AND a."NIJI-GENKA" = :niji_genka 
    AND a."NIJI-GENKA" >= :niji_genka_1 
    AND a."NIJI-GENKA" <= :niji_genka_2 
    AND a."HYOJUN-BAIKA" = :hyojun_baika 
    AND a."HYOJUN-BAIKA" >= :hyojun_baika_1 
    AND a."HYOJUN-BAIKA" <= :hyojun_baika_2 
    AND a."TOUROKUBI" = :tourokubi 
    AND a."TOUROKUBI" >= :tourokubi_1 
    AND a."TOUROKUBI" <= :tourokubi_2 
    AND a."HATUBAIBI" = :hatubaibi 
    AND a."HATUBAIBI" >= :hatubaibi_1 
    AND a."HATUBAIBI" <= :hatubaibi_2 
    AND TRIM (a."TOJITUKBN") IN (:tojitukbn) 
    AND a."SIN-SEIHIN-BUNRUI" IN (:sin_seihin_bunrui) 
    AND TRIM (a."DTEIBANKBN") IN (:dteibankbn) 
    AND TRIM (a."ZAIJUCKBN") IN (:zaijuckbn) 
    AND a."STANTOCD" = :stantocd 
    AND TRIM (a."TORIFUKBN") IN (:torifukbn) 
    AND TRIM (a."PRDENDKBN") IN (:prdendkbn) 
    AND a."BUNRUI4" = :bunrui4 
    AND TRIM (a."ZAISHUKBN") IN (:zaishukbn) 
    AND a."BARCODE" = :barcode 
    AND CASE WHEN a."DATA-FLG" IS NULL THEN '0' ELSE TO_CHAR (a."DATA-FLG") END IN (:data_flg) 
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
    AND a."SAPPOROZAIKO" >= :sapporozaiko_1 
    AND a."SAPPOROZAIKO" <= :sapporozaiko_2 
    AND a."SENDAIZAIKO" = :sendaizaiko 
    AND a."SENDAIZAIKO" >= :sendaizaiko_1 
    AND a."SENDAIZAIKO" <= :sendaizaiko_2 
    AND a."TOKYOZAIKO" = :tokyozaiko 
    AND a."TOKYOZAIKO" >= :tokyozaiko_1 
    AND a."TOKYOZAIKO" <= :tokyozaiko_2 
    AND a."KANTOZAIKO" = :kantozaiko 
    AND a."KANTOZAIKO" >= :kantozaiko_1 
    AND a."KANTOZAIKO" <= :kantozaiko_2 
    AND a."KANAZAWAZAIKO" = :kanazawazaiko 
    AND a."KANAZAWAZAIKO" >= :kanazawazaiko_1 
    AND a."KANAZAWAZAIKO" <= :kanazawazaiko_2 
    AND a."NAGOYAZAIKO" = :nagoyazaiko 
    AND a."NAGOYAZAIKO" >= :nagoyazaiko_1 
    AND a."NAGOYAZAIKO" <= :nagoyazaiko_2 
    AND a."KINKIZAIKO" = :kinkizaiko 
    AND a."KINKIZAIKO" >= :kinkizaiko_1 
    AND a."KINKIZAIKO" <= :kinkizaiko_2 
    AND a."HIROSIMAZAIKO" = :hirosimazaiko 
    AND a."HIROSIMAZAIKO" >= :hirosimazaiko_1 
    AND a."HIROSIMAZAIKO" <= :hirosimazaiko_2 
    AND a."FUKUOKAZAIKO" = :fukuokazaiko 
    AND a."FUKUOKAZAIKO" >= :fukuokazaiko_1 
    AND a."FUKUOKAZAIKO" <= :fukuokazaiko_2 
    AND a."GYOMUZAIKO" = :gyomuzaiko 
    AND a."GYOMUZAIKO" >= :gyomuzaiko_1 
    AND a."GYOMUZAIKO" <= :gyomuzaiko_2 
    AND a."BOEKIZAIKO" = :boekizaiko 
    AND a."BOEKIZAIKO" >= :boekizaiko_1 
    AND a."BOEKIZAIKO" <= :boekizaiko_2 
    AND a."HITECZAIKO" = :hiteczaiko 
    AND a."HITECZAIKO" >= :hiteczaiko_1 
    AND a."HITECZAIKO" <= :hiteczaiko_2 
    AND a."BOEKIITAKU" = :boekiitaku 
    AND a."SKTCHSZAIKO" = :sktchszaiko 
    AND a."SKTCHSZAIKO" >= :sktchszaiko_1 
    AND a."SKTCHSZAIKO" <= :sktchszaiko_2 
    AND a."HOSOZAIKO" = :hosozaiko 
    AND a."HOSOZAIKO" >= :hosozaiko_1 
    AND a."HOSOZAIKO" <= :hosozaiko_2 
    AND a."SENDYOTEIBI" = :sendyoteibi 
    AND a."SENDYOTEIBI" >= :sendyoteibi_1 
    AND a."SENDYOTEIBI" <= :sendyoteibi_2 
    AND a."SENDBI" = :sendbi 
    AND a."SENDBI" >= :sendbi_1 
    AND a."SENDBI" <= :sendbi_2 
    AND a."HINCDALT1" = :hincdalt1 
    AND a."HINCDALT2" = :hincdalt2 
    AND TRIM (a."NOUKIFUKAKBN") IN (:noukifukakbn) 
    AND TRIM (a."CHOKUHINKBN") IN (:chokuhinkbn) 
    AND TRIM (a."KOKUSAICD") = TRIM (:kokusaicd) 
    AND TRIM (a."KUNICD") = TRIM (:kunicd) 
    AND TRIM (a."CHOKUKAKBN") IN (:chokukakbn) 
ORDER BY
    a."HHINBAN"
