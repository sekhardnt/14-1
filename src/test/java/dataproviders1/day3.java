package dataproviders1;

import org.testng.annotations.*;

public class day3 {
	
	@Test(dataProvider="getdata")
	public void ts(Integer s)
	{
		System.out.println(s);
		
	}
	
	@DataProvider
	public Integer[] getdata()
	{
		Integer[] a=new Integer[]{1,2,3};
		return a;
	}

}
