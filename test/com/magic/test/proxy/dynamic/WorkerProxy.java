package com.magic.test.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class WorkerProxy implements InvocationHandler {
	private IWorker worker = null;
	
	public Object getProxy(Worker worker) {
		this.worker = worker;
		Class clazz = worker.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object obj, Method method, Object[] args)
			throws Throwable {
		System.out.println("I prepare some gifts for customers.");
		method.invoke(worker, args);
		System.out.println("I provide good service for customers.");
		return null;
	}
}
