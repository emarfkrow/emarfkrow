/**
 * M_TOKUIグリッド定義
 */

let MTokuiGridColumns = [
    Column.cell('TOKUCD', Messages['MTokuiGrid.tokucd'], 80, 'primaryKey', null),
    Column.text('TOKUMEI1', Messages['MTokuiGrid.tokumei1'], 280, '', null),
    Column.text('TOKUMEI2', Messages['MTokuiGrid.tokumei2'], 220, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MTokuiGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MTokuiGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MTokuiGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MTokuiGrid.userIdChange'], 100, 'metaInfo', null),
];
