import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	
	public static void main(String[] args) {

		
	System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	
	driver.findElement(By.name("userName")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	
	String title_actual = driver.getTitle();
	System.out.println(title_actual);
	String title_expected= "Sign-on: Mercury Tours";
	System.out.println(title_expected);
	if(title_actual.contains(title_expected))
	{
		System.out.println("Test Case Passed ");
	}
		else
			System.out.println("Test Case Failed ");

		driver.quit();
	}
	

}
	
	

