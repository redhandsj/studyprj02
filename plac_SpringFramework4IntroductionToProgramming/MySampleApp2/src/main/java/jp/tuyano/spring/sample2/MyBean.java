package jp.tuyano.spring.sample2;

import java.util.Calendar;
import java.util.Date;

public class MyBean {
	private String message;
	private Date date = Calendar.getInstance().getTime();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MyBean [message=" + message + ", date=" + date + "]";
	}

}
