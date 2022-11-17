package home;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import reporting.Logs;
import utils.retry.RetryClass;

public class HomeTest2 extends BaseClass{

	@Test(priority = 1, testName = "This is priority1 comes after priority 0, no priority")
	public void homeQuote1() {
		Logs.log("This is priority 1");
	}
	
	@Test(priority = 0, groups = {"home", "priority"})
	public void homeQuote2() {
		Logs.log("This is priority 0");
	}
	
	@Test (priority = 2, groups = {"home", "priority"})
	public void homeQuote3() {
		Logs.log("This is  priority 2");
	}
	
	@Test 
	public void homeQuote4() {
		Logs.log("This is  no priority");
	}
	
	@Test ( groups = "home", dependsOnGroups = "home",alwaysRun = true)
	public void homeQuote5() {
		Logs.log("This is  no priority 2");
	}
	

	@Test (enabled=false,groups = {"home", "noPriority"})
	public void homeQuote6() {
		Logs.log("This is  no priority 3");
	}
	
	@Test ( groups = "home", dependsOnGroups = "homeQuote6",ignoreMissingDependencies = true)
	public void homeQuot7() {
		Logs.log("This is  no priority 4");
	}
	/*
	@Test(groups = "home", dependsOnGroups = "home", alwaysRun = true, retryAnalyzer = RetryClass.class,ignoreMissingDependencies = true)
	public void homeQuote8() {
		Logs.log("No priority 5");
		Assert.fail();
	}
	*/
	
	@Test(groups = "home", dependsOnMethods = "homeQuote3", ignoreMissingDependencies = true)
	public void aHomeTest() {
		Logs.log("No priority 6");
	}
	
	@Test(priority = 100, enabled = false)
	public void bHomeTest() {
		Logs.log("This is priority 100");
	}

}
