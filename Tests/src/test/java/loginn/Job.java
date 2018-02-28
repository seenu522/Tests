package loginn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Job extends Login {
	 @Test(priority=2)
	  public void f2() throws InterruptedException {
		  driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']")).click();
		  WebElement rec=driver.findElement(By.xpath("//select[@id='candidateSearch_jobTitle']"));
		  Select sel=new Select(rec);
		  sel.selectByValue("Flash developer");
		  WebElement rec1=driver.findElement(By.xpath("//*[@id='candidateSearch_status']"));
		  Select sel1=new Select(rec1);
		  sel1.selectByValue("SHORTLISTED");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(".//*[@id='frmSrchCandidates']/fieldset/ol/li[7]/img")).click();
		  while(true) 
			  try {
				 driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]")).click();
				 driver.findElement(By.xpath("//option[text()='May']")).click();
				 driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")).click();
				 driver.findElement(By.xpath("//option[text()='2019']")).click();
			     driver.findElement(By.xpath("//a[text()='3']")).click();
			     driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
			     driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]")).click();
			     driver.findElement(By.xpath("//option[text()='Jun']")).click();
			     driver.findElement(By.xpath("//option[text()='2019']")).click();
			     driver.findElement(By.xpath("//a[text()='9']")).click();
				 break;
				 
			 	  }
		  catch(Exception e) {
			  
		  }
		  		  
	  }
}
