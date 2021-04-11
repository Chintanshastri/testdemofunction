package selenium.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo1 {
	WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.manage().deleteAllCookies();
	//	driver.manage().window().maximize();
		
	driver.get("https://www.guru99.com/");
	}

}
