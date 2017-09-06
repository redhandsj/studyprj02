package jp.tuyano.spring.form;

import java.util.List;

import jp.tuyano.spring.domain.model.Yokin;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class YokinForm {

	/**
	 * テスト用文字列
	 */
	private String testStr;
	
	/**
	 * 預金出能帳
	 */
	private List<Yokin> yokinList;
	
}