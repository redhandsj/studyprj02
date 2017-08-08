package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// DispatcherServlet用のコンフィギュレーションクラスを作成
@Configuration
// Spring MVCが提供しているコンフィギュレー ションクラスがインポートされ、Spring MVCを利用するために必要となるコンポーネントのBean定義が自動で行 なわれる 
@EnableWebMvc
// 指定したパッケージの配下に あるステレオタイプアノテーション（@Componentや@Controllerなど）が付与されているクラスがスキャンされ、 アプリケーションコンテキストにBean登録される
@ComponentScan("app")
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	// WebMvcConfigurerAdapterクラスを継承すると、 デフォルトで適用されるBean定義を簡単にカスタマイズできる

	// configureViewResolversメソッドをオーバーライド
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
    	// /WEB-INFディレクトリ配下に格納されている JSPファイルがViewとして扱わ れます
        registry.jsp();
    }

}
