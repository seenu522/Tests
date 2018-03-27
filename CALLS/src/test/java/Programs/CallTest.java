package Programs;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CallTest extends LoginTest{

  @Test(priority=1)
  public void ss() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.switchTo().frame("mainpanel");
	  driver.findElement(By.xpath("//a[@title='Call']")).click();
	  driver.findElement(By.xpath("//*[@id='f_trigger_c_schedule']")).click();
	 // driver.findElement(By.xpath("//img[@id='f_trigger_c_schedule']")).click();
  }
}
