/**
 * MST_SUPPLY_LISTグリッド定義
 */

let MstSupplyListGridColumns = [
    Column.cell('ROUTING_GROUP', Messages['MstSupplyListGrid.routingGroup'], 20, 'primaryKey', null),
    Column.refer('MAN_HINBAN', Messages['MstSupplyListGrid.manHinban'], 250, 'primaryKey', 'MAN_HINMEI'),
    Column.cell('ROUTING', Messages['MstSupplyListGrid.routing'], 20, 'primaryKey', null),
    Column.refer('SUPPLY_HINBAN', Messages['MstSupplyListGrid.supplyHinban'], 250, 'primaryKey', 'SUPPLY_HINMEI'),
    Column.text('COUNTS', Messages['MstSupplyListGrid.counts'], 110, '', null),
    Column.select('SUPPLY_KBN', Messages['MstSupplyListGrid.supplyKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('STAN_COUNTS', Messages['MstSupplyListGrid.stanCounts'], 110, '', null),
    Column.text('UNIT_SUPPLY', Messages['MstSupplyListGrid.unitSupply'], 90, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSupplyListGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSupplyListGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSupplyListGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSupplyListGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSupplyListGrid.deleteFlag'], 10, ''),
];
