package com.Framework.moven_moduleTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MynTest {

	@Test
	 public void myCustTest() {
	String exp="xyz";
	String act= "abc";
	
Reporter.log("Validating createcustomerTest");
	Assert.assertEquals(act, exp);
		
	
System.out.println("createcustomer2444 created");
}
}