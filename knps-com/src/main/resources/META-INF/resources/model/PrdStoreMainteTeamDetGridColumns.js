/**
 * PRD_STORE_MAINTE_TEAM_DETグリッド定義
 */

let PrdStoreMainteTeamDetGridColumns = [
    Column.refer('MFG_TEAM_CODE', Messages['PrdStoreMainteTeamDetGrid.mfgTeamCode'], 100, 'primaryKey', 'MFG_TEAM_NAME'),
    Column.refer('WS_CODE', Messages['PrdStoreMainteTeamDetGrid.wsCode'], 40, 'primaryKey', 'WS_NAME'),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdStoreMainteTeamDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdStoreMainteTeamDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdStoreMainteTeamDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdStoreMainteTeamDetGrid.userIdChange'], 100, 'metaInfo', null),
];
