package com.magic.test.proxy.simple;

public class EventProxy implements ILivePart {
	private ILivePart part = new EventPart();
	
	public EventProxy() {}
	
	public void run() {
		System.out.println("You can handle something before");
		part.run();
		System.out.println("You can handle something after");
	}
}
