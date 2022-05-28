/**
 * INV_RFID_DATAグリッド定義
 */

let InvRfidDataGridColumns = [
    Column.select('TARGET_KBN', Messages['InvRfidDataGrid.targetKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('TID', Messages['InvRfidDataGrid.tid'], 240, '', null),
    Column.text('TAG_DATA', Messages['InvRfidDataGrid.tagData'], 160, '', null),
    Column.text('READER_NO', Messages['InvRfidDataGrid.readerNo'], 20, '', null),
    Column.text('ANTENNA_NO', Messages['InvRfidDataGrid.antennaNo'], 20, '', null),
    Column.select('SPOT_KBN', Messages['InvRfidDataGrid.spotKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('RECIVE_TIME', Messages['InvRfidDataGrid.reciveTime'], 140, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvRfidDataGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvRfidDataGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvRfidDataGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvRfidDataGrid.userIdChange'], 100, 'metaInfo', null),
];
