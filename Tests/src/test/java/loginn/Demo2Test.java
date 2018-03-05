package loginn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2Test {
  @Test
  public void f() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.freepdfconvert.com/");
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@id='clientUpload']")).click();
	  Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\ss.exe");
	  Thread.sleep(4000);
	  driver.quit();
  }
}
