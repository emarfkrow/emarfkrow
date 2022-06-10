/**
 * 与信管理マスタグリッド定義
 */

let MYosinGridColumns = [
    Column.cell('SHUKINCD', Messages['MYosinGrid.shukincd'], 80, 'primaryKey', null),
    Column.text('HONSHACD', Messages['MYosinGrid.honshacd'], 80, '', null),
    Column.text('RTOKUMEI', Messages['MYosinGrid.rtokumei'], 200, '', null),
    Column.text('SINYO-RANK', Messages['MYosinGrid.sinyoRank'], 10, '', null),
    Column.text('SINYO-HOKEN', Messages['MYosinGrid.sinyoHoken'], 110, '', null),
    Column.text('EIGYO-HOSYOKIN', Messages['MYosinGrid.eigyoHosyokin'], 110, '', null),
    Column.text('TANPO-KABUSU', Messages['MYosinGrid.tanpoKabusu'], 110, '', null),
    Column.text('SHUSHIGAKU', Messages['MYosinGrid.shushigaku'], 110, '', null),
    Column.text('KASIDAORE-HIKIATE', Messages['MYosinGrid.kasidaoreHikiate'], 110, '', null),
    Column.text('SHUKA-GENDO', Messages['MYosinGrid.shukaGendo'], 110, '', null),
    Column.date('TOUROKUBI', Messages['MYosinGrid.tourokubi'], 80, '', null),
    Column.text('UPDDATE', Messages['MYosinGrid.upddate'], 80, '', null),
];
