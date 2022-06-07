/**
 * INV_SURVEY_RESULT_HIS_OTHERグリッド定義
 */

let InvSurveyResultHisOtherGridColumns = [
    Column.cell('LOCATION_CODE', Messages['InvSurveyResultHisOtherGrid.locationCode'], 100, 'primaryKey', null),
    Column.cell('RESULT_BRANCH_NO', Messages['InvSurveyResultHisOtherGrid.resultBranchNo'], 20, 'primaryKey', null),
    Column.cell('YYYY', Messages['InvSurveyResultHisOtherGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['InvSurveyResultHisOtherGrid.mm'], 20, 'primaryKey', null),
    Column.text('HINBAN', Messages['InvSurveyResultHisOtherGrid.hinban'], 250, '', null),
    Column.text('STOCK', Messages['InvSurveyResultHisOtherGrid.stock'], 110, '', null),
    Column.select('DECISION_KBN', Messages['InvSurveyResultHisOtherGrid.decisionKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.date('ENTRY_DATE', Messages['InvSurveyResultHisOtherGrid.entryDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('REGISTRANT', Messages['InvSurveyResultHisOtherGrid.registrant'], 100, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvSurveyResultHisOtherGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvSurveyResultHisOtherGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvSurveyResultHisOtherGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvSurveyResultHisOtherGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('SHUKEI_TANI_MEI', Messages['InvSurveyResultHisOtherGrid.shukeiTaniMei'], 200, '', null),
    Column.text('DENPYO_NO', Messages['InvSurveyResultHisOtherGrid.denpyoNo'], 100, '', null),
    Column.text('OPE_DETAIL', Messages['InvSurveyResultHisOtherGrid.opeDetail'], 100, '', null),
];
