package com.magic.bean;

/**
 * 对象工厂抽象类，可以获取对象
 * @author xufan
 */
public interface BeanFactory {
	Object getBean(String name);
}
