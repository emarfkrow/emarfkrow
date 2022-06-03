SELECT
      a.*
FROM
    M_TOKUI a 
WHERE
    1 = 1 
    AND a.tokucd = :tokucd 
    AND TRIM (a.tokumei1) = TRIM (:tokumei1) 
    AND TRIM (a.tokumei2) = TRIM (:tokumei2) 
    AND TRIM (a.rtokumei) = TRIM (:rtokumei) 
    AND TRIM (a.ubinno) = TRIM (:ubinno) 
    AND TRIM (a.toku_jusho1) = TRIM (:toku_jusho1) 
    AND TRIM (a.toku_jusho2) = TRIM (:toku_jusho2) 
    AND TRIM (a.telno) = TRIM (:telno) 
    AND a.seikyucd = :seikyucd 
    AND a.mailcd = :mailcd 
    AND a.shukincd = :shukincd 
    AND a.honshacd = :honshacd 
    AND a.shukeicd = :shukeicd 
    AND TRIM (a.tankakbn) = TRIM (:tankakbn) 
    AND TRIM (a.bonuskbn) = TRIM (:bonuskbn) 
    AND TRIM (a.nohinkbn) = TRIM (:nohinkbn) 
    AND TRIM (a.hakkokbn) = TRIM (:hakkokbn) 
    AND TRIM (a.nohinformkbn) = TRIM (:nohinformkbn) 
    AND TRIM (a.simukekbn) = TRIM (:simukekbn) 
    AND TRIM (a.eigyokbn) = TRIM (:eigyokbn) 
    AND TRIM (a.filler1) = TRIM (:filler1) 
    AND TRIM (a.kinlesskbn) = TRIM (:kinlesskbn) 
    AND TRIM (a.seikyokbn) = TRIM (:seikyokbn) 
    AND a.tikusimebi = :tikusimebi 
    AND a.misesimebi = :misesimebi 
    AND a.tourokubi = :tourokubi 
    AND TRIM (a.jukinkbn) = TRIM (:jukinkbn) 
    AND TRIM (a.tenkinkbn) = TRIM (:tenkinkbn) 
    AND TRIM (a.urisumkbn) = TRIM (:urisumkbn) 
    AND TRIM (a.diykbn) = TRIM (:diykbn) 
    AND TRIM (a.ktokumei) = TRIM (:ktokumei) 
    AND TRIM (a.zeikbn) = TRIM (:zeikbn) 
    AND a.ei_tantocd = :ei_tantocd 
    AND TRIM (a.sichocd) = TRIM (:sichocd) 
    AND TRIM (a.faxno) = TRIM (:faxno) 
    AND TRIM (a.tokuikbn1) = TRIM (:tokuikbn1) 
    AND TRIM (a.tokuikbn2) = TRIM (:tokuikbn2) 
    AND TRIM (a.tokuikbn3) = TRIM (:tokuikbn3) 
    AND TRIM (a.faxkbn) = TRIM (:faxkbn) 
    AND TRIM (a.unsocd) = TRIM (:unsocd) 
    AND TRIM (a.urisumkbnm) = TRIM (:urisumkbnm) 
    AND TRIM (a.tikucd) = TRIM (:tikucd) 
    AND TRIM (a.todofukencd) = TRIM (:todofukencd) 
    AND TRIM (a.kokusaicd) = TRIM (:kokusaicd) 
    AND TRIM (a.kunicd) = TRIM (:kunicd) 
    AND TRIM (a.eigyoareacd) = TRIM (:eigyoareacd) 
    AND a.kensyukikan = :kensyukikan 
    AND TRIM (a.e_seikyukbn) = TRIM (:e_seikyukbn) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.TOKUCD
