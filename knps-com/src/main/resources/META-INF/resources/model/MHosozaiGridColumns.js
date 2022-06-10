/**
 * 包装材マスタグリッド定義
 */

let MHosozaiGridColumns = [
    Column.cell('HOSO-HINBAN', Messages['MHosozaiGrid.hosoHinban'], 250, 'primaryKey', null),
    Column.text('HOSO-HINMEI', Messages['MHosozaiGrid.hosoHinmei'], 300, '', null),
    Column.text('HOSO-HINMEI-RYAKU', Messages['MHosozaiGrid.hosoHinmeiRyaku'], 250, '', null),
    Column.text('HOSO-SIZE', Messages['MHosozaiGrid.hosoSize'], 300, '', null),
    Column.text('HOSO-TANKA', Messages['MHosozaiGrid.hosoTanka'], 70, '', null),
    Column.text('HOSO-ZAICODE', Messages['MHosozaiGrid.hosoZaicode'], 50, '', null),
    Column.text('HOSO-WEIGHT', Messages['MHosozaiGrid.hosoWeight'], 70, '', null),
    Column.text('MAKEDATE', Messages['MHosozaiGrid.makedate'], 80, '', null),
    Column.text('UPDDATE', Messages['MHosozaiGrid.upddate'], 80, '', null),
];
