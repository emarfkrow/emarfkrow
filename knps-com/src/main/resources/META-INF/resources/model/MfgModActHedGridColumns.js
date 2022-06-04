/**
 * MFG_MOD_ACT_HEDグリッド定義
 */

let MfgModActHedGridColumns = [
    Column.cell('MOD_ACT_NO', Messages['MfgModActHedGrid.modActNo'], 120, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['MfgModActHedGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('MOD_KIND', Messages['MfgModActHedGrid.modKind'], 10, '', null),
    Column.text('AMOUNT_TIME', Messages['MfgModActHedGrid.amountTime'], 60, '', null),
    Column.text('ACT_MOD_TIME', Messages['MfgModActHedGrid.actModTime'], 60, '', null),
    Column.text('EXP_TIME', Messages['MfgModActHedGrid.expTime'], 60, '', null),
    Column.text('MOD_COUNTS', Messages['MfgModActHedGrid.modCounts'], 60, '', null),
    Column.text('ACT_MOD_COUNTS', Messages['MfgModActHedGrid.actModCounts'], 60, '', null),
    Column.text('MEMO', Messages['MfgModActHedGrid.memo'], 300, '', null),
    Column.text('MOD_STATUS', Messages['MfgModActHedGrid.modStatus'], 10, '', null),
    Column.check('EXP_FLAG', Messages['MfgModActHedGrid.expFlag'], 10, ''),
    Column.date('BEG_DATE', Messages['MfgModActHedGrid.begDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('END_DATE', Messages['MfgModActHedGrid.endDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgModActHedGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgModActHedGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgModActHedGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgModActHedGrid.userIdChange'], 100, 'metaInfo', null),
];
