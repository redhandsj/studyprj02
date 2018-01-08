package org.rhpj.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.rhpj.validation.impl.EqualsPropertyValuesValidator;

@Documented
// ↓バリデータの実装クラスを指定する
@Constraint(validatedBy = {EqualsPropertyValuesValidator.class})
@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME) 
public @interface EqualsPropertyValues {

	String message() default "com.example.validation.EqualsPropertyValues.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};

	String property();
	String comparingProperty(); 

	@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	public @interface List {
		EqualsPropertyValues[] value();
	}
	
}
