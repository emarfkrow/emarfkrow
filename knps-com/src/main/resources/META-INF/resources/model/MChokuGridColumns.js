/**
 * 直送先マスタグリッド定義
 */

let MChokuGridColumns = [
    Column.cell('CHOKUCD', Messages['MChokuGrid.chokucd'], 80, 'primaryKey', null),
    Column.text('CHOKUMEI1', Messages['MChokuGrid.chokumei1'], 280, '', null),
    Column.text('CHOKUMEI2', Messages['MChokuGrid.chokumei2'], 220, '', null),
    Column.text('RCHOKUMEI', Messages['MChokuGrid.rchokumei'], 200, '', null),
    Column.text('CHOKU-JUSHO1', Messages['MChokuGrid.chokuJusho1'], 280, '', null),
    Column.text('CHOKU-JUSHO2', Messages['MChokuGrid.chokuJusho2'], 220, '', null),
    Column.text('UBINNO', Messages['MChokuGrid.ubinno'], 80, '', null),
    Column.text('TELNO', Messages['MChokuGrid.telno'], 120, '', null),
    Column.date('TOUROKUBI', Messages['MChokuGrid.tourokubi'], 80, '', null),
    Column.text('KCHOKUMEI', Messages['MChokuGrid.kchokumei'], 200, '', null),
    Column.text('SICHOCD', Messages['MChokuGrid.sichocd'], 60, '', null),
    Column.text('FAXNO', Messages['MChokuGrid.faxno'], 120, '', null),
    Column.select('TORIKESI-KBN', Messages['MChokuGrid.torikesiKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('UNSOCD', Messages['MChokuGrid.unsocd'], 30, '', null),
    Column.text('TIKUCD', Messages['MChokuGrid.tikucd'], 10, '', null),
    Column.text('TODOFUKENCD', Messages['MChokuGrid.todofukencd'], 10, '', null),
    Column.select('UPDNKINKBN', Messages['MChokuGrid.updnkinkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
];
