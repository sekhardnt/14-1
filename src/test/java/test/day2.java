package test;

import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups="regression")
	public void TC6()
	{
		System.out.println("TC6");
		
	}
	
	@Test
	public void TC7()
	{
		System.out.println("TC7");
	}
	
	@Test(groups="smoke")
	public void TC8()
	{
		System.out.println("TC8");
	}

}
