package com.ws.learn.java8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyInterfaceImplTest {

	private MyInterfaceImpl undertest;
	
	@Before
	public void setUp() throws Exception {
		undertest = new MyInterfaceImpl();
	}

	@Test
	public void testProcess1() {
		undertest.process1(new Integer(10));
	}

	@Test
	public void testProcess2() {
		undertest.process2();
	}

	@Test
	public void testProcess3() {
		MyInterface.process3();
	}

}
