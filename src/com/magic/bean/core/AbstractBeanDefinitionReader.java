package com.magic.bean.core;

import java.io.IOException;

import com.magic.bean.BeanDefinitionReader;
import com.magic.bean.BeanDefinitionRegistry;
import com.magic.bean.core.resource.DefaultResourceLoader;
import com.magic.bean.core.resource.Resource;
import com.magic.bean.core.resource.ResourceLoader;

public abstract class AbstractBeanDefinitionReader implements
		BeanDefinitionReader {
	private ResourceLoader resourceLoader;
	
	private BeanDefinitionRegistry registry;

	public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
		this.registry = registry;
	}
	
	@Override
	public void loadBeanDefinitions(String path) throws IOException {
		Resource resource = getResourceLoader().getResource(path);

		loadBeanDefinitions(resource);
	}
	
	public BeanDefinitionRegistry getRegistry() {
		return registry;
	}

	public ResourceLoader getResourceLoader() {
		if (resourceLoader == null) {
			resourceLoader = new DefaultResourceLoader();
		}
		return resourceLoader;
	}

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
}
