SELECT
      a.*
FROM
    M_YOSIN a 
WHERE
    1 = 1 
    AND a.shukincd = :shukincd 
    AND a.honshacd = :honshacd 
    AND TRIM (a.rtokumei) = TRIM (:rtokumei) 
    AND TRIM (a.sinyo_rank) = TRIM (:sinyo_rank) 
    AND a.sinyo_hoken = :sinyo_hoken 
    AND a.eigyo_hosyokin = :eigyo_hosyokin 
    AND a.tanpo_kabusu = :tanpo_kabusu 
    AND a.shushigaku = :shushigaku 
    AND a.kasidaore_hikiate = :kasidaore_hikiate 
    AND a.shuka_gendo = :shuka_gendo 
    AND a.tourokubi = :tourokubi 
    AND a.upddate = :upddate 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.SHUKINCD
