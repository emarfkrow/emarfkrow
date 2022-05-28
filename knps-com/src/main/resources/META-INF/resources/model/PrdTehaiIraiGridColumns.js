/**
 * PRD_TEHAI_IRAIグリッド定義
 */

let PrdTehaiIraiGridColumns = [
    Column.cell('PRD_TEHAI_NO', Messages['PrdTehaiIraiGrid.prdTehaiNo'], 100, 'primaryKey', null),
    Column.select('TEHAI_JOKYO_KB', Messages['PrdTehaiIraiGrid.tehaiJokyoKb'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('KAITEI_JOKYO_KB', Messages['PrdTehaiIraiGrid.kaiteiJokyoKb'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('IRAI_BUSHO_CD', Messages['PrdTehaiIraiGrid.iraiBushoCd'], 20, '', null),
    Column.text('DAIRITEN_MEI', Messages['PrdTehaiIraiGrid.dairitenMei'], 300, '', null),
    Column.text('NONYUSAKI_MEI', Messages['PrdTehaiIraiGrid.nonyusakiMei'], 300, '', null),
    Column.text('KIHYOSHA_CD', Messages['PrdTehaiIraiGrid.kihyoshaCd'], 100, '', null),
    Column.dateTime('KIHYO_DT', Messages['PrdTehaiIraiGrid.kihyoDt'], 70, ''),
    Column.text('SHINSEISHA_CD', Messages['PrdTehaiIraiGrid.shinseishaCd'], 100, '', null),
    Column.dateTime('SHINSEI_DT', Messages['PrdTehaiIraiGrid.shinseiDt'], 70, ''),
    Column.text('SHINSEI_CMT', Messages['PrdTehaiIraiGrid.shinseiCmt'], 300, '', null),
    Column.text('SHINSEISAKI_CD', Messages['PrdTehaiIraiGrid.shinseisakiCd'], 100, '', null),
    Column.text('SHONINSHA_CD', Messages['PrdTehaiIraiGrid.shoninshaCd'], 100, '', null),
    Column.dateTime('SHONIN_DT', Messages['PrdTehaiIraiGrid.shoninDt'], 70, ''),
    Column.text('UKETSUKESHA_CD', Messages['PrdTehaiIraiGrid.uketsukeshaCd'], 100, '', null),
    Column.dateTime('UKETSUKE_DT', Messages['PrdTehaiIraiGrid.uketsukeDt'], 70, ''),
    Column.text('KAITOSHA_CD', Messages['PrdTehaiIraiGrid.kaitoshaCd'], 100, '', null),
    Column.dateTime('KAITO_DT', Messages['PrdTehaiIraiGrid.kaitoDt'], 70, ''),
    Column.text('JUCHUNO_CSV', Messages['PrdTehaiIraiGrid.juchunoCsv'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdTehaiIraiGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdTehaiIraiGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdTehaiIraiGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdTehaiIraiGrid.userIdChange'], 100, 'metaInfo', null),
];
