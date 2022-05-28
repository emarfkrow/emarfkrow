/**
 * MST_COST_CENTER_BKグリッド定義
 */

let MstCostCenterBkGridColumns = [
    Column.cell('YY', Messages['MstCostCenterBkGrid.yy'], 40, 'primaryKey', null),
    Column.cell('COST_CENTER_CODE', Messages['MstCostCenterBkGrid.costCenterCode'], 100, 'primaryKey', null),
    Column.text('COST_CENTER_NAME', Messages['MstCostCenterBkGrid.costCenterName'], 300, '', null),
    Column.select('IN_OUT_KBN', Messages['MstCostCenterBkGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('SUP_CODE', Messages['MstCostCenterBkGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.select('COST_RATE_KBN', Messages['MstCostCenterBkGrid.costRateKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('COST_RATE_CODE', Messages['MstCostCenterBkGrid.costRateCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('COST_COLLECT', Messages['MstCostCenterBkGrid.costCollect'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstCostCenterBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstCostCenterBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstCostCenterBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstCostCenterBkGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstCostCenterBkGrid.deleteFlag'], 10, ''),
];
