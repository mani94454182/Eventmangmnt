package com.ems.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletConfiguration implements WebApplicationInitializer{
	//Onstartup Event
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//Step1: create webSpring IoC Container	
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		
		//step2: Register your Spring Web configuration class
		context.register(SpringWebConfiguration.class);//Spring Web annotated configuration class
		
		//step 3:registering the DispatcherServlet to web application
		ServletRegistration.Dynamic sr = servletContext.addServlet
				("dispatcherServlet", new DispatcherServlet(context));
		
		//step4: Loading servlet at the time of bootstrapping the web application
		sr.setLoadOnStartup(1);
		System.out.println("hi");
		
		//step5:Servlet Url Pattern Mapping
		sr.addMapping("/");
		
		
	}

}
