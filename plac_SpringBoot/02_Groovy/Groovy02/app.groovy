/**
 * クラス定義
 */
@RestController
class App {
	/**
	 * メソッド定義
	 */
	@RequestMapping("/")
	def home(){
		def header = "<html><body>";
		def footer = "</body></html>";
		def content = "<h1>Hello!</h1><p>this is html content.</p>";
		// Groovyでは、メソッドの最後に書かれた値が、そのまま返値と してreturnされます。 
		header + content + footer;
	}
}