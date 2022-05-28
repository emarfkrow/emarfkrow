/**
 * MST_SALES_TAXグリッド定義
 */

let MstSalesTaxGridColumns = [
    Column.cell('START_DATE', Messages['MstSalesTaxGrid.startDate'], 70, 'primaryKey', Slick.Formatters.Extends.DateTime),
    Column.text('SALSE_TAX', Messages['MstSalesTaxGrid.salseTax'], 30, '', null),
];
