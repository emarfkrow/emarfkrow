/**
 * MST_TEMP_SUPPLIERグリッド定義
 */

let MstTempSupplierGridColumns = [
    Column.cell('TEMP_SUP_CODE', Messages['MstTempSupplierGrid.tempSupCode'], 60, 'primaryKey', null),
    Column.text('TEMP_SUP_NAME', Messages['MstTempSupplierGrid.tempSupName'], 300, '', null),
    Column.text('TEMP_SUP_STAFF_NAME', Messages['MstTempSupplierGrid.tempSupStaffName'], 300, '', null),
    Column.text('TEMP_SUP_TEL_NO', Messages['MstTempSupplierGrid.tempSupTelNo'], 150, '', null),
    Column.text('TEMP_SUP_FAX_NO', Messages['MstTempSupplierGrid.tempSupFaxNo'], 150, '', null),
    Column.select('TEMP_SUP_DIV_CODE', Messages['MstTempSupplierGrid.tempSupDivCode'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('TEMP_KOZA_NO', Messages['MstTempSupplierGrid.tempKozaNo'], 80, '', null),
    Column.text('TEMP_KOZA_MEIGI', Messages['MstTempSupplierGrid.tempKozaMeigi'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstTempSupplierGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstTempSupplierGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstTempSupplierGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstTempSupplierGrid.userIdChange'], 100, 'metaInfo', null),
];
