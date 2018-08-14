package com.magic.bean.core.reader.parser;

import org.w3c.dom.Element;

import com.magic.bean.BeanDefinition;

public class BeanElementParser extends ElementParser {
	public static final String ELEMENT_BEAN = "bean";
	public static final String ATTRIBUTE_ID = "id";
	public static final String ATTRIBUTE_NAME = "name";
	public static final String ATTRIBUTE_CLASS = "class";
	public static final String ATTRIBUTE_PARENT = "parent";
	
	public BeanElementParser(BeanDefinitionParserChain chain) {
		super(chain);
	}
	
	@Override
	public boolean parseBeanDefinition(Element ele, BeanDefinition beanDefinition) {
		if(!isTheNode(ele, ELEMENT_BEAN)) { // ะฃั้
			return false;
		}
		
		String id = ele.getAttribute(ATTRIBUTE_ID);
		String name = ele.getAttribute(ATTRIBUTE_NAME);
		String className = ele.getAttribute(ATTRIBUTE_CLASS);
		String parentName = ele.getAttribute(ATTRIBUTE_PARENT);
		
		beanDefinition.setId(id);
		beanDefinition.setName(name);
		beanDefinition.setClassName(className);
		beanDefinition.setParentName(parentName);
		
		return true;
	}
}
