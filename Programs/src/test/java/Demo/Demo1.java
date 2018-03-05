package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com");
  }
}
