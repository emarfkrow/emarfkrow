/**
 * PCH_TEMP_ORDER_EST_FILEグリッド定義
 */

let PchTempOrderEstFileGridColumns = [
    Column.cell('TEMP_ORDER_NO', Messages['PchTempOrderEstFileGrid.tempOrderNo'], 100, 'primaryKey', null),
    Column.cell('EST_FILE_SEQ', Messages['PchTempOrderEstFileGrid.estFileSeq'], 100, 'primaryKey', null),
    Column.text('UPLOAD_FILE_NM', Messages['PchTempOrderEstFileGrid.uploadFileNm'], 300, '', null),
    Column.text('SAVE_FILE_PATH', Messages['PchTempOrderEstFileGrid.saveFilePath'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PchTempOrderEstFileGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchTempOrderEstFileGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchTempOrderEstFileGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchTempOrderEstFileGrid.userIdChange'], 100, 'metaInfo', null),
];
