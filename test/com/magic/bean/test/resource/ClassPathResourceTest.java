package com.magic.bean.test.resource;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.magic.bean.resource.ClassPathResource;
import com.magic.bean.resource.Resource;
import com.magic.bean.test.User;
import com.magic.bean.test.company.Worker;

public class ClassPathResourceTest extends TestCase {
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testPath() throws Exception {
		Resource resource = new ClassPathResource("com/magic/bean/test/config.xml");
		Assert.assertTrue(resource.getInputStream()!=null);
		Assert.assertTrue(resource.exists());
		
	    resource = new ClassPathResource("com/magic/bean/test/company/company.xml");
		Assert.assertTrue(resource.getInputStream()!=null);
		Assert.assertTrue(resource.exists());
	}
	
	public void testPathWithClass() throws Exception {
		// 同级目录
		Resource resource = new ClassPathResource("config.xml", User.class);
		Assert.assertTrue(resource.getInputStream()!=null);
		Assert.assertTrue(resource.exists());
		
		// 子目录
		resource = new ClassPathResource("company/company.xml", User.class);
		Assert.assertTrue(resource.getInputStream()!=null);
		Assert.assertTrue(resource.exists());
		
		// 不同级，也不是子目录
		resource = new ClassPathResource("/com/magic/bean/test/config.xml", Worker.class);
		Assert.assertTrue(resource.getInputStream()!=null);
		Assert.assertTrue(resource.exists());
	}
}
