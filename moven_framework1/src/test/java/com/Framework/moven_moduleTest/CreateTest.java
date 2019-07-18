package com.Framework.moven_moduleTest;
import org.testng.annotations.Test;
public class CreateTest {
		
	@Test(groups="SanityTest")
	public void createcustomer() {
	System.out.println("createcustomer1 created");	
		
	}
	
	@Test(groups="RegressionTest")
	public void createcustomerTest() {
	System.out.println("createcustomer2 created");	
	}	
}
