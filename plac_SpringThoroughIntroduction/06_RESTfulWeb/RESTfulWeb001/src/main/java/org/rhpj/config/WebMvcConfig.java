package org.rhpj.config;

import java.util.Locale;

import org.rhpj.domain.converter.StringToEmailValueConverter;
import org.rhpj.interceptor.SuccessLoggingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.OptionalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.resource.VersionResourceResolver;

@Configuration
// Spring MVC が提供しているコンフィギュレーションクラスがインポートされる
@EnableWebMvc
@ComponentScan("org.rhpj")
@EnableAspectJAutoProxy
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	/**
	 * InternalResourceViewResolverのBean定義
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp()
				.prefix("/WEB-INF/view/")
				.suffix(".jsp");
	}

//	/**
//	 * 、Viewを呼び出すだけの処理であれば、SpringMVCが提供しているView Controllerの仕組みを利用
//	 */
//	public void addViewControllers(ViewControllerRegistry registry) { 
//		 registry.addViewController("/").setViewName("home");
//	}

	//=======================================================================
	// Spring MVC上での非同期実行の有効化
	//=======================================================================
	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) { 
		configurer.setDefaultTimeout(5000);
		// TODO 7.3.5 非同期実行に対する共通処理の実装の作成クラスの登録例
		//configurer.registerCallableInterceptors(new CustomCallableProcessingInterceptor());
		//configurer.registerDeferredResultInterceptors(new CustomDeferredResultProcessingInterceptor());
	}

	//=======================================================================
	// デフォルトサーブレット機能
	//=======================================================================
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) { 
		configurer.enable();
	}

	//=======================================================================
	// 任意のディレクトリに格納されているファイルへのアクセス
	//=======================================================================
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) { 
		// リクエストパスとリソースの物理的な格納場所をマッピング
		registry.addResourceHandler("/static/**")
				.addResourceLocations("classpath:/static/")
				// キャッシュ有効期間を秒単位で指定 (604800=7日)
				.setCachePeriod(604800)  
				// ResourceResolverやResourceTransformerの実行結果をキャッシュする
				.resourceChain(true)
				// /static/配下のすべてのリソースがバージョン付きの公開パスでアクセス可能
				.addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));
	}

	//=======================================================================
	// 切り替えたロケールを保存する際に使用するLocaleResolverのBean定義
	//=======================================================================
	@Bean
	public LocaleResolver localeResolver() { 
		CookieLocaleResolver resolver = new CookieLocaleResolver();
		// cookieNameプロパティにロケールを保存するCookie名を設定する。
		// デフォルト値だとSpring Frameworkを使用 していることがわかる名前
		// （"org.springframework.web.servlet.i18n.CookieLocaleResolver.LOCALE"）
		// なので、Cookie名は変更するほうが望ましい 
		resolver.setCookieName("locale");
		// デフォルトのロケールを指定する
		resolver.setDefaultLocale(Locale.JAPANESE);
		return resolver;
	}
	
	//=======================================================================
	// HandlerInterceptorの利用
	//=======================================================================
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SuccessLoggingInterceptor())
//		    .includePathPatterns("/**")  // 適用対象のパスを指定
		    .excludePathPatterns("/resources/**");  // 除外パスを指定
//		    .addInterceptor(new LocaleChangeInterceptor());
	}
	
	
	//=======================================================================
	// カスタマイズしたValidatorをDIコンテナに登録する 
	//=======================================================================
	@Bean
	OptionalValidatorFactoryBean validator() { 
		OptionalValidatorFactoryBean validator = new OptionalValidatorFactoryBean();
		// setterメソッドなどを呼び出してカスタマイズする        
		return validator;
	}
	@Override
	public Validator getValidator() { 
		 return validator();
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
