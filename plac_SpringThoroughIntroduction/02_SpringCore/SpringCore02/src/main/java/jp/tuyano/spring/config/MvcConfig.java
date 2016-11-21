package jp.tuyano.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//@EnableWebMvc
//@Configuration
//@ComponentScan({ "jp.tuyano.spring.*" })
//@Import({ SecurityConfig.class })
@Configuration
@EnableWebMvc
@ComponentScan("jp.tuyano.spring")
public class MvcConfig extends WebMvcConfigurerAdapter {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	// メソッド名がBean名で、戻り値がインスタンス

//	@Bean
//	UserRepository userRepository() {
//		return new UserRepositoryImpl();
//	}
	
//	@Bean
//	UserService userService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//		return new UserServiceImpl(userRepository, passwordEncoder);
//	}
//	
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return (PasswordEncoder) new BCryptPasswordEncoder();
//	}

//	@Bean
//	UserService userService() {
//		return new UserServiceImpl(userRepository(), passwordEncoder());
//	}
	
}
