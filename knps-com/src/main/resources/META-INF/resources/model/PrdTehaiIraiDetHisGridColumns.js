/**
 * PRD_TEHAI_IRAI_DET_HISグリッド定義
 */

let PrdTehaiIraiDetHisGridColumns = [
    Column.cell('PRD_TEHAI_NO', Messages['PrdTehaiIraiDetHisGrid.prdTehaiNo'], 100, 'primaryKey', null),
    Column.cell('IRAI_DET_SEQ', Messages['PrdTehaiIraiDetHisGrid.iraiDetSeq'], 100, 'primaryKey', null),
    Column.cell('IRAI_DET_HIS_SEQ', Messages['PrdTehaiIraiDetHisGrid.iraiDetHisSeq'], 100, 'primaryKey', null),
    Column.text('ID', Messages['PrdTehaiIraiDetHisGrid.id'], 140, '', null),
    Column.text('PARENT_ID', Messages['PrdTehaiIraiDetHisGrid.parentId'], 140, '', null),
    Column.text('IRAI_HINBAN', Messages['PrdTehaiIraiDetHisGrid.iraiHinban'], 250, '', null),
    Column.text('IRAI_QT', Messages['PrdTehaiIraiDetHisGrid.iraiQt'], 110, '', null),
    Column.check('SHINSETSUHIN_F', Messages['PrdTehaiIraiDetHisGrid.shinsetsuhinF'], 10, ''),
    Column.check('SETHIN_F', Messages['PrdTehaiIraiDetHisGrid.sethinF'], 10, ''),
    Column.check('HANMOKUGAI_F', Messages['PrdTehaiIraiDetHisGrid.hanmokugaiF'], 10, ''),
    Column.check('CHUMON_NYURYOKU_ZUMI_F', Messages['PrdTehaiIraiDetHisGrid.chumonNyuryokuZumiF'], 10, ''),
    Column.date('KIBO_NOKI_YMD', Messages['PrdTehaiIraiDetHisGrid.kiboNokiYmd'], 100, '', null),
    Column.check('SHUKKA_ZUMI_F', Messages['PrdTehaiIraiDetHisGrid.shukkaZumiF'], 10, ''),
    Column.select('TEHAI_JOKYO_KB', Messages['PrdTehaiIraiDetHisGrid.tehaiJokyoKb'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('KAITEI_JOKYO_KB', Messages['PrdTehaiIraiDetHisGrid.kaiteiJokyoKb'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdTehaiIraiDetHisGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdTehaiIraiDetHisGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdTehaiIraiDetHisGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdTehaiIraiDetHisGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('IRAI_INZU_QT', Messages['PrdTehaiIraiDetHisGrid.iraiInzuQt'], 110, '', null),
];
