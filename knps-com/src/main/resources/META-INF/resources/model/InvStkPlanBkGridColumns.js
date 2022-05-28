/**
 * INV_STK_PLAN_BKグリッド定義
 */

let InvStkPlanBkGridColumns = [
    Column.text('PRO_HINBAN', Messages['InvStkPlanBkGrid.proHinban'], 250, '', null),
    Column.text('YYYY', Messages['InvStkPlanBkGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['InvStkPlanBkGrid.mm'], 20, '', null),
    Column.text('PAP_KAN_AMT_SCH', Messages['InvStkPlanBkGrid.papKanAmtSch'], 40, '', null),
    Column.text('PAP_KAN_AMT_SCH_FST', Messages['InvStkPlanBkGrid.papKanAmtSchFst'], 40, '', null),
    Column.text('PAP_KAN_AMT_SCH_MID', Messages['InvStkPlanBkGrid.papKanAmtSchMid'], 40, '', null),
    Column.text('PAP_KAN_AMT_SCH_LST', Messages['InvStkPlanBkGrid.papKanAmtSchLst'], 40, '', null),
    Column.text('PAP_KAN_AMT_ACT_FST', Messages['InvStkPlanBkGrid.papKanAmtActFst'], 40, '', null),
    Column.text('PAP_KAN_AMT_ACT_MID', Messages['InvStkPlanBkGrid.papKanAmtActMid'], 40, '', null),
    Column.text('PAP_KAN_AMT_ACT_LST', Messages['InvStkPlanBkGrid.papKanAmtActLst'], 40, '', null),
    Column.text('PAP_KAN_AMT_ACT', Messages['InvStkPlanBkGrid.papKanAmtAct'], 40, '', null),
    Column.text('REQ_COUNTS', Messages['InvStkPlanBkGrid.reqCounts'], 70, '', null),
    Column.text('REQ_NES_COUNTS', Messages['InvStkPlanBkGrid.reqNesCounts'], 70, '', null),
    Column.text('REQ_PAP_KAN_AMT_SCH', Messages['InvStkPlanBkGrid.reqPapKanAmtSch'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_SCH_FST', Messages['InvStkPlanBkGrid.reqPapKanAmtSchFst'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_SCH_MID', Messages['InvStkPlanBkGrid.reqPapKanAmtSchMid'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_SCH_LST', Messages['InvStkPlanBkGrid.reqPapKanAmtSchLst'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_ACT_FST', Messages['InvStkPlanBkGrid.reqPapKanAmtActFst'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_ACT_MID', Messages['InvStkPlanBkGrid.reqPapKanAmtActMid'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_ACT_LST', Messages['InvStkPlanBkGrid.reqPapKanAmtActLst'], 40, '', null),
    Column.text('REQ_PAP_KAN_AMT_ACT', Messages['InvStkPlanBkGrid.reqPapKanAmtAct'], 40, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStkPlanBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStkPlanBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStkPlanBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStkPlanBkGrid.userIdChange'], 100, 'metaInfo', null),
];
