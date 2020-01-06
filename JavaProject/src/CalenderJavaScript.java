import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderJavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\mytools\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		System.out.println("Started now at"+new Date());
		WebElement date=driver.findElement(By.id("datepicker"));
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		String value="10/10/2020";
		
		jse.executeScript("arguments[0].setAttribute('value','"+value+"');", date);

	}

}
