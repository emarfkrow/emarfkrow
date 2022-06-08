/**
 * WEB在庫管理マスタグリッド定義
 */

let MWebkanGridColumns = [
    Column.refer('HHINBAN', Messages['MWebkanGrid.hhinban'], 200, 'primaryKey', 'HHINMEI'),
    Column.text('KIKAKU', Messages['MWebkanGrid.kikaku'], 300, '', null),
    Column.text('DAICD', Messages['MWebkanGrid.daicd'], 10, '', null),
    Column.text('CHUCD', Messages['MWebkanGrid.chucd'], 20, '', null),
    Column.text('SHOCD', Messages['MWebkanGrid.shocd'], 40, '', null),
    Column.text('ABUNCD', Messages['MWebkanGrid.abuncd'], 60, '', null),
    Column.text('BBUNCD', Messages['MWebkanGrid.bbuncd'], 200, '', null),
    Column.text('WHYOJIKBN', Messages['MWebkanGrid.whyojikbn'], 10, '', null),
    Column.text('IRISU', Messages['MWebkanGrid.irisu'], 40, '', null),
    Column.text('ZAISIKII', Messages['MWebkanGrid.zaisikii'], 70, '', null),
    Column.text('NYUYOTEISIKII', Messages['MWebkanGrid.nyuyoteisikii'], 70, '', null),
    Column.text('HANYOU1', Messages['MWebkanGrid.hanyou1'], 300, '', null),
    Column.text('HANYOU2', Messages['MWebkanGrid.hanyou2'], 300, '', null),
    Column.text('HANYOU3', Messages['MWebkanGrid.hanyou3'], 300, '', null),
    Column.text('ZAIHENKBN', Messages['MWebkanGrid.zaihenkbn'], 10, '', null),
    Column.text('TEIDSPKBN', Messages['MWebkanGrid.teidspkbn'], 10, '', null),
    Column.text('UPDEXCDKBN', Messages['MWebkanGrid.updexcdkbn'], 10, '', null),
    Column.text('TOUROKUBI', Messages['MWebkanGrid.tourokubi'], 80, '', null),
    Column.text('SHUSEIBI', Messages['MWebkanGrid.shuseibi'], 80, '', null),
    Column.text('FILLER', Messages['MWebkanGrid.filler'], 300, '', null),
];
