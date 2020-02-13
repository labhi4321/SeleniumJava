import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datepiker {
	
	
	@Test
	public void ChooseDate() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
	driver.findElement(By.xpath("//span[@class=\"input-group-addon\"]/i")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[2]/td[5]")).click();
	
	
	

}
}
