/**
 *
 */

let D0001GridColumns = [
    Column.refer('SOSEN_ID', '祖先ID', 100, 'primaryKey', 'SOSEN_MEI'),
    Column.cell('OYA_SN', '親連番', 100, 'primaryKey'),
    Column.cell('ENTITY_SN', 'エンティティ連番', 100, 'primaryKey'),
    Column.text('ENTITY_MEI', 'エンティティ名', 300),
    Column.text('SANSHO1_ID', '参照１ID', 100),
    Column.text('SANSHO1_MEI', '参照１名', 300),
    Column.text('SANSHO2_ID', '参照２ID', 100),
    Column.text('SANSHO2_MEI', '参照２名', 300),
    Column.text('BETSU_SANSHO1_ID', '別参照１ID', 100),
    Column.text('BETSU_SANSHO1_MEI', '別参照１名', 300),
    Column.check('DELETE_F', '削除フラグ', 10),
    Column.text('NULL_ENTITY2_MEI', '任意エンティティ２名', 200),
    Column.text('ENTITY2_MEI', 'エンティティ２名', 300),
    Column.check('CHECK_F', 'チェックフラグ', 10, ''),
    Column.select('RADIO_KB', 'ラジオ区分', 20, '', { json: 'MCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('PULLDOWN_KB', 'プルダウン区分', 20, '', { json: 'MCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.longText('MEMO_TX', 'メモ', 300),
    Column.date('HIDUKE_YMD', '日付', 100),
    Column.month('NENGETSU_YM', '年月', 70),
    Column.text('SAMPLE_Y', '年', 40),
    Column.text('SAMPLE_M', '月', 20),
    Column.dateTime('NICHIJI_DT', '日時', 230),
    Column.time('JIKOKU_HM', '時刻', 60),
    Column.text('JIKAN_TM', '時間', 60),
    Column.text('SURYO_QT', '数量', 90),
    Column.text('TANKA_AM', '単価', 110),
    Column.text('KINGAKU_AM', '金額', 110),
];
