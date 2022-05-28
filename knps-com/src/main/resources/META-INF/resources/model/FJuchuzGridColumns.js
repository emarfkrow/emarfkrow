/**
 * F_JUCHUZグリッド定義
 */

let FJuchuzGridColumns = [
    Column.cell('TOKUCD', Messages['FJuchuzGrid.tokucd'], 80, 'primaryKey', null),
    Column.text('CHOKUCD', Messages['FJuchuzGrid.chokucd'], 80, '', null),
    Column.cell('HHINBAN', Messages['FJuchuzGrid.hhinban'], 200, 'primaryKey', null),
    Column.text('CHUBAN', Messages['FJuchuzGrid.chuban'], 100, '', null),
    Column.text('JUCHUSU', Messages['FJuchuzGrid.juchusu'], 70, '', null),
    Column.cell('JUCHUNO', Messages['FJuchuzGrid.juchuno'], 160, 'primaryKey', null),
    Column.cell('TIME_STAMP_CREATE', Messages['FJuchuzGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['FJuchuzGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['FJuchuzGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['FJuchuzGrid.userIdChange'], 100, 'metaInfo', null),
];
