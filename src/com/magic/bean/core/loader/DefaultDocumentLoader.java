package com.magic.bean.core.loader;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.magic.bean.core.resource.Resource;
import com.magic.bean.exception.BeanDefinitionStoreException;

public class DefaultDocumentLoader implements DocumentLoader {
	@Override
	public Document loadDocument(Resource resource) throws IOException {
		InputStream inputStream = resource.getInputStream();
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();   
		documentBuilderFactory.setNamespaceAware(true); //名称空间支持
		
		DocumentBuilder builder = null;
		try {
			builder = documentBuilderFactory.newDocumentBuilder();
			return builder.parse(inputStream);
		} catch (ParserConfigurationException e) {
			throw new BeanDefinitionStoreException("");
		} catch (SAXException e) {
			throw new BeanDefinitionStoreException("");
		} 
	}
}
