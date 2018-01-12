package org.rhpj.domain.converter;

import org.rhpj.domain.value.EmailValue;
import org.springframework.core.convert.converter.Converter;

public class StringToEmailValueConverter implements Converter<String, EmailValue> {
	@Override
	public EmailValue convert(String source) {
		EmailValue email = new EmailValue();
		email.setValue(source);
		return email;
	}
}
