/**
 * MST_OPE_FORMグリッド定義
 */

let MstOpeFormGridColumns = [
    Column.cell('PATTERN_NO', Messages['MstOpeFormGrid.patternNo'], 20, 'primaryKey', null),
    Column.text('F_CHOKU_START', Messages['MstOpeFormGrid.fChokuStart'], 40, '', null),
    Column.text('F_CHOKU_END', Messages['MstOpeFormGrid.fChokuEnd'], 40, '', null),
    Column.text('F_CHOKU_START_DED', Messages['MstOpeFormGrid.fChokuStartDed'], 40, '', null),
    Column.text('F_CHOKU_END_DED', Messages['MstOpeFormGrid.fChokuEndDed'], 40, '', null),
    Column.text('S_CHOKU_START_DED', Messages['MstOpeFormGrid.sChokuStartDed'], 40, '', null),
    Column.text('S_CHOKU_END_DED', Messages['MstOpeFormGrid.sChokuEndDed'], 40, '', null),
    Column.text('T_CHOKU_START_DED', Messages['MstOpeFormGrid.tChokuStartDed'], 40, '', null),
    Column.text('T_CHOKU_END_DED', Messages['MstOpeFormGrid.tChokuEndDed'], 40, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstOpeFormGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstOpeFormGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstOpeFormGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstOpeFormGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstOpeFormGrid.deleteFlag'], 10, ''),
];
