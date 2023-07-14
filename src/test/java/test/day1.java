package test;

import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups= {"sanity","regression"})
	public void TC1()
	{
		System.out.println("TC1");
	}
	
	@Test(groups="smoke")
	public void TC2()
	{
		System.out.println("TC2");
	}
	@Test(groups="sanity")
	public void TC3()
	{
		System.out.println("TC3");
	}
	@Test(groups={"smoke","sanity"})
	public void TC4()
	{
		System.out.println("TC4");
	}
	@Test(groups="regression")
	public void TC5()
	{
		System.out.println("TC5");
	}
	

}
