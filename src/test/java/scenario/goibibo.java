package scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class goibibo {

	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/"); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//handling hidden division
		driver.findElement(By.xpath("//span[@class='sc-pVTFL gMNQJM']")).click();
		//click on round trip
		driver.findElement(By.xpath("//span[@class='sc-jtXEFf ezccfJ' and text()='Round-trip']")).click();
		//click on hidden division
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 dRQhOp']")).click();
		//click on from
		driver.findElement(By.xpath("//span[@class='sc-clIzBv bhRlrM fswWidgetLabel' and text()='From']")).click();
		driver.findElement(By.xpath("//span[@class='sc-gsNilK dImRia']/following-sibling::input")).sendKeys("MAA");
		driver.findElement(By.xpath("//ul[@id='autoSuggest-list']/descendant::P[text()='Chennai International Airport']")).click();
		//click on To 
		//driver.findElement(By.xpath("//span[@class='sc-clIzBv bhRlrM fswWidgetLabel' and text()='To']")).click();
		driver.findElement(By.xpath("//span[@class='sc-gsNilK dImRia']/following-sibling::input")).sendKeys("Tokyo");
		driver.findElement(By.xpath("//div[@class='sc-gIDmLj bjofAZ']//span[contains(.,'Tokyo, Japan')]")).click();
		//driver.findElement(By.xpath("//ul[@id='autoSuggest-list']/descendant::P[text()='Chennai International Airport']")).click();
		//click on depature 
		driver.findElement(By.xpath("//div[@class='gr_fswFld ']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Mon Apr 24 2023']")).click();
		//click  on return date
		driver.findElement(By.xpath("//div[@class='gr_fswFld active']")).click();
        //to select particular month
		for(;;)
		{
			
		      String text=driver.findElement(By.xpath("//div[@class='DayPicker-Months']//child::div[@class='DayPicker-Caption']/div")).getText();
		      System.out.println(text);
              if(text.contains("June 2023"))
              {
            	  driver.findElement(By.xpath("//div[@aria-label='Sat Jun 10 2023']")).click();
            	  break;
              }
              else
              {
  				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next' and @aria-label='Next Month']")).click();
              }
		}
			
		
		driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
		driver.findElement(By.xpath("(//div[@class='sc-bQtKYq bfQCXn']/p[text()='Adults']/..//*[name()='svg'  and @xmlns='http://www.w3.org/2000/svg'])[2]")).click();		
	    driver.findElement(By.xpath("//a[@class='sc-fmciRz duyTj']")).click();
	    driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
	}
}
