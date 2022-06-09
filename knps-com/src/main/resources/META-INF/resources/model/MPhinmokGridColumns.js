/**
 * 部品マスタグリッド定義
 */

let MPhinmokGridColumns = [
    Column.cell('PHINBAN', Messages['MPhinmokGrid.phinban'], 200, 'primaryKey', null),
    Column.text('PHINMEI', Messages['MPhinmokGrid.phinmei'], 200, '', null),
    Column.text('PHINMEIK', Messages['MPhinmokGrid.phinmeik'], 200, '', null),
    Column.text('HINBAN', Messages['MPhinmokGrid.hinban'], 250, '', null),
    Column.text('P-KAKAKU', Messages['MPhinmokGrid.pKakaku'], 70, '', null),
    Column.text('P-GENKA', Messages['MPhinmokGrid.pGenka'], 70, '', null),
    Column.select('P-KBN', Messages['MPhinmokGrid.pKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('KISHUZAN', Messages['MPhinmokGrid.kishuzan'], 70, '', null),
    Column.text('KIJYUNZAIKO', Messages['MPhinmokGrid.kijyunzaiko'], 70, '', null),
    Column.text('HACHUTEN', Messages['MPhinmokGrid.hachuten'], 70, '', null),
    Column.select('TOUROKUKBN', Messages['MPhinmokGrid.tourokukbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('DENPYOTKBN', Messages['MPhinmokGrid.denpyotkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('JUKINKBN', Messages['MPhinmokGrid.jukinkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('DLTFLG', Messages['MPhinmokGrid.dltflg'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('UPDDATE', Messages['MPhinmokGrid.upddate'], 80, '', null),
    Column.text('FILLER', Messages['MPhinmokGrid.filler'], 300, '', null),
];
