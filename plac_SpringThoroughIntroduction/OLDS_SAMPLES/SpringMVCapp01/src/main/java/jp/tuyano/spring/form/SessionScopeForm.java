package jp.tuyano.spring.form;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope(value = "session")
@Data
public class SessionScopeForm {
	private String id;
}
