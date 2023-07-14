package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day5 {

	@Test(invocationTimeOut=5000)
	public void A() throws InterruptedException
	{
		System.out.println("A");
		Thread.sleep(5000);
	}
	
	@Test(invocationCount=5)
	public void B()
	{
		System.out.println("B");
	}
	
	@Test(dependsOnMethods="A",alwaysRun=true)
	public void C()
	{
		System.out.println("C");
	}
}
