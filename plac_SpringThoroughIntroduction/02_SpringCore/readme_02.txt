★Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
 - (CHAPTER 02) SpringCore(DI×AOP) (P.031 - 120)
しおり　：　
URL　:　

★ 2017/12/06(木)に、新規作成


//==========================================================================================================
// 2.1 SpringによるDI（依存性の注入）
//==========================================================================================================
 - あるクラスに必要となるコンポーネントを設定することを「依存性 を注入（DI）する」もしくは「インジェクショ
   ンする」といいます
 - 依存性の注入（DI）を自動で行ない、インス タンスを組み立ててくれる基盤を「DIコンテナ」

■2.1.1 DI（依存性の注入）とは
 - ソフトウェアのデザインパターンの1つで、「 Inversion of Control Principle（制御の反 転の原則）」を実現
   ⇒ P.035の図

■2.1.2 ApplicationContextとBean定義
 - Spring MVCを使 用する場合はフレームワーク側でApplicationContextをWeb向けに拡張したWebApplicationContextが作 成されます。
 
■2.1.3 Configuration方法
 - JavaベースConfiguration 
   - メソッドの引数を追加することで他のコンポーネントの参照ができます。
     ただし、引数 のインスタンスは別途Bean定義されている必要があります。

 - XMLベースConfiguration

 - アノテーションベースConfiguration
   - 「コンポーネントスキャン」
   - 「オートワイヤリング」
   - デフォルトでは、登録されるBeanの名前はクラス名の先頭を小文字にしたものです。
     ただし、先頭から大文 字が2つ以上続く場合は変換が行なわれず、クラス名がそのまま使用されます。 
   - 明示的にBean名を指定したい場合は、@Componentアノテーションに名前を指定

■2.1.4 インジェクションの種類
 - セッターインジェクション
   - @Autowiredアノテーションをセッターメソッドに付与

 - コンストラクタインジェクション
   - @ConstructorPropertiesアノテーション
   - コンストラクタインジェクションのメリットとしては、フィールドにfinal修飾子を付けて、不変にできること

 - フィールドインジェクション
   - フィールドインジェクション対象のフィールドの可視性は何が適切でしょうか？
   - 指定なし（パッケージプライベート）

■2.1.5 オートワイヤリング
 - Bean定義しなくても自動でDIコンテナにインジェクションさせる

 - 型によるオートワイヤリング
   - @Autowired
   - 対象の型を持つBeanが1つも登録されていないとorg.springframework.beans. factory.NoSuchBeanDefinitionExceptionが発生
   - required属性にfalse → フィールドはnullとなる
   - インジェクション対象の型がDIコンテナに複数定義されている場合は、 DIコンテナはどちらを使えばよいかわからないため、例外org.springframework.beans.factory.NoUnique BeanDefinitionExceptionが発生
   - 同じ型の Beanが複数定義されている場合は、@org.spri ngframework.beans.factory.annotation.QualifierアノテーションでBean名を設定
   - @Primary → 未指定の場合に適用
   - Bean名を「実装名」ではなく「用途名」にするのがよい

 - 名前によるオートワイヤリング
   - @javax.annotation.Resourceアノテーション
   - name属性を省略すると、Bean名がフィールド名（フィールドインジェクション の場合）、プロパティ名（セッターインジェクションの場合）と一致するBeanがインジェクション候補
   - もし名前で探せない場合は、型による解決が試みられます
   - コンストラクタインジェクションで @Resourceは利用できません

 - コレクションやマップ型のオートワイヤリング 
   ⇒ P.053～ 054 の例
   
■2.1.6 コンポーネントスキャン
 ● @org.springframework.stereotype.Component 
 ● @org.springframework.stereotype.Controller 
 ● @org.springframework.stereotype.Service 
 ● @org.springframework.stereotype.Repository 
 ● @org.springframework.context.annotation.Configuration 
 ● @org.springframework.web.bind.annotation.RestController 
 ● @org.springframework.web.bind.annotation.ControllerAdvice 
 ● @javax.annotation.ManagedBean 
 ● @javax.inject.Named
   - value属性はbasePackages属性の別、ただし、この属性を省略した場合 は、コンフィギュレーションクラスと同じパッケージ配下をスキャンする

 - フィルタを明示したコンポーネントスキャン 


