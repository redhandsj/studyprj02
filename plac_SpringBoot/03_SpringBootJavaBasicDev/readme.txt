★SpringBoot_プログラミング入門.pdf
 - (CHAPTER 03) JavaによるSpringBoot開発の基本 (P.095 - 152)
しおり　：P.112 → 130 → 147
URL : http://localhost:8080

★ 2017/02/06(月)に、新規作成

//==========================================================================================================
// 3.1 Spring Boot と Spring Starterプロジェクト
//==========================================================================================================
★ Apache Maven と Spring Boot
 ※ 省略

★ Mavenでプロジェクト生成
  → ./SpringBootJavaBasicDev_01 に作成
 - G:\tools\dev\apache-maven-3.2.3\bin\mvn archetype:generate
   - Define value for property 'groupId': : com.tuyano.springboot
   - Define value for property 'artifactId': : MyBootApp
   - Define value for property 'version':  1.0-SNAPSHOT: : [return]
   - Define value for property 'package':  com.tuyano.springboot: : [return]

★ プロジェクト内容チェック
G:.
└─MyBootApp
    └─src
        ├─main
        │  └─java
        │      └─com
        │          └─tuyano
        │              └─springboot
        └─test
            └─java
                └─com
                    └─tuyano
                        └─springboot

★ STSプロジェクトを作る
★ プロジェクト内容チェック
  → ./SpringBootJavaBasicDev_02 に作成
  - Spring Boot用プロジェクト
    - <File> → <New> → <Spring Starter Project>

★ プロジェクトを実行してみる
 - Maven コマンドの方
   - G:\tools\dev\apache-maven-3.2.3\bin\mvn spring-boot:run
     - ただ、これだけではダメ

 - STSプロジェクトの実行
   - プロジェクトを右クリック → <Run As> → <Spring Boot App>
   - 「http://localhost:8080」にアクセス可能。
     - ただし、この時点ではページを作ってないので「Whitelabel Error Page」

★ Spring Boot アプリケーションの仕組み
 - Spring Bootは、サーバにデプロイが不要（内臓サーバに自動デプロイ）
   - (利点)クラウドの仕組みなどとマッチしている

★ pom.xml を調べる
 - 先ほどMavenコマンドで失敗したのは、Spring Boot ではなかったから
 - pom.xml の編集で設定する必要がある

★ pom.xmlをコピー＆ペーストして利用する
  - ./SpringBootJavaBasicDev_02 の pom.xmlをそのまま ./SpringBootJavaBasicDev_01 に置きかえて
    「mvn spring-boot:run」を実施すればアプリとして正常に実行される。

//==========================================================================================================
// 3.2 RestController を利用する
//==========================================================================================================
★ MyBootAppApplicationクラス
 - SpringAppLication run(NyBootAppAppLication.class args)

★ MVCアーキテクチャ
 - コントローラとwebページ
   - 特定のアドレスにアクセスした時に実行される処理 → URLマッピング

★ コントローラクラスを用意する
★ HeloControllerを作成する
 - STSで作成する
  → ./SpringBootJavaBasicDev_02 に追加

 - Mavenで作成したプロジェクトに追加する
  → ./SpringBootJavaBasicDev_01 に追加

★ RestControllerを作成する
 - REST の為のコントローラ(RESTful)
   - RESTfulは、ただのテキスト情報を返すだけなので、シンプル

★ RestMappingについて
 - RestMapping(アドレス)
 - リクエスト用メソッド
   - return に単純な文字列（テキスト）を返す

★ パラメーラを渡す
  → ./SpringBootJavaBasicDev_02 を変更

★ パス変数と@PathVariable

★ オブジェクトをJSONで出力する
  → ./SpringBootJavaBasicDev_02 を変更


//==========================================================================================================
// 3.3 Controller によるWebページ作成
//==========================================================================================================
★ Controllerクラスについて
 - @Cntrollerをクラスに付ける
 - ぺｰジのテンプレートを用意する
 - テンプレート用ライブラリを用意する
 
★ Thymeleafを追加する
  → ./SpringBootJavaBasicDev_02 を変更


★ コントローラの修正
  → ./SpringBootJavaBasicDev_02 を変更
    ⇒ HeloController2のindex()として実装

★ テンプレートファイルを作る
  → ./SpringBootJavaBasicDev_02 を変更
    ⇒ /MyBootApp/src/main/resources/templates/index.html


★ テンプレートに値を表示する
  → ./SpringBootJavaBasicDev_02 を変更
    ⇒ /MyBootApp/src/main/resources/templates/index.html

★ Modelクラスの利用
  → ./SpringBootJavaBasicDev_02 を変更
    ⇒ /MyBootApp/src/main/java/com/tuyano/springboot/HeloController2.java

★ ModelView クラスの利用
 - Model
   - データのみ
 - ModelAndView
   - データ＋ビュー（戻り値として使用可能）
  → ./SpringBootJavaBasicDev_02 を変更
    ⇒ /MyBootApp/src/main/java/com/tuyano/springboot/HeloController2.java index

★ フォームを利用する
  → ./SpringBootJavaBasicDev_02 を変更
    ⇒ /MyBootApp/src/main/resources/templates/index.html
    ⇒ /MyBootApp/src/main/java/com/tuyano/springboot/HeloController2.java


----------
★ そのほかのフォームコントロール
 - チェックボックス・ラジオボタン・選択ボックス
  /MyBootApp/src/main/java/com/tuyano/springboot/PartsController.java 作成


★ リダイレクトについて
 - フォワード
   - サーバー内部で別のページを読み込み、表示
   - アクセスするア ドレスはそのまま
   - 表示内容だけが別のページに差し替えられます。 

 - リダイレクト
   - クライアント側に送られた後で別のページに移動
   - アクセスしているアドレスも移動先のものに変更



//==========================================================================================================
//==========================================================================================================
// 問題
//==========================================================================================================


//==========================================================================================================
// 未整頓メモ
//==========================================================================================================
★ eclipse上でのエディタ関連づけ
  [環境設定]→[一般]→[コンテンツ・タイプ]→[テキスト]→[HTML]を選択して[追加]
  *.inc と入力して[OK]
  ファイルを開き直せばおk


★ 起動ポートの変更
 - /MyBootApp/src/main/resources/application.properties に以下を追記
   - server.port=8082



//==========================================================================================================
// <END>
//==========================================================================================================
