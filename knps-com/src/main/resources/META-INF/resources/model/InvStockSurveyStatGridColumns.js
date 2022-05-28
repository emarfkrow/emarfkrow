/**
 * INV_STOCK_SURVEY_STATグリッド定義
 */

let InvStockSurveyStatGridColumns = [
    Column.cell('REC_NO', Messages['InvStockSurveyStatGrid.recNo'], 30, 'primaryKey', null),
    Column.text('YYYY', Messages['InvStockSurveyStatGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['InvStockSurveyStatGrid.mm'], 20, '', null),
    Column.text('SURVEY_STAT', Messages['InvStockSurveyStatGrid.surveyStat'], 10, '', null),
    Column.text('DEVELOP_PRODUCTS_STAT', Messages['InvStockSurveyStatGrid.developProductsStat'], 10, '', null),
    Column.text('DEVELOP_PARTS_STAT', Messages['InvStockSurveyStatGrid.developPartsStat'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockSurveyStatGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockSurveyStatGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockSurveyStatGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockSurveyStatGrid.userIdChange'], 100, 'metaInfo', null),
];
