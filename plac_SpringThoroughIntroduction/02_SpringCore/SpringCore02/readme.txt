★Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf

//==========================================================================================================
// Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
//==========================================================================================================
 - (CHAPTER 02) Spring Core　（P.031 ～　120）
しおり　：　P.068
URL　:　 http://localhost:8080/SpringCore02_MVC/

★　2016/11/21 に SpringSecurity03 から派生


//==========================================================================================================
// 2.1 SpringによるDI（依存性の注入）
//==========================================================================================================
★依存性の注入
 - デザインパターン「Inversion of  Control Principle（制御の反転の原則）」の実現

★インジェクション
 - セッターインジェクション
 - コンストラクタインジェクション
 - フィールドインジェクション

★オートワイヤリング
 - 型による
 - 名前による

★コンポーネントスキャン

★スコープ
 - @Scope("prototype")
 - Webアプリケーションの場合にはrequest ＜ session ＜ singletonの順に長寿命

★(2.1.8) Beanのライフサイクル
 - 初期化フェーズ
   - Bean定義の読み込み 
     - org.springframework.beans.factory.config.BeanFactoryPostProcessor
       - Bean Factory Post Processor（BFPP）によるBean定義情報の書き換え処理
       - Bean定義中のプロパティのプレースホルダにプロパティ値を埋 め込む処理
       
      - Beanのインスタンスが生成され、インジェクション
        - コンストラクタインジェクション
        - フィールドインジェクション
        - セッターインジェクション
      - Post Construct
        - 初期化処理
           - @javax.annotation.PostConstructアノテーションが付与されたメソッド
             → 
           - org.springframework.beans.factory.InitializingBeanインターフェイスのafterPropertiesSetメ ソッド 
           
           - Bean定義中の@BeanのinitMethod属性、または <bean>要素のinit-method属性で指定したメソッド
           
 - 利用フェーズ
    
 - 終了フェーズ
   - DIコンテナが破棄されるタイミング
     - Pre	Destroy
       - @javax.annotation.PreDestroyアノテーションが付与されたメソッド
       - org.springframework.beans.factory.DisposableBeanインターフェイスのdestroyメソッド 
       - Bean定義中の@BeanのdestroyMethod属性、または <bean>要素のdestroy-method属性で指定したメ ソッド
   - DIコンテナの破棄 
     - ApplicationContextを拡張したorg.springframework.context.ConfigurableApplicationContextイン ターフェイスのcloseメソッド

★(2.1.9) Configurationの分割
 - @org.springframework.context.annotation.Importアノテーション

★(2.1.10)Configurationのプロファイル化
 ■ プロファイル定義
   - @org.springframework.context.annota tion.Profileアノテーション

 ■使用するプロファイルの選択方法
  - java プロセスの実行時に次のように指定してください。
     -Dspring.profiles.active=production
  - 環境変数の場合
     export SPRING_PROFILES_ACTIVE=production
  - web.xmlの場合
    <context-param><param-name>spring.profiles.active</param-name><param-value>production</param-value></context-param>
  

★(2.1.11) JSR 330: Dependency Injection for Java 
  - 表2.5　SpringとJSR 330の主なアノテーションの対応関係
  
  
  

//==========================================================================================================
// 2.2 AOP
//==========================================================================================================
 - セキュリティ
 - ログ出力
 - トランザクション
 - モニタリング
 - キャッシュ
 - 例外ハンドリング

★(2.2.1) AOPの概要
 - Advice
   - 特定のJoin Pointで実行されるコード(Around、Before、After)
 - Pointcut
   - Join Pointのグループ
 - Weaving
   - Aspectを入れ込む処理。、Spring のAOPは実行時にWeavingを行ないます。
 - Target
   - AOP処理によって処理フローが変更されたオブジェクト

 

★(2.2.2) Spring AOP
 - 必要依存
   - <dependency>    <groupId>org.springframework</groupId>    <artifactId>spring-context</artifactId> </dependency>
   - <dependency>    <groupId>org.springframework</groupId>    <artifactId>spring-aop</artifactId> </dependency> 
   - <dependency>    <groupId>org.aspectj</groupId>    <artifactId>aspectjweaver</artifactId> </dependency>



★(2.2.3) Adviceの実装方法
 → ※※※　動作確認（http://localhost:8080/SpringCore02_MVC/）


★(2.2.4) XMLでAdviceを定義
 → 省略


★(2.2.5) Pointcut式
 - execution(* com.example.domain.*Service.find*(..))
 - within(com.example.service.*) 
   - クラス名のパターンを指定
 -  bean(*Service) 
   - SpringのDIコンテナに管理されており、Bean名が「Service」で終わるBeanのメソッドを対象
 - @annotation(com.example.annotation.TraceLog)
   - @com.example.annotation.TraceLogアノテーションが付いたメソッドを対象

 - ■名前付きPointcut 
   - org.aspectj.lang.annotati on.Pointcutアノテーションで定義
   - 戻り値はvoid

 - ■Adviceの対象オブジェクトや引数を取得 




//==========================================================================================================
// 2.3 データバインディングと型変換
//==========================================================================================================





//==========================================================================================================
// 2.4 プロパティ管理
//==========================================================================================================


//==========================================================================================================
// 2.5 Spring Expression Language(SpEL)
//==========================================================================================================



//==========================================================================================================
// 2.6 リソースの抽象化
//==========================================================================================================



//==========================================================================================================
// 2.7 メッセージ管理
//==========================================================================================================


 

//==========================================================================================================
★ とりあえずメモ
 - springのシングルトン問題を@Scopeを使って回避する
   - http://javatechnology.net/spring/spring-singleton-scope/

 - Formのセッション管理
   - https://terasolunaorg.github.io/guideline/public_review/ArchitectureInDetail/SessionManagement.html#id3



 - Tomcat8の起動が遅い問題の解決方法
   - http://blog.w-hippo.com/entry/2017/05/09/Tomcat8%E3%81%AE%E8%B5%B7%E5%8B%95%E3%81%8C%E9%81%85%E3%81%84%E5%95%8F%E9%A1%8C%E3%81%AE%E8%A7%A3%E6%B1%BA%E6%96%B9%E6%B3%95


//==========================================================================================================
// <END>
//==========================================================================================================



★これを見てみる
http://websystique.com/spring-security/spring-security-4-hello-world-annotation-xml-example/

redhandsj <redhandsj@redhandsj.com>

 http://localhost:8080/SpringCore02_MVC/
   → アクセス可能
 http://localhost:8080/SpringCore02_MVC/admin
   → 権限admin
 http://localhost:8080/SpringCore02_MVC/logout
   → 権限admin


-------------------------------------------------------------------------------
★以下のエラーでバージョンを変更（4.3.3.RELEASE に変更）
    <!-- <spring-framework.version>4.0.3.RELEASE</spring-framework.version> -->
    <spring-framework.version>4.3.3.RELEASE</spring-framework.version>
Caused by: org.springframework.beans.BeanInstantiationException: Could not instantiate bean class [org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter]: Constructor threw exception; nested exception is java.lang.NoSuchMethodError: org.springframework.util.AntPathMatcher.setCaseSensitive(Z)V

