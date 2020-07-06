package main.java.com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

/**
 * @PACKAGE_NAME: main.java.com.imooc.beanannotation.javabased
 * @NAME: StoreConfig
 * @date: 2020/7/6 10:25 周一
 * @author: heqinz
 */

@Configuration
@ImportResource("classpath:/main/resources/config.xml")
public class StoreConfig {


//    @Value("${url}")
//	private String url;
//
//	@Value("${jdbc.username}")
//	private String username;
//
//	@Value("${password}")
//	private String password;
//
//    @Bean
//	public MyDriverManager myDriverManager() {
//		return new MyDriverManager(url, username, password);
//	}

	@Bean(name = "stringStore")
    @Scope(value = "prototype")
	public Store stringstore(){
        return new StringStore();
    }


//    @Bean(name = "stringStore", initMethod="init", destroyMethod="destroy")
//    public Store StringStore(){
//        return new StringStore();
//    }
}
