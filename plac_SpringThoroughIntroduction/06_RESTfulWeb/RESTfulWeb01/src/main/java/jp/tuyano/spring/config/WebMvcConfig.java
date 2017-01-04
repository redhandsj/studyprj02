package jp.tuyano.spring.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;

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

	/**
	 * Jackson2ObjectMapperBuilder設定
	 * @return 設定結果
	 */
	@Bean
	ObjectMapper objectMapper() {
		return Jackson2ObjectMapperBuilder.json()
				.indentOutput(true) // JSONにインデントを設ける
				.dateFormat(new StdDateFormat()) // ISO 8601の日時形式をサポート
				.build();
	}
	
	/**
	 * CORS機能を適用するパスを指定する
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**");
	}
	
	/**
	 * RestTemplateをDIコンテナに登録
	 * @return RestTemplate
	 */
	@Bean
	RestTemplate restTemplate() {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		// connectTimeoutプロパティにサーバーとの接続タイムアウト時間（ミリ秒）を設定
		requestFactory.setConnectTimeout(5000);
		// readTimeoutプロパティにレスポンスデータの読み込みタイムアウト時間（ミリ秒）を設定
		requestFactory.setReadTimeout(3000);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		return restTemplate;
//		return new RestTemplate();
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
