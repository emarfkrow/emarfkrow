-- Project Name : emarf
-- Date/Time    : 2022/04/29 7:52:22
-- Author       : toshiyuki
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- 添付ファイル
drop table if exists T_TENPU_FILE cascade;

create table T_TENPU_FILE (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_SN INT not null comment '親連番'
  , ENTITY_SN INT not null comment 'エンティティ連番'
  , TENPU_FILE_SN INT not null comment '添付ファイル連番'
  , TENPU_FILE VARCHAR(200) not null comment '添付ファイル'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_TENPU_FILE_PKC primary key (SOSEN_ID,OYA_SN,ENTITY_SN,TENPU_FILE_SN)
) comment '添付ファイル' ;

-- 所属マスタ
drop table if exists M_SHOZOKU cascade;

create table M_SHOZOKU (
  BUSHO_ID INT not null comment '部署ID'
  , SHOKUI_ID INT not null comment '職位ID'
  , USER_ID INT not null comment 'ユーザID'
  , KAISHI_YMD CHAR(10) comment '開始日'
  , SHURYO_YMD CHAR(10) comment '終了日'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_SHOZOKU_PKC primary key (BUSHO_ID,SHOKUI_ID,USER_ID)
) comment '所属マスタ' ;

-- 職位マスタ
drop table if exists M_SHOKUI cascade;

create table M_SHOKUI (
  SHOKUI_ID INT not null comment '職位ID'
  , SHOKUI_MEI VARCHAR(30) not null comment '職位名'
  , ORDER_ID INT not null comment '職位順'
  , KAISHI_YMD CHAR(10) comment '開始日'
  , SHURYO_YMD CHAR(10) comment '終了日'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_SHOKUI_PKC primary key (SHOKUI_ID)
) comment '職位マスタ' ;

-- 部署マスタ
drop table if exists M_BUSHO cascade;

create table M_BUSHO (
  BUSHO_ID INT not null comment '部署ID'
  , BUSHO_MEI VARCHAR(30) not null comment '部署名'
  , KAISHI_YMD CHAR(10) comment '開始日'
  , SHURYO_YMD CHAR(10) comment '終了日'
  , OYA_BUSHO_ID INT comment '親部署ID'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_BUSHO_PKC primary key (BUSHO_ID)
) comment '部署マスタ' ;

-- 参照２マスタ
drop table if exists M_SANSHO2 cascade;

create table M_SANSHO2 (
  SANSHO2_ID CHAR(6) not null comment '参照２ID'
  , SANSHO2_MEI VARCHAR(30) not null comment '参照２名'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_SANSHO2_PKC primary key (SANSHO2_ID)
) comment '参照２マスタ' ;

-- 認可マスタ
drop table if exists M_NINKA cascade;

create table M_NINKA (
  BUSHO_ID INT not null comment '部署ID'
  , SHOKUI_ID INT not null comment '職位ID'
  , GAMEN_NM VARCHAR(20) not null comment '画面名'
  , KENGEN_KB VARCHAR(2) not null comment '権限区分'
  , KAISHI_YMD CHAR(10) comment '開始日'
  , SHURYO_YMD CHAR(10) comment '終了日'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_NINKA_PKC primary key (BUSHO_ID,SHOKUI_ID,GAMEN_NM)
) comment '認可マスタ' ;

-- ユーザマスタ
drop table if exists M_USER cascade;

create table M_USER (
  USER_ID INT not null comment 'ユーザID'
  , USER_SEI VARCHAR(30) not null comment 'ユーザ姓'
  , USER_MEI VARCHAR(30) not null comment 'ユーザ名'
  , EMAIL VARCHAR(200) not null comment 'メールアドレス'
  , PASSWORD VARCHAR(200) not null comment 'パスワード'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_USER_PKC primary key (USER_ID)
) comment 'ユーザマスタ' ;

-- エンティティ２
drop table if exists T_ENTITY2 cascade;

create table T_ENTITY2 (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_SN INT not null comment '親連番'
  , ENTITY_SN INT not null comment 'エンティティ連番'
  , NULL_ENTITY2_MEI VARCHAR(20) comment '任意エンティティ２名'
  , ENTITY2_MEI VARCHAR(30) not null comment 'エンティティ２名'
  , CHECK_F CHAR(1) not null comment 'チェックフラグ'
  , RADIO_KB VARCHAR(2) not null comment 'ラジオ区分'
  , PULLDOWN_KB VARCHAR(2) not null comment 'プルダウン区分'
  , MEMO_TX VARCHAR(200) not null comment 'メモ'
  , HIDUKE_YMD CHAR(10) not null comment '日付'
  , NENGETSU_YM CHAR(7) not null comment '年月'
  , SAMPLE_Y CHAR(4) not null comment '年'
  , SAMPLE_M CHAR(2) not null comment '月'
  , NICHIJI_DT DATETIME(3) not null comment '日時'
  , JIKOKU_HM VARCHAR(6) not null comment '時刻'
  , JIKAN_TM VARCHAR(6) not null comment '時間'
  , SURYO_QT DECIMAL(9,2) not null comment '数量'
  , TANKA_AM DECIMAL(11,3) not null comment '単価'
  , KINGAKU_AM DECIMAL(11,3) not null comment '金額'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ENTITY2_PKC primary key (SOSEN_ID,OYA_SN,ENTITY_SN)
) comment 'エンティティ２' ;

