import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	x
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
			WebDriver driver =new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver","C://IE//IEDriverServer.exe");
			WebDriver driver =new InternetExplorerDriver();
			
		}
		else
		{
			
			System.out.println("No Browser Found");
		}
		
		
	}
	
	
	@Test
	public void CrossBrowser() {
		
		driver.get("https://www.google.com");
		
		
	}
	
	@AfterTest
	public void Quit() {
		
		driver.quit();
	}

}
