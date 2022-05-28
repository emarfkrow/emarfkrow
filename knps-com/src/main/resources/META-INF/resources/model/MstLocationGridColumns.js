/**
 * MST_LOCATIONグリッド定義
 */

let MstLocationGridColumns = [
    Column.cell('LOCATION_CODE', Messages['MstLocationGrid.locationCode'], 100, 'primaryKey', null),
    Column.text('LOCATION_NAME', Messages['MstLocationGrid.locationName'], 300, '', null),
    Column.select('LOC_KBN', Messages['MstLocationGrid.locKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('LOC_STATUS', Messages['MstLocationGrid.locStatus'], 10, '', null),
    Column.text('LOC_ENABLE', Messages['MstLocationGrid.locEnable'], 10, '', null),
    Column.refer('SUB_INV_CODE', Messages['MstLocationGrid.subInvCode'], 100, '', 'SUB_INV_NAME'),
    Column.cell('TIME_STAMP_CREATE', Messages['MstLocationGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstLocationGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstLocationGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstLocationGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstLocationGrid.deleteFlag'], 10, ''),
    Column.text('AREA_CD', Messages['MstLocationGrid.areaCd'], 100, '', null),
    Column.refer('STORE_MAN_ID', Messages['MstLocationGrid.storeManId'], 100, '', 'STORE_MAN_MEI'),
];
