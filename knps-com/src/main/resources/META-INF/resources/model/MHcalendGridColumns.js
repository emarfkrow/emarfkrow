/**
 * 販売カレンダーグリッド定義
 */

let MHcalendGridColumns = [
    Column.cell('YYMM', Messages['MHcalendGrid.yymm'], 60, 'primaryKey', null),
    Column.cell('CALENDKBN', Messages['MHcalendGrid.calendkbn'], 10, 'primaryKey', null),
    Column.text('KADONITUSU', Messages['MHcalendGrid.kadonitusu'], 20, '', null),
    Column.text('DD', Messages['MHcalendGrid.dd'], 20, '', null),
    Column.date('YOUBI', Messages['MHcalendGrid.youbi'], 20, '', null),
    Column.select('KADOUKBN', Messages['MHcalendGrid.kadoukbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('KADOURUI', Messages['MHcalendGrid.kadourui'], 40, '', null),
    Column.text('FILLER', Messages['MHcalendGrid.filler'], 120, '', null),
];
