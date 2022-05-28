/**
 * PRD_TEHAI_FLOWグリッド定義
 */

let PrdTehaiFlowGridColumns = [
    Column.cell('PRD_TEHAI_NO', Messages['PrdTehaiFlowGrid.prdTehaiNo'], 100, 'primaryKey', null),
    Column.cell('TEHAI_FLOW_SEQ', Messages['PrdTehaiFlowGrid.tehaiFlowSeq'], 100, 'primaryKey', null),
    Column.select('TEHAI_JOKYO_KB', Messages['PrdTehaiFlowGrid.tehaiJokyoKb'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('KAITEI_JOKYO_KB', Messages['PrdTehaiFlowGrid.kaiteiJokyoKb'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('SHORISHA_CD', Messages['PrdTehaiFlowGrid.shorishaCd'], 100, '', null),
    Column.dateTime('SHORI_DT', Messages['PrdTehaiFlowGrid.shoriDt'], 70, ''),
    Column.text('SHORI_CMT', Messages['PrdTehaiFlowGrid.shoriCmt'], 300, '', null),
    Column.text('AITESAKI_CD', Messages['PrdTehaiFlowGrid.aitesakiCd'], 100, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdTehaiFlowGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdTehaiFlowGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdTehaiFlowGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdTehaiFlowGrid.userIdChange'], 100, 'metaInfo', null),
];
