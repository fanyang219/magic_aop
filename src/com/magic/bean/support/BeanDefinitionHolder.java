package com.magic.bean.support;

import com.magic.bean.BeanDefinition;

public class BeanDefinitionHolder {
	private BeanDefinition beanDefinition;
	
	public BeanDefinitionHolder(BeanDefinition beanDefinition) {
		this.beanDefinition = beanDefinition;
	}
	
	public BeanDefinition getBeanDefinition() {
		return beanDefinition;
	}
}
