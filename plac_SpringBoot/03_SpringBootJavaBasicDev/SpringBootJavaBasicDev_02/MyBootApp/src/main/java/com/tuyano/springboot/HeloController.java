package com.tuyano.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloController {
//	/**
//	 * @return 単純なテキスト
//	 */
//	@RequestMapping("/")
//	public String index(){
//		return "Hello Spring-Boot World!!";
//	}
	/**
	 * パラメータ渡す
	 * @param num パラメータ
	 * @return
	 */
	@RequestMapping("/{num}")
	public String index(@PathVariable int num){
		int res = 0;
		for(int i=1; i <= num; i++){
			res += i;
		}
		return "total: " + res;
	}
}