-- コード値マスタ
drop table if exists M_CODE_VALUE cascade;

create table M_CODE_VALUE (
  CODE_NM VARCHAR(20) not null comment 'コード名称'
  , CODE_VALUE VARCHAR(2) not null comment 'コード値'
  , CODE_VALUE_MEI VARCHAR(30) not null comment 'コード値名'
  , HYOJI_JUN INT not null comment '表示順'
  , CRITERIA VARCHAR(200) comment '取得条件'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_CODE_VALUE_PKC primary key (CODE_NM,CODE_VALUE)
) comment 'コード値マスタ' ;

-- コードマスタ
drop table if exists M_CODE cascade;

create table M_CODE (
  CODE_NM VARCHAR(20) not null comment 'コード名称'
  , CODE_MEI VARCHAR(30) not null comment 'コード名'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_CODE_PKC primary key (CODE_NM)
) comment 'コードマスタ' ;

-- エンティティ履歴
drop table if exists T_ENTITY_HIS cascade;

create table T_ENTITY_HIS (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_SN INT not null comment '親連番'
  , ENTITY_SN INT not null comment 'エンティティ連番'
  , HISTORY_SN INT not null comment '履歴連番'
  , ENTITY_MEI VARCHAR(30) not null comment 'エンティティ名'
  , SANSHO1_ID INT comment '参照１ID'
  , SANSHO1_MEI VARCHAR(30) comment '参照１名'
  , SANSHO2_ID INT comment '参照２ID'
  , SANSHO2_MEI VARCHAR(30) comment '参照２名'
  , BETSU_SANSHO1_ID INT comment '別参照１ID'
  , BETSU_SANSHO1_MEI VARCHAR(30) comment '別参照１名'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ENTITY_HIS_PKC primary key (SOSEN_ID,OYA_SN,ENTITY_SN,HISTORY_SN)
) comment 'エンティティ履歴' ;

-- 参照１マスタ
drop table if exists M_SANSHO1 cascade;

create table M_SANSHO1 (
  SANSHO1_ID INT not null comment '参照１ID'
  , SANSHO1_MEI VARCHAR(30) not null comment '参照１名'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint M_SANSHO1_PKC primary key (SANSHO1_ID)
) comment '参照１マスタ' ;

-- 子孫
drop table if exists T_SHISON cascade;

create table T_SHISON (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_SN INT not null comment '親連番'
  , ENTITY_SN INT not null comment 'エンティティ連番'
  , KO_SN INT not null comment '子連番'
  , SHISON_SN INT not null comment '子孫連番'
  , SHISON_MEI VARCHAR(30) not null comment '子孫名'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_SHISON_PKC primary key (SOSEN_ID,OYA_SN,ENTITY_SN,KO_SN,SHISON_SN)
) comment '子孫' ;

-- 子
drop table if exists T_KO cascade;

create table T_KO (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_SN INT not null comment '親連番'
  , ENTITY_SN INT not null comment 'エンティティ連番'
  , KO_SN INT not null comment '子連番'
  , KO_MEI VARCHAR(30) not null comment '子名'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_KO_PKC primary key (SOSEN_ID,OYA_SN,ENTITY_SN,KO_SN)
) comment '子' ;

-- エンティティ
drop table if exists T_ENTITY cascade;

create table T_ENTITY (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_SN INT not null comment '親連番'
  , ENTITY_SN INT not null comment 'エンティティ連番'
  , ENTITY_MEI VARCHAR(30) not null comment 'エンティティ名'
  , SANSHO1_ID INT comment '参照１ID'
  , SANSHO1_MEI VARCHAR(30) comment '参照１名'
  , SANSHO2_ID INT comment '参照２ID'
  , SANSHO2_MEI VARCHAR(30) comment '参照２名'
  , BETSU_SANSHO1_ID INT comment '別参照１ID'
  , BETSU_SANSHO1_MEI VARCHAR(30) comment '別参照１名'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_ENTITY_PKC primary key (SOSEN_ID,OYA_SN,ENTITY_SN)
) comment 'エンティティ' ;

-- 親
drop table if exists T_OYA cascade;

create table T_OYA (
  SOSEN_ID INT not null comment '祖先ID'
  , OYA_SN INT not null comment '親連番'
  , OYA_MEI VARCHAR(30) not null comment '親名'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_OYA_PKC primary key (SOSEN_ID,OYA_SN)
) comment '親' ;

-- 祖先
drop table if exists T_SOSEN cascade;

create table T_SOSEN (
  SOSEN_ID INT not null comment '祖先ID'
  , SOSEN_MEI VARCHAR(30) not null comment '祖先名'
  , INSERT_DT DATETIME(3) not null comment '登録日時'
  , INSERT_BY VARCHAR(10) not null comment '登録者'
  , UPDATE_DT DATETIME(3) not null comment '更新日時'
  , UPDATE_BY VARCHAR(10) not null comment '更新者'
  , DELETE_F CHAR(1) comment '削除フラグ'
  , constraint T_SOSEN_PKC primary key (SOSEN_ID)
) comment '祖先' ;

