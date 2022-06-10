/**
 * PCH_TEMP_ORDERグリッド定義
 */

let PchTempOrderGridColumns = [
    Column.cell('TEMP_ORDER_NO', Messages['PchTempOrderGrid.tempOrderNo'], 100, 'primaryKey', null),
    Column.dateTime('IRAI_DT', Messages['PchTempOrderGrid.iraiDt'], 70, ''),
    Column.select('IRAI_EMP_CODE', Messages['PchTempOrderGrid.iraiEmpCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('SUP_CODE', Messages['PchTempOrderGrid.supCode'], 60, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('TEMP_SUP_CODE', Messages['PchTempOrderGrid.tempSupCode'], 60, '', 'TEMP_SUP_NAME'),
    Column.longText('MEMO', Messages['PchTempOrderGrid.memo'], 300, '', null),
    Column.dateTime('PAY_IRAI_DT', Messages['PchTempOrderGrid.payIraiDt'], 70, ''),
    Column.select('PAY_IRAI_EMP_CODE', Messages['PchTempOrderGrid.payIraiEmpCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['PchTempOrderGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchTempOrderGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchTempOrderGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchTempOrderGrid.userIdChange'], 100, 'metaInfo', null),
];
