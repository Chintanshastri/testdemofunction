package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demoproject {
	WebDriver driver;
@BeforeTest
public void Start() {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32(1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
}
	/*
@Test(priority = 2)
  public void forms() {
	driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
  driver.findElement(By.name("first_name")).sendKeys("rahul");
  driver.findElement(By.name("last_name")).sendKeys("data");
  driver.findElement(By.name("email")).sendKeys("rahul@data.com");
  driver.findElement(By.name("phone")).sendKeys("1234567890");
  driver.findElement(By.name("address")).sendKeys("B-12 address data set");
  driver.findElement(By.name("city")).sendKeys("gujarat");
  Select drp = new Select(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")));
  drp.selectByVisibleText("Texas");
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.findElement(By.name("zip")).sendKeys("12345");
  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input")).click();;
  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")).submit();
  driver.findElement(By.name("comment")).sendKeys("Project Description");
  }
  
  @Test(priority = 1)
  public void selectcheckbox()
  {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	  System.out.print("This is new checkbox");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.id("isAgeSelected")).click();
	  driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")).click();
	  driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")).click();
	  driver.findElement(By.id("check1")).click();
	
  }
  
  @Test(priority = 1)
  public void selectradiobutton()
  {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	  System.out.print("This is new radio button");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")).click();
	  driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
  }
  
  @Test(priority = 4)
  public void selectajax()
  {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
	  System.out.print("This is Ajax Form Submit with Loading icon");
	  driver.findElement(By.id("title")).sendKeys("this is my Ajax");
	  driver.findElement(By.id("description")).sendKeys("In mathematics, the graph of a function f is the set of ordered pairs, where f(x) = y. In the common case where x and f(x) are real numbers, these pairs are Cartesian coordinates of points in two-dimensional space and thus form a subset of this plane");
	  driver.findElement(By.id("btn-submit")).submit();
	  
}
  @Test(priority = 0)
  public void dropdownlist()
  {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html"); 
	  System.out.print("select dropd down list to with Selenium.");
	  Select drp = new Select(driver.findElement(By.id("select-demo")));
	  drp.selectByIndex(3);
	  driver.findElement(By.xpath("//*[@id=\"multi-select\"]/option[2]")).click();
	  driver.findElement(By.id("printAll")).click();
  }
  @Test
  public void datepicker()
  {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html"); 
	  System.out.print("Bootstrap Date Pickers Example");
	  driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]/div/input")).click();
	  WebElement nextLink = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div/div/input"));
	  
  }*/
  }

