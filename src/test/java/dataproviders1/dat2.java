package dataproviders1;

import org.testng.annotations.*;

public class dat2 {
	@Parameters("Uname")
	@Test
	public void test1(String name)
	{
		System.out.println(name);
	}

}
