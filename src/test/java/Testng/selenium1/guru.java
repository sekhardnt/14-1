package Testng.selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class guru {
	WebDriver d;
	
	@Test
	public void opening_browser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours");
		d.manage().window().maximize();
		d.findElement(By.linkText("Insurance Project")).click();
		Thread.sleep(3000);
	}
	
	@Test
	public void login()
	{
		d.findElement(By.name("email")).sendKeys("sekhardantla203@gmail.com");
		d.findElement(By.name("password")).sendKeys("Sekhar@123");
		d.findElement(By.name("submit")).click();
	}
	@Test
	public void verifylogin()
	{
		System.out.println(d.getTitle());
	}
	
	@Test 
	public void naviagteedit()
	{
		d.findElement(By.id("ui-id-5")).click();
	}
	
	@Test
	public void verifyedit()
	{
		System.out.println(d.getTitle());
	}
}
