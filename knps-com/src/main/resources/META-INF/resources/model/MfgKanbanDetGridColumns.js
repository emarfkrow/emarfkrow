/**
 * MFG_KANBAN_DETグリッド定義
 */

let MfgKanbanDetGridColumns = [
    Column.cell('KANBAN_ID', Messages['MfgKanbanDetGrid.kanbanId'], 90, 'primaryKey', null),
    Column.text('HINBAN', Messages['MfgKanbanDetGrid.hinban'], 250, '', null),
    Column.refer('NECK_ROUTING_CODE', Messages['MfgKanbanDetGrid.neckRoutingCode'], 100, '', 'NECK_ROUTING_NAME'),
    Column.select('FOR_PRO_CODE', Messages['MfgKanbanDetGrid.forProCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('FOR_PRO_LOCATION_CODE', Messages['MfgKanbanDetGrid.forProLocationCode'], 100, '', 'FOR_PRO_LOCATION_NAME'),
    Column.select('PRO_CODE', Messages['MfgKanbanDetGrid.proCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('PRO_LOCATION_CODE', Messages['MfgKanbanDetGrid.proLocationCode'], 100, '', 'PRO_LOCATION_NAME'),
    Column.text('COMMENT1', Messages['MfgKanbanDetGrid.comment1'], 300, '', null),
    Column.text('COMMENT2', Messages['MfgKanbanDetGrid.comment2'], 300, '', null),
    Column.text('ROUTING1', Messages['MfgKanbanDetGrid.routing1'], 20, '', null),
    Column.text('TUNNEL_PRO_CODE1', Messages['MfgKanbanDetGrid.tunnelProCode1'], 100, '', null),
    Column.text('ROUTING2', Messages['MfgKanbanDetGrid.routing2'], 20, '', null),
    Column.text('TUNNEL_PRO_CODE2', Messages['MfgKanbanDetGrid.tunnelProCode2'], 100, '', null),
    Column.text('ROUTING3', Messages['MfgKanbanDetGrid.routing3'], 20, '', null),
    Column.text('TUNNEL_PRO_CODE3', Messages['MfgKanbanDetGrid.tunnelProCode3'], 100, '', null),
    Column.text('ROUTING4', Messages['MfgKanbanDetGrid.routing4'], 20, '', null),
    Column.text('TUNNEL_PRO_CODE4', Messages['MfgKanbanDetGrid.tunnelProCode4'], 100, '', null),
    Column.text('ROUTING5', Messages['MfgKanbanDetGrid.routing5'], 20, '', null),
    Column.text('TUNNEL_PRO_CODE5', Messages['MfgKanbanDetGrid.tunnelProCode5'], 100, '', null),
    Column.text('KANBAN_ACC_COUNTS', Messages['MfgKanbanDetGrid.kanbanAccCounts'], 60, '', null),
    Column.text('LOT_SIZE', Messages['MfgKanbanDetGrid.lotSize'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgKanbanDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgKanbanDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgKanbanDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgKanbanDetGrid.userIdChange'], 100, 'metaInfo', null),
];
