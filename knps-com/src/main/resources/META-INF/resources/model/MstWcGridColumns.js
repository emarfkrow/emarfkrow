/**
 * MST_WCグリッド定義
 */

let MstWcGridColumns = [
    Column.cell('WC_CODE', Messages['MstWcGrid.wcCode'], 30, 'primaryKey', null),
    Column.text('WC_NAME', Messages['MstWcGrid.wcName'], 300, '', null),
    Column.text('NORM_LT', Messages['MstWcGrid.normLt'], 60, '', null),
    Column.text('MAC_NORM_ABILITY', Messages['MstWcGrid.macNormAbility'], 70, '', null),
    Column.text('MAC_MAX_ABILITY', Messages['MstWcGrid.macMaxAbility'], 70, '', null),
    Column.text('MAC_COUNTS', Messages['MstWcGrid.macCounts'], 20, '', null),
    Column.text('ACT_GATHER_PAT_NO', Messages['MstWcGrid.actGatherPatNo'], 30, '', null),
    Column.text('OPE_FORM_PAT_NO', Messages['MstWcGrid.opeFormPatNo'], 20, '', null),
    Column.text('DELAY_ALERT_DAYS', Messages['MstWcGrid.delayAlertDays'], 30, '', null),
    Column.text('ATO_CONTROL', Messages['MstWcGrid.atoControl'], 10, '', null),
    Column.refer('ROUTING_CODE', Messages['MstWcGrid.routingCode'], 100, '', 'ROUTING_NAME'),
    Column.select('IN_OUT_KBN', Messages['MstWcGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('WS_CODE', Messages['MstWcGrid.wsCode'], 40, '', 'WS_NAME'),
    Column.refer('COST_CENTER_CODE', Messages['MstWcGrid.costCenterCode'], 100, '', 'COST_CENTER_NAME'),
    Column.select('NECK_KBN', Messages['MstWcGrid.neckKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('SUB_INV_CODE', Messages['MstWcGrid.subInvCode'], 100, '', 'SUB_INV_NAME'),
    Column.text('STOCK_CONTROL', Messages['MstWcGrid.stockControl'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstWcGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstWcGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstWcGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstWcGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstWcGrid.deleteFlag'], 10, ''),
    Column.text('ST_ALERT_RATIO', Messages['MstWcGrid.stAlertRatio'], 30, '', null),
    Column.text('ACT_INPUT_TYPE', Messages['MstWcGrid.actInputType'], 10, '', null),
    Column.check('NICHIJI_SHIME_F', Messages['MstWcGrid.nichijiShimeF'], 10, ''),
];
