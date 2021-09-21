package expath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\SFT\\DRIVER\\chromedriver_win32_92\\chromedriver.exe");  
			    WebDriver driver=new ChromeDriver();
			    driver.get("https:/browserstack.com");
			    //WebElement txt=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
			    WebElement txt=driver.findElement(By.xpath("//*[text()='Get started free']"));//contains
			   // WebElement txt=driver.findElement(By.xpath("//*[@name='q' and @class='gLFyf gsfi']"));//ands
			    //WebElement txt=driver.findElement(By.xpath("//*[@name='q' or @class='gLFyf gsfi']"));//ors
			    //txt.sendKeys("text");
			    txt.click();
			    Thread.sleep(1000);
			    driver.close();

	}

}
