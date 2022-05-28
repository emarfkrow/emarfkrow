/**
 * PCH_SUP_UNIT_COSTグリッド定義
 */

let PchSupUnitCostGridColumns = [
    Column.date('CLOSE_DATE', Messages['PchSupUnitCostGrid.closeDate'], 40, '', null),
    Column.text('HINBAN', Messages['PchSupUnitCostGrid.hinban'], 250, '', null),
    Column.refer('SUP_CODE', Messages['PchSupUnitCostGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('PROPRIETARY_TOTAL_COUNTS', Messages['PchSupUnitCostGrid.proprietaryTotalCounts'], 110, '', null),
    Column.text('PROPRIETARY_TOTAL_COST', Messages['PchSupUnitCostGrid.proprietaryTotalCost'], 110, '', null),
    Column.text('LAST_PRCH_UNIT_COST', Messages['PchSupUnitCostGrid.lastPrchUnitCost'], 90, '', null),
    Column.date('LAST_ACT_DATE', Messages['PchSupUnitCostGrid.lastActDate'], 40, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PchSupUnitCostGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchSupUnitCostGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchSupUnitCostGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchSupUnitCostGrid.userIdChange'], 100, 'metaInfo', null),
    Column.select('LOWER_COST_KBN', Messages['PchSupUnitCostGrid.lowerCostKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
];
