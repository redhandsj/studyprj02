-- ユーザマスタ
CREATE TABLE m_user (
	user_id INTEGER PRIMARY KEY AUTO_INCREMENT,
	user_name VARCHAR(255) NOT NULL,
	password VARCHAR(255) NOT NULL
);
INSERT INTO m_user (user_name, password) VALUES('test_user_001','p001');
INSERT INTO m_user (user_name, password) VALUES('test_user_002','p002');
INSERT INTO m_user (user_name, password) VALUES('test_user_003','p003');

-- 銀行マスタ
CREATE TABLE m_bank (
	bank_id INTEGER PRIMARY KEY AUTO_INCREMENT,
	bank_name VARCHAR(255) NOT NULL,
);
INSERT INTO m_bank (bank_name) VALUES('ginko001');
INSERT INTO m_bank (bank_name) VALUES('ginko002');
INSERT INTO m_bank (bank_name) VALUES('ginko003');

-- 口座トランザクション
CREATE TABLE t_account (
	account_id INTEGER PRIMARY KEY AUTO_INCREMENT,
	user_id INTEGER NOT NULL,
	bank_id INTEGER NOT NULL,
	balance INTEGER NOT NULL
);
INSERT INTO t_account (user_id,bank_id,balance) VALUES(1,1,100);
INSERT INTO t_account (user_id,bank_id,balance) VALUES(2,2,100);
INSERT INTO t_account (user_id,bank_id,balance) VALUES(3,3,100);
