package com.magic.bean.core.reader;

import org.w3c.dom.Document;

import com.magic.bean.core.XmlReaderContext;

public interface DocumentReader {
	public void readDocument(Document document, XmlReaderContext context);
}
