package com.ws.learn.java8;

import org.junit.Before;
import org.junit.Test;

public class LambdaTest {

	private Lambda undertest;
	
	@Before
	public void setup() {
		undertest = new Lambda();
	}
	
	@Test
	public void testRun() {
		undertest.run();
		assert(true);
	}

}
