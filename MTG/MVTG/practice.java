package MTG.MVTG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class practice {
  @Test
  public void testcase1() {
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new chromedriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
