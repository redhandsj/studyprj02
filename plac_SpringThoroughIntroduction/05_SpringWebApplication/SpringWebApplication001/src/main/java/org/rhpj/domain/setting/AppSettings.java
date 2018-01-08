package org.rhpj.domain.setting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppSettings {
	 @Value("${passwordValidDays:90}")
	 int passwordValidDays;
	 public int getPasswordValidDays() {
		 return passwordValidDays;   
	 }
}
