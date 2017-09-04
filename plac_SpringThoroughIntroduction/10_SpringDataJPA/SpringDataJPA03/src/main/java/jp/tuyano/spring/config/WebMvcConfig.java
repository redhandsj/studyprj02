package jp.tuyano.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("jp.tuyano.spring")
public class WebMvcConfig extends WebMvcConfigurerAdapter {

//	@Autowired
//    SpringTemplateEngine templateEngine;

	
	@Bean(name ="templateResolver")
	public SpringResourceTemplateResolver getTemplateResolver() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/templates/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("XHTML");
		templateResolver.setCacheable(false);
		templateResolver.setCharacterEncoding("UTF-8");
		return templateResolver;
	}
	@Bean(name ="templateEngine")
	public SpringTemplateEngine getTemplateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(getTemplateResolver());
		return templateEngine;
	}
	@Bean(name="viewResolver")
	public ThymeleafViewResolver getViewResolver(){
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setContentType("text/html; charset=utf-8");
		viewResolver.setTemplateEngine(getTemplateEngine());
		viewResolver.setCache(false);
		viewResolver.setCharacterEncoding("UTF-8");
		return viewResolver;
	}
//	@Bean
//	public FilterRegistrationBean filterRegistrationBean() {
//	    CharacterEncodingFilter filter = new CharacterEncodingFilter();
//	    filter.setEncoding("UTF-8");
//
//	    FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//	    registrationBean.setFilter(filter);
//	    registrationBean.addUrlPatterns("/*");
//	    return registrationBean;
//	}
//	@Bean
//    public AjaxThymeleafViewResolver viewResolver() {
//        AjaxThymeleafViewResolver viewResolver = new AjaxThymeleafViewResolver();
//        viewResolver.setViewClass(FlowAjaxThymeleafView.class);
//        viewResolver.setTemplateEngine(templateEngine);
//        viewResolver.setCharacterEncoding("UTF-8");
//        return viewResolver;
//    }

}
