insert into m_user (user_id, user_sei, user_mei, email, password, insert_dt, insert_by, update_dt, update_by, delete_f) values (1,1,1,1,1, SYSDATE(), 'initdata', SYSDATE(), 'initdata',null);



delete from m_code;

INSERT INTO m_code(code_nm, code_mei, insert_dt, insert_by, update_dt, update_by) VALUES ('check_f', 'チェックフラグ', SYSDATE(), 'initdata', SYSDATE(), 'initdata');

INSERT INTO m_code(code_nm, code_mei, insert_dt, insert_by, update_dt, update_by) VALUES ('radio_kb', 'ラジオ区分', SYSDATE(), 'initdata', SYSDATE(), 'initdata');


INSERT INTO m_code(code_nm, code_mei, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', 'プルダウン区分', SYSDATE(), 'initdata', SYSDATE(), 'initdata');









INSERT INTO m_code(code_nm, code_mei, insert_dt, insert_by, update_dt, update_by) VALUES ('delete_f', '削除フラグ', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code(code_nm, code_mei, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '権限区分', SYSDATE(), 'initdata', SYSDATE(), 'initdata');

delete from m_code_value;

INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('check_f', '0', 'なし', 1, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('check_f', '1', 'あり', 2, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('radio_kb', '1', '一つ目', 1, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('radio_kb', '2', '二つ目', 2, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('radio_kb', '3', '三つ目', 3, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '01', '一番目', 1, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '02', '二番目', 2, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '03', '三番目', 3, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '04', '四番目', 4, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '05', '五番目', 5, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '06', '六番目', 6, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '07', '七番目', 7, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '08', '八番目', 8, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '09', '九番目', 9, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '10', '十番目', 10, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('delete_f', '0', '未削除', 1, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('delete_f', '1', '削除', 2, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '0', 'なし', 1, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '1', '閲覧', 2, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_code_value(code_nm, code_value, code_value_mei, hyoji_jun, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '2', '更新', 3, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');


insert into emarf.m_busho(`BUSHO_ID`,`BUSHO_MEI`,`KAISHI_YMD`,`SHURYO_YMD`,`OYA_BUSHO_ID`,`INSERT_DT`,`INSERT_BY`,`UPDATE_DT`,`UPDATE_BY`,`DELETE_F`) values 
    (1,'創研情報株式会社',null,null,null,'2022/04/20 13:33:21.503','1','2022/04/20 13:33:28.226','1',null)
  , (2,'東京本社',null,null,1,'2022/04/20 13:33:50.448','1','2022/04/20 13:33:53.434','1',null)
  , (3,'京都本社',null,null,1,'2022/04/20 13:34:12.686','1','2022/04/20 13:34:15.393','1',null)
  , (4,'営業部',null,null,3,'2022/04/20 13:34:37.963','1','2022/04/20 13:34:42.501','1',null)
  , (5,'開発部',null,null,3,'2022/04/20 13:35:00.051','1','2022/04/20 13:35:03.341','1',null);

insert into emarf.m_shokui(`SHOKUI_ID`,`SHOKUI_MEI`,`ORDER_ID`,`KAISHI_YMD`,`SHURYO_YMD`,`INSERT_DT`,`INSERT_BY`,`UPDATE_DT`,`UPDATE_BY`,`DELETE_F`) values 
    (1,'会長',1,null,null,'2022/04/20 13:41:12.139','1','2022/04/20 13:48:00.912','1',null)
  , (2,'社長',2,null,null,'2022/04/20 13:41:46.993','1','2022/04/20 13:48:00.912','1',null)
  , (3,'専務',3,null,null,'2022/04/20 13:42:42.966','1','2022/04/20 13:48:00.912','1',null)
  , (4,'常務',4,null,null,'2022/04/20 13:43:07.619','1','2022/04/20 13:48:00.912','1',null)
  , (5,'監査役',5,null,null,'2022/04/20 13:43:29.102','1','2022/04/20 13:48:00.912','1',null)
  , (6,'事業部長',6,null,null,'2022/04/20 13:48:00.912','1','2022/04/20 13:48:00.912','1',null)
  , (7,'本部長',7,null,null,'2022/04/20 13:48:00.912','1','2022/04/20 13:48:00.912','1',null)
  , (8,'部長',8,null,null,'2022/04/20 13:48:00.912','1','2022/04/20 13:48:00.912','1',null)
  , (9,'次長',9,null,null,'2022/04/20 13:48:00.912','1','2022/04/20 13:48:00.912','1',null)
  , (10,'課長',10,null,null,'2022/04/20 13:48:00.912','1','2022/04/20 13:48:00.912','1',null)
  , (11,'係長',11,null,null,'2022/04/20 13:48:00.912','1','2022/04/20 13:48:00.912','1',null)
  , (12,'主任',12,null,null,'2022/04/20 13:48:00.912','1','2022/04/20 13:48:00.912','1',null);

