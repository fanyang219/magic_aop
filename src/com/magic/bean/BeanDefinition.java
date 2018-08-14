package com.magic.bean;

import com.magic.bean.support.PropertyList;

/**
 * ÃèÊöbean½Ó¿Ú
 * °üÀ¨:...
 * @author xufan
 */
public interface BeanDefinition {
	String getId();
	
	void setId(String id);
	
	String getName();
	
	void setName(String name);
	
	String getClassName();
	
	void setClassName(String className);
	
	String getParentName();
	
	void setParentName(String parentName);
	
	PropertyList getPropertyList();
}
