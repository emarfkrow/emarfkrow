/**
 * MST_SUPPLY_LIST_BKグリッド定義
 */

let MstSupplyListBkGridColumns = [
    Column.cell('YY', Messages['MstSupplyListBkGrid.yy'], 40, 'primaryKey', null),
    Column.cell('ROUTING_GROUP', Messages['MstSupplyListBkGrid.routingGroup'], 20, 'primaryKey', null),
    Column.cell('MAN_HINBAN', Messages['MstSupplyListBkGrid.manHinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['MstSupplyListBkGrid.routing'], 20, 'primaryKey', null),
    Column.cell('SUPPLY_HINBAN', Messages['MstSupplyListBkGrid.supplyHinban'], 250, 'primaryKey', null),
    Column.text('COUNTS', Messages['MstSupplyListBkGrid.counts'], 110, '', null),
    Column.select('SUPPLY_KBN', Messages['MstSupplyListBkGrid.supplyKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('STAN_COUNTS', Messages['MstSupplyListBkGrid.stanCounts'], 110, '', null),
    Column.text('UNIT_SUPPLY', Messages['MstSupplyListBkGrid.unitSupply'], 90, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSupplyListBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSupplyListBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSupplyListBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSupplyListBkGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSupplyListBkGrid.deleteFlag'], 10, ''),
];
