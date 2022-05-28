/**
 * MST_PHASEグリッド定義
 */

let MstPhaseGridColumns = [
    Column.cell('PHASE', Messages['MstPhaseGrid.phase'], 30, 'primaryKey', null),
    Column.text('YY', Messages['MstPhaseGrid.yy'], 40, '', null),
    Column.text('PHASE_FROM', Messages['MstPhaseGrid.phaseFrom'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('PHASE_TO', Messages['MstPhaseGrid.phaseTo'], 70, '', Slick.Formatters.Extends.DateTime),
];
