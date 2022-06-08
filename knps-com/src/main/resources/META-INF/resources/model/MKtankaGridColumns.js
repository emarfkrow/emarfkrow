/**
 * 契約単価マスタグリッド定義
 */

let MKtankaGridColumns = [
    Column.cell('HONSHACD', Messages['MKtankaGrid.honshacd'], 80, 'primaryKey', null),
    Column.cell('SHAGAI-HINBAN', Messages['MKtankaGrid.shagaiHinban'], 200, 'primaryKey', null),
    Column.text('KKAISIBI', Messages['MKtankaGrid.kkaisibi'], 80, '', null),
    Column.text('KSHURYOBI', Messages['MKtankaGrid.kshuryobi'], 80, '', null),
    Column.refer('HHINBAN', Messages['MKtankaGrid.hhinban'], 200, '', 'HITEM'),
    Column.text('KEIYAKU-TANKA', Messages['MKtankaGrid.keiyakuTanka'], 70, '', null),
    Column.text('SHOHINKBN', Messages['MKtankaGrid.shohinkbn'], 20, '', null),
    Column.text('KAKAKUKBN', Messages['MKtankaGrid.kakakukbn'], 10, '', null),
    Column.text('FILLER', Messages['MKtankaGrid.filler'], 280, '', null),
];
