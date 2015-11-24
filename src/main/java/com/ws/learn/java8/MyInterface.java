package com.ws.learn.java8;

@FunctionalInterface
public interface MyInterface<I, O> {
	
	O process1(I i);
	
	default void process2() {
		System.out.println("This is process2()");
	}
	
	static void process3() {
		System.out.println("This is process3()");
	}

}
