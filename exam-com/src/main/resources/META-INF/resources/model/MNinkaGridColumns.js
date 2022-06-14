/**
 * 認可マスタグリッド定義
 */

let MNinkaGridColumns = [
    Column.cell('BUSHO_ID', Messages['MNinkaGrid.bushoId'], 100, 'primaryKey', null),
    Column.cell('SHOKUI_ID', Messages['MNinkaGrid.shokuiId'], 100, 'primaryKey', null),
    Column.cell('GAMEN_NM', Messages['MNinkaGrid.gamenNm'], 200, 'primaryKey', null),
    Column.select('KENGEN_KB', Messages['MNinkaGrid.kengenKb'], 20, '', { json: 'MCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.date('KAISHI_YMD', Messages['MNinkaGrid.kaishiYmd'], 100, '', null),
    Column.date('SHURYO_YMD', Messages['MNinkaGrid.shuryoYmd'], 100, '', null),
    Column.cell('INSERT_DT', Messages['MNinkaGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MNinkaGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MNinkaGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MNinkaGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MNinkaGrid.deleteF'], 10, ''),
];
