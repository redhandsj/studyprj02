-- 個人情報テーブル
CREATE TABLE mypersondata (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	mail VARCHAR(50),
	age INTEGER
);

INSERT INTO mypersondata (name, mail, age) VALUES('taro', 'taro@yamada', 34);
INSERT INTO mypersondata (name, mail, age) VALUES('hanako', 'hanako@flower', 28);

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
