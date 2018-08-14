package com.magic.bean.core.reader.parser;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import com.magic.bean.BeanDefinition;
import com.magic.bean.support.CustomBeanDefinition;

/**
 * 解析责任链，类似工厂的流水线
 * @author xufan
 */
public class BeanDefinitionParserChain {
	private List<BeanDefinitionParser> parserList = new ArrayList<BeanDefinitionParser>();

	private int position = 0;
	
	private BeanDefinition beanDefinition;
	
	public BeanDefinition parseBeanDefinition(Element ele) {
		if(parserList.size()<=0) {
			return beanDefinition;
		}
		
		if(beanDefinition==null) {
			beanDefinition = createBeanDefinition();
		}
		
		BeanDefinitionParser parser = parserList.get(position);
		position++;
		parser.parseBeanDefinition(ele);
		
		return beanDefinition;
	}
	
	public void register(BeanDefinitionParser parser) {
		parserList.add(parser);
	}
	
	public void reset() {
		position = 0;
	}
	
	protected BeanDefinition createBeanDefinition() {
		BeanDefinition beanDefinition = new CustomBeanDefinition();
		return beanDefinition;
	}

	public BeanDefinition getBeanDefinition() {
		return beanDefinition;
	}
}
