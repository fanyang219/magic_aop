package com.magic.bean.resource;

import java.io.IOException;
import java.io.InputStream;

public interface Resource {
	InputStream getInputStream() throws IOException;
	
	boolean exists();
}
