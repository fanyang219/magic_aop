package com.magic.bean.core.resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ClassPathResource extends AbstractResource {
	private String path = "";
	private Class clazz = null;
	
	public ClassPathResource(String path) {
		this(path, (Class) null);
	}
	
	public ClassPathResource(String path, Class clazz) {
		this.path = path;
		this.clazz = clazz;
	}
	
	@Override
	public InputStream getInputStream() throws IOException {
		InputStream inputStream = null;
		if(clazz!=null) {
			inputStream = clazz.getResourceAsStream(path);
		} else {
			inputStream = ClassLoader.getSystemResourceAsStream(path);
		}
		
		if(inputStream==null) {
			throw new FileNotFoundException("Class path resource not found, path:"+path);
		}
		
		return inputStream;
	}

	@Override
	public boolean exists() {
		return getURL() != null;
	}
	
	private URL getURL() {
		if(clazz!=null) {
			return clazz.getResource(path);
		} else {
			return ClassLoader.getSystemResource(path);
		}
	}
}
