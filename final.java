import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class testing
{
	@Test

	 public static void main(String[] args) {
	 		

	 		System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
	 		ChromeOptions chromeOptions = new ChromeOptions();
	 		chromeOptions.addAgruments("--headless");
	 		WebDriver driver = new ChromeDriver(chromeOptions);

	 		System.out.printLn("Hi, Welcome to the World of Naveen Dasari Home");

	 		driver.findElement(By.name("login")).sendKeys("Naveen");
	 		driver.findElement(By.name("password")).sendKeys("naveen");
	 		driver.findElement(By.name("click")).click();




	 	


	 	String Naveen = driver.findElement(By.name("test")).getText();
	 		assertEquals(Naveen, "Login Succeeded");


	 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 		//Thread.sleep(5000);
	 		driver.quit();	

	 }
}
	

	
