package MTG.MVTG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Flipkartproject {
	
	WebDriver driver;
  @Test(priority=0)
  public void Tectcase1() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
	//  JavascriptExecutor js=(JavascriptExecutor) driver;
	 // js.executeScript("window(100,100)");
	   Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@title='SAMSUNG']//div[@class='XqNaEv']")).click();
	   Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@title='vivo']//div[@class='XqNaEv']")).click();
	   Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@title='OPPO']//div[@class='XqNaEv']")).click();
	   Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@title='realme']//div[@class='XqNaEv']")).click();
	  
	 // driver.findElement(By.xpath("//div[@title='MOTOROLA']//div[@class='XqNaEv']")).click();
	   Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='aOfogh']//span[contains(text(),'Clear all')]")).click();
  }
	  @Test(priority=1)
	  public void Testcase2() throws InterruptedException {
		  
		  
		  driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
		  Thread.sleep(1000);
		  
		   driver.findElement(By.xpath("//span[@role='button']")).click();
		   Thread.sleep(1000);
		   
		 
		  driver.findElement(By.xpath("//a[@aria-label='Travel']//div//div[@class='YBLJE4']")).click();
		 
		  driver.manage().deleteAllCookies();
		  Thread.sleep(1000);
		  /*driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='trGfi6 JxFEK3 _48O0EI']/div[2]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//table[1]//thead[1]//tr[2]//th[2]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='0-datefrom']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/button[1]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='0-dateto']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/button[1]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='ddniwG S0EQss']//div[1]//div[2]//div[1]//div[3]//button[1]//*[name()='svg']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@type='button']")).click();
		  Thread.sleep(1000);*/
		  
		 // driver.findElement(By.xpath("//label[@class='VKzPTL iAFtyB']")).click();
	//	  driver.findElement(By.xpath("//input[@class='v2VFa- rLGgLC g9KxuM smJZop ZjUTQC z2D4XG']")).click();
		//  Thread.sleep(1000);
		//  driver.findElement(By.xpath("//input[@value='Mumbai, BOM - Chatrapati Shivaji International Airport']")).click();
		 // Thread.sleep(1000);
		 // driver.findElement(By.xpath("//div[text()='Round Trip']")).click();
		  //Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='0-departcity']")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//input[@name='0-arrivalcity']")).sendKeys("Mumbai");
		  Thread.sleep(1000);
		  
		List<WebElement>lit=driver.findElements(By.xpath("//div[@class='ecAhsD uzeEmI']"));
		System.out.println(lit.size());
		
		for(int i=0;i<lit.size();i++) {
			System.out.println(lit.get(i).getText());
			
			if(lit.get(i).getText().contains("Mumbai")) {
			     lit.get(i).click();
			     break;
			}
		}
		
		String monthanddate="Augest 2024";
		String date="10";
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='0-datefrom']")).click();
		
		while(true)
		{
			String actualmd=driver.findElement(By.xpath("//div[@class='_1w7bXX']")).getText();
		if(monthanddate.equals(actualmd)) {
			
			break;
		}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='au1mSN']")).click();
			}
	
		List<WebElement>datetype=driver.findElements(By.xpath("//table[@class='RYl+NW']//tbody//tr//td//button"));
		
		for(WebElement  dt:datetype) 
		{
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
			
		}
		 
		WebElement search=driver.findElement(By.xpath("//button[@class='QqFHMw sgUmTV M5XAsp']"));
		search.click();
	}
	  
	  
	  
	  
@BeforeClass
  public void beforeClass() {
	  
	// System.setProperty("webdriver.chrome.driver", "./Drivers./chromedriver.exe");
	// driver= new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.flipkart.com/");
	 
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  
	  driver.close();
  }

}