package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CallTest extends LoginTest{

  @Test(priority=1)
  public void ss() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.switchTo().frame("mainpanel");
	  driver.findElement(By.xpath("//a[@title='Call']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//img[@id='f_trigger_c_schedule']")).click();
	  driver.findElement(By.xpath("(//div[text()='›'])")).click();
	  driver.findElement(By.xpath("//td[text()='29']")).click();
	 WebElement ele1= driver.findElement(By.xpath("(//select[@class='select'])[3]"));
	 ele1.click();
	 Select sel=new Select(ele1);
	 Thread.sleep(1000);
	 sel.selectByIndex(0);
	 driver.findElement(By.xpath("(//select[@class='select'])[4]")).sendKeys("30 Minutes");
	 driver.findElement(By.xpath("(//select[@class='select'])[5]")).click();
	 
  }
}
