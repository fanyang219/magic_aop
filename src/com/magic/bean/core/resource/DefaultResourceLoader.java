package com.magic.bean.core.resource;

public class DefaultResourceLoader implements ResourceLoader {
	private static final String CLASS_PATH_PREFIX = "classpath:";
	private static final String FILE_PATH_PREFIX = "file:";
	
	@Override
	public Resource getResource(String path) {
		// TODO Auto-generated method stub
		if(path.startsWith(CLASS_PATH_PREFIX)) {
			return new ClassPathResource(path.replace(CLASS_PATH_PREFIX, ""));
		} else if(path.startsWith(FILE_PATH_PREFIX)) {
			return new FileSystemResource(path.replace(FILE_PATH_PREFIX, ""));
		}
		return null;
	}
}
