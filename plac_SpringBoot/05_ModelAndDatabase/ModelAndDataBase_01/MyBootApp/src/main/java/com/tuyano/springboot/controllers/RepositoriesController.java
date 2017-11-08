package com.tuyano.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tuyano.springboot.entities.MyData;
import com.tuyano.springboot.repositories.MyDataRepository;

@Controller
@RequestMapping(("repositories"))
public class RepositoriesController {
		
	@Autowired
	private MyDataRepository repository;
	
	/**
	 * 動作確認ページ
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/index" , method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("repos/index");
		mav.addObject("msg","リポジトリ確認ページ");
		Iterable<MyData> list = repository.findAll();
		mav.addObject("data",list);
		
		
		
		
		return mav;
	}


	
}