■2.1.7 Beanのスコープ
   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 - コンテナに管理されるBeanはデフォルトでシングルトン
   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

 - @Beanアノテーションが付与されたメソッドに、
   @org.springframework.context. annotation.Scopeアノテーションを付与してスコープを設定

 - サーブレットフィルタでWebアプリケーション向 けのスコープのBeanを使う場合は、web.xmlに以下の設定
   - org.springframework.web.context.request.RequestContextListener

 - 一度インジェクションされたBeanはインジェクション先のスコープに寄る
   - 対策：P.062の例
   - 「ルックアップメソッドインジェクション」 @Lookup
      - privateやfinalを付けてはいけませ ん。また、メソッド引数は指定しないようにする必要があります。 

 - Scoped Proxy

 - カスタムスコープ
   - org.springframework.beans.factory. config.CustomScopeConfigurer
   ⇒ P.066 の例

■2.1.8 Beanのライフサイクル
 - 初期化
   ⇒ P.067 の図
   - コンフィギュレーションを読み 込み、Beanを特定
   - Bean Factory Post Processor（BFPP）によるBean定義情報の書き換え
   - Bean定義中のプロパティのプレースホルダにプロパティ値を埋 め込む
   - Beanのインスタンスが生成され、インジェクションが行なわれます
   - Post Construct処理（Bean Post Processor（BPP））
     - @javax.annotation.PostConstructアノテーションが付与されたメソッド
     - org.springframework.beans.factory.InitializingBeanインターフェイスのafterPropertiesSetメソッド
     - Bean定義中の@BeanのinitMethod属性、または <bean>要素のinit-method属性で指定したメソッド

 - 利用


 - 終了
   - DIコンテナが破棄されるタイミングでBeanは終了フェーズ
   - Pre Destroy
     - @javax.annotation.PreDestroyアノテーションが付与されたメソッド
     - org.springframework.beans.factory.DisposableBeanインターフェイスのdestroyメソッド
     - Bean定義中の@BeanのdestroyMethod属性、または <bean>要素のdestroy-method属性で指定したメソッド
   - DIコンテナの破棄
     - org.springframework.context.ConfigurableApplicationContextイン ターフェイスのcloseメソッド
       ⇒ P.071の例
   - 明示的にクローズするのが難しい場合は、以下のようにJVMのシャットダウンにフックして、破棄処理を差し 込むことが可能
    

■2.1.9 Configurationの分割
 - インポート
   - @Import({DomainConfig.class, InfrastructureConfig.class})
   -  <import resource="classpath:conf/domain-config.xml" /> 


■2.1.10 Configurationのプロファイル化
 - 環境ごとに「development」プロファイル、「 test」プロファイル、 「production」プロファイルなどを作成

 - @org.springframework.context.annotation.Profileアノテーション
   - 設定 → @Profile("development")
     - @Profile({"development", "test"})というように複数のプロファイルを指定
     - @Profile("!production")（productionプロファイル以外）というように否定形でプロファイルを指 定
   - プロファイルの指定がないBean定義はすべてのプロファイルで利用可能

 - 使用するプロファイルの選択方法 
   - Javaのシステムプロパティspring.profiles.activeで選択
   - (JVM引数) -Dspring.profiles.active=production
   - ※ 複数選択したい場合は、カンマ区切りで指定
   - ※ 環境変数SPRING_PROFILES_ACTIVEを使っ てもプロファイルを選択できます
     - export SPRING_PROFILES_ACTIVE=production
   - web.xmlに指定することも可能
     ⇒ P.076の例
   - 指定しなかった場合に使用されるプロファイルは、spring.profiles.default で指定可能

■2.1.11 JSR 330: Dependency Injection for Java 
 - @Component → @Named
   - JSR 330の場合はデフォルトで prototypeスコープである
   - Springでもデフォルトで prototypeスコープの設定が可能
     - @ComponentScan(basePackages = "com.example.demo", scopeResolver = Jsr330ScopeMetadataResolver.class) 

 - Java標準のAPIにこだわりがなければ、Springのアノテーションを使うのがよいでしょう


//==========================================================================================================
// 2.2 AOP
//==========================================================================================================
 - 複数のモジュールにまたがって存在する処理は「横断的関心事（Cross-Cutting Concern）」
   ● セキュリティ 
   ● ログ出力 
   ● トランザクション 
   ● モニタリング 
   ● キャッシュ 
   ● 例外ハンドリング


■2.2.1 AOPの概要
 - AOPとはアスペクト指向プログラミング（Aspect Oriented Programming）

   ⇒ P.079の図

 - Aspect
   - AOPの単位となる横断的な関心事を示すモジュール

 - Join Point
   - 横断的な関心事を実行するポイント（メソッド実行時や例外スロー時など）
   - グループ化 → Pointcut

 - Advice
   - 特定のJoin Pointで実行されるコードのことで、横断的な関心事を実装する箇所
    ⇒ P.081の表、図


 - Weaving 
   - アプリケーションコードの適切なポイントにAspectを入れ込む処理
   - Spring のAOPは実行時にWeavingを行う

 - Target
   - AOP処理によって処理フローが変更されたオブジェクト

   ⇒ P.080の図

