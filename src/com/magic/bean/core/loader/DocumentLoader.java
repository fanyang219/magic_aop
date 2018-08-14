package com.magic.bean.core.loader;

import java.io.IOException;

import org.w3c.dom.Document;

import com.magic.bean.core.resource.Resource;

/**
 * xml文件加载类
 * 负责resource->Document
 * @author xufan
 */
public interface DocumentLoader {
	Document loadDocument(Resource resource) throws IOException;
}
