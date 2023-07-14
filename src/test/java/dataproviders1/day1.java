package dataproviders1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {
	@Parameters({"Uname","Pass"})
	@Test //(dataProvider="getdata")
	public void login(String name,String pass ) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/newtours");
		d.manage().window().maximize();
		d.findElement(By.linkText("Insurance Project")).click();
		Thread.sleep(3000);
		d.findElement(By.name("email")).sendKeys(name);
		d.findElement(By.name("password")).sendKeys(pass);
		d.findElement(By.name("submit")).click();
	}
	
//	@DataProvider
//	public Object[][] getdata()
//	{
//		Object[][] data= new Object[3][2];
//		//1st set data
//		data[0][0]="sekhardantla203@gmail.com";
//		data[0][1]="Sekhar@123";
//		
//		//2nd set of data
//		
//		data[1][0]="sekhardantla@gmail.com";
//		data[1][1]="12345";
//		
//		//3rd set of data
//		
//		data[2][0]="";
//		data[2][1]="";
//		
//		return data;
//		
//	}
}
