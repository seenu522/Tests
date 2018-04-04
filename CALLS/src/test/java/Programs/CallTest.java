package Programs;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CallTest extends LoginTest{

  @Test(priority=1)
  public void ss() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.switchTo().frame("mainpanel");
	  driver.findElement(By.xpath("//a[@title='Call']")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.id("f_trigger_c_schedule")).click();
	  driver.findElement(By.xpath("(//div[text()='›'])")).click();
	  driver.findElement(By.xpath("//td[text()='29']")).click();
	 WebElement ele1= driver.findElement(By.xpath("(//select[@class='select'])[3]"));
	 ele1.click();
	 Select sel=new Select(ele1);
	 Thread.sleep(1000);
	 sel.selectByIndex(0);
	 driver.findElement(By.xpath("(//select[@class='select'])[4]")).sendKeys("30 Minutes");
	 driver.findElement(By.xpath("(//select[@class='select'])[5]")).sendKeys("Via Text Message");
	 driver.findElement(By.xpath("(//input[@class='select'])[2]")).sendKeys("hiii");
	 driver.findElement(By.xpath("(//input[@value='Lookup'])[1]")).click();
	 
	 Set<String> aa=driver.getWindowHandles();
	 Iterator<String> bb=aa.iterator();
	 String parentId=bb.next();
	 String childId=bb.next();
	 driver.switchTo().window(childId);
	 
	 driver.findElement(By.xpath("//input[@name='search']")).sendKeys("wexos");
	 driver.findElement(By.xpath("(//input[@class='button'])[2]")).click();
	 Thread.sleep(2000);
	 driver.close();
	 driver.switchTo().window(parentId);
//	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.switchTo().frame("mainpanel");
	 driver.findElement(By.xpath("//input[@name='contact_lookup']")).sendKeys("wexos");
	 driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys("wexos");
	 WebElement ele2=driver.findElement(By.xpath("(//select[@name='flag'])[1]"));
	 ele2.click();
	 Select sel1=new Select(ele2);
	 Thread.sleep(2000);
	 sel1.selectByIndex(2);
	 driver.findElement(By.id("f_trigger_c_start_time")).click();
	 driver.findElement(By.xpath("(//div[text()='›'])[2]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//td[text()='9'])[8]")).click();
	 driver.findElement(By.xpath("//select[@name=\"end_time_hour\"]")).sendKeys("4");
	 
  }
}
  