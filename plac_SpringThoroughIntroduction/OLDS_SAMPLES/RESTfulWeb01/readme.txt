//==========================================================================================================
// Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
//==========================================================================================================
 - (CHAPTER 06) RESTful Webサービスの開発(P.307 - 360)
しおり　：　P.354 -- 6.6.2 RestTemplateのセットアップ
URL　:
 - http://localhost:8080/RESTfulWeb01/

REST用URL
 - http://localhost:8080/RESTfulWeb01/books


★ 2016/12/10(土)に、RESTfulWeb01の勉強の為にSpringWebApplication01から派生して作成


★ oninputイベント発明
http://saikyoline.jp/weblog/2005/04/08/013450.html





//==========================================================================================================
// 6.1 REST APIのアーキテクチャ
//==========================================================================================================
★ Resource Oriented Architecture（ROA）
 - Web上のリソースとして公開
 - URIによるリソースの識別
 - HTTPメソッドによるリソースの操作（GET、POST、PUT、DELETEなど）
 - 適切なフォーマットの使用
 - 適切なHTTPステータスコードの使用
 - ステートレスなクライアント／サーバー間の通信
 - 関連のあるリソースへのリンク

★ フレームワークのアーキテクチャ
 - 画面を応答するWebアプリケーションとの主な違い
   (1) レスポンスボディを生成するためにViewの仕組みは利用しない
   (2) 「リクエストボディの解析」と「レスポンスボディの生成」はHttpMessageConverterというコンポーネントを介して行なう
 - (P.313)表 6.3　依存ライブラリを必要としない主な HttpMessageConverter の実装クラス

//==========================================================================================================
// 6.2 アプリケーションの設定
//==========================================================================================================
★ サーブレットコンテナの設定


//==========================================================================================================
// 6.3 @RestControllerの実装
//==========================================================================================================
★ Controllerで実装する処理の全体像
 - メソッドシグネチャを参照してフロントコントローラが処理を行なう「宣言型」の処理
   - リクエストマッピング
   - リクエストデータ（リソース）の取得
   - 入力チェックの実行

 - Controllerクラスのメソッド内に処理を実装する「プログラミング型」の処理
   - ビジネスロジックの呼び出し
   - レスポンスデータ（リソース）の返却
 
 - 画面応答のWebアプリと以下の2点が異なります。
   - リクエストデータとレスポンスデータはHttpMessageConverterを使用して取得および返却する
   - 入力チェック結果のハンドリングは例外ハンドラで共通的に行なう


★ Controllerクラスの作成
 - 
G:\tools\dev\curl-7.51.0-win64-mingw\bin\curl --help
C:\00\tools\curl-7.51.0-win64-mingw\bin\curl --help


★ 作成
G:\tools\dev\curl-7.51.0-win64-mingw\bin\curl -v -H "Accept: application/json" -H "Content-type: application/json" -X POST -d "{\"name\":\"Spring\",\"publishedDate\":\"2016-04-01\"}" http://localhost:8080/RESTfulWeb01/books/create
C:\00\tools\curl-7.51.0-win64-mingw\bin\curl -v -H "Accept: application/json" -H "Content-type: application/json" -X POST -d "{\"name\":\"Spring\",\"publishedDate\":\"2016-04-01\"}" http://localhost:8080/RESTfulWeb01/books/create


★ 更新
G:\tools\dev\curl-7.51.0-win64-mingw\bin\curl -D - -H "Content-type: application/json" -X PUT -d "{\"bookId\":\"00000000-0000-0000-0000-000000000000\",\"name\":\"ABCDEFG\",\"publishedDate\":\"2016-07-31\"}" http://localhost:8080/RESTfulWeb01/books/00000000-0000-0000-0000-000000000000
C:\00\tools\curl-7.51.0-win64-mingw\bin\curl -D - -H "Content-type: application/json" -X PUT -d "{\"bookId\":\"00000000-0000-0000-0000-000000000000\",\"name\":\"ABCDEFG\",\"publishedDate\":\"2016-07-31\"}" http://localhost:8080/RESTfulWeb01/books/00000000-0000-0000-0000-000000000000

★ 削除
G:\tools\dev\curl-7.51.0-win64-mingw\bin\curl -D - -X DELETE http://localhost:8080/RESTfulWeb01/books/00000000-0000-0000-0000-000000000000
C:\00\tools\curl-7.51.0-win64-mingw\bin\curl -D - -X DELETE http://localhost:8080/RESTfulWeb01/books/00000000-0000-0000-0000-000000000000


{
  "bookId" : "00000000-0000-0000-0000-000000000000",
  "name" : "書籍名",
  "publishedDate" : "2010-04-20"
}


★
G:\tools\dev\jq\jq-win64


★ 全件表示
http://localhost:8080/RESTfulWeb01/books/

★ ID指定して表示
http://localhost:8080/RESTfulWeb01/books/00000000-0000-0000-0000-000000000000




G:\tools\dev\curl-7.51.0-win64-mingw\bin\curl -D - -H "Content-type: application/json" -X POST -d '{"name":"Spring徹底入門","publishedDate":"2016-04-01"}' http://localhost:8080/books

