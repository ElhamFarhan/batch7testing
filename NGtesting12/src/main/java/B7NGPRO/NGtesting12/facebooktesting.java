package B7NGPRO.NGtesting12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebooktesting {
	public static WebDriver driver;
	public static void main (String[]args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Elham Farhan\\eclipse-workspace\\mavenbatch\\drivers\\chromedriver.exe");
		
	driver= new ChromeDriver();	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
	//List<WebElement>fb_field=driver.findElements(By.xpath("//*[@id='email']"));
	//if(fb_field.size()>0) {
		//System.out.println("Element is present");
	//}
	//else {
		//System.out.println("Element is not present");
	
	//}
	
	//driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
	WebDriverWait ob= new WebDriverWait(driver,20);
	ob.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='email']")));
	WebElement email_field=driver.findElement(By.xpath("//*[@id='email']"));
	email_field.sendKeys("elham.farhan@gmail.com");
	//try {
	
	//Thread.sleep(5000);
	//}catch(InterruptedException e) {
		//e.printStackTrace();
	//try {
		//WebElement email_field=driver.findElement(By.xpath("//*[@id='ema888il']"));
	//if(email_field.isDisplayed()) {
		//System.out.println("Email field is displayed");
	//}
	
	//}catch(Exception e1) {
	//	System.out.println("Exception occured,element may not be displayed");
	//}
		//try {
			//Thread.sleep(5000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	Thread.sleep(5000);
		driver.close();
	
		
	
}
}