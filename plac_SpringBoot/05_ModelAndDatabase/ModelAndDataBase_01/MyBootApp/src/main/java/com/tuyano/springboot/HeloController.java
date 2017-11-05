package com.tuyano.springboot;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloController {
//	/**
//	 * 通常コントローラ
//	 * @return
//	 */
//	@RequestMapping("/")
//	public String index(){
//		return "Hello Spring-Boot World!!";
//	}

//	/**
//	 * 引数の合計をテキスト出力
//	 * @param num
//	 * @return
//	 */
//	@RequestMapping("/{num}")
//	public String index(@PathVariable int num){
//		int res = 0;
//		for(int i=1;i <= num ; i++){
//			res+=i;
//		}
//		return "total : " + res;
//	}

//	String[] names = {"tuyano","hanako","taro","sachiko","ichiro"};
//	String[] mails = {"syoda@tuuyano.com","hanako@flower","taro@yamada","sachiko@happy","ichiro@baseball"};
//
//	/**
//	 * 
//	 * @param num
//	 * @return
//	 */
//	@RequestMapping("/{id}")
//	public DataObject index(@PathVariable int id){
//		return new DataObject(id,names[id],mails[id]);
//	}

}

/**
 * {"id":0,"name":"tuyano","value":"syoda@tuuyano.com"}
 * @author h-dodo
 *
 */
class DataObject{
	private int id;
	private String name;
	private String value;

	public DataObject(int id, String name, String value){
		super();
		this.setId(id);
		this.setName(name);
		this.setValue(value);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
