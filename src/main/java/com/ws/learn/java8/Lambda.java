package com.ws.learn.java8;

public class Lambda {
	
	public void run() {
		Runnable runnable = () -> System.out.println("Hello World");
		runnable.run();
	}

}
