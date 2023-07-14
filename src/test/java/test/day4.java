package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4 {

	@Test
	public void pp()
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.google.com");
		String act=d.getTitle();
		String exp="Googl";
		Assert.assertEquals(act, exp);
	}
}
