package jp.tuyano.spring.form;

import java.io.Serializable;

import javax.validation.constraints.Size;

public class echoForm implements Serializable {
	private static final long serialVersionUID = 1L;
	@Size(min = 9, max = 10)
	private String text;
	private String remark;
	private String size;

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}
