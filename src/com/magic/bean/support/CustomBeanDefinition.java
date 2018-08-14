package com.magic.bean.support;

import com.magic.bean.AbstractBeanDefinition;

/**
 * ¼Ì³Ð¹ØÏµµÄBeanDefinition
 * @author xufan
 */
public class CustomBeanDefinition extends AbstractBeanDefinition {
	private String parentName;

	@Override
	public String getParentName() {
		return parentName;
	}

	@Override
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}
