package scenario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IPhone13Excel 
{
	@Test
	public void testIcc() throws EncryptedDocumentException, IOException
	{
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     List<WebElement> allEle=driver.findElements(By.xpath("//span[contains(.,'Apple iPhone 13') and not(contains(.,'Cover')) and not(contains(.,'Case'))]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]"));
//	     WebDriverWait wait=new WebDriverWait(driver,10);
//	     wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']")));
	     System.out.println(allEle.size());
  		 List<WebElement> element=driver.findElements(By.xpath("//span[contains(.,'Apple iPhone 13') and not(contains(.,'Cover')) and not(contains(.,'Case'))]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/div[@class='sg-row']/descendant::div[@class='a-row a-size-base a-color-base']/a/span"));
  		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\git\\PractiseProgram\\practise\\src\\test\\resources\\data.xlsx");
	     Workbook wb = WorkbookFactory.create(fis);
	     int i=0;
	     for(WebElement ele:element)
	     {
	    	    String text=ele.getText();
	    	     System.out.println(text);
	    	     wb.createSheet("Sheet2").createRow(i).createCell(1).setCellValue(text);
                 i++;
	    	
	     }
	     	FileOutputStream fos=new FileOutputStream("C:\\Users\\LENOVO\\git\\PractiseProgram\\practise\\src\\test\\resources\\data.xlsx");
	     	wb.write(fos);
	     	wb.close();
	}
}
