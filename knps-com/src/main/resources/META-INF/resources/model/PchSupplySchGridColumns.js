/**
 * PCH_SUPPLY_SCHグリッド定義
 */

let PchSupplySchGridColumns = [
    Column.cell('SUPPLY_NO', Messages['PchSupplySchGrid.supplyNo'], 120, 'primaryKey', null),
    Column.text('SUPPLY_ORDER_NO', Messages['PchSupplySchGrid.supplyOrderNo'], 100, '', null),
    Column.text('HINBAN', Messages['PchSupplySchGrid.hinban'], 250, '', null),
    Column.select('SUPPLY_KBN', Messages['PchSupplySchGrid.supplyKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('SUPPLY_UNIT', Messages['PchSupplySchGrid.supplyUnit'], 90, '', null),
    Column.text('SUPPLY_COUNTS', Messages['PchSupplySchGrid.supplyCounts'], 110, '', null),
    Column.text('ACT_SUPPLY_COUNTS', Messages['PchSupplySchGrid.actSupplyCounts'], 110, '', null),
    Column.refer('SUP_CODE', Messages['PchSupplySchGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.date('SUPPLY_DATE', Messages['PchSupplySchGrid.supplyDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('SUPPLY_VERIFY_STAT', Messages['PchSupplySchGrid.supplyVerifyStat'], 10, '', null),
    Column.text('USER_ID_VERIFY', Messages['PchSupplySchGrid.userIdVerify'], 100, '', null),
    Column.text('SUPPLY_ISSUE_STAT', Messages['PchSupplySchGrid.supplyIssueStat'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PchSupplySchGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchSupplySchGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchSupplySchGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchSupplySchGrid.userIdChange'], 100, 'metaInfo', null),
];
