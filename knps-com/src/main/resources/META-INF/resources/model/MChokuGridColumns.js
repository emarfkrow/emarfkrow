/**
 * M_CHOKUグリッド定義
 */

let MChokuGridColumns = [
    Column.cell('CHOKUCD', Messages['MChokuGrid.chokucd'], 80, 'primaryKey', null),
    Column.text('CHOKUMEI1', Messages['MChokuGrid.chokumei1'], 280, '', null),
    Column.text('CHOKUMEI2', Messages['MChokuGrid.chokumei2'], 220, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MChokuGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MChokuGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MChokuGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MChokuGrid.userIdChange'], 100, 'metaInfo', null),
];
