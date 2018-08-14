package com.magic.bean;

public interface BeanDefinitionRegistry {
	void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
	
	void removeBeanDefinition(String beanName);
	
	BeanDefinition getBeanDefinition(String beanName);
	
	int getBeanDefinitionCount();
}
