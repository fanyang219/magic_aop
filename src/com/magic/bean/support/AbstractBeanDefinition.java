package com.magic.bean.support;

import com.magic.bean.BeanDefinition;

public abstract class AbstractBeanDefinition implements BeanDefinition {
	private String id;
	private String name;
	private String className;
	private PropertyList propertyList;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getClassName() {
		return className;
	}

	@Override
	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public PropertyList getPropertyList() {
		if(propertyList==null) {
			propertyList = new PropertyList();
		}
		return propertyList;
	}
}
