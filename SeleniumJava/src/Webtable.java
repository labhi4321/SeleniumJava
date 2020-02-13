import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Webtable {
	
	@Test
	public void  webtablehandle() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");	
	driver.findElement(By.linkText("Cruises")).click();
	Thread.sleep(10);
	
	List<WebElement> Table_Rows=driver.findElements(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table/tbody/tr"));
	int row_count=Table_Rows.size();
	System.out.println("The number of rows are "+row_count);
	
	List<WebElement> Table_columns=driver.findElements(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table/tbody/tr/td"));
	int col_count=Table_columns.size();
	System.out.println("The number of colums are "+col_count);
	
	//for getting row values 
	for(int row=0;row<row_count;row++) {
		String row_values=Table_Rows.get(row).getText();
		System.out.println(row_values);
	}
			
	driver.quit();

}
}

