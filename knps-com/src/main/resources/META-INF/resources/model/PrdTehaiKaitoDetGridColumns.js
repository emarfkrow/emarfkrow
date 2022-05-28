/**
 * PRD_TEHAI_KAITO_DETグリッド定義
 */

let PrdTehaiKaitoDetGridColumns = [
    Column.cell('PRD_TEHAI_NO', Messages['PrdTehaiKaitoDetGrid.prdTehaiNo'], 100, 'primaryKey', null),
    Column.cell('KAITO_DET_SEQ', Messages['PrdTehaiKaitoDetGrid.kaitoDetSeq'], 100, 'primaryKey', null),
    Column.text('IRAI_DET_SEQ', Messages['PrdTehaiKaitoDetGrid.iraiDetSeq'], 100, '', null),
    Column.text('ID', Messages['PrdTehaiKaitoDetGrid.id'], 140, '', null),
    Column.text('PARENT_ID', Messages['PrdTehaiKaitoDetGrid.parentId'], 140, '', null),
    Column.text('KAITO_HINBAN', Messages['PrdTehaiKaitoDetGrid.kaitoHinban'], 250, '', null),
    Column.text('KAITO_QT', Messages['PrdTehaiKaitoDetGrid.kaitoQt'], 110, '', null),
    Column.check('FUMEIHIN_F', Messages['PrdTehaiKaitoDetGrid.fumeihinF'], 10, ''),
    Column.check('SETHIN_F', Messages['PrdTehaiKaitoDetGrid.sethinF'], 10, ''),
    Column.date('KIBO_NOKI_YMD', Messages['PrdTehaiKaitoDetGrid.kiboNokiYmd'], 100, '', null),
    Column.text('HINBAN_TANTOSHA_CD', Messages['PrdTehaiKaitoDetGrid.hinbanTantoshaCd'], 100, '', null),
    Column.check('SET_NOKI_TUCHI_F', Messages['PrdTehaiKaitoDetGrid.setNokiTuchiF'], 10, ''),
    Column.date('KAITO_NOKI_YMD', Messages['PrdTehaiKaitoDetGrid.kaitoNokiYmd'], 100, '', null),
    Column.text('KAITO_NOKI_CMT', Messages['PrdTehaiKaitoDetGrid.kaitoNokiCmt'], 300, '', null),
    Column.text('NOKI_KAITOSHA_CD', Messages['PrdTehaiKaitoDetGrid.nokiKaitoshaCd'], 100, '', null),
    Column.dateTime('NOKI_KAITO_DT', Messages['PrdTehaiKaitoDetGrid.nokiKaitoDt'], 70, ''),
    Column.check('KAITO_NOKI_HININ_F', Messages['PrdTehaiKaitoDetGrid.kaitoNokiHininF'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdTehaiKaitoDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdTehaiKaitoDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdTehaiKaitoDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdTehaiKaitoDetGrid.userIdChange'], 100, 'metaInfo', null),
];
