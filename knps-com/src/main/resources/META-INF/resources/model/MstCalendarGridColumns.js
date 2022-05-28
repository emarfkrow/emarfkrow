/**
 * MST_CALENDARグリッド定義
 */

let MstCalendarGridColumns = [
    Column.cell('SERIAL_DAY', Messages['MstCalendarGrid.serialDay'], 70, 'primaryKey', Slick.Formatters.Extends.DateTime),
    Column.check('WORKING_FLAG', Messages['MstCalendarGrid.workingFlag'], 10, ''),
    Column.text('DAY_OF_WEEK', Messages['MstCalendarGrid.dayOfWeek'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstCalendarGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstCalendarGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstCalendarGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstCalendarGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstCalendarGrid.deleteFlag'], 10, ''),
    Column.text('N_WORKING', Messages['MstCalendarGrid.nWorking'], 50, '', null),
];
