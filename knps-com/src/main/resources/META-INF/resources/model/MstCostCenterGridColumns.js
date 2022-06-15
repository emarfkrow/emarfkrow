/**
 * MST_COST_CENTERグリッド定義
 */

let MstCostCenterGridColumns = [
    Column.cell('COST_CENTER_CODE', Messages['MstCostCenterGrid.costCenterCode'], 100, 'primaryKey', null),
    Column.text('COST_CENTER_NAME', Messages['MstCostCenterGrid.costCenterName'], 300, '', null),
    Column.select('IN_OUT_KBN', Messages['MstCostCenterGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('SUP_CODE', Messages['MstCostCenterGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.select('COST_RATE_KBN', Messages['MstCostCenterGrid.costRateKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('COST_RATE_CODE', Messages['MstCostCenterGrid.costRateCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('COST_COLLECT', Messages['MstCostCenterGrid.costCollect'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstCostCenterGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstCostCenterGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstCostCenterGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstCostCenterGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstCostCenterGrid.deleteFlag'], 10, ''),
];
