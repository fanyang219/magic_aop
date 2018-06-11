package com.magic.bean.reader;

import java.io.IOException;

import com.magic.bean.resource.DefaultResourceLoader;
import com.magic.bean.resource.Resource;
import com.magic.bean.resource.ResourceLoader;

public abstract class AbstractBeanDefinitionReader implements
		BeanDefinitionReader {
	private ResourceLoader resourceLoader = null;
	
	@Override
	public void loadBeanDefinitions(String path) throws IOException {
		Resource resource = getResourceLoader().getResource(path);
		
		loadBeanDefinitions(resource);
	}

	public ResourceLoader getResourceLoader() {
		if(resourceLoader==null) {
			resourceLoader = new DefaultResourceLoader();
		}
		return resourceLoader;
	}

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
}
