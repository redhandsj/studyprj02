package jp.tuyano.spring.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.tuyano.spring.domain.model.Yokin;
import jp.tuyano.spring.form.SimpleInputForm;
import jp.tuyano.spring.form.YokinForm;
import jp.tuyano.spring.service.YokinService;

@Controller
@RequestMapping("/goToYokin")
public class YokinController {

	@Autowired
	private YokinService yokinService;
	
	/**
	 * 
	 * @return
	 */
	@ModelAttribute(value = "yokinForm")
	public YokinForm newSimpleInputForm() {
	    return new YokinForm();
	}
	
	/**
	 * 初期表示
	 * @param model
	 * @return
	 */
	@RequestMapping
	public String index(@ModelAttribute("yokinForm") YokinForm yokinForm) {

		yokinForm.setTestStr("aaaaaaaaaaa");
		
		// 預金テーブル取得
		List<Yokin> yokins = yokinService.findAll();
		yokinForm.setYokinList(yokins);
		
		return "html/yokin";
    }	

	/**
	 * 登録
	 * @param model
	 * @return
	 */
	@RequestMapping("/regist")
	public String regist(@ModelAttribute("yokinForm") YokinForm yokinForm) {

		yokinService.regist(yokinForm.getYokin());
		return "foward:html/yokin";
    }	
}

