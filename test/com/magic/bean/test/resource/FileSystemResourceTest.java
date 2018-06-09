package com.magic.bean.test.resource;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.magic.bean.resource.FileSystemResource;
import com.magic.bean.resource.Resource;

public class FileSystemResourceTest extends TestCase {
	private Resource resource = null;
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testPath() throws Exception {
		Resource resource = new FileSystemResource("D:/xufan/projectB2-magic-ioc/config.xml");
		Assert.assertTrue(resource.getInputStream()!=null);
		Assert.assertTrue(resource.exists());
	}
}
