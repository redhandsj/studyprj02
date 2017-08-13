-- 科目マスタ
CREATE TABLE m_kamoku (
	kamoku_id INTEGER PRIMARY KEY AUTO_INCREMENT,
	kamoku_name VARCHAR(255) NOT NULL,
);
INSERT INTO m_kamoku (kamoku_name) VALUES('事業主貸');
INSERT INTO m_kamoku (kamoku_name) VALUES('通信費');
INSERT INTO m_kamoku (kamoku_name) VALUES('現金');
INSERT INTO m_kamoku (kamoku_name) VALUES('光熱費');
INSERT INTO m_kamoku (kamoku_name) VALUES('地代家賃');
INSERT INTO m_kamoku (kamoku_name) VALUES('売掛金');


-- 預金出納帳
CREATE TABLE t_yokin (
	yokin_id INTEGER PRIMARY KEY AUTO_INCREMENT, 
	hiduke DATE NOT NULL,
	kamoku_id INTEGER NOT NULL,
	tekiyo VARCHAR(255) NOT NULL,
	nyuukin INTEGER NOT NULL,
	syukkin INTEGER NOT NULL,
	zandaka INTEGER NOT NULL
);

-- 部屋テーブル
CREATE TABLE room (
	room_id INTEGER PRIMARY KEY AUTO_INCREMENT,
	room_name VARCHAR(255) NOT NULL,
	capacity INTEGER
);

INSERT INTO room (room_name, capacity) VALUES('aaaaaa', 10);
INSERT INTO room (room_name, capacity) VALUES('bbbbbb', 20);
INSERT INTO room (room_name, capacity) VALUES('aaaaaa', 30);
INSERT INTO room (room_name, capacity) VALUES('dddddd', 40);
INSERT INTO room (room_name, capacity) VALUES('aaaaaa', 50);
INSERT INTO room (room_name, capacity) VALUES('aaaaaa', 60);



-- 個人情報テーブル
-- CREATE TABLE mypersondata (
-- 	id INTEGER PRIMARY KEY AUTO_INCREMENT,
-- 	name VARCHAR(20) NOT NULL,
-- 	mail VARCHAR(50),
-- 	age INTEGER
-- );
-- INSERT INTO mypersondata (name, mail, age) VALUES('taro', 'taro@yamada', 34);
-- INSERT INTO mypersondata (name, mail, age) VALUES('hanako', 'hanako@flower', 28);
