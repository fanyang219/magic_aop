package com.magic.test.proxy.dynamic;

public class Worker implements IWorker {
	@Override
	public void work() {
		System.out.println("I produce basic product in factory.");
	}
}
