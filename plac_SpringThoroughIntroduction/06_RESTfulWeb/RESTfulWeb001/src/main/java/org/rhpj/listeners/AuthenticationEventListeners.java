package org.rhpj.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

@Component 
public class AuthenticationEventListeners {
//	 private static final Logger log = LoggerFactory.getLogger(AuthenticationEventListeners.class);
	 
	// 認証イベントの通知を受け取って処理を行ないたい場合のリスナー
	 @EventListener 
	 public void handleBadCredentials(AuthenticationFailureBadCredentialsEvent event) { 
//		 log.info("Bad credentials is detected. username : {}", event.getAuthentication().getName());
	 }	 
}
