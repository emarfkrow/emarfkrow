/**
 * M_HHINMOKグリッド定義
 */

let MHhinmokGridColumns = [
    Column.cell('HHINBAN', Messages['MHhinmokGrid.hhinban'], 200, 'primaryKey', null),
    Column.text('DLTFLG', Messages['MHhinmokGrid.dltflg'], 10, '', null),
    Column.text('SETKBN', Messages['MHhinmokGrid.setkbn'], 10, '', null),
    Column.text('HYOJUN-GENKA', Messages['MHhinmokGrid.hyojunGenka'], 90, '', null),
    Column.text('HYOJUN-BAIKA', Messages['MHhinmokGrid.hyojunBaika'], 90, '', null),
    Column.text('ZAIKOSU-H1', Messages['MHhinmokGrid.zaikosuH1'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MHhinmokGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MHhinmokGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MHhinmokGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MHhinmokGrid.userIdChange'], 100, 'metaInfo', null),
];
