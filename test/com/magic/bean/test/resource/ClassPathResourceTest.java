package com.magic.bean.test.resource;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.magic.bean.core.resource.ClassPathResource;
import com.magic.bean.core.resource.Resource;
import com.magic.bean.test.Constants;
import com.magic.bean.test.config.User;

public class ClassPathResourceTest extends TestCase {
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testPath() throws Exception {
		Resource resource = new ClassPathResource(Constants.CLASS_PATH_SIMPLE_CONFIG);
		Assert.assertTrue(resource.getInputStream()!=null);
		Assert.assertTrue(resource.exists());
		
	    resource = new ClassPathResource("com/magic/bean/test/company/company.xml");
		Assert.assertTrue(resource.getInputStream()!=null);
		Assert.assertTrue(resource.exists());
	}
	
	public void testPathWithClass() throws Exception {
		// 同级目录
		Resource resource = new ClassPathResource("simple_config.xml", User.class);
		Assert.assertTrue(resource.getInputStream()!=null);
		Assert.assertTrue(resource.exists());
		
		// 子目录
		resource = new ClassPathResource("company/company.xml", User.class);
		Assert.assertTrue(resource.getInputStream()!=null);
		Assert.assertTrue(resource.exists());
	}
}
