package com.nuzmil.common.config;

import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.PropertiesLoaderSupport;

public class PropertyFactory extends PropertiesLoaderSupport {

	private static Properties properties = new Properties();
	
	static{
		try{
			Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:properties/*.properties");
			if(resources != null){
				for(Resource resource : resources){
					Properties currProps = new Properties();
					currProps.load(resource.getInputStream());
					properties.putAll(currProps);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key){
		return properties.getProperty(key);
	}
	
}
