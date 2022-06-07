/**
 * F_JUCHUMグリッド定義
 */

let FJuchumGridColumns = [
    Column.cell('TOKUCD', Messages['FJuchumGrid.tokucd'], 80, 'primaryKey', null),
    Column.text('CHOKUCD', Messages['FJuchumGrid.chokucd'], 80, '', null),
    Column.refer('HHINBAN', Messages['FJuchumGrid.hhinban'], 200, 'primaryKey', 'HHINMEI'),
    Column.text('CHUBAN', Messages['FJuchumGrid.chuban'], 100, '', null),
    Column.text('JUCHUSU', Messages['FJuchumGrid.juchusu'], 70, '', null),
    Column.cell('JUCHUNO', Messages['FJuchumGrid.juchuno'], 160, 'primaryKey', null),
    Column.cell('TIME_STAMP_CREATE', Messages['FJuchumGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['FJuchumGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['FJuchumGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['FJuchumGrid.userIdChange'], 100, 'metaInfo', null),
];
