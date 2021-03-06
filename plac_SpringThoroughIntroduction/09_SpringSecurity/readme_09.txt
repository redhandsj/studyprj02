★Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
 - (CHAPTER 09) Spring Security (P.431 - 492)
しおり　：P.
URL : 

//==========================================================================================================
// 9.1 Spring Securityとは
//==========================================================================================================

■9.1.1 Spring Securityの特徴


■9.1.2 基本機能
 - 認証
 - 認可

■9.1.3 強化機能
 - セッション管理
 - CSRF対策
 - ブラウザのセキュリティ対策機能との連携

//==========================================================================================================
// 9.2 Spring Securityのセットアップ
//==========================================================================================================

■9.2.1 ライブラリのセットアップ

■9.2.2 Spring SecurityのBean定義

■9.2.3 サーブレットフィルタの設定

//==========================================================================================================
// 9.3 Spring Securityのアーキテクチャ
//==========================================================================================================

■9.3.1 Spring Securityのモジュール構成

■9.3.2 フレームワークのアーキ手クチャ
 ⇒ P.439の図


//==========================================================================================================
// 9.4 認証処理の適用
//==========================================================================================================

■9.4.1 認証処理の仕組み
 ⇒ P.442の図
 - Authentication Filter
 - AuthenticationManager
 - AuthenticationProvider


■9.4.2 フォーム認証
 ⇒ loginForm.jsp


■9.4.3 認証成功時のレスポンス

■9.4.4 認証失敗時のレスポンス
 - ログインフォームを表示する ためのパスが"/login"の場合は、"/login?error"にリダイレクトされます。
 
■9.4.5 データベース認証
　⇒ P.450の図


■9.4.6 パスワードのハッシュ化
 - パスワードをハッシュ化するためのインターフェイス（PasswordEn coder）と実装クラスを提供しており、
   認証機能と連携して動作する仕組みになっています
 ⇒ P.455 の表

■9.4.7 認証イベントのハンドリング
 - 認証成功、失敗などの認証履歴をデータベースやログに保存したい

 - パスワードを連続して間違った場合にアカウントをロックしたい

 - 認証成功イベント
   ⇒ P.457 の表

 - 認証失敗イベント 
   ⇒ P.458 の表

 - イベントリスナの作成 
   public void handleBadCredentials(AuthenticationFailureBadCredentialsEvent event) { 
   }


■9.4.8 ログアウト
 ⇒ P.459の図
 ⇒ P.459の表
 - ログアウト処理の適用 
 - デフォルトの動作 
 - Spring Securityのデフォルトの動作では、"/logout"というパスにリクエストを送るとログアウト処理が行な われます。
   - ログインユーザーの認証情報のクリア
   - セッションの破棄が行なわれ
   - CSRF 対策を行なっている場合はCSRF対策用トークンの破棄
 

■9.4.9 ログアウト成功時のレスポンス
 ⇒ P.461 の表
 - デフォルトの動作
   - ログインフォームを表示するためのパスが"/login"の場合は、"/login?logout"にリダイレクト されます。

 - デフォルト動作のカスタマイズ


■9.4.10 認証情報へのアクセス
   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 - 認証済みユーザーの認証情報は、Spring Securityのデフォルト実装ではセッションに格納
   → リクエストごとにSecurityContextPersistenceFilterクラスによって
      Security ContextHolderというクラスに格納
   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


■9.4.11 認証処理とSpring MVCの連携
 ⇒ HelloController.index()

■9.4.12 エラーメッセージ
 - エラーメッセージの変更
 - システムエラー時のメッセージ
   - InternalAuthenticationServiceException


//==========================================================================================================
// 9.5 認可処理の適用
//==========================================================================================================
 - アクセスポリシーには、どのリソースにどのユーザーからのアクセスを許可するかを定義します

■9.5.1 認可処理の仕組み
 ⇒ P.466の図
 - ExceptionTranslationFilter
   - 認可処理（AccessDecisionManager）で発生した例外をハンドリングし、 クライアントへ適切なレスポンスを行なうためのサーブレットフィルタ

 - FilterSecurityInterceptor 
   - 認可処理を適用するためのサーブレットフィルタ

 - AccessDecisionManager
   - リソースに対してアクセス権があるかチェックを行なうた めのインターフェイス

 - AccessDecision Voter
   - Spring Security 4.0からデフォルトで適用されるクラスは WebExpression Voter

 
■9.5.2 アクセスポリシーの記述方法
 - Common Expressions 
   ⇒ P.467 の表9.12

 - Web Expressions
   ⇒ P.468 の表9.13


■9.5.3 Webリソースへの認可（Java Config編）
 - アクセスポリシーを適用するWebリソースの指定
   ⇒ P.468 の表9.14


■9.5.4 Webリソースへの認可（XMLファイル編）
 ※ 省略
 

■9.5.5 メソッドへの認可
 - @PreAuthorize、@PostAuthorize、@PreFilter、@PostFilter
 - @Secured
 - JSR 250（javax.annotation.securityパッケージ）のアノテーション（@RolesAllowedなど）
 - @PreAuthorize と @PostAuthorize


■9.5.6 JSPの画面項目への認可
 ⇒ /SpringSecurity001/src/main/webapp/WEB-INF/view/index.jsp


■9.5.7 認可エラー時のレスポンス
 ⇒ P.475 の図
 - AccessDeniedHandler
   - 認証済みのユーザーからのアクセスを拒否した際のエラー応答
 - AuthenticationEntryPoint
   - 未認証のユーザーからのアクセスを拒否した際のエラー 応答を行なうためのインターフェイス


