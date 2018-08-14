package com.magic.bean.core;

import java.io.IOException;

import org.w3c.dom.Document;

import com.magic.bean.AbstractBeanDefinitionReader;
import com.magic.bean.BeanDefinitionRegistry;
import com.magic.bean.core.loader.DefaultDocumentLoader;
import com.magic.bean.core.loader.DocumentLoader;
import com.magic.bean.core.reader.DefaultDocumentReader;
import com.magic.bean.core.reader.DocumentReader;
import com.magic.bean.core.resource.Resource;

public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {
	private DocumentLoader documentLoader = new DefaultDocumentLoader();
	private DocumentReader documentReader = new DefaultDocumentReader();

	public XmlBeanDefinitionReader(BeanDefinitionRegistry registry) {
		super(registry);
	}
	
	@Override
	public void loadBeanDefinitions(Resource resource) throws IOException {
		// 1 º”‘ÿdocument
		Document document = documentLoader.loadDocument(resource);
		
		// 2 Ω‚Œˆdocument
		documentReader.readDocument(document, createReaderContext());
	}
	
	private XmlReaderContext createReaderContext() {
		return new XmlReaderContext(this);
	}
}
