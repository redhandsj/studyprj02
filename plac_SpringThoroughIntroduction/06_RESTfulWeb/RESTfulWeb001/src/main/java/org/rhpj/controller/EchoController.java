package org.rhpj.controller;

import javax.validation.Valid;

import org.rhpj.form.EchoForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("echo")
public class EchoController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) {
		EchoForm form = new EchoForm();
		model.addAttribute(form);
		return "echo/input";
	}
	
	// TODO BindingResultは必ず form の直後
	@RequestMapping(method = RequestMethod.POST)
	public String echo(@Valid EchoForm form, BindingResult result, Model model) {
		if(result.hasErrors()) {
			// エラーがある場合、戻る
			return "echo/input";
		}
		// 正常の場合
		return "echo/output";
	}
	
}
