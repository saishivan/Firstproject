package MTG.MVTG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class practice {
	WebDriver driver;
	
	//TestCase=1
  @Test (groups="somke")
  public void Testcase1() {
	  driver.get("https://www.amazon.in/");
	  driver.findElement(By.xpath("//a[text()='Sell']")).click();
  }
  
  
   //TestCase=2
  @Test(groups="smoke")
  public void Testcase2() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
	  Thread.sleep(100);
  }
  
      //TestCase=3
	  @Test(enabled=true,groups="Functional")
	  public void Testcase4()
	  {
	  driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']")).click(); 
  }
	  
	//TestCase=4  
  @Test(groups="Regression")
  public void Testcase3()
  {
	  driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_5']")).click();
	  driver.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox']")).click();
  }
  
  
  @BeforeClass(alwaysRun=true)
  
  public void beforeclass()
  {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
  }
  
  
 /* @Parameters("browser")
  public void beforeClass(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		  driver= new FirefoxDriver();
	  }
	  else if(browser.equalsIgnoreCase("edge")) {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  
	  }*/
 
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
