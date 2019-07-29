package com.Framework.moven_moduleTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class CreateTest {
		
	@Test(priority=2)  //"
	public void avalidatecustomeraTest() {
	
	System.out.println("validatedcustomer111 created");
	}

	@Test(priority=1)  //groups="RegressionTest"
	public void avalidatecustomerTest() {
	
	System.out.println("validatedcustomer222 created");
	}
	
	@Test()  //groups="RegressionTest"
	public void abalidatecustomerTest() {
	
	System.out.println("validatedcustomer333 created");
	}
		
}
