package com.magic.bean.support;


/**
 * �̳й�ϵ��BeanDefinition
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
