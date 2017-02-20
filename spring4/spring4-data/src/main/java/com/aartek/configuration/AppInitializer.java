package com.aartek.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
		annotationConfigWebApplicationContext.register(AppConfig.class);
		servletContext.addListener(new ContextLoaderListener(annotationConfigWebApplicationContext));
		annotationConfigWebApplicationContext.setServletContext(servletContext);
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(annotationConfigWebApplicationContext));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		servlet.setInitParameter("throwExceptionIfNoHandlerFound","true");
		
		
		
	}

}
