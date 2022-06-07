/**
 * INV_SURVEY_RESULT_HIS_LOCグリッド定義
 */

let InvSurveyResultHisLocGridColumns = [
    Column.cell('LOCATION_CODE', Messages['InvSurveyResultHisLocGrid.locationCode'], 100, 'primaryKey', null),
    Column.cell('YYYY', Messages['InvSurveyResultHisLocGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['InvSurveyResultHisLocGrid.mm'], 20, 'primaryKey', null),
    Column.text('HINBAN', Messages['InvSurveyResultHisLocGrid.hinban'], 250, '', null),
    Column.text('STOCK', Messages['InvSurveyResultHisLocGrid.stock'], 110, '', null),
    Column.select('DECISION_KBN', Messages['InvSurveyResultHisLocGrid.decisionKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.date('ENTRY_DATE', Messages['InvSurveyResultHisLocGrid.entryDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('REGISTRANT', Messages['InvSurveyResultHisLocGrid.registrant'], 100, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvSurveyResultHisLocGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvSurveyResultHisLocGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvSurveyResultHisLocGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvSurveyResultHisLocGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('SHUKEI_TANI_MEI', Messages['InvSurveyResultHisLocGrid.shukeiTaniMei'], 200, '', null),
];
