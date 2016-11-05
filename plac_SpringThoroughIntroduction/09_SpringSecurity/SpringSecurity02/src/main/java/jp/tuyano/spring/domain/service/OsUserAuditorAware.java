package jp.tuyano.spring.domain.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.AuditorAware;

public class OsUserAuditorAware implements AuditorAware<String> {
	@Value("#{ systemProperties['user.name'] }")
	private String userName;
	
	public String getCurrentAuditor() {
		// TODO Auto-generated method stub
		return userName;
	}
}
