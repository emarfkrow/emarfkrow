/**
 * 販売カレンダーグリッド定義
 */

let MHcalendGridColumns = [
    Column.cell('YYMM', Messages['MHcalendGrid.yymm'], 60, 'primaryKey', null),
    Column.cell('CALENDKBN', Messages['MHcalendGrid.calendkbn'], 10, 'primaryKey', null),
    Column.text('KADONITUSU', Messages['MHcalendGrid.kadonitusu'], 20, '', null),
    Column.text('DD', Messages['MHcalendGrid.dd'], 20, '', null),
    Column.text('YOUBI', Messages['MHcalendGrid.youbi'], 20, '', null),
    Column.text('KADOUKBN', Messages['MHcalendGrid.kadoukbn'], 10, '', null),
    Column.text('KADOURUI', Messages['MHcalendGrid.kadourui'], 40, '', null),
    Column.text('FILLER', Messages['MHcalendGrid.filler'], 120, '', null),
];
