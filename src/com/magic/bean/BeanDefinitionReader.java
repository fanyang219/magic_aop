package com.magic.bean;

import java.io.IOException;

import com.magic.bean.core.resource.Resource;

public interface BeanDefinitionReader {
	void loadBeanDefinitions(String path) throws IOException;
	
	void loadBeanDefinitions(Resource resource) throws IOException;
}
