package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		//String expectedurl="https://demo.actitime.com/login.do/";

		String expectedtitle="https://demo.actitime.com/login.do/Ajay";
		
		w.until(ExpectedConditions.titleIs(expectedtitle));
		String actualtitle = driver.getCurrentUrl();

		
		
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("True");
			
		} else {
			System.out.println("false");

		}
		System.out.println(actualtitle);

	}

}
