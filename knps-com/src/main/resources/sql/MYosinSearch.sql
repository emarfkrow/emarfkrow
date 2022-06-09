SELECT
      a.*
FROM
    M_YOSIN a 
WHERE
    1 = 1 
    AND a."SHUKINCD" = :shukincd 
    AND a."HONSHACD" = :honshacd 
    AND TRIM (a."RTOKUMEI") = TRIM (:rtokumei) 
    AND TRIM (a."SINYO-RANK") = TRIM (:sinyo_rank) 
    AND a."SINYO-HOKEN" = :sinyo_hoken 
    AND a."EIGYO-HOSYOKIN" = :eigyo_hosyokin 
    AND a."TANPO-KABUSU" = :tanpo_kabusu 
    AND a."SHUSHIGAKU" = :shushigaku 
    AND a."KASIDAORE-HIKIATE" = :kasidaore_hikiate 
    AND a."SHUKA-GENDO" = :shuka_gendo 
    AND a."TOUROKUBI" = :tourokubi 
    AND a."TOUROKUBI" >= :tourokubi_1 
    AND a."TOUROKUBI" <= :tourokubi_2 
    AND a."UPDDATE" = :upddate 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."SHUKINCD"
