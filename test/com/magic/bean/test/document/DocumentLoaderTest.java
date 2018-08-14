package com.magic.bean.test.document;

import junit.framework.TestCase;

import org.w3c.dom.Document;

import com.magic.bean.core.loader.DefaultDocumentLoader;
import com.magic.bean.core.loader.DocumentLoader;
import com.magic.bean.core.resource.ClassPathResource;
import com.magic.bean.core.resource.Resource;
import com.magic.bean.test.Constants;

public class DocumentLoaderTest extends TestCase {
	private DocumentLoader documentLoader = null;
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testLoadDocument() throws Exception {
		Resource configResource = new ClassPathResource(Constants.CLASS_PATH_SIMPLE_CONFIG);
		
		documentLoader = new DefaultDocumentLoader();
		Document document = documentLoader.loadDocument(configResource);
		assertTrue(document != null);
	}
}
