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
		// Groovyでは、メソッドの最後に書かれた値が、そのまま返値と してreturnされます。 
		"Hello!!";
	}
}