/**
 * PRD_STORE_MAINTE_TEAM_HEDグリッド定義
 */

let PrdStoreMainteTeamHedGridColumns = [
    Column.cell('MFG_TEAM_CODE', Messages['PrdStoreMainteTeamHedGrid.mfgTeamCode'], 100, 'primaryKey', null),
    Column.text('MFG_TEAM_NAME', Messages['PrdStoreMainteTeamHedGrid.mfgTeamName'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdStoreMainteTeamHedGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdStoreMainteTeamHedGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdStoreMainteTeamHedGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdStoreMainteTeamHedGrid.userIdChange'], 100, 'metaInfo', null),
];
