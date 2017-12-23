package org.rhpj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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

	/**
	 * TODO ■10.5.6 Open EntityManager in Viewパターン
	 * @return
	 */
	@Bean
	public OpenEntityManagerInViewInterceptor openEntityManagerInViewInterceptor() {
		// 画面レンダリング時にLazyフェッチ
		return new OpenEntityManagerInViewInterceptor();
	}
	
	 @Override
	 public void addInterceptors(InterceptorRegistry registry) {
		 // 無駄なオーバーヘッドを削減するため、Lazyフェッチが明らかに発生しない
		 // 静的リソース（HTML ファイル、CSSファイル、画像など）を対象から除外
		registry.addWebRequestInterceptor(openEntityManagerInViewInterceptor())
		        .addPathPatterns("/**")
		        .excludePathPatterns("/**/*.html")
		        .excludePathPatterns("/**/*.js")
		        .excludePathPatterns("/**/*.css")
		        .excludePathPatterns("/**/*.png");
		} 

}
