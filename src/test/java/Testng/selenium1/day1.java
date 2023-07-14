package Testng.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {

	@Test
	public void google() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http:www.google.com");
		d.manage().window().maximize();
		d.findElement(By.name("q")).sendKeys("sekhar reddy d",Keys.ENTER);
		System.out.println(d.getTitle());
		Thread.sleep(2000);
		d.close();
		
	}
	@Test(groups="sanity")
	public void Facebook() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.name("email")).sendKeys("sekhar reddy d",Keys.ENTER);
		System.out.println(d.getTitle());
		Thread.sleep(2000);
		d.close();
		
	}
	
	@Test(groups="smoke")
	public void tc()
	{
		System.out.println("tc");
	}
	
}
