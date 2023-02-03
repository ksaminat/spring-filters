package com.kiru.security.exfilters.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kiru.security.exfilters.adaptors.ExampleAdaptor;

@Configuration
public class ExampleSecurityConfig implements WebMvcConfigurer{

	@Autowired
	private ExampleAdaptor ea;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(ea);
	}
}
