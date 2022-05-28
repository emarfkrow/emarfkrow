/**
 * INV_SURVEY_RESULT_HALFグリッド定義
 */

let InvSurveyResultHalfGridColumns = [
    Column.cell('DISCRIMINATION_ID', Messages['InvSurveyResultHalfGrid.discriminationId'], 130, 'primaryKey', null),
    Column.text('YYYY', Messages['InvSurveyResultHalfGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['InvSurveyResultHalfGrid.mm'], 20, '', null),
    Column.text('HINBAN', Messages['InvSurveyResultHalfGrid.hinban'], 250, '', null),
    Column.text('STOCK', Messages['InvSurveyResultHalfGrid.stock'], 110, '', null),
    Column.select('DECISION_KBN', Messages['InvSurveyResultHalfGrid.decisionKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('PRO_GROUP_NO', Messages['InvSurveyResultHalfGrid.proGroupNo'], 20, '', null),
    Column.text('ROUTING', Messages['InvSurveyResultHalfGrid.routing'], 20, '', null),
    Column.refer('WC_CODE', Messages['InvSurveyResultHalfGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.date('ENTRY_DATE', Messages['InvSurveyResultHalfGrid.entryDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('REGISTRANT', Messages['InvSurveyResultHalfGrid.registrant'], 100, '', null),
    Column.text('OUTPUT_STATUS', Messages['InvSurveyResultHalfGrid.outputStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvSurveyResultHalfGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvSurveyResultHalfGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvSurveyResultHalfGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvSurveyResultHalfGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('SHUKEI_TANI_MEI', Messages['InvSurveyResultHalfGrid.shukeiTaniMei'], 200, '', null),
];
