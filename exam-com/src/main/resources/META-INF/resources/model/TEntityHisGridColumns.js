/**
 * エンティティ履歴グリッド定義
 */

let TEntityHisGridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntityHisGrid.sosenId'], 100, 'primaryKey', 'SOSEN_MEI'),
    Column.cell('OYA_SN', Messages['TEntityHisGrid.oyaSn'], 100, 'primaryKey', null),
    Column.cell('ENTITY_SN', Messages['TEntityHisGrid.entitySn'], 100, 'primaryKey', null),
    Column.cell('HISTORY_SN', Messages['TEntityHisGrid.historySn'], 100, 'primaryKey', null),
    Column.text('ENTITY_MEI', Messages['TEntityHisGrid.entityMei'], 300, '', null),
    Column.text('SANSHO1_ID', Messages['TEntityHisGrid.sansho1Id'], 100, '', null),
    Column.text('SANSHO1_MEI', Messages['TEntityHisGrid.sansho1Mei'], 300, '', null),
    Column.text('SANSHO2_ID', Messages['TEntityHisGrid.sansho2Id'], 100, '', null),
    Column.text('SANSHO2_MEI', Messages['TEntityHisGrid.sansho2Mei'], 300, '', null),
    Column.text('BETSU_SANSHO1_ID', Messages['TEntityHisGrid.betsuSansho1Id'], 100, '', null),
    Column.text('BETSU_SANSHO1_MEI', Messages['TEntityHisGrid.betsuSansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntityHisGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntityHisGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntityHisGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntityHisGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntityHisGrid.deleteF'], 10, ''),
];
