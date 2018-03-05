package loginn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Job extends Login{
  @Test(priority=1)
  public void f1() throws IOException, InterruptedException {
	  driver.findElement(By.xpath("//b[text()='Admin']")).click();
	  driver.findElement(By.xpath("//a[text()='Job']")).click();
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']")).click();
	  driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	  driver.findElement(By.xpath("//input[@id='jobTitle_jobTitle']")).sendKeys("Software Tester");
	  driver.findElement(By.xpath("//textarea[@id='jobTitle_jobDescription']")).sendKeys("Tester is the one who Tests the Application.");
	  driver.findElement(By.xpath("//input[@id='jobTitle_jobSpec']")).click();
	  Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\s.exe");
	  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	  Thread.sleep(4000);
	  driver.quit();
  }
}
