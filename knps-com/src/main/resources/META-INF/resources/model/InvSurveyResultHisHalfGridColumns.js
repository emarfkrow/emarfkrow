/**
 * INV_SURVEY_RESULT_HIS_HALFグリッド定義
 */

let InvSurveyResultHisHalfGridColumns = [
    Column.cell('DISCRIMINATION_ID', Messages['InvSurveyResultHisHalfGrid.discriminationId'], 130, 'primaryKey', null),
    Column.cell('YYYY', Messages['InvSurveyResultHisHalfGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['InvSurveyResultHisHalfGrid.mm'], 20, 'primaryKey', null),
    Column.text('HINBAN', Messages['InvSurveyResultHisHalfGrid.hinban'], 250, '', null),
    Column.text('STOCK', Messages['InvSurveyResultHisHalfGrid.stock'], 110, '', null),
    Column.select('DECISION_KBN', Messages['InvSurveyResultHisHalfGrid.decisionKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('PRO_GROUP_NO', Messages['InvSurveyResultHisHalfGrid.proGroupNo'], 20, '', null),
    Column.text('ROUTING', Messages['InvSurveyResultHisHalfGrid.routing'], 20, '', null),
    Column.refer('WC_CODE', Messages['InvSurveyResultHisHalfGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.date('ENTRY_DATE', Messages['InvSurveyResultHisHalfGrid.entryDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('REGISTRANT', Messages['InvSurveyResultHisHalfGrid.registrant'], 100, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvSurveyResultHisHalfGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvSurveyResultHisHalfGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvSurveyResultHisHalfGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvSurveyResultHisHalfGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('SHUKEI_TANI_MEI', Messages['InvSurveyResultHisHalfGrid.shukeiTaniMei'], 200, '', null),
];
