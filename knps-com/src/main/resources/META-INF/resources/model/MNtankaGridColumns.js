/**
 * 日産単価マスタグリッド定義
 */

let MNtankaGridColumns = [
    Column.refer('HHINBAN', Messages['MNtankaGrid.hhinban'], 200, 'primaryKey', 'HHINMEI'),
    Column.refer('NISSAN-HINBAN', Messages['MNtankaGrid.nissanHinban'], 200, '', 'NISSAN_HINMEI'),
    Column.text('NISSAN-TANKA', Messages['MNtankaGrid.nissanTanka'], 70, '', null),
    Column.text('KOURI-KAKAKU', Messages['MNtankaGrid.kouriKakaku'], 70, '', null),
    Column.select('SHOHINKBN', Messages['MNtankaGrid.shohinkbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('PERSOKBN', Messages['MNtankaGrid.persokbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('KAKAKUKBN', Messages['MNtankaGrid.kakakukbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('FILLER', Messages['MNtankaGrid.filler'], 260, '', null),
];
