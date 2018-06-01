package com.magic.bean.resource;

import java.io.InputStream;

public class ClassPathResource extends AbstractResource {
	private String path = "";
	
	public ClassPathResource(String path) {
		this.path = path;
	}
	
	@Override
	public InputStream getInputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}
}
