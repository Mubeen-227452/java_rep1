package webdriver_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1_id_name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SFT\\DRIVER\\chromedriver_win32_92\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders");
	    WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
	    username.sendKeys("Tester");
	    WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
	    password.sendKeys("test");
	    Thread.sleep(1000);
	    System.out.println("First");
	    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders");
	    WebElement username1=driver.findElement(By.name("ctl00$MainContent$username"));
	    username1.sendKeys("Tester");
	    WebElement password1=driver.findElement(By.name("ctl00$MainContent$password"));
	    password1.sendKeys("test");
	    driver.close();
	    System.out.println("second");
	    

	}

}
