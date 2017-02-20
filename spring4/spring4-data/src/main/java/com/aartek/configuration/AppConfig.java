package com.aartek.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.aartek")
@EnableTransactionManagement
/*@PropertySource(IConstant.PROPERTY_SOURCE)*/
@EnableScheduling
@EnableAsync
public class AppConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");

	}

	

	/*@Bean
	public MessageSource messageSource() {

		ResourceBundleMessageSource resourceMessage = new ResourceBundleMessageSource();
		resourceMessage.setBasename("message");
		return resourceMessage;
	}*/

	/**
	 * Resolves views selected for rendering by @Controllers to tiles resources
	 * in the Apache TilesConfigurer bean
	 */
	@Bean
	public TilesViewResolver getTilesViewResolver() {
		System.out.println("in Resolver ");
		TilesViewResolver tilesViewResolver = new TilesViewResolver();
		tilesViewResolver.setViewClass(TilesView.class);

		return tilesViewResolver;
	}
	
	/**
	 * Configures Apache tiles definitions bean used by Apache TilesViewResolver
	 * to resolve views selected for rendering by @Controllers
	 */
	@Bean
	public TilesConfigurer getTilesConfigure() {

		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setCheckRefresh(true);
		tilesConfigurer.setDefinitionsFactoryClass(TilesDefinitionsConfig.class);
		TilesDefinitionsConfig.addDefinitions();

		return tilesConfigurer;
	}

}
