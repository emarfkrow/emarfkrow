/**
 * PRD_TEHAI_IRAI_DETグリッド定義
 */

let PrdTehaiIraiDetGridColumns = [
    Column.cell('PRD_TEHAI_NO', Messages['PrdTehaiIraiDetGrid.prdTehaiNo'], 100, 'primaryKey', null),
    Column.cell('IRAI_DET_SEQ', Messages['PrdTehaiIraiDetGrid.iraiDetSeq'], 100, 'primaryKey', null),
    Column.text('ID', Messages['PrdTehaiIraiDetGrid.id'], 140, '', null),
    Column.text('PARENT_ID', Messages['PrdTehaiIraiDetGrid.parentId'], 140, '', null),
    Column.refer('IRAI_HINBAN', Messages['PrdTehaiIraiDetGrid.iraiHinban'], 250, '', 'IRAI_HINMEI'),
    Column.text('IRAI_QT', Messages['PrdTehaiIraiDetGrid.iraiQt'], 110, '', null),
    Column.check('SHINSETSUHIN_F', Messages['PrdTehaiIraiDetGrid.shinsetsuhinF'], 10, ''),
    Column.check('SETHIN_F', Messages['PrdTehaiIraiDetGrid.sethinF'], 10, ''),
    Column.check('HANMOKUGAI_F', Messages['PrdTehaiIraiDetGrid.hanmokugaiF'], 10, ''),
    Column.check('CHUMON_NYURYOKU_ZUMI_F', Messages['PrdTehaiIraiDetGrid.chumonNyuryokuZumiF'], 10, ''),
    Column.date('KIBO_NOKI_YMD', Messages['PrdTehaiIraiDetGrid.kiboNokiYmd'], 100, '', null),
    Column.check('SHUKKA_ZUMI_F', Messages['PrdTehaiIraiDetGrid.shukkaZumiF'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdTehaiIraiDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdTehaiIraiDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdTehaiIraiDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdTehaiIraiDetGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('IRAI_INZU_QT', Messages['PrdTehaiIraiDetGrid.iraiInzuQt'], 110, '', null),
];
