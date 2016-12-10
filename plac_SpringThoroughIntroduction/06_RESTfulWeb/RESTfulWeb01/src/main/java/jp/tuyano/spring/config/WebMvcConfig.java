package jp.tuyano.spring.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("jp.tuyano.spring")
@Import(ThymeleafConfig.class)
public class WebMvcConfig extends WebMvcConfigurerAdapter {


	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		return new MappingJackson2HttpMessageConverter(Jackson2ObjectMapperBuilder.json().indentOutput(true).build());
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// 任意のHttpMessageConverterを追加する
		converters.add(0, mappingJackson2HttpMessageConverter());
	}

//	@Override
//	public void configureViewResolvers(ViewResolverRegistry registry){
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		viewResolver.setPrefix("/WEB-INF/templates/");
//        viewResolver.setSuffix(".html");
//        registry.viewResolver(viewResolver);
//		//registry.jsp().prefix("/WEB-INF/views/"); ←こんな書き方もできるらしい
//	}

//	@Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**")
//                .addResourceLocations("classpath:/static/");
//    }
}
