package com.magic.bean.core.reader;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.magic.bean.BeanDefinition;
import com.magic.bean.core.XmlReaderContext;
import com.magic.bean.core.reader.parser.BeanDefinitionParserChain;
import com.magic.bean.core.reader.parser.BeanElementParser;
import com.magic.bean.core.reader.parser.PropertyElementParser;

public class DefaultDocumentReader implements DocumentReader {
	private BeanDefinitionParserChain chain = new BeanDefinitionParserChain();
	
	public DefaultDocumentReader() {
		register();
	}
	
	private void register() {
		chain.register(new BeanElementParser(chain));
		chain.register(new PropertyElementParser(chain));
	}
	
	@Override
	public void readDocument(Document document, XmlReaderContext context) {
		Element rootElement = document.getDocumentElement();
		readElement(rootElement, context);
	}
	
	public void readElement(Element root, XmlReaderContext context) {
		NodeList nodeList = root.getChildNodes();
		if(nodeList.getLength()<=0) { // 没有子节点，返回
			return;
		}
		
		for(int index=0; index<nodeList.getLength(); index++) {
			Node node = nodeList.item(index);
			if(node instanceof Element) {
				Element ele = (Element) node;
				chain.reset();
				// 解析当前节点配置
				BeanDefinition beanDefinition = chain.parseBeanDefinition(ele);
				// 注册当前节点
				if(context.getRegistry()!=null) {
					context.getRegistry().registerBeanDefinition(
							beanDefinition.getName(), beanDefinition);
				}
				// 解析子节点配置
				readElement(ele, context);
			}
		}
	}
}
