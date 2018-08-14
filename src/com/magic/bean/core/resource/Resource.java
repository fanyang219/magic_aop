package com.magic.bean.core.resource;

import java.io.IOException;
import java.io.InputStream;

public interface Resource {
	InputStream getInputStream() throws IOException;
	
	boolean exists();
}
