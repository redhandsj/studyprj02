package jp.tuyano.spring.sample2;

import java.beans.PropertyEditorSupport;

public class MyBeanTypeEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) {
		MyBean bean = new MyBean();
		bean.setMessage(text);
		setValue(bean);
	}
}