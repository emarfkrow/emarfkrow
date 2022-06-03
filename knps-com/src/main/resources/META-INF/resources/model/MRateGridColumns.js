/**
 * 為替レートマスタグリッド定義
 */

let MRateGridColumns = [
    Column.cell('YY', Messages['MRateGrid.yy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['MRateGrid.mm'], 20, 'primaryKey', null),
    Column.cell('DD', Messages['MRateGrid.dd'], 20, 'primaryKey', null),
    Column.cell('TUUKA', Messages['MRateGrid.tuuka'], 30, 'primaryKey', null),
    Column.text('TTM', Messages['MRateGrid.ttm'], 50, '', null),
    Column.text('TTS', Messages['MRateGrid.tts'], 50, '', null),
    Column.text('TTB', Messages['MRateGrid.ttb'], 50, '', null),
    Column.text('TTS-ORG', Messages['MRateGrid.ttsOrg'], 50, '', null),
    Column.text('TTB-ORG', Messages['MRateGrid.ttbOrg'], 50, '', null),
    Column.text('LSTYMD', Messages['MRateGrid.lstymd'], 80, '', null),
    Column.text('LSTHM', Messages['MRateGrid.lsthm'], 40, '', null),
    Column.text('UPDDATE', Messages['MRateGrid.upddate'], 80, '', null),
];
