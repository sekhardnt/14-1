package test;


import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class day3 {

	@Test
	public void TC1()
	{
		System.out.println("TC1");
	}
	
	@Test
	public void TC2() throws InterruptedException
	{
		System.out.println("TC2");
		Thread.sleep(6000);
		Assertion assertion = new Assertion();
		assertion.assertTrue(true);
		
	}
	
	@Test(dependsOnMethods="TC2")
	public void TC3()
	{
		System.out.println("TC3");
	}
	
	@Test
	public void TC4()
	{
		System.out.println("TC4");
	}
	

}
