/**
 * INV_STK_PLANグリッド定義
 */

let InvStkPlanGridColumns = [
    Column.refer('PRO_HINBAN', Messages['InvStkPlanGrid.proHinban'], 250, 'primaryKey', 'PRO_HINMEI'),
    Column.cell('YYYY', Messages['InvStkPlanGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['InvStkPlanGrid.mm'], 20, 'primaryKey', null),
    Column.text('PAP_KAN_AMT_SCH', Messages['InvStkPlanGrid.papKanAmtSch'], 40, '', null),
    Column.text('PAP_KAN_AMT_SCH_FST', Messages['InvStkPlanGrid.papKanAmtSchFst'], 40, '', null),
    Column.text('PAP_KAN_AMT_SCH_MID', Messages['InvStkPlanGrid.papKanAmtSchMid'], 40, '', null),
    Column.text('PAP_KAN_AMT_SCH_LST', Messages['InvStkPlanGrid.papKanAmtSchLst'], 40, '', null),
    Column.text('PAP_KAN_AMT_ACT_FST', Messages['InvStkPlanGrid.papKanAmtActFst'], 40, '', null),
    Column.text('PAP_KAN_AMT_ACT_MID', Messages['InvStkPlanGrid.papKanAmtActMid'], 40, '', null),
    Column.text('PAP_KAN_AMT_ACT_LST', Messages['InvStkPlanGrid.papKanAmtActLst'], 40, '', null),
    Column.text('PAP_KAN_AMT_ACT', Messages['InvStkPlanGrid.papKanAmtAct'], 40, '', null),
    Column.text('REQ_COUNTS', Messages['InvStkPlanGrid.reqCounts'], 70, '', null),
    Column.text('REQ_NES_COUNTS', Messages['InvStkPlanGrid.reqNesCounts'], 70, '', null),
    Column.text('REQ_PAP_KAN_AMT_SCH', Messages['InvStkPlanGrid.reqPapKanAmtSch'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_SCH_FST', Messages['InvStkPlanGrid.reqPapKanAmtSchFst'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_SCH_MID', Messages['InvStkPlanGrid.reqPapKanAmtSchMid'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_SCH_LST', Messages['InvStkPlanGrid.reqPapKanAmtSchLst'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_ACT_FST', Messages['InvStkPlanGrid.reqPapKanAmtActFst'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_ACT_MID', Messages['InvStkPlanGrid.reqPapKanAmtActMid'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_ACT_LST', Messages['InvStkPlanGrid.reqPapKanAmtActLst'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_ACT', Messages['InvStkPlanGrid.reqPapKanAmtAct'], 40, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStkPlanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStkPlanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStkPlanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStkPlanGrid.userIdChange'], 100, 'metaInfo', null),
];
