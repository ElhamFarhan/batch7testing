package B7NGPRO.NGtesting12;

import org.testng.annotations.Test;

import myprject2.myownproject.HomePOM;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	 public static WebDriver driver;

  @BeforeMethod
  public void beforeTest1() throws InterruptedException{
	  System.out.println("this is before test");
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Elham Farhan\\eclipse-workspace\\mavenbatch\\drivers\\chromedriver.exe");
  driver=new ChromeDriver(); 
  driver.get("https://www.facebook.com");
	//driver.get("https://www.amazon.com");
driver.manage().window().maximize();
	 Thread.sleep(5000);
}
  
 
  
//  @Test
//  public void backtoSchool()throws InterruptedException{ 
//	  
//	  System.out.println("this is  test");
//	  
//	  HomePOM ob= new  HomePOM(driver);
//		ob.backtoSchoolClick();
//	  //WebElement backtoSchool=driver.findElement(By.xpath("//*[text()='Back to School']"));
//	//  backtoSchool.click();
//	  Thread.sleep(5000);
//  }
  
  @Test (priority=1)
	 public void fbtextCase1()throws InterruptedException{
		  System.out.println("this is first test");
		  HomePOM ob= new  HomePOM(driver);
		  //ob.getfbText();
		  ob.enterEmail("elham@gmail.com");
		//ob.offtoCollegeClick();
		 // WebElement offtoCollege=driver.findElement(By.xpath("//*[text()='Off to College']"));
		  //offtoCollege.click();
		  Thread.sleep(5000);
		  ob.enterPass("bbbbb");
		  Thread.sleep(5000);
  }

  @Test (priority=2)
	 public void fbtextCase ()throws InterruptedException{
		  System.out.println("this is second test");
		  HomePOM ob= new  HomePOM(driver);
		  //ob.getfbText();
		  ob.enterEmail("fatima@gmail.com");
		//ob.offtoCollegeClick();
		 // WebElement offtoCollege=driver.findElement(By.xpath("//*[text()='Off to College']"));
		  //offtoCollege.click();
		  Thread.sleep(5000);
		  ob.enterPass("bbbbb");
		  Thread.sleep(5000);
}
	 
 @AfterMethod
  public void afterTest() {
	  System.out.println("this is after test");
  }
  public void shots() throws IOException {
  File cap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileHandler.copy(cap, new File("C:\\Users\\Elham Farhan\\eclipse-workspace\\NGtesting12\\PICTURES\\1.png"));
}
}