package loginn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo extends Login{
  @Test(priority=1)
  public void f5() 
  {
	  driver.findElement(By.linkText("Admin")).click();
	  WebElement ele=driver.findElement(By.id("menu_admin_Job"));
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).build().perform();
	  driver.findElement(By.id("menu_admin_employmentStatus")).click();
	  
  }
}
