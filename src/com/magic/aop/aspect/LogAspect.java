package com.magic.aop.aspect;

public class LogAspect {
	public void logBegin() {
		System.out.println("******Print begin log before method execute******");
	}
	
	public void logEnds() {
		System.out.println("******Print commit log after method execute******");
	}
}
