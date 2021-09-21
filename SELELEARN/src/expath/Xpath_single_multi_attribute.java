package expath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_single_multi_attribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SFT\\DRIVER\\chromedriver_win32_92\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    //WebElement txt=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	    //WebElement txt=driver.findElement(By.xpath("//*[@name='q']"));/relative single
	    WebElement txt=driver.findElement(By.xpath("//*[@name='q'][@class='gLFyf gsfi']"));//reative multi
	    txt.sendKeys("text");
	    Thread.sleep(1000);
	    driver.close();

	}

}
