package loginn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1Test {
  @Test
  public void f() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	  driver.findElement(By.xpath("//input[@value='Register with us']")).click();
	  driver.findElement(By.xpath("//button[text()='I am a Fresher']")).click();
	  //driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("syed");
	  //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sye2d@wexos.in");
	  //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("wexos123");
	  //driver.findElement(By.xpath("//input[@name='number']")).sendKeys("8562325212");
	  //driver.findElement(By.xpath("//input[@name='city']")).click();
	 // driver.findElement(By.xpath("(//span[text()='Hyderabad / Secunderabad'])[1]")).click();
	  driver.findElement(By.xpath("//span[@class='uploadCV']")).click();
	  Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\sami.exe");
	  Thread.sleep(300000);
	  //driver.findElement(By.xpath("//button[@class='primary-btn']")).click();
	  Thread.sleep(4000);
	  driver.quit();
  }
}
