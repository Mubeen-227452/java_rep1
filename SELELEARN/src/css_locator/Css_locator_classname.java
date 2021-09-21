package css_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_locator_classname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SFT\\DRIVER\\chromedriver_win32_92\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.testandquiz.com/selenium/testing.html");
	    WebElement ck=driver.findElement(By.cssSelector("input.Automation"));
	    ck.click();
	    Thread.sleep(1000);
	    driver.close();

	}

}
