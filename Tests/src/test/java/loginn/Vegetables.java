package loginn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vegetables {
	
  @Test(groups="Fruits")
  public void Apple() {
	  System.out.println("i am apple");
  }
  @Test(groups="Fruits")
  public void Grapes() {
	  System.out.println("Grapes");
  }
  @Test(groups="Vegetable")
  public void tomato() {
	  System.out.println("Tomato");
  }
  @Test(groups="Raja")
  public void raj() {
	  System.out.println("Raja is mad");
  }
}