//==========================================================================================================
// 9.6 CSRF対策
//==========================================================================================================
■9.6.1 Spring SecurityのCSRF対策
 - セッション単位にランダムなトークン値（CSRFトークン）を払い出し、払い出された CSRFトークンをリクエスト
   パラメータ（HTMLフォームのhidden項目）として送信する

 - デフォルト実装では、POST、PUT、DELETE、PATCHのHTTPメソッドを使用したリク エストに対して、CSRFトークン
   チェックを行ないます。

■9.6.2 CSRF対策機能の適用
 - CSRF対策機能は、Spring 3.2から追加された機能でSpring Security 4.0からデフォルトで適用されるように なりました。
   そのため、CSRF対策機能を有効にするための特別な定義は必要ありません

■9.6.3 トークンチェックエラー時のレスポンス
 - AccessDeniedHandlerインターフェイス
 - 専用のエラーページに遷移させる場合は、Spring Security から提供されている
   DelegatingAccessDeniedHandlerクラスを利用して、
   それぞれの例外にAccessDeniedHandlerインターフェイス
 

■9.6.4 CSRF対策機能とSpring MVCとの連携



//==========================================================================================================
// 9.7 セッション管理
//==========================================================================================================
■9.7.1 セッション管理機能の適用
 - 

■9.7.2 URL Rewriting抑止機能
 - URL内にセッションIDが露出してしまうのを防ぐ


■9.7.3 セッション固定攻撃対策機能
 - セッション管理機能を適用すると、デフォルトでセッション固定攻撃対策機能が有効になます
 - ログイン成功時に新たにセッションIDを払い直すため、攻撃者が事前に払い 出したセッション
   IDが使われることはありません。
 ⇒ P.483の表


■9.7.4 多重ログインの制御
 - 同じユーザー名（ログインID）を使った多重ログインを制御する機能
 - デフォルト実装（org.springframework.security.core.session.Session RegistryImpl）では、
   ユーザーごとにセッション情報をアプリケーションサーバーのメモリ内で管理
    → 複数のアプリケーションサーバーを同時に起動するシステムでは利用することができません

   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 - アプリケーションサーバーによっては、停止または再起動時のセッション状態を復元する機能
   を持っているため、実際のセッション状態とSpring Securityが管理しているセッション情報
   に不整合が生じ る可能性があります。
   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


■9.7.5 無効なセッションを使ったリクエストの検知
 - 無効なセッショ ンとして扱われるリクエストの大部分は、セッションタイムアウト後のリクエストです。 

//==========================================================================================================
// 9.8 ブラウザのセキュリティ対策機能との連携
//==========================================================================================================
■9.8.1 セキュリティヘッダー出力機能の適用
 - Spring Security 4.0からデフォルトで適用
 - ブラウザが提供するセキュリティ対策機能の一部は、サーバー側でHTTPの レスポンスヘッダーを出力することで動作を制御
 

■9.8.2 デフォルトでサポートしているセキュリティヘッダー
 - Cache-Control（Pragma、Expires）
   - コンテンツのキャッシュ方法を指示

 - X-Frame-Options
   - フレーム（<frame>または<iframe>要素）内でコンテンツの表示を許可するか否かを指示

 - X-Content-Type-Options
   - コンテンツの種類の決定方法を指示

 - X-XSS-Protection
   - ブラウザのXSSフィルタ機能を使って有害スクリプトを検出する方法を指示

 - Strict-Transport-Security
   - HTTPSを使ってアクセスした後にHTTPを使ってアクセスしようとした際に、HTTPSに置き換えてからア クセスすることを指示

■9.8.3 セキュリティヘッダーの選択


//==========================================================================================================
// 9.9 Spring Securityのテスト
//==========================================================================================================

■9.9.1 Spring Security Testのセットアップ


■9.9.2 認証処理のテスト


■9.9.3 認可処理のテスト
 - アノテーションを使用した認証情報のセットアップ


■9.9.4 CSRFトークンチェック対象のリクエストに対するテスト






########## P.491 ####################


//==========================================================================================================
//==========================================================================================================
// 問題
//==========================================================================================================
★ P.455 の カスタマイズできない問題


//==========================================================================================================
// 未整頓メモ
//==========================================================================================================
 - H2 の起動について
   - https://qiita.com/yutaka-tanaka/items/3a67d03008073b5cf6c3
     > cd C:\00\works\repos\gits\redhandsj\studyprj02\plac_SpringThoroughIntroduction\03_DataAccess\DataAccess001\libs
     > java -cp h2-1.4.196.jar org.h2.tools.Server -webAllowOthers


■ web.xml

    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>springbook.config.WebSecurityConfig</param-value>
    </context-param>
    <!-- 
    FilterChainProxyが受け取ったリクエストに対して適用する 「Security Filterのリスト」を管理するためのインターフェイス
    <filter>
        <filter-name>springSecurityFilterChain</filter-name>
        <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class> 
    </filter>
     -->
    <!-- 
    フレームワーク処理のエントリーポイントとなるサーブレットフィルタクラス
    フレームワーク処理の全体の流れを制御し、具体的なセキュリティ対策処理はSecurity Filter に委譲
    <filter-mapping>
        <filter-name>springSecurityFilterChain</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
     -->


//==========================================================================================================
// <END>
//==========================================================================================================
