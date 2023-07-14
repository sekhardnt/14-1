package Testng.selenium1;



import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day2 {
	WebDriver d;
	
	
	@Test(dependsOnMethods="B")
	public void A() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("http:www.google.com");
		String act=d.getTitle();
		SoftAssert a= new SoftAssert();
		String exp="Google";
		System.out.println("i will execute in second test Case");
		a.assertEquals(act,exp);
		a.assertFalse(false);
		a.assertTrue(false);
		System.out.println("hello");
		a.assertAll();
	}
	
	@Test
	public void B() throws InterruptedException{
		
		System.out.println("i will execute in First test Case");
	}
	
	@Test(dependsOnMethods="A")
	public void C()
	{
		System.out.println("i will execute last");
	}
	


}
