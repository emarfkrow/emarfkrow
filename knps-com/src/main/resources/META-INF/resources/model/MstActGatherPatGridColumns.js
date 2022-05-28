/**
 * MST_ACT_GATHER_PATグリッド定義
 */

let MstActGatherPatGridColumns = [
    Column.cell('ACT_GATHER_PAT_NO', Messages['MstActGatherPatGrid.actGatherPatNo'], 30, 'primaryKey', null),
    Column.text('IN_PRE_START', Messages['MstActGatherPatGrid.inPreStart'], 10, '', null),
    Column.text('IN_PRE_END', Messages['MstActGatherPatGrid.inPreEnd'], 10, '', null),
    Column.text('PROC_END', Messages['MstActGatherPatGrid.procEnd'], 10, '', null),
    Column.text('PROC_STOP', Messages['MstActGatherPatGrid.procStop'], 10, '', null),
    Column.text('PROC_CANCEL', Messages['MstActGatherPatGrid.procCancel'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstActGatherPatGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstActGatherPatGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstActGatherPatGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstActGatherPatGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstActGatherPatGrid.deleteFlag'], 10, ''),
];
