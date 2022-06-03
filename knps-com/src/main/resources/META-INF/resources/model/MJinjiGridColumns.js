/**
 * 人事マスタグリッド定義
 */

let MJinjiGridColumns = [
    Column.cell('SHAIN-NO', Messages['MJinjiGrid.shainNo'], 40, 'primaryKey', null),
    Column.text('SHAIN-MEI', Messages['MJinjiGrid.shainMei'], 200, '', null),
    Column.text('JINJI-SHOZOKUCD', Messages['MJinjiGrid.jinjiShozokucd'], 60, '', null),
    Column.text('FILLER', Messages['MJinjiGrid.filler'], 190, '', null),
];
