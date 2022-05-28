/**
 * PCH_PROD_UNIT_COSTグリッド定義
 */

let PchProdUnitCostGridColumns = [
    Column.cell('CLOSE_DATE', Messages['PchProdUnitCostGrid.closeDate'], 40, 'primaryKey', null),
    Column.cell('PRO_GROUP_NO', Messages['PchProdUnitCostGrid.proGroupNo'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['PchProdUnitCostGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['PchProdUnitCostGrid.routing'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['PchProdUnitCostGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('OPE_DETAIL', Messages['PchProdUnitCostGrid.opeDetail'], 100, '', null),
    Column.text('PROPRIETARY_TOTAL_COUNTS', Messages['PchProdUnitCostGrid.proprietaryTotalCounts'], 110, '', null),
    Column.text('PROPRIETARY_TOTAL_COST', Messages['PchProdUnitCostGrid.proprietaryTotalCost'], 110, '', null),
    Column.text('LAST_PRCH_UNIT_COST', Messages['PchProdUnitCostGrid.lastPrchUnitCost'], 90, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PchProdUnitCostGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchProdUnitCostGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchProdUnitCostGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchProdUnitCostGrid.userIdChange'], 100, 'metaInfo', null),
];
