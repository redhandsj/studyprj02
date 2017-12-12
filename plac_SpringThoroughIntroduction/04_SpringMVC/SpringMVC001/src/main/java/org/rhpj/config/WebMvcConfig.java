package org.rhpj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
// Spring MVC が提供しているコンフィギュレーションクラスがインポートされる
@EnableWebMvc
@ComponentScan("org.rhpj")
public class WebMvcConfig  extends WebMvcConfigurerAdapter {
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp()
				.prefix("/WEB-INF/view/")
				.suffix(".jsp");
	}

	
}
