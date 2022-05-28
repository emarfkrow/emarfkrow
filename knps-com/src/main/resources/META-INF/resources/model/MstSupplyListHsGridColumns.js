/**
 * MST_SUPPLY_LIST_HSグリッド定義
 */

let MstSupplyListHsGridColumns = [
    Column.cell('MAN_HINBAN', Messages['MstSupplyListHsGrid.manHinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING_GROUP', Messages['MstSupplyListHsGrid.routingGroup'], 20, 'primaryKey', null),
    Column.cell('ROUTING', Messages['MstSupplyListHsGrid.routing'], 20, 'primaryKey', null),
    Column.cell('SUPPLY_HINBAN', Messages['MstSupplyListHsGrid.supplyHinban'], 250, 'primaryKey', null),
    Column.text('COUNTS', Messages['MstSupplyListHsGrid.counts'], 110, '', null),
    Column.select('SUPPLY_KBN', Messages['MstSupplyListHsGrid.supplyKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('STAN_COUNTS', Messages['MstSupplyListHsGrid.stanCounts'], 110, '', null),
    Column.text('UNIT_SUPPLY', Messages['MstSupplyListHsGrid.unitSupply'], 90, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSupplyListHsGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSupplyListHsGrid.timeStampChange'], 70, 'primaryKey', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSupplyListHsGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSupplyListHsGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSupplyListHsGrid.deleteFlag'], 10, ''),
];
