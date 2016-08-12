package jp.tuyano.spring.sample1;

import java.util.Calendar;
import java.util.Date;

public class MyBean implements MyBeanInterface {
	private Date date;
	private String message;
	
	public MyBean() {
		super();
		this.date = Calendar.getInstance().getTime();
	}
	public MyBean(String message) {
		this();
		this.message = message;
	}

	@Override
	public Date getDate() {
		return date;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MyBean [message=" + message + ", date=" + date + "]";
	}
	
}
