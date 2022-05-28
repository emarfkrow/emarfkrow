/**
 * MFG_KANBAN_FORM_HEDグリッド定義
 */

let MfgKanbanFormHedGridColumns = [
    Column.cell('KANBAN_FORM_DEF_NAME', Messages['MfgKanbanFormHedGrid.kanbanFormDefName'], 300, 'primaryKey', null),
    Column.text('KANBAN_TEMPLATE_NAME', Messages['MfgKanbanFormHedGrid.kanbanTemplateName'], 300, '', null),
    Column.check('SELF_PROC_AFTER_TUNNEL_FLG', Messages['MfgKanbanFormHedGrid.selfProcAfterTunnelFlg'], 10, ''),
    Column.text('OUTPUT_PER_PAGE', Messages['MfgKanbanFormHedGrid.outputPerPage'], 20, '', null),
    Column.check('AUTO_SHAPE_FLG', Messages['MfgKanbanFormHedGrid.autoShapeFlg'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgKanbanFormHedGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgKanbanFormHedGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgKanbanFormHedGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgKanbanFormHedGrid.userIdChange'], 100, 'metaInfo', null),
];
