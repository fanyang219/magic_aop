package com.magic.bean.test.resource;

import junit.framework.TestCase;

import com.magic.bean.resource.ClassPathResource;
import com.magic.bean.resource.DefaultResourceLoader;
import com.magic.bean.resource.FileSystemResource;
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
	
	public void testLoadResource() throws Exception {
		resourceLoader = new DefaultResourceLoader();
		Resource classPathResource = resourceLoader.getResource(
				"classpath:com/magic/bean/test/config.xml");
		assertTrue(classPathResource!=null
				&& (classPathResource instanceof ClassPathResource));
		assertTrue(classPathResource.getInputStream()!=null);
		assertTrue(classPathResource.exists());
		
		Resource fileSystemResource = resourceLoader.getResource(
				"file:D:/xufan/projectB2-magic-ioc/config.xml");
		assertTrue(fileSystemResource!=null
				&& (fileSystemResource instanceof FileSystemResource));
		assertTrue(fileSystemResource.getInputStream()!=null);
		assertTrue(fileSystemResource.exists());
	}
}
