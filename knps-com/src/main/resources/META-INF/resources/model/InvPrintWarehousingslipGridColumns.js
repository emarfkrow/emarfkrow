/**
 * INV_PRINT_WAREHOUSINGSLIPグリッド定義
 */

let InvPrintWarehousingslipGridColumns = [
    Column.refer('EMP_CODE', Messages['InvPrintWarehousingslipGrid.empCode'], 100, 'primaryKey', 'EMP_NAME'),
    Column.cell('HINBAN', Messages['InvPrintWarehousingslipGrid.hinban'], 250, 'primaryKey', null),
    Column.text('KANBAN_ACC_COUNTS', Messages['InvPrintWarehousingslipGrid.kanbanAccCounts'], 60, '', null),
    Column.text('KANBAN_COUNTS', Messages['InvPrintWarehousingslipGrid.kanbanCounts'], 30, '', null),
    Column.select('HOST_N_KBN', Messages['InvPrintWarehousingslipGrid.hostNKbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('PRINT_KBN', Messages['InvPrintWarehousingslipGrid.printKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('REQ_ID', Messages['InvPrintWarehousingslipGrid.reqId'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvPrintWarehousingslipGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvPrintWarehousingslipGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvPrintWarehousingslipGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvPrintWarehousingslipGrid.userIdChange'], 100, 'metaInfo', null),
];
