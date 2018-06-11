package com.magic.bean.exception;

public class BeanDefinitionStoreException extends BeanException {
	public BeanDefinitionStoreException(String msg) {
		super(msg);
	}
	
	public BeanDefinitionStoreException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
