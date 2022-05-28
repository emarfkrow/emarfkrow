/**
 * MST_SET_CONSTITUTIONグリッド定義
 */

let MstSetConstitutionGridColumns = [
    Column.cell('SET_HINBAN', Messages['MstSetConstitutionGrid.setHinban'], 200, 'primaryKey', null),
    Column.cell('SET_CHILD_HINBAN', Messages['MstSetConstitutionGrid.setChildHinban'], 200, 'primaryKey', null),
    Column.check('DELETE_FLAG', Messages['MstSetConstitutionGrid.deleteFlag'], 10, ''),
    Column.check('BOTTOM_FLAG', Messages['MstSetConstitutionGrid.bottomFlag'], 10, ''),
    Column.text('SET_COUNT', Messages['MstSetConstitutionGrid.setCount'], 30, '', null),
    Column.select('GRATIS_SUPPLY_KBN', Messages['MstSetConstitutionGrid.gratisSupplyKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
];
