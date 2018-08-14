package com.magic.bean.core.reader.parser;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.magic.bean.BeanDefinition;

public abstract class ElementParser implements BeanDefinitionParser {
	private BeanDefinitionParserChain chain;
	
	public ElementParser(BeanDefinitionParserChain chain) {
		this.chain = chain;
	}
	
	@Override
	public void parseBeanDefinition(Element ele) {
		boolean flag = parseBeanDefinition(ele, chain.getBeanDefinition());
		if(!flag) { // 未处理，则继续
			chain.parseBeanDefinition(ele);
		}
	}

	public abstract boolean parseBeanDefinition(Element ele, BeanDefinition beanDefinition);

	public boolean isTheNode(Node node, String nodeName) {
		return nodeName.equals(node.getNodeName()) || nodeName.equals(node.getLocalName());
	}
}
