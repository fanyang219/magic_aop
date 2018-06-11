package com.magic.bean.reader;

import java.io.IOException;

import com.magic.bean.resource.Resource;

public interface BeanDefinitionReader {
	void loadBeanDefinitions(String path) throws IOException;
	
	void loadBeanDefinitions(Resource resource) throws IOException;
}
