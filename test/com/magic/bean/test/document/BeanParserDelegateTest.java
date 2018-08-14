package com.magic.bean.test.document;

import junit.framework.TestCase;

import org.w3c.dom.Document;

import com.magic.bean.core.XmlBeanDefinitionReader;
import com.magic.bean.core.XmlReaderContext;
import com.magic.bean.core.loader.DefaultDocumentLoader;
import com.magic.bean.core.loader.DocumentLoader;
import com.magic.bean.core.reader.DefaultDocumentReader;
import com.magic.bean.core.reader.DocumentReader;
import com.magic.bean.core.resource.ClassPathResource;
import com.magic.bean.core.resource.Resource;

public class BeanParserDelegateTest extends TestCase {
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
//	public void testDefaultNamespace() throws Exception {
//		Resource configResource = new ClassPathResource("com/magic/bean/test/simple_config.xml");
//		
//		DocumentLoader documentLoader = new DefaultDocumentLoader();
//		Document document = documentLoader.loadDocument(configResource);
//		Element rootElement = document.getDocumentElement();
//		
//		assertTrue(delegate.isDefaultNamespace(rootElement));
//	}
//	
//	public void testInvalidDefaultNamespace() throws Exception {
//		Resource configResource = new ClassPathResource("com/magic/bean/test/invalid_config.xml");
//		
//		DocumentLoader documentLoader = new DefaultDocumentLoader();
//		Document document = documentLoader.loadDocument(configResource);
//		Element rootElement = document.getDocumentElement();
//		
//		assertFalse(delegate.isDefaultNamespace(rootElement));
//	}
	
	public void testParseBeanDefinition() throws Exception {
		XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(null);
		
		Resource configResource = new ClassPathResource("com/magic/bean/test/config/bean_property.xml");
		
		DocumentLoader documentLoader = new DefaultDocumentLoader();
		Document document = documentLoader.loadDocument(configResource);
		
		DocumentReader documentReader = new DefaultDocumentReader();
		documentReader.readDocument(document, new XmlReaderContext(xmlReader));
		
		// ÅÐ¶¨BeanDefinitionÊý¾Ý
	}
}
