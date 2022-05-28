/**
 * INV_SURVEY_RESULT_LOCグリッド定義
 */

let InvSurveyResultLocGridColumns = [
    Column.refer('LOCATION_CODE', Messages['InvSurveyResultLocGrid.locationCode'], 100, 'primaryKey', 'LOCATION_NAME'),
    Column.text('YYYY', Messages['InvSurveyResultLocGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['InvSurveyResultLocGrid.mm'], 20, '', null),
    Column.text('HINBAN', Messages['InvSurveyResultLocGrid.hinban'], 250, '', null),
    Column.text('STOCK', Messages['InvSurveyResultLocGrid.stock'], 110, '', null),
    Column.select('DECISION_KBN', Messages['InvSurveyResultLocGrid.decisionKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.date('ENTRY_DATE', Messages['InvSurveyResultLocGrid.entryDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('REGISTRANT', Messages['InvSurveyResultLocGrid.registrant'], 100, '', null),
    Column.text('OUTPUT_STATUS', Messages['InvSurveyResultLocGrid.outputStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvSurveyResultLocGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvSurveyResultLocGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvSurveyResultLocGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvSurveyResultLocGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('SHUKEI_TANI_MEI', Messages['InvSurveyResultLocGrid.shukeiTaniMei'], 200, '', null),
];
