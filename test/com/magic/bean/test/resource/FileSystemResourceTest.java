package com.magic.bean.test.resource;

import java.io.IOException;

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
	
	public void testGetInputStream() throws IOException {
		resource = new FileSystemResource("test11");
		Assert.assertTrue(resource.getInputStream()==null);
	}
	
	public void testValue() {
		Assert.assertTrue(false);
	}
}
