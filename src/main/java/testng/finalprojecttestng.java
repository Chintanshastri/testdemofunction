package testng;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


public class finalprojecttestng {

//public String baseUrl = "http://demo.guru99.com/test/newtours/";
	//public String baseUrl = "https://www.amazon.in/";
    String driverPath = "C:\\selenium\\chromedriver_win32(1)\\chromedriver.exe";
    public WebDriver driver ; 
	@BeforeTest
    public void launchBrowser() {
        System.out.println("launching firefox browser"); 
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
    }
    @Test
    public void verifyHomepageTitle() {
    /*    String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
   */
    	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

    }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
}

