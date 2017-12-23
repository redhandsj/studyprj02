★Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
 - (CHAPTER 03) データアクセス（Tx、JDBC） (P.121 - 162)
しおり　：　
URL　:　

★ 2017/12/06(木)に、新規作成


基本
 → P.122 の図

//==========================================================================================================
// 3.1 Springによるデータアクセス
//==========================================================================================================
■3.1.1 データソースについて
 - DBにアクセスする為のコネクション
 - アプリ内に定義したデータソース
   - DriverManagerDataSource などを Bean定義して利用する
 - アプリサーバに定義したデータソース
 - 組込DBのデータソース


■3.1.2 データソースのコンフィギュレーション
 ⇒ /DataAccess001/src/main/java/org/rhpj/config/DataSourceConfig.java


//==========================================================================================================
// 3.2 Spring JDBC
//==========================================================================================================
■3.2.1 Spring JDBCとは
 - コネクションのオープン・クローズ
 - SQLステートメントの実行
 - 処理結果行の繰り返し処理
 - 例外ハンドリング


■3.2.2 JdbcTemplateクラスを利用したCRUD操作
 - /DataAccess001/src/main/java/org/rhpj/domain/dao パッケージ
 - public Room getRoomById(String roomId)
   ⇒ この為に、Roomオブジェクト生成が必要
   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     割込みでMyBitsをやってみる
   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

■3.2.3 取得結果の変換処理
 - RowMapper
 - ResultSetExtractor
 - RowCallbackHAndler
 - ResultSetExtractorの実装 
 - RowCallbackHandlerの実装 


■3.2.4 応用的なCRUD操作
 - SQLバッチ → batchUpdate
 - ストアドプロシージャの呼び出し → execute

//==========================================================================================================
// 3.3 トランザクション管理
//==========================================================================================================
■3.3.1 トランザクションマネージャ
 - ローカルトランザクション（単一データストア）
 - グローバルトランザクション（複数データストア）
   - JTAを使用


■3.3.2 宣言的トランザクション
 - @TransactionalアノテーションをBeanのpublicメソッドへ付加
   → P.148の表


■3.3.3 明示的トランザクション
 - PlatformTransactionManager
 - 分離レベル
 - 伝播レベル
 - TransactionTemplate
   ⇒ org.rhpj.service.impl.RoomServiceImpl
  

■3.3.4 トランザクションの分離レベルと伝播レベル
 - トランザクション分離レベル
   - 参照するデータや変更したデータを他のトランザクションとどのように 分離するか ?
   - SpringのデフォルトであるDEFAULT
     → P.156の表
        ダーティリード、ノンリピータブルリード、ファントムリード？

 - トランザクション伝播レベル
   - トランザクション境界でトランザクションへ参加する方法
   - SpringのデフォルトであるREQUIRED
     → P.157の表

//==========================================================================================================
// 3.4 データアクセスエラーのハンドリング
//==========================================================================================================
■3.4.1 Springが提供するデータアクセス例外
 - DataAccessExceptionを親クラスとするデータアクセス例外の階層構造
 - 非検査例外によるDataAccessExceptionの実装 
 - 実装を隠ぺいしたデータアクセス例外 
 - 各データベースのエラーコードの対応はspring-jdbc-xxx.jarのorg/springframework/jdbc/support/ sql-error-codes.xml


■3.4.2 データアクセス例外のハンドリング


■3.4.3 データアクセス例外の変換ルールのカスタマイズ
 - クラスパス直下にsql-error-codes.xmlを配置する




########## P.158 ####################



//==========================================================================================================
//==========================================================================================================
// 問題
//==========================================================================================================
★ h2のインメモリモードで日本語文字化けする


//==========================================================================================================
// 未整頓メモ
//==========================================================================================================
★JNDI
 - ネーミング・サービス
 - https://www.ibm.com/developerworks/jp/websphere/library/was/was_jndi/1.html


★ @Autowired、@Inject、@Resourceの違いについての検証
 - https://qiita.com/KevinFQ/items/20a6d53a5f93e28ab9ef

★ 非検査例外
 - https://qiita.com/yuba/items/d41290eca726559cd743

----------------------------------------------------
ソースのバックアップ
----------------------------------------------------
//  @Autowired
//  private JdbcRoomDao jdbcRoom;
//  
//  @Autowired
//  private JdbcRoomNamedDao jdbcRoomNamedDao; 

    public void Print(final String title) {
        System.out.println("Print() : " + title);
    }

    
//  public void insertRoom() {
//      Room r1 = new Room();
//      r1.setRoomId("ZZ9999");
//      r1.setRoomName("ADD ROOM NAME");
//      r1.setCapacity(999);
//      int ret = jdbcRoom.insertRoom(r1);
//      System.out.println("insertRoom() : " + ret);
//      this.allRoomPrint("insertRoom()");
//  }
//  
//  /**
//   * 全部屋表示
//   */
//  private void allRoomPrint(final String title) {
//      List<Room> list = jdbcRoom.getAllRoom();
//      for(Room rr: list) {
//          System.out.println(title + "roomName : " + rr.getRoomName());
//      }       
//  }
    
    
    
//
//  @Autowired
//  RoomMapper roomMapper;
//
//  /**
//   * 挿入
//   * @param room
//   */
//  public void create(Room room) {
//      roomMapper.insert(room);
//  }
//
//  /**
//   * 特定レコード取得
//   * @param room
//   */
//  public Room findByOne(String roomId) {
//      RoomKey key = new RoomKey();
//      key.setRoomId(roomId);
//      return roomMapper.selectByPrimaryKey(key);
//  }

//==========================================================================================================
// <END>
//==========================================================================================================
