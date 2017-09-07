package jp.tuyano.spring.form;

import java.util.List;

import jp.tuyano.spring.domain.model.Yokin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

	/**
	 * 一旦文字列で日付を受ける
	 */
	private String dateStr;

}