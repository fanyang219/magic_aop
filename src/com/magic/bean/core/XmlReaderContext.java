package com.magic.bean.core;

import com.magic.bean.BeanDefinitionRegistry;

public class XmlReaderContext {
	private XmlBeanDefinitionReader reader;
	
	public XmlReaderContext(XmlBeanDefinitionReader reader) {
		this.reader = reader;
	}
	
	public BeanDefinitionRegistry getRegistry() {
		return reader.getRegistry();
	}
}
