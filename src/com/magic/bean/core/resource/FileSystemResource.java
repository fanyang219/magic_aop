package com.magic.bean.core.resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class FileSystemResource extends AbstractResource {
	private String path = "";
	
	public FileSystemResource(String path) {
		this.path = path;
	}
	
	@Override
	public InputStream getInputStream() throws IOException {
		return Files.newInputStream(getFile().toPath());
	}

	@Override
	public boolean exists() {
		return getFile().exists();
	}
	
	private File getFile() {
		return new File(path);
	}
}
