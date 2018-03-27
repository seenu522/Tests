package demo;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class JobTitleTest extends LoginpageTest{
   WebDriver driver;
	@Test(priority=2,enabled=true)
	  public void g(){
		
		  driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']")).click();
		  driver.findElement(By.xpath("//a[text()='Job']")).click();
		  driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']")).click();
		  driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		  driver.findElement(By.xpath("//input[@id='jobTitle_jobTitle']")).sendKeys("Software Tester");
		  driver.findElement(By.xpath("//textarea[@id='jobTitle_jobDescription']")).sendKeys("Tester is the one who Tests the Application.");
		  driver.findElement(By.xpath("//input[@id='jobTitle_jobSpec']")).click();
		  //Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\s.exe");
		  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		  
}
}