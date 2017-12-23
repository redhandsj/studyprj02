package org.rhpj.form;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class EchoForm implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// 必須チェック・サイズチェック
	@NotEmpty
	@Size(max = 10)
	private String text;

	// TODO String以外の必須チェック
	// NotNullを使用。
	// Stringの場合は、未入力で空文字が入る為にNotNullが使えない
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
