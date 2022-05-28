/**
 * MFG_PRO_ACT_HEDグリッド定義
 */

let MfgProActHedGridColumns = [
    Column.cell('PRO_NO', Messages['MfgProActHedGrid.proNo'], 140, 'primaryKey', null),
    Column.cell('PRO_ROUTING_BRANCH', Messages['MfgProActHedGrid.proRoutingBranch'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['MfgProActHedGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('CHARGE_NO', Messages['MfgProActHedGrid.chargeNo'], 20, '', null),
    Column.select('MAC_CODE', Messages['MfgProActHedGrid.macCode'], 40, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('HUM_PRE_TIME', Messages['MfgProActHedGrid.humPreTime'], 60, '', null),
    Column.text('HUM_ACT_TIME', Messages['MfgProActHedGrid.humActTime'], 60, '', null),
    Column.text('MAC_PRE_TIME', Messages['MfgProActHedGrid.macPreTime'], 60, '', null),
    Column.text('MAC_ACT_TIME', Messages['MfgProActHedGrid.macActTime'], 60, '', null),
    Column.text('GOOD_COUNTS', Messages['MfgProActHedGrid.goodCounts'], 60, '', null),
    Column.text('REJECT_COUNTS', Messages['MfgProActHedGrid.rejectCounts'], 60, '', null),
    Column.refer('UNIT_CODE', Messages['MfgProActHedGrid.unitCode'], 20, '', 'UNIT_NAME'),
    Column.text('ACT_LT', Messages['MfgProActHedGrid.actLt'], 80, '', null),
    Column.text('ACT_WAIT_TIME', Messages['MfgProActHedGrid.actWaitTime'], 80, '', null),
    Column.text('EXP_WAIT_TIME', Messages['MfgProActHedGrid.expWaitTime'], 80, '', null),
    Column.text('EXP_PRE_TIME', Messages['MfgProActHedGrid.expPreTime'], 60, '', null),
    Column.text('EXP_PRO_TIME', Messages['MfgProActHedGrid.expProTime'], 60, '', null),
    Column.text('EXP_REST_TIME', Messages['MfgProActHedGrid.expRestTime'], 60, '', null),
    Column.text('EXP_CHOKO_TIME', Messages['MfgProActHedGrid.expChokoTime'], 60, '', null),
    Column.text('EXP_TROUB_TIME', Messages['MfgProActHedGrid.expTroubTime'], 60, '', null),
    Column.text('EXP_SELF_MOD_TIME', Messages['MfgProActHedGrid.expSelfModTime'], 60, '', null),
    Column.text('EXP_OTHR_MOD_TIME', Messages['MfgProActHedGrid.expOthrModTime'], 60, '', null),
    Column.text('EXP_ETC_TIME', Messages['MfgProActHedGrid.expEtcTime'], 60, '', null),
    Column.text('SET_STOCK_NOTICE', Messages['MfgProActHedGrid.setStockNotice'], 10, '', null),
    Column.text('PRO_STOCK_NOTICE', Messages['MfgProActHedGrid.proStockNotice'], 10, '', null),
    Column.text('VOLUME_WEIGHT', Messages['MfgProActHedGrid.volumeWeight'], 110, '', null),
    Column.date('BEG_DATE', Messages['MfgProActHedGrid.begDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('END_DATE', Messages['MfgProActHedGrid.endDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('END_MATERIAL_WEIGHT', Messages['MfgProActHedGrid.endMaterialWeight'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgProActHedGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgProActHedGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgProActHedGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgProActHedGrid.userIdChange'], 100, 'metaInfo', null),
];
