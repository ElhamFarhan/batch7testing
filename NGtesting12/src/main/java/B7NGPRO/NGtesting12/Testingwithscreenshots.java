package B7NGPRO.NGtesting12;
import java.io.IOException;

import org.testng.annotations.Test;

import myprject2.myownproject.HomePOM;

public class  Testingwithscreenshots extends baseclass{
    

  

    @Test//(priority = 1)
    public void fbtextTestCase1() throws InterruptedException, IOException {
        System.out.println("This is test 1");
        HomePOM ob = new HomePOM(driver);
        ob.enterEmail("elham.farhan@gmail.com");
        Thread.sleep(5000);
      ob.enterPass("bbbbbbb");
      shots_withdate();
        Thread.sleep(5000);
        
    }

   @Test(priority = 2)
  public void fbtextTestCase2() throws InterruptedException, IOException {
        System.out.println("This is test 2");
        HomePOM ob = new HomePOM(driver);
       ob.enterEmail("def@yahoo");
       Thread.sleep(5000);
       ob.enterPass("nnnnn");
       shots_withdate();
        Thread.sleep(5000);
    }

}