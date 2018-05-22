package com.magic.test.proxy.dynamic;

public class DynamicTest {
	public static void main(String args[]) {
		IWorker proxy = (IWorker) new WorkerProxy().getProxy(new Worker());
		proxy.work();
	}
}