★ CORS(Cross-Origin Resource Sharing)のサポート
 - Webページの中からAJAX（XMLHttpRequest）を使って「別ドメインのサーバーのリソ
   ース（JSONなど）」にアクセスできるようにするための仕組み
 - (P.332) 表 6.6 CORS 機能のオプションを指定する Java Config のメソッド


★ URIの組み立て
 - UriComponentsBuilderを利用したURIの生成
   - プロトコル、ホスト名、ポート番号、コンテキストパスといった環境依存する部分の隠ぺい
   - URIテンプレートを使用したURIの組み立て
 - MvcUriComponentsBuilderを利用したURIの生成
   - 作成するURI（URIテンプレート）を意識する必要がなくなる
   - タイプセーフな実装となる
 - 


//==========================================================================================================
// 6.4 リソースクラスの実装
//==========================================================================================================
★ Jacksonの機能を使用したフォーマットの制御
 - 


//==========================================================================================================
// 6.5 例外ハンドリング
//==========================================================================================================
※ うまく動かないので、飛ばす
★ REST APIのエラー応答
 - 



//==========================================================================================================
// 6.6 RESTクライアントの実装
//==========================================================================================================
★ JavaアプリケーションからREST APIにアクセスする方法
 - サードパーティ製のHTTPクライアント用のライブラリを使用する
 - JDK 1.1から追加されたjava.net.HttpURLConnectionクラスを使用する

★ RestTemplate
 - アプリケーションは、RestTemplateのメソッドを呼び出してREST APIの呼び出し依頼を行なう
 - 



★ RestTemplateを構成するコンポーネント
 - org.springframework.http.converter.HttpMessageConverter
   - HTTPのボディ部のメッセージとJavaBeansを相互に変換するためのインターフェイス
 - org.springframework.http.client.ClientHttpRequestFactory
   - リクエストを送信するオブジェクトを（org.springframework.http.client.ClientHttpRequestインターフェイスを実装したクラスのオブジェクト）を生成するためのインターフェイス
 - org.springframework.http.client.ClientHttpRequestInterceptor
   - HTTP通信の前後に共通処理を組み込むためのインターフェイス
 - org.springframework.web.client.ResponseErrorHandler
   - エラー応答の判定とエラー時の処理を実装するためのインターフェイス


★ REST APIの呼び出し
 - (P.355) 表 6.7 RestTemplate から提供されているメソッド






//==========================================================================================================
// 問題
//==========================================================================================================
★ 例外ハンドラが動かない


★ ラムダ式を使ってコンパイルすると起動時にエラーとなる




//==========================================================================================================
// 未整頓メモ
//==========================================================================================================
★ Thymeleaf + Javascript

<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript" th:inline="javascript">
var jsonData; // JSON格納
var jsonStr; //  JSON格納（文字列）
var textValue;  // 作業用のグローバル変数
/*<![CDATA[*/
// ロード時に範囲を取得する
$(function() {
	var url = /*[[ @{/getresource/pullout/} ]]*/ 'dummy';
	var bankId = /*[[ ${bank.bankId} ]]*/ 'dummy';
	//alert('url  = ' + url + bankId);
	$.getJSON(url + bankId, function(json) {
		// 成功時の処理
		jsonData = json;
		jsonStr = JSON.stringify(json);
		alert('jsonStr = ' + jsonStr);
		alert('data[pulloutCommisions] = ' + jsonData["pulloutCommisions"]);
		alert('data[pulloutCommisions].length = ' + jsonData["pulloutCommisions"].length);
		alert('data[pulloutCommisions][0][lowerLimit]' + jsonData["pulloutCommisions"][0]["lowerLimit"]);
		alert('data[pulloutCommisions][0][upperLimit]' + jsonData["pulloutCommisions"][0]["upperLimit"]);
		alert('data[pulloutCommisions][0][commision]' + jsonData["pulloutCommisions"][0]["commision"]);
		return;
	});
});
/*]]>*/

function showCommision(keyCode, value) {
	// テキストが変更されていなかったら処理をしない
	if (textValue == value) { return; }
	// 以下処理
	//alert('(#commisiontext).txt = ' + $('#commisiontext').text);
	//alert(data["pulloutCommisions"]);
	
	$('#commisiontext').text(value);
	//alert('textValue = ' + textValue + ' / value = ' + value);
	return;
}
</script>




/RESTfulWeb01/src/main/java/jp/tuyano/spring/exception/GlobalExceptionHandler.java
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//	/**
//	 * 共通エラーメソッド
//	 * @param e
//	 * @return
//	 */
//	@ExceptionHandler
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	public String handleException(Exception e) {
//		System.out.println("★★★★★★★★★★★★");
//		System.out.println(e.getMessage());
//		return "error/systemError";
//	}
//
//}

/RESTfulWeb01/src/main/java/jp/tuyano/spring/exception/BookResourceNotFoundException.java

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BookResourceNotFoundException(String bookId) {
		super("Book is not found (bookId = " + bookId + ")");
	}
}




//==========================================================================================================
// <END>
//==========================================================================================================
