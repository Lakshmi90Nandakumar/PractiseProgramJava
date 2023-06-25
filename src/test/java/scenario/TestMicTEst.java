package scenario;

import static org.testng.Assert.expectThrows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMicTEst
{
	@Test
	public void test() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		//To change the settings of chromedriver
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");//general notification 
		option.addArguments("--use-fake-device-for-media-stream");//to access the mic or camera
	    option.addArguments("--use-fake-ui-for-media-stream");//to access the mic or camera
		WebDriver driver=new ChromeDriver(option);//passing the seeting the chrome driver
		
		//launching the url and maximize window
		
		driver.manage().window().maximize();
		driver.get("https://www.mictests.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait
		
		//driver.findElement(By.xpath("//div[@id='mic-controls']/child::button")).click();//click on test my mic element
		
		//through the robot class
		
		//Thread.sleep(5000);
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		//click on test web cam link
		
		driver.findElement(By.xpath("//a[text()='Test Webcam']")).click();
		
		Set<String> allWh = driver.getWindowHandles();
		
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			if(title.contains("Webcam Test"))
			{
			    driver.switchTo().window(wh);
			    System.out.println(driver.getTitle());
			    break;
			}
		}
		
		//click on test my cam
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='webcam-controls']/child::button[text()='Test my cam']")).click();
		
		
	}

}
