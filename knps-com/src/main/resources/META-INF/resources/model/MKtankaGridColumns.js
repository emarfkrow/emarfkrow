/**
 * 契約単価マスタグリッド定義
 */

let MKtankaGridColumns = [
    Column.cell('HONSHACD', Messages['MKtankaGrid.honshacd'], 80, 'primaryKey', null),
    Column.refer('SHAGAI-HINBAN', Messages['MKtankaGrid.shagaiHinban'], 200, 'primaryKey', 'SHAGAI_HINMEI'),
    Column.date('KKAISIBI', Messages['MKtankaGrid.kkaisibi'], 80, '', null),
    Column.date('KSHURYOBI', Messages['MKtankaGrid.kshuryobi'], 80, '', null),
    Column.refer('HHINBAN', Messages['MKtankaGrid.hhinban'], 200, '', 'HHINMEI'),
    Column.text('KEIYAKU-TANKA', Messages['MKtankaGrid.keiyakuTanka'], 70, '', null),
    Column.select('SHOHINKBN', Messages['MKtankaGrid.shohinkbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('KAKAKUKBN', Messages['MKtankaGrid.kakakukbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('FILLER', Messages['MKtankaGrid.filler'], 280, '', null),
];
