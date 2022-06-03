/**
 * 国名マスタグリッド定義
 */

let MKunimeiGridColumns = [
    Column.cell('KOKUSAICD', Messages['MKunimeiGrid.kokusaicd'], 10, 'primaryKey', null),
    Column.cell('KUNICD', Messages['MKunimeiGrid.kunicd'], 20, 'primaryKey', null),
    Column.text('GENSANKOKU', Messages['MKunimeiGrid.gensankoku'], 200, '', null),
    Column.text('KUNIMEI', Messages['MKunimeiGrid.kunimei'], 300, '', null),
    Column.text('FILLER', Messages['MKunimeiGrid.filler'], 300, '', null),
];
