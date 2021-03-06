package jp.tuyano.spring.controll;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView index(@Validated @ModelAttribute("yokinForm") YokinForm yokinForm, BindingResult result) {
		ModelAndView mv = new ModelAndView("html/yokin");
		yokinForm.setTestStr("aaaaaaaaaaa");		
		// 預金テーブル取得
		List<Yokin> yokins = yokinService.findAll();
		yokinForm.setYokinList(yokins);
		//yokinForm.setEditId(1L);

		return(mv);
    }	

	/**
	 * 登録
	 * @param yokinForm
	 * @param result
	 * @return
	 */
	@RequestMapping(params = "/regist")
	public ModelAndView regist(@Validated @ModelAttribute("yokinForm") YokinForm yokinForm, BindingResult result) {
		ModelAndView mv = new ModelAndView("redirect:/goToYokin");
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
		
		return(mv);
    }	

	/**
	 * 編集
	 * @param yokinForm
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView edit(
			@Validated @ModelAttribute("yokinForm") YokinForm yokinForm,
			@PathVariable("id") String id,
			BindingResult result) {
		//ModelAndView mv = new ModelAndView("redirect:/goToYokin");
		if (result.hasErrors()) {
		      return null;
		}
//      if ((model.get("yokinForm") != null && model.get("yokinForm") instanceof YokinForm)) {
//      BeanUtils.copyProperties(yokinForm, model.get("yokinForm"));
//  }
//		Yokin entity = yokinService.findById(Long.valueOf(id));
		yokinForm.setEditYokin(yokinService.findById(Long.valueOf(id)));
		String str = new SimpleDateFormat("yyyy-MM-dd").format(yokinForm.getEditYokin().getHiduke());
		yokinForm.setEditDateStr(str);
		yokinForm.setEditId(Long.valueOf(id));
		
//		return(mv);
		return(this.index(yokinForm,result));
	}

	/**
	 * 編集確定
	 * @param yokinForm
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView update(
			@Validated @ModelAttribute("yokinForm") YokinForm yokinForm,
			@PathVariable("id") String id,
			BindingResult result, ModelMap model) {

		if ((model.get("yokinForm") != null && model.get("yokinForm") instanceof YokinForm)) {
			BeanUtils.copyProperties(yokinForm, model.get("yokinForm"));
		}
		yokinService.regist(yokinForm.getEditYokin());
		yokinForm.setEditId(0L);
		return(this.index(yokinForm,result));
	}	
	
	/**
	 * 削除
	 * @param yokinForm
	 * @param result
	 * @return
	 */
	//@RequestMapping(params = "/delete/{id}")
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView delete(
			@Validated @ModelAttribute("yokinForm") YokinForm yokinForm, 
			@PathVariable("id") String id,
			BindingResult result) {
		ModelAndView mv = new ModelAndView("redirect:/goToYokin");
		if (result.hasErrors()) {
		      return null;
		}
		yokinService.detele(Long.valueOf(id));
		return(mv);
	}
}

