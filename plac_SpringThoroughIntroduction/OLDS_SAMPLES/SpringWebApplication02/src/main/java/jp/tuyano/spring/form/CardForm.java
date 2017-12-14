package jp.tuyano.spring.form;

import java.io.Serializable;
import java.util.Date;

public class CardForm implements Serializable {
	private static final long serialVersionUID = 1L;
	private String no;
	private Date validMonth;

	public CardForm(final String no, final Date validMonth){
		this.no = no;
		this.validMonth = validMonth;
	}

	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Date getValidMonth() {
		return validMonth;
	}
	public void setValidMonth(Date validMonth) {
		this.validMonth = validMonth;
	}
	 
	 
	 
}
