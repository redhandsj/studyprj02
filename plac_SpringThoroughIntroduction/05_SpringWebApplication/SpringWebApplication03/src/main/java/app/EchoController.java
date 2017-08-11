package app;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// コンポーネントスキャン機能を使用してDIコンテナにBean登録することができる 
// リクエストをハンドリングするメソッド（以降、Handlerメソッドと呼ぶ）が定義されているクラスとして認 識される
@Controller
// "/echo"というパ スに対するリクエストがこのControllerにマッピングされる
@RequestMapping("echo")
public class EchoController {

	// "GET /echo"というリクエスト がこのメソッドにマッピングされる 
    @RequestMapping(method = RequestMethod.GET)
    public String viewInput(Model model) {
        EchoForm form = new EchoForm();
        model.addAttribute(form);
        return "echo/input";
    }

    /**
     * 
     * @param form ＠Validを指定すると、フロントコントローラはフォームクラスの入力 チェックを実施してチェック結果をBindingResultに格納する 
     * @param result フォームクラスの入力チェック結果
     * @return
     */
    // 、"POST /echo"というリクエストがこの メソッドにマッピングされる 
    @RequestMapping(method = RequestMethod.POST)
    public String echo(@Valid EchoForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "echo/input";
        }
        return "echo/output";
    }

}