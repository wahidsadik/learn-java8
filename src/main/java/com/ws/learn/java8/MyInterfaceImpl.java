package com.ws.learn.java8;

public class MyInterfaceImpl implements MyInterface<Integer, String>{

	@Override
	public String process1(Integer i) {
		return i.toString();
	}

}
