package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class navigation {
	WebDriver driver;
@BeforeTest
public void Start() {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32(1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
}
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
	  System.out.print("This is Ajax Form Submit with Loading icon");
	  driver.findElement(By.id("title")).sendKeys("this is my Ajax");
	  driver.findElement(By.id("description")).sendKeys("In mathematics, the graph of a function f is the set of ordered pairs, where f(x) = y. In the common case where x and f(x) are real numbers, these pairs are Cartesian coordinates of points in two-dimensional space and thus form a subset of this plane");
	  driver.findElement(By.id("btn-submit")).submit();
  }
}
