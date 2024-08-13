package MTG.MVTG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	//MTG.MVTG.NewTest
  @Test
  public void f() {
	  System.out.println("Test");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("precondition");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Post condition");
  }

}
