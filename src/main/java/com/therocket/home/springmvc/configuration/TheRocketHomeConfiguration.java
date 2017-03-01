package com.therocket.home.springmvc.configuration;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.WebJarsResourceResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.therocket.home")
@PropertySource({"classpath:app.properties"})
public class TheRocketHomeConfiguration extends WebMvcConfigurerAdapter{

	@Bean(name="Home")
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}


	@Bean
	public static PropertySourcesPlaceholderConfigurer propertiesResolver() {
		return new PropertySourcesPlaceholderConfigurer();
	}

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/resources/**")
//		.addResourceLocations("/resources/")
//		.setCachePeriod(3600)
//		.resourceChain(true)
//		.addResolver(new GzipResourceResolver());
//
//	}
	
    @Override
    //http://memorynotfound.com/spring-mvc-static-resources-webjars-caching/
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("/resources/", "/webjars/")
                .setCacheControl(
                        CacheControl.maxAge(30L, TimeUnit.DAYS).cachePublic())
                .resourceChain(true)
                .addResolver(new WebJarsResourceResolver());

    }


}