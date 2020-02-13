import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Abhijit");
		driver.findElement(By.name("lastName")).sendKeys("Dey");
		driver.findElement(By.name("phone")).sendKeys("7655664328");
		driver.findElement(By.name("address1")).sendKeys("Kormangala");
		driver.findElement(By.name("city")).sendKeys("Bangalore");
		
		WebElement dropdown_element = driver.findElement(By.name("country"));
		Select drpdwn= new Select(dropdown_element);
		drpdwn.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("abhi");
		driver.findElement(By.name("password")).sendKeys("abhi");
		driver.findElement(By.name("confirmPassword")).sendKeys("abhi");
		driver.findElement(By.name("register")).click();
		
		
		driver.getTitle();
		driver.close();
		
		
		
		
		
		

	}

}
