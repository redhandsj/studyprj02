package jp.tuyano.spring.controll;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.tuyano.spring.domain.model.Yokin;
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
	 * @param yokinForm
	 * @param result
	 * @return
	 */
	@RequestMapping
	public String index(@Validated @ModelAttribute("yokinForm") YokinForm yokinForm, BindingResult result) {
		yokinForm.setTestStr("aaaaaaaaaaa");		
		// 預金テーブル取得
		List<Yokin> yokins = yokinService.findAll();
		yokinForm.setYokinList(yokins);
		
		return "html/yokin";
    }	

	/**
	 * 登録
	 * @param yokinForm
	 * @param result
	 * @return
	 */
	@RequestMapping("/regist")
	public String regist(@Validated @ModelAttribute("yokinForm") YokinForm yokinForm, BindingResult result) {
		if (result.hasErrors()) {
		      return null;
		}
		// 日付変換
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
		try {
			date = sdFormat.parse(yokinForm.getDateStr());
			yokinForm.getYokin().setHiduke(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 金融コードを４桁０埋め
		String t1 = String.format("%4s", yokinForm.getYokin().getKinyuCd()).replace(" ", "0");
		yokinForm.getYokin().setKinyuCd(t1);
		// 科目コードを４桁０埋め
		String t2 = String.format("%4s", yokinForm.getYokin().getKamokuCd()).replace(" ", "0");
		yokinForm.getYokin().setKamokuCd(t2);
		// 残高を仮
		yokinForm.getYokin().setZandaka(0L);
		
		yokinService.regist(yokinForm.getYokin());
		return "redirect:/goToYokin";
    }	


	/**
	 * 登録
	 * @param yokinForm
	 * @param result
	 * @return
	 */
	@RequestMapping("/delete/{num}")
	public String delete(@Validated @ModelAttribute("yokinForm") YokinForm yokinForm, BindingResult result) {
		if (result.hasErrors()) {
		      return null;
		}
		yokinService.regist(yokinForm.getYokin());
		
		return "redirect:/goToYokin";
	}
}

