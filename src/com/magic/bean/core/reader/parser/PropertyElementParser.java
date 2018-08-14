package com.magic.bean.core.reader.parser;

import org.w3c.dom.Element;

import com.magic.bean.BeanDefinition;
import com.magic.bean.support.PropertyItem;

public class PropertyElementParser extends ElementParser {
	public static final String ELEMENT_PROPERTY = "property";
	public static final String ATTRIBUTE_NAME = "name";
	public static final String ATTRIBUTE_VALUE = "value";
	public static final String ATTRIBUTE_REF = "ref";

	public PropertyElementParser(BeanDefinitionParserChain chain) {
		super(chain);
	}
	
	@Override
	public boolean parseBeanDefinition(Element ele, BeanDefinition beanDefinition) {
		if(!isTheNode(ele, ELEMENT_PROPERTY)) { // ะฃั้
			return false;
		}
		
		String name = ele.getAttribute(ATTRIBUTE_NAME);
		String value = ele.getAttribute(ATTRIBUTE_VALUE);
		String ref = ele.getAttribute(ATTRIBUTE_REF);
		
		PropertyItem propertyItem = new PropertyItem();
		propertyItem.setName(name);
		propertyItem.setValue(value);
		propertyItem.setRef(ref);
		
		beanDefinition.getPropertyList().addPropertyItem(propertyItem);
		
		return true;
	}
}
