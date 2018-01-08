package org.rhpj.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;

@Documented
@Constraint(validatedBy = {}) 
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER }) 
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
//↓ 英数字であること (正規表現のパターン文字列をメタアノテーションに指定) 
@Pattern(regexp = "[a-zA-Z0-9]*")
public @interface AlphaNumeric {

	String message() default "{com.example.validation.AlphaNumeric.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
	@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER }) 
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	public @interface List {
		 AlphaNumeric[] value();
	}
}
