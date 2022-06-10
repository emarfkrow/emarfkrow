/**
 * 販売制御マスタグリッド定義
 */

let MHseigyoGridColumns = [
    Column.cell('KEYCD', Messages['MHseigyoGrid.keycd'], 10, 'primaryKey', null),
    Column.date('KAISIBI', Messages['MHseigyoGrid.kaisibi'], 80, '', null),
    Column.date('SHURYOBI', Messages['MHseigyoGrid.shuryobi'], 80, '', null),
    Column.text('ZEIRITU', Messages['MHseigyoGrid.zeiritu'], 20, '', null),
    Column.text('YUBOENT', Messages['MHseigyoGrid.yuboent'], 10, '', null),
    Column.text('SHUSIJINO1', Messages['MHseigyoGrid.shusijino1'], 50, '', null),
    Column.text('NOHINSHONO', Messages['MHseigyoGrid.nohinshono'], 60, '', null),
    Column.text('SETKEINO', Messages['MHseigyoGrid.setkeino'], 60, '', null),
    Column.text('GETUJI-YYMM', Messages['MHseigyoGrid.getujiYymm'], 60, '', null),
    Column.text('T-JUCCNT', Messages['MHseigyoGrid.tJuccnt'], 40, '', null),
    Column.text('T-MAXCNT', Messages['MHseigyoGrid.tMaxcnt'], 40, '', null),
    Column.text('CHOKUCNT', Messages['MHseigyoGrid.chokucnt'], 60, '', null),
    Column.text('HYOTANKA', Messages['MHseigyoGrid.hyotanka'], 70, '', null),
];
