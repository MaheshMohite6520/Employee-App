package com.qsp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializers extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		return new Class[] {MyConfig.class};
	}

	@Override
	protected String[] getServletMappings() 
	{
		return new String[] {"/"};
	}
	
}
