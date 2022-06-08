/**
 * 単価マスタグリッド定義
 */

let MTankaGridColumns = [
    Column.refer('HHINBAN', Messages['MTankaGrid.hhinban'], 200, 'primaryKey', 'HITEM'),
    Column.text('DAIRI-TANKA', Messages['MTankaGrid.dairiTanka'], 70, '', null),
    Column.text('CDAIKO-TANKA', Messages['MTankaGrid.cdaikoTanka'], 70, '', null),
    Column.text('JDAIKO-TANKA', Messages['MTankaGrid.jdaikoTanka'], 70, '', null),
    Column.text('OROSI-TANKA', Messages['MTankaGrid.orosiTanka'], 70, '', null),
    Column.text('KOURI-KAKAKU', Messages['MTankaGrid.kouriKakaku'], 70, '', null),
    Column.text('DIY-KAKAKU', Messages['MTankaGrid.diyKakaku'], 70, '', null),
    Column.text('YUSHUTU1-KAKAKU', Messages['MTankaGrid.yushutu1Kakaku'], 70, '', null),
    Column.text('YUSHUTU2-KAKAKU', Messages['MTankaGrid.yushutu2Kakaku'], 70, '', null),
    Column.text('YUSHUTU3-KAKAKU', Messages['MTankaGrid.yushutu3Kakaku'], 70, '', null),
    Column.text('KAKAKU1', Messages['MTankaGrid.kakaku1'], 70, '', null),
    Column.text('KAKAKU2', Messages['MTankaGrid.kakaku2'], 70, '', null),
    Column.text('KAKAKU3', Messages['MTankaGrid.kakaku3'], 70, '', null),
    Column.text('KAKAKU4', Messages['MTankaGrid.kakaku4'], 70, '', null),
    Column.text('KAKAKU5', Messages['MTankaGrid.kakaku5'], 70, '', null),
    Column.text('KAKAKU6', Messages['MTankaGrid.kakaku6'], 70, '', null),
    Column.text('SHOHINKBN', Messages['MTankaGrid.shohinkbn'], 20, '', null),
    Column.text('KAKAKUKBN', Messages['MTankaGrid.kakakukbn'], 10, '', null),
    Column.text('FILLER', Messages['MTankaGrid.filler'], 120, '', null),
];
