★Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
 - (CHAPTER 11) Spring + MyBatis (P.536 - 572)
URL : 

//==========================================================================================================
// 11.1 MyBatisとは
//==========================================================================================================
 - メリット
   - SQLの体系的な管理

■11.1.1 MyBitsとSpringの連携
 - MyBits-springライブラリ
   - 明示的なトランザクション管理が不要
   - 初期化不要
   - 例外管理不要
   - スレッドセーフ
   
   
■11.1.2 MyBatisとMyBatis-Springの主要コンポーネント
 - MyBits設定ファイル
 - Mapperインターフェイス
 - マッピングファイル
 - org.apache.ibatis.session.SqlSession
 - org.apache.ibatis.session.SqlSessionFactory
 - org.apache.ibatis.session.SqlSessionFactoryBuilder
 - org.mybatis.spring.SqlSessionFactoryBean
 - org.mybatis.spring.SqlSessionTemplate
 - org.mybatis.spring.mapper.MapperFactoryBean
   → P.540 , 541の表
   → P.541の図
 - リクエスト単位のデータアクセス
   → P.542の図

■11.1.3 MyBatis-Springの例外ハンドリング
 - org.springframework.dao.DataAccessException

//==========================================================================================================
// 11.2 Spring + MyBatisのセットアップ
//==========================================================================================================
■11.2.1 ライブラリのセットアップ
 ⇒ 03_DataAccess\DataAccess001 でテスト


■11.2.2 SpringとMyBatisを連携するための設定


■11.2.3 MyBatisの設定


//==========================================================================================================
// 11.3 基本的なCRUD操作
//==========================================================================================================
■11.3.1 Mapperインターフェイスの作成
 ⇒ /DataAccess001/src/main/java/org/rhpj/domain/client

■11.3.2 マッピングファイルの作成（xml
 - 数値や日付の大小比較で「<」や「>」を記述したい場合は、SQLの可読性を考慮し、てCDATAセクションをうまく活用しましょう
 

■11.3.3 SQLへの値の埋め込み方法
 - バインド変数を使用して埋め込む
   - #{変数名}

 - 置換変数を使用して埋め込む
   - ${変数名}
   - SQLインジェクションへの対策が必要になります


■11.3.4 埋め込み値の連携方法
 - メソッド引数が1つでかつIntegerやStringなどのJavaの基本的なデータ型の場合（JavaBeanではない場 合）は、SQLへ埋め込む値が一意に定まるため、メソッド引数名とバインド変数名を揃える必要はなく任意の 名前が使用できます。
 - @Paramを省略した場合は、引数の宣言順に「param1」「 param2」「 param3」という機械的な変数名が 割り当てられます


■11.3.5 SELECT（Read）操作の実装
 ⇒ P.554の例

■11.3.6 INSERT（Create）操作の実装
 - キー取得の利用
   ⇒ P.558 の例
 - ID列の利用
 　⇒ P.559 の例

■11.3.7 UPDATE操作の実装


■11.3.8 DELETE操作の実装


■11.3.9 Mapperオブジェクトの利用
 - MyBatisが動的に生成したMapper オブジェクトをServiceクラスなどにDIし、
   DIしたMapperオブジェクトのメソッドを呼び出します


//==========================================================================================================
// 11.4 MyBatisでの応用的なCRUD操作
//==========================================================================================================
■11.4.1 マッピングファイル上での動的SQLの組み立て


■11.4.2 SQLビルダークラスによるSQL文の組み立て
 ⇒ P.566 の例

■11.4.3 1対1と1対多のマッピング
 - 主テーブルと関連テーブルのレコードを別々に取得してマッピングする方法
 - テーブル結合を利用して関連オブジェクトをマッピングする方法
   - １回のSQLで取得する

■11.4.4 RowBoundsを利用した範囲検索
 - メモリ枯渇やカーソル移動処理の性能劣化 が発生する可能性


■11.4.5 ResultHandlerによる検索結果の処理
 ⇒ P.572の例
 

########## P.572 ####################


//==========================================================================================================
//==========================================================================================================
// 問題
//==========================================================================================================

//==========================================================================================================
// 未整頓メモ
//==========================================================================================================
★ mybatis generator maven
 - generateConfig.cml参考
   - http://hit-techblog.blogspot.jp/2014/03/mybatis-2.html

 - h2 設定
   - http://www.mybatis.org/generator/configreference/xmlconfig.html

 - maven
   - http://www.mybatis.org/generator/running/runningWithMaven.html

★ H2スキーマ指定
 - H2 の起動について
   - https://qiita.com/yutaka-tanaka/items/3a67d03008073b5cf6c3
     > cd C:\00\works\repos\gits\redhandsj\studyprj02\plac_SpringThoroughIntroduction\03_DataAccess\DataAccess001\libs
     > java -cp h2-1.4.196.jar org.h2.tools.Server -webAllowOthers

★ インメモリ試し 


★ OGNL
 - https://ja.wikipedia.org/wiki/OGNL

★ マッパーを使用すると以下のエラー
2017/12/18 20:39:26.783 ERROR - Context initialization failed
org.springframework.beans.factory.BeanCreationException: 
Error creating bean with name 'roomService' defined in file [C:\00\tools\sts\sts-bundle\pivotal-tc-server-developer-3.2.6.RELEASE\base-instance\wtpwebapps\DataAccess001\WEB-INF\classes\org\rhpj\service\RoomService.class]: Initialization of bean failed; nested exception is java.lang.NoSuchMethodError: org.springframework.util.ClassUtils.getQualifiedMethodName(Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/String;



//==========================================================================================================
// <END>
//==========================================================================================================
