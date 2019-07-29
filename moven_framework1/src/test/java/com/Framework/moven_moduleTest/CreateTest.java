package com.Framework.moven_moduleTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class CreateTest {
		
	@Test(groups="SanityTest")
	public void createcustomer() {
	System.out.println("createcustomer15555 created");	
		
	}
	
	@Test(groups="RegressionTest")
	public void createcustomeraTest() {
		
		String expected="xyz";
		String Actual= "abc";
	Reporter.log("Validating createcustomerTest");
		Assert.assertEquals(Actual, expected);
			
		
	System.out.println("createcustomer2444 created");	
	}	
}
