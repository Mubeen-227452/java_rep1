package expath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_single_slash {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SFT\\DRIVER\\chromedriver_win32_92\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.testandquiz.com/selenium/testing.html");
	   // WebElement textbox=driver.findElement(By.xpath("/html/body/div/div[5]/div/p/input"));//absolutepath--fullxpath
	    //WebElement textbox=driver.findElement(By.xpath("//*[@id='fname']"));////*[@id="fname"]-xpath-relative
	    //WebElement textbox=driver.findElement(By.xpath("//*[@name='firstName']"));//xpath-for using name
	    WebElement textbox=driver.findElement(By.xpath("//input[@name='firstName']"));
	    textbox.sendKeys("text");
	    WebElement b=driver.findElement(By.cssSelector("button#idOfButton"));
	    b.click();
	    Thread.sleep(1000);
	    driver.close();


	}

}
