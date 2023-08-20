package B7NGPRO.NGtesting12;

import org.testng.annotations.Test;

import myprject2.myownproject.HomePOM;

import org.testng.annotations.DataProvider;

public class NewTestDataProvider extends  baseclass {
  @Test(dataProvider = "dp")
  public void f(String email, String pass) throws InterruptedException {
	  HomePOM ob = new HomePOM(driver);
      ob.enterEmail(email);
      Thread.sleep(5000);
    ob.enterPass(pass);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "elham.farhan@gmail.com", "bbbbbbb" },
      new Object[] { "abc@yahoo.com", "nnnnnn" },
      new Object[] { "mbn@yahoo.com", "hhhnnn" },
    };
  }
}