-------------------------------------------------------------------------------
★generate
https://blog.ik.am/entries/258

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>org.springframework.samples.service.service</groupId>
  <artifactId>SpringSecurity03</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>war</packaging>

  <!-- 各種変数 -->
  <properties>
    <java.version>1.6</java.version>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
    <!-- Web -->
    <jsp.version>2.2</jsp.version>
    <jstl.version>1.2</jstl.version>
    <servlet.version>2.5</servlet.version>
    <!-- Spring -->
    <!-- <spring-framework.version>3.2.3.RELEASE</spring-framework.version> -->
    <!-- <spring-framework.version>4.0.3.RELEASE</spring-framework.version> -->
    <spring-framework.version>4.3.3.RELEASE</spring-framework.version>
    <!-- Hibernate / JPA -->
    <hibernate.version>4.2.1.Final</hibernate.version>
    <!-- Logging -->
    <logback.version>1.0.13</logback.version>
    <slf4j.version>1.7.5</slf4j.version>
    <!-- Test -->
    <junit.version>4.11</junit.version>
    <!-- MySQL -->
    <mysql.version>5.1.9</mysql.version>
    <!-- spring security -->
    <spring-security.version>4.1.3.RELEASE</spring-security.version>
  </properties>

  <!-- 依存関係 -->
  <dependencies>
    <!-- ★ -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>${spring-framework.version}</version>
    </dependency>
    <!-- ★ -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-web</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <!-- Spring MVC -->
    <!-- ★ -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>${spring-framework.version}</version>
    </dependency>

    <!-- Other Web dependencies -->
    <!-- ★ -->
    <dependency>
      <!-- <groupId>javax.servlet</groupId> -->
      <groupId>jstl</groupId>
      <artifactId>jstl</artifactId>
      <version>${jstl.version}</version>
    </dependency>
    <!-- ★ -->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>servlet-api</artifactId>
      <version>${servlet.version}</version>
      <!-- providedとは、ライブラリが JDK やコンテナによって提供される場合に指定します。コンパイル時のみクラスパスに追加されます。 -->
      <scope>provided</scope>
    </dependency>
    <!-- 
    <dependency>
      <groupId>javax.servlet.jsp</groupId>
      <artifactId>jsp-api</artifactId>
      <version>${jsp.version}</version>
      <scope>provided</scope>
    </dependency>
    -->
    <!-- Spring and Transactions -->
    <!-- 
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-tx</artifactId>
      <version>${spring-framework.version}</version>
    </dependency>
    -->

    <!-- Logging with SLF4J & LogBack -->
    <!-- 
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-api</artifactId>
      <version>${slf4j.version}</version>
      <scope>compile</scope>
    </dependency>
    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>${logback.version}</version>
      <!-- runtimeとは、実行時のみに必要な場合に指定します。テストの実行および通常の実行のときにクラスパスに追加されます。
      <scope>runtime</scope>
    </dependency>
    -->

    <!-- Hibernate -->
    <!-- 
    <dependency>
      <groupId>org.hibernate</groupId>
      <artifactId>hibernate-entitymanager</artifactId>
      <version>${hibernate.version}</version>
    </dependency>
    -->

    <!-- Test Artifacts
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-test</artifactId>
      <version>${spring-framework.version}</version>
      <!-- testとは、テストのときのみ必要な場合に指定します。テストのコンパイルと実行のときにクラスパスに追加されます。
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>${junit.version}</version>
      <scope>test</scope>
    </dependency>
     -->
    <!-- adding dependency by user.
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>4.0.4.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>com.h2database</groupId>
      <artifactId>h2</artifactId>
      <version>1.4.178</version>
    </dependency>
    <dependency>
      <groupId>org.springframework.data</groupId>
      <artifactId>spring-data-jpa</artifactId>
      <version>1.5.2.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-orm</artifactId>
      <version>${spring-framework.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-aspects</artifactId>
      <version>${spring-framework.version}</version>
    </dependency>
    -->
    <!-- MySQL
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>${mysql.version}</version>
    </dependency>
   -->
    <!-- list_08_24 Validation API 
    <dependency>
      <groupId>org.hibernate</groupId>
      <artifactId>hibernate-validator</artifactId>
      <version>5.1.0.Final</version>
    </dependency>
    -->
    <!-- Spring Security -->
    <!-- Webアプリのセキュリティ対策実現コンポーネント -->
    <!-- ★ -->
    <dependency>
      <groupId>org.springframework.security</groupId>
      <artifactId>spring-security-web</artifactId>
      <version>${spring-security.version}</version>
    </dependency>
    <!-- セットアップ用 -->
    <!-- ★ -->
    <dependency>
      <groupId>org.springframework.security</groupId>
      <artifactId>spring-security-config</artifactId>
      <version>${spring-security.version}</version>
    </dependency>
    <!-- 認証機能アクセス用のJSP用
    <dependency>
      <groupId>org.springframework.security</groupId>
      <artifactId>spring-security-taglibs</artifactId>
      <version>${spring-security.version}</version>
    </dependency>
    -->
  </dependencies>	
</project>
