-- アカウント
--INSERT INTO ACCOUNT VALUES('user','pass');

-- 部屋
--INSERT INTO ROOM VALUES('A001','幹部用会議室', 10);
--INSERT INTO ROOM VALUES('C001001','セミナールーム', 30);
--INSERT INTO ROOM VALUES('X9999','カンファレンスルーム', 100);
INSERT INTO ROOM VALUES('A001','kanbuyo', 10);
INSERT INTO ROOM VALUES('C001001','semoner_room', 30);
INSERT INTO ROOM VALUES('X9999','kanfarens_room', 100);
-- 設備
--INSERT INTO EQUIPMENT VALUES('10-1','A001','テレビ会議システム', 1, NULL);
--INSERT INTO EQUIPMENT VALUES('20-1','A001','プロジェクタ', 1, '部屋据え付けです');
--INSERT INTO EQUIPMENT VALUES('40-500','C001001','シンクライアント', 10, NULL);
--INSERT INTO EQUIPMENT VALUES('20-2','C001001','プロジェクタ', 5, '移動可能です');
--INSERT INTO EQUIPMENT VALUES('30-2','C001001','ホワイトボード', 6, '移動可能です');
INSERT INTO EQUIPMENT VALUES('10-1','A001','TV_kaigi_System', 1, NULL);
INSERT INTO EQUIPMENT VALUES('20-1','A001','projecter', 1, 'aaaaaa');
INSERT INTO EQUIPMENT VALUES('40-500','C001001','sin_client', 10, NULL);
INSERT INTO EQUIPMENT VALUES('20-2','C001001','projecter', 5, 'can move');
INSERT INTO EQUIPMENT VALUES('30-2','C001001','white_boad', 6, 'can move');

