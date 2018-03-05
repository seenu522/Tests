package Demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PayScaleTest extends LoginTest{
  @Test(priority=3)
  public void f1() throws InterruptedException {
	  driver.findElement(By.xpath("//b[text()='Admin']")).click();
	  driver.findElement(By.xpath("//a[text()='Job']")).click();
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewPayGrades']")).click();
	  driver.findElement(By.xpath("//a[text()='wexos']")).click();
	  driver.findElement(By.xpath("//input[@id='btnAddCurrency']")).click();
	  driver.findElement(By.xpath("//input[@id='payGradeCurrency_currencyName']")).sendKeys("rup");
	  driver.findElement(By.xpath("(//strong[text()='Rup'])[2]")).click();
	  driver.findElement(By.xpath("//input[@id='payGradeCurrency_minSalary']")).sendKeys("25000");
	  driver.findElement(By.xpath("//input[@id='payGradeCurrency_maxSalary']")).sendKeys("40000");
	  driver.findElement(By.xpath("//input[@id='btnSaveCurrency']")).click();
	  Thread.sleep(4000);
	  driver.quit();
  }
}
