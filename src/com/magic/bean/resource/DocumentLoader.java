package com.magic.bean.resource;

import java.io.IOException;

import org.w3c.dom.Document;

/**
 * xml文件加载类
 * 负责resource->Document
 * @author xufan
 */
public interface DocumentLoader {
	Document loadDocument(Resource resource) throws IOException;
}
