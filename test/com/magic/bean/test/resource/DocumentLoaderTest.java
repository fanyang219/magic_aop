package com.magic.bean.test.resource;

import junit.framework.TestCase;

import org.w3c.dom.Document;

import com.magic.bean.resource.ClassPathResource;
import com.magic.bean.resource.DefaultDocumentLoader;
import com.magic.bean.resource.DocumentLoader;
import com.magic.bean.resource.Resource;

public class DocumentLoaderTest extends TestCase {
	private DocumentLoader documentLoader = null;
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testLoadDocument() throws Exception {
		Resource configResource = new ClassPathResource("com/magic/bean/test/config.xml");
		
		documentLoader = new DefaultDocumentLoader();
		Document document = documentLoader.loadDocument(configResource);
		System.out.println("flag:"+(document!=null));
		assertTrue(document != null);
	}
}
