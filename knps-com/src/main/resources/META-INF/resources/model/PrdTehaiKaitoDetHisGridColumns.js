/**
 * PRD_TEHAI_KAITO_DET_HISグリッド定義
 */

let PrdTehaiKaitoDetHisGridColumns = [
    Column.cell('PRD_TEHAI_NO', Messages['PrdTehaiKaitoDetHisGrid.prdTehaiNo'], 100, 'primaryKey', null),
    Column.cell('KAITO_DET_HIS_SEQ', Messages['PrdTehaiKaitoDetHisGrid.kaitoDetHisSeq'], 100, 'primaryKey', null),
    Column.cell('KAITO_DET_SEQ', Messages['PrdTehaiKaitoDetHisGrid.kaitoDetSeq'], 100, 'primaryKey', null),
    Column.text('IRAI_DET_SEQ', Messages['PrdTehaiKaitoDetHisGrid.iraiDetSeq'], 100, '', null),
    Column.text('ID', Messages['PrdTehaiKaitoDetHisGrid.id'], 140, '', null),
    Column.text('PARENT_ID', Messages['PrdTehaiKaitoDetHisGrid.parentId'], 140, '', null),
    Column.text('KAITO_HINBAN', Messages['PrdTehaiKaitoDetHisGrid.kaitoHinban'], 250, '', null),
    Column.text('KAITO_QT', Messages['PrdTehaiKaitoDetHisGrid.kaitoQt'], 110, '', null),
    Column.check('FUMEIHIN_F', Messages['PrdTehaiKaitoDetHisGrid.fumeihinF'], 10, ''),
    Column.check('SETHIN_F', Messages['PrdTehaiKaitoDetHisGrid.sethinF'], 10, ''),
    Column.date('KIBO_NOKI_YMD', Messages['PrdTehaiKaitoDetHisGrid.kiboNokiYmd'], 100, '', null),
    Column.text('HINBAN_TANTOSHA_CD', Messages['PrdTehaiKaitoDetHisGrid.hinbanTantoshaCd'], 100, '', null),
    Column.check('SET_NOKI_TUCHI_F', Messages['PrdTehaiKaitoDetHisGrid.setNokiTuchiF'], 10, ''),
    Column.date('KAITO_NOKI_YMD', Messages['PrdTehaiKaitoDetHisGrid.kaitoNokiYmd'], 100, '', null),
    Column.text('KAITO_NOKI_CMT', Messages['PrdTehaiKaitoDetHisGrid.kaitoNokiCmt'], 300, '', null),
    Column.text('NOKI_KAITOSHA_CD', Messages['PrdTehaiKaitoDetHisGrid.nokiKaitoshaCd'], 100, '', null),
    Column.dateTime('NOKI_KAITO_DT', Messages['PrdTehaiKaitoDetHisGrid.nokiKaitoDt'], 70, ''),
    Column.check('KAITO_NOKI_HININ_F', Messages['PrdTehaiKaitoDetHisGrid.kaitoNokiHininF'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdTehaiKaitoDetHisGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdTehaiKaitoDetHisGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdTehaiKaitoDetHisGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdTehaiKaitoDetHisGrid.userIdChange'], 100, 'metaInfo', null),
];
