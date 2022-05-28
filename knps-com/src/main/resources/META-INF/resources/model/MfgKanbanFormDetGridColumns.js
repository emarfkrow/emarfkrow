/**
 * MFG_KANBAN_FORM_DETグリッド定義
 */

let MfgKanbanFormDetGridColumns = [
    Column.cell('KANBAN_FORM_DEF_NAME', Messages['MfgKanbanFormDetGrid.kanbanFormDefName'], 300, 'primaryKey', null),
    Column.cell('EXCEL_CELL_NAME', Messages['MfgKanbanFormDetGrid.excelCellName'], 300, 'primaryKey', null),
    Column.check('BASIC_OR_TUNNNEL_FLG', Messages['MfgKanbanFormDetGrid.basicOrTunnnelFlg'], 10, ''),
    Column.text('DISP_ORDER', Messages['MfgKanbanFormDetGrid.dispOrder'], 30, '', null),
    Column.select('ITEM_CODE', Messages['MfgKanbanFormDetGrid.itemCode'], 30, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.check('VALID_FLG', Messages['MfgKanbanFormDetGrid.validFlg'], 30, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgKanbanFormDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgKanbanFormDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgKanbanFormDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgKanbanFormDetGrid.userIdChange'], 100, 'metaInfo', null),
];
