/**
 * MFG_KANBAN_SHIPPINGグリッド定義
 */

let MfgKanbanShippingGridColumns = [
    Column.cell('KANBAN_ID', Messages['MfgKanbanShippingGrid.kanbanId'], 90, 'primaryKey', null),
    Column.cell('HINBAN', Messages['MfgKanbanShippingGrid.hinban'], 250, 'primaryKey', null),
    Column.select('FOR_PRO_CODE', Messages['MfgKanbanShippingGrid.forProCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('FOR_PRO_LOCATION_CODE', Messages['MfgKanbanShippingGrid.forProLocationCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('KANBAN_ACC_COUNTS', Messages['MfgKanbanShippingGrid.kanbanAccCounts'], 60, '', null),
    Column.text('COUNTS', Messages['MfgKanbanShippingGrid.counts'], 110, '', null),
];
