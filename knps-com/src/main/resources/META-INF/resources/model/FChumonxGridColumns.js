/**
 * F_CHUMONXグリッド定義
 */

let FChumonxGridColumns = [
    Column.cell('TOKUCD', Messages['FChumonxGrid.tokucd'], 80, 'primaryKey', null),
    Column.refer('HHINBAN', Messages['FChumonxGrid.hhinban'], 200, 'primaryKey', 'HITEM'),
    Column.text('SHUKKASU-RUI', Messages['FChumonxGrid.shukkasuRui'], 70, '', null),
    Column.cell('JUCHUNO', Messages['FChumonxGrid.juchuno'], 160, 'primaryKey', null),
    Column.cell('TIME_STAMP_CREATE', Messages['FChumonxGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['FChumonxGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['FChumonxGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['FChumonxGrid.userIdChange'], 100, 'metaInfo', null),
];
