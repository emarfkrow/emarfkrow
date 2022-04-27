/**
 * 部署マスタグリッド定義
 */

let MBushoGridColumns = [
    Column.cell('BUSHO_ID', Messages['MBushoGrid.bushoId'], 100, 'primaryKey', null),
    Column.text('BUSHO_MEI', Messages['MBushoGrid.bushoMei'], 300, '', null),
    Column.date('KAISHI_YMD', Messages['MBushoGrid.kaishiYmd'], 100, '', null),
    Column.date('SHURYO_YMD', Messages['MBushoGrid.shuryoYmd'], 100, '', null),
    Column.text('OYA_BUSHO_ID', Messages['MBushoGrid.oyaBushoId'], 100, '', null),
    Column.cell('INSERT_DT', Messages['MBushoGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MBushoGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MBushoGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MBushoGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MBushoGrid.deleteF'], 10, ''),
];
