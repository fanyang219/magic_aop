package com.magic.bean.test.resource;

import junit.framework.TestCase;

import com.magic.bean.resource.ClassPathResource;
import com.magic.bean.resource.DefaultResourceLoader;
import com.magic.bean.resource.Resource;
import com.magic.bean.resource.ResourceLoader;

public class ResourceLoaderTest extends TestCase {
	private ResourceLoader resourceLoader = null;
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testLoadResource() {
		resourceLoader = new DefaultResourceLoader();
		Resource classPathResource = resourceLoader.getResource(
				"com/magic/bean/test/config.xml");
		assertTrue(classPathResource!=null
				&& (classPathResource instanceof ClassPathResource));
		
		Resource fileSystemResource = resourceLoader.getResource(
				"D:/xufan/projectB2-magic-ioc/config.xml");
		assertTrue(fileSystemResource!=null
				&& (fileSystemResource instanceof ClassPathResource));
	}
}
