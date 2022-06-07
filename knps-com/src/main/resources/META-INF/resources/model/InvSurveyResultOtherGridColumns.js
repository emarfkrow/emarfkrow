/**
 * INV_SURVEY_RESULT_OTHERグリッド定義
 */

let InvSurveyResultOtherGridColumns = [
    Column.cell('LOCATION_CODE', Messages['InvSurveyResultOtherGrid.locationCode'], 100, 'primaryKey', null),
    Column.cell('RESULT_BRANCH_NO', Messages['InvSurveyResultOtherGrid.resultBranchNo'], 20, 'primaryKey', null),
    Column.text('YYYY', Messages['InvSurveyResultOtherGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['InvSurveyResultOtherGrid.mm'], 20, '', null),
    Column.text('HINBAN', Messages['InvSurveyResultOtherGrid.hinban'], 250, '', null),
    Column.text('STOCK', Messages['InvSurveyResultOtherGrid.stock'], 110, '', null),
    Column.select('DECISION_KBN', Messages['InvSurveyResultOtherGrid.decisionKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.date('ENTRY_DATE', Messages['InvSurveyResultOtherGrid.entryDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('REGISTRANT', Messages['InvSurveyResultOtherGrid.registrant'], 100, '', null),
    Column.text('OUTPUT_STATUS', Messages['InvSurveyResultOtherGrid.outputStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvSurveyResultOtherGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvSurveyResultOtherGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvSurveyResultOtherGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvSurveyResultOtherGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('SHUKEI_TANI_MEI', Messages['InvSurveyResultOtherGrid.shukeiTaniMei'], 200, '', null),
    Column.text('DENPYO_NO', Messages['InvSurveyResultOtherGrid.denpyoNo'], 100, '', null),
    Column.text('OPE_DETAIL', Messages['InvSurveyResultOtherGrid.opeDetail'], 100, '', null),
];