■2.2.2 Spring AOP
 - 、現場で広く使われているAOPフレームワークであるAspectJ【11】を利用
 - Spring AOPでは基本的にProxyオブジェクトを作ることで実行時のWeavingをサポート


■2.2.3 Adviceの実装方法
  ⇒ /SpringCore001/src/main/java/org/rhpj/aspect パッケージ


■2.2.4 XMLでAdviceを定義


■2.2.5 Pointcut式
 - execution
 - within
 - bean(*Service) 
 - @annotation(com.example.annotation.TraceLog) 
 - 名前付きPointcut
   ⇒ P.091の例
   - &&（論理積）や||（論理和）、!（否定）演算子を用いて組み合わせ可能


■2.2.6 Springプロジェクトで利用されているAOP
 - トランザクション管理処理 
 - キャッシュ処理
 - 非同期処理 
 - リトライ処理

//==========================================================================================================
// 2.3 データバインディングと型変換
//==========================================================================================================
■2.3.1 Springのデータバインディング
 ⇒ P.095の例


■2.3.2 Springの型変換
 - PropertyEditor
 - Type Conversion
 - Field Formatting


■2.3.3 PropertyEditorの利用
 ⇒ P.097の例
 
■2.3.4 ConversionService の利用
 ⇒ P.097 ～ 098 の例

■2.3.5 フォーマット指定用のアノテーションの利用
  - @org.springframework.format.annotation.DateTimeFormat 
  - @org.springframework.format.annotation.NumberFormat
 ⇒ P.098の例

■2.3.6 Type Conversionのカスタマイズ
 ⇒ P.100の例

■2.3.7 Field Formattingのカスタマイズ 
 ⇒ P.101の例


//==========================================================================================================
// 2.4 プロパティ管理
//==========================================================================================================
■2.4.1 Bean定義内でプロパティの使用
 - デフォルトでは、次の順番で優先的にプロパティが適用
   1. JVMシステムプロパティ 
   2. 環境変数 
   3. プロパティファイル
 
■2.4.2 Beanにプロパティをインジェクション
 ⇒ P.104 ～ 105 の例



//==========================================================================================================
// 2.5 Spring Expression Language(SpEL)
//==========================================================================================================
■2.5.1 SpELのセットアップ


■2.5.2 SpEL APIの利用
 - org.springframework.expression.ExpressionParser
 - org.springframework.expression.Expression


■2.5.3 Bean定義でのSpELの利用


■2.5.4 SpELで使用可能な式の表現
 - リテラル値 
 - オブジェクトの生成
 - プロパティへの参照
 - メソッドの呼び出し
 - 型の解決「T(型のFQCN)」
 - 変数の参照
 - Beanの参照
 - 演算子
 - テンプレート
 - コレクションの操作


//==========================================================================================================
// 2.6 リソースの抽象化
//==========================================================================================================
■2.6.1 Resourceインターフェイスと実装クラス
 - org.springframework.core.io.Resourceインターフェイス
 - org.springframework.core.io.WritableResourceインターフェイス

■2.6.2 ResourceLoaderインターフェイス

■2.6.3 Resourceインターフェイスを使用したリソースアクセス

■2.6.4 XMLファイル上でのリソースの指定


//==========================================================================================================
// 2.7 メッセージ管理
//==========================================================================================================

■2.7.1 MessageSourceインターフェイスと実装クラス

■2.7.2 MessageSourceの利用
 ⇒ WebMvcConfig.messageSource()
 
■2.7.3 ネイティブコードのメッセージ定義
 ⇒ P.119の例
 
■2.7.4 メッセージの多言語サポート
 - messages_en.properties






########## P.121 ####################


//==========================================================================================================
//==========================================================================================================
// 問題
//==========================================================================================================


//==========================================================================================================
// 未整頓メモ
//==========================================================================================================
★ アノテーション作成

★ リフレクション

★ ポートレート

★ スレッドセーフ
 - http://itpro.nikkeibp.co.jp/article/COLUMN/20070820/279950/?rt=nocnt

★ EL式
 - http://www.techscore.com/tech/Java/JavaEE/JSP/12/


//==========================================================================================================
// <END>
//==========================================================================================================
