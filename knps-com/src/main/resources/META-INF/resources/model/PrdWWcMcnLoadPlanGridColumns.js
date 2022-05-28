/**
 * PRD_W_WC_MCN_LOAD_PLANグリッド定義
 */

let PrdWWcMcnLoadPlanGridColumns = [
    Column.cell('W_PLAN_ID', Messages['PrdWWcMcnLoadPlanGrid.wPlanId'], 60, 'primaryKey', null),
    Column.cell('MAN_HINBAN', Messages['PrdWWcMcnLoadPlanGrid.manHinban'], 250, 'primaryKey', null),
    Column.cell('WC_CODE', Messages['PrdWWcMcnLoadPlanGrid.wcCode'], 30, 'primaryKey', null),
    Column.text('WC_NAME', Messages['PrdWWcMcnLoadPlanGrid.wcName'], 300, '', null),
    Column.select('WS_CODE', Messages['PrdWWcMcnLoadPlanGrid.wsCode'], 40, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('WS_NAME', Messages['PrdWWcMcnLoadPlanGrid.wsName'], 300, '', null),
    Column.text('OPE_DETAIL', Messages['PrdWWcMcnLoadPlanGrid.opeDetail'], 100, '', null),
    Column.text('HUM_PRE_TIME', Messages['PrdWWcMcnLoadPlanGrid.humPreTime'], 70, '', null),
    Column.text('HUM_ACT_TIME', Messages['PrdWWcMcnLoadPlanGrid.humActTime'], 70, '', null),
    Column.text('HUM_TOTAL_TIME', Messages['PrdWWcMcnLoadPlanGrid.humTotalTime'], 70, '', null),
    Column.text('MAC_PRE_TIME', Messages['PrdWWcMcnLoadPlanGrid.macPreTime'], 70, '', null),
    Column.text('MAC_ACT_TIME', Messages['PrdWWcMcnLoadPlanGrid.macActTime'], 70, '', null),
    Column.text('MAC_TOTAL_TIME', Messages['PrdWWcMcnLoadPlanGrid.macTotalTime'], 70, '', null),
    Column.text('PRO_NES_COUNTS', Messages['PrdWWcMcnLoadPlanGrid.proNesCounts'], 70, '', null),
    Column.text('PRO_NES_WEIGHT', Messages['PrdWWcMcnLoadPlanGrid.proNesWeight'], 120, '', null),
    Column.cell('DATA_SOURCE_KBN', Messages['PrdWWcMcnLoadPlanGrid.dataSourceKbn'], 10, 'primaryKey', null),
    Column.cell('PERIOD', Messages['PrdWWcMcnLoadPlanGrid.period'], 80, 'primaryKey', null),
    Column.cell('PLAN_NO', Messages['PrdWWcMcnLoadPlanGrid.planNo'], 120, 'primaryKey', null),
    Column.date('BEG_DATE', Messages['PrdWWcMcnLoadPlanGrid.begDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('END_DATE', Messages['PrdWWcMcnLoadPlanGrid.endDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdWWcMcnLoadPlanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdWWcMcnLoadPlanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdWWcMcnLoadPlanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdWWcMcnLoadPlanGrid.userIdChange'], 100, 'metaInfo', null),
];
