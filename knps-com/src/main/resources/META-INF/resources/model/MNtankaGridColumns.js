/**
 * 日産単価マスタグリッド定義
 */

let MNtankaGridColumns = [
    Column.refer('HHINBAN', Messages['MNtankaGrid.hhinban'], 200, 'primaryKey', 'HHINMEI'),
    Column.text('NISSAN-HINBAN', Messages['MNtankaGrid.nissanHinban'], 200, '', null),
    Column.text('NISSAN-TANKA', Messages['MNtankaGrid.nissanTanka'], 70, '', null),
    Column.text('KOURI-KAKAKU', Messages['MNtankaGrid.kouriKakaku'], 70, '', null),
    Column.text('SHOHINKBN', Messages['MNtankaGrid.shohinkbn'], 20, '', null),
    Column.text('PERSOKBN', Messages['MNtankaGrid.persokbn'], 10, '', null),
    Column.text('KAKAKUKBN', Messages['MNtankaGrid.kakakukbn'], 10, '', null),
    Column.text('FILLER', Messages['MNtankaGrid.filler'], 260, '', null),
];
