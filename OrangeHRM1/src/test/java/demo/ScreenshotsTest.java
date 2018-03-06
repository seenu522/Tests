package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ScreenshotsTest extends LoginpageTest{
 
  public void takescreenshot(String str) throws IOException {
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// screenshot will be captured
		FileUtils.copyFile(f, new File("D:\\SELENIUM WORKSPACE 2017\\FAST TRACK\\SCREENSHOTS\\"+str+".png"));
  }
  @Test
  public void f1() throws IOException {
	  driver.findElement(By.xpath("//b[text()='Leave']")).click();
	  takescreenshot("Admin Link");
  }
}

