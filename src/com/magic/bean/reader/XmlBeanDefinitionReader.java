package com.magic.bean.reader;

import java.io.IOException;

import org.w3c.dom.Document;

import com.magic.bean.resource.DefaultDocumentLoader;
import com.magic.bean.resource.DocumentLoader;
import com.magic.bean.resource.Resource;

public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {
	private DocumentLoader documentLoader = new DefaultDocumentLoader();

	@Override
	public void loadBeanDefinitions(Resource resource) throws IOException {
		Document document = documentLoader.loadDocument(resource);
		
		// TODO ½âÎö
	}
}
