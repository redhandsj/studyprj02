package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// クラスアノテーションに@Controllerを指定する 
@Controller
public class WelcomeController {
	
	// トップ画面の表示リクエストをハンドリングするためのメソッドを追加、"/"というパスに対するリクエストがこのメソッド にマッピングされる 
    @RequestMapping("/")
    public String home() {
    	// トップ画面を表示するJSPのView名を返却する
    	// View名として"index"を返却しているので、src/main/webapp/WEB-INF/index.jspが呼び出される
        return "index";
    }
}
