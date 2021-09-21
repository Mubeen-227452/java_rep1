package css_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_locator_id {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SFT\\DRIVER\\chromedriver_win32_92\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.testandquiz.com/selenium/testing.html");
	    WebElement textbox=driver.findElement(By.cssSelector("input#fname"));
	    textbox.sendKeys("text");
	    WebElement b=driver.findElement(By.cssSelector("button#idOfButton"));
	    b.click();
	    Thread.sleep(1000);
	    driver.close();

	}

}
