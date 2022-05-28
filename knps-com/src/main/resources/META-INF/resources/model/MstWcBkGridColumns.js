/**
 * MST_WC_BKグリッド定義
 */

let MstWcBkGridColumns = [
    Column.cell('YY', Messages['MstWcBkGrid.yy'], 40, 'primaryKey', null),
    Column.cell('WC_CODE', Messages['MstWcBkGrid.wcCode'], 30, 'primaryKey', null),
    Column.text('WC_NAME', Messages['MstWcBkGrid.wcName'], 300, '', null),
    Column.text('NORM_LT', Messages['MstWcBkGrid.normLt'], 60, '', null),
    Column.text('MAC_NORM_ABILITY', Messages['MstWcBkGrid.macNormAbility'], 70, '', null),
    Column.text('MAC_MAX_ABILITY', Messages['MstWcBkGrid.macMaxAbility'], 70, '', null),
    Column.text('MAC_COUNTS', Messages['MstWcBkGrid.macCounts'], 20, '', null),
    Column.text('ACT_GATHER_PAT_NO', Messages['MstWcBkGrid.actGatherPatNo'], 30, '', null),
    Column.text('OPE_FORM_PAT_NO', Messages['MstWcBkGrid.opeFormPatNo'], 20, '', null),
    Column.text('DELAY_ALERT_DAYS', Messages['MstWcBkGrid.delayAlertDays'], 30, '', null),
    Column.text('ATO_CONTROL', Messages['MstWcBkGrid.atoControl'], 10, '', null),
    Column.refer('ROUTING_CODE', Messages['MstWcBkGrid.routingCode'], 100, '', 'ROUTING_NAME'),
    Column.select('IN_OUT_KBN', Messages['MstWcBkGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('WS_CODE', Messages['MstWcBkGrid.wsCode'], 40, '', 'WS_NAME'),
    Column.refer('COST_CENTER_CODE', Messages['MstWcBkGrid.costCenterCode'], 100, '', 'COST_CENTER_NAME'),
    Column.select('NECK_KBN', Messages['MstWcBkGrid.neckKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('SUB_INV_CODE', Messages['MstWcBkGrid.subInvCode'], 100, '', 'SUB_INV_NAME'),
    Column.text('STOCK_CONTROL', Messages['MstWcBkGrid.stockControl'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstWcBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstWcBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstWcBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstWcBkGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstWcBkGrid.deleteFlag'], 10, ''),
    Column.text('ST_ALERT_RATIO', Messages['MstWcBkGrid.stAlertRatio'], 30, '', null),
    Column.text('ACT_INPUT_TYPE', Messages['MstWcBkGrid.actInputType'], 10, '', null),
    Column.check('NICHIJI_SHIME_F', Messages['MstWcBkGrid.nichijiShimeF'], 10, ''),
];
