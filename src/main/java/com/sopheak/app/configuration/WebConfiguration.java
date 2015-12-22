package com.sopheak.app.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration 
/*
 * indicates that the class can be used by the Spring IoC
 * container as a source of bean definitions.
 */
@EnableWebMvc /*
 * activates annotation-driven controller request mapping and
 * replaces <mvc:annotation-driven>.
 */
@ComponentScan(basePackages = "com.sopheak.app")
public class WebConfiguration {
	
	/*
	 * @Bean annotation tells Spring that a method annotated with @Bean will
	 * return an object that should be registered as a bean in the Spring
	 * application context.
	 */

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/page/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
//	@Bean
//    public MultipartResolver multipartResolver() {
//        org.springframework.web.multipart.commons.CommonsMultipartResolver multipartResolver = new org.springframework.web.multipart.commons.CommonsMultipartResolver();
//        //multipartResolver.setMaxUploadSize(2097152);
//        multipartResolver.setMaxUploadSize(5242880);
//        return multipartResolver;
//    }
	
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	
	
	
}
