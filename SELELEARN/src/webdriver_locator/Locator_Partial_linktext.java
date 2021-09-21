package webdriver_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Partial_linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SFT\\DRIVER\\chromedriver_win32_92\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.testandquiz.com/selenium/testing.html");
	    WebElement textbox=driver.findElement(By.partialLinkText("This is"));
	    textbox.click();
	    driver.close();
	}

}
