package MTG.MVTG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Testcase1 {
	
	WebDriver driver;
  @Test
  public void test1() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Courses']")).click();
	  Thread.sleep(2000);
	 // driver.findElement(By.xpath("//div[@class='ads__navigation__btn navigate__next__btn']")).click();
	  driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-ed72f9e elementor-widget__width-auto elementor-widget-mobile__width-initial elementor-widget elementor-widget-heading']//h1[@class='elementor-heading-title elementor-size-default']\n"
	  		+ "")).click();
  }
	 
  
@BeforeClass
  public void beforeClass() {
	 System.setProperty("webdriver.chrome.driver", "./Drivers./chromedriver.exe");
	 driver   =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://selectorshub.com/selectorshub-pro/plans/");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
