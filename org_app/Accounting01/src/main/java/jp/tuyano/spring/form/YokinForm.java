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
	 * 預金出能帳の最新状態保持
	 */
	private List<Yokin> yokinList;

	/**
	 * 預金出能帳登録用オブジェクト
	 */
	private Yokin yokin;
}