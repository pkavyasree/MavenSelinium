package com.Framework.moven_moduleTest;

import org.testng.annotations.Test;

public class MyTest {

	@Test(groups="SanityTest")
	public void my1Test() {
		System.out.println("MyTest: Sanity1");
	}
	@Test(groups="SanityTest")
	public void my2Test() {
		System.out.println("MyTest: Sanity2");
	}
	
}
