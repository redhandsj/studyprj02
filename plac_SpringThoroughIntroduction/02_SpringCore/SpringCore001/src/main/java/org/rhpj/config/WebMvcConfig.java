package org.rhpj.config;

import org.rhpj.domain.converter.StringToEmailValueConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
// Spring MVC が提供しているコンフィギュレーションクラスがインポートされる
@EnableWebMvc
@ComponentScan("org.rhpj")
@EnableAspectJAutoProxy
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp()
				.prefix("/WEB-INF/view/")
				.suffix(".jsp");
	}
	/**
	 * メッセージリソース設定
	 * @return
	 */
	@Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("messages");
        source.setUseCodeAsDefaultMessage(true);
        source.setDefaultEncoding("UTF-8");
        return source;
    }

	/**
	 * 独自クラス（メールアドレスを表現するクラス）を追加
	 * @return
	 */
	@Bean
	public ConversionService conversionService() {
		DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
		// addConverterメソッドの引数に作成したConverterを指定
		conversionService.addConverter(new StringToEmailValueConverter());    
		return conversionService; 
	}
//	/**
//	 * 
//	 */
//	@Bean
//	UserRepository userRepository() {
//		return new UserRepositoryImpl();
//	}
	
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();    
//	}

//	@Bean
//	UserService userService() {
//		return new UserServiceImpl(userRepository(), passwordEncoder());    
//	} 
	 
//	/**
//	 * TODO ■10.5.6 Open EntityManager in Viewパターン
//	 * @return
//	 */
//	@Bean
//	public OpenEntityManagerInViewInterceptor openEntityManagerInViewInterceptor() {
//		// 画面レンダリング時にLazyフェッチ
//		return new OpenEntityManagerInViewInterceptor();
//	}
	
//	 @Override
//	 public void addInterceptors(InterceptorRegistry registry) {
//		 // 無駄なオーバーヘッドを削減するため、Lazyフェッチが明らかに発生しない
//		 // 静的リソース（HTML ファイル、CSSファイル、画像など）を対象から除外
//		registry.addWebRequestInterceptor(openEntityManagerInViewInterceptor())
//		        .addPathPatterns("/**")
//		        .excludePathPatterns("/**/*.html")
//		        .excludePathPatterns("/**/*.js")
//		        .excludePathPatterns("/**/*.css")
//		        .excludePathPatterns("/**/*.png");
//	 } 

	
}
