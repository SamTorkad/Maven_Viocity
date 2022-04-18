package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Homepage;

public class HomeTest extends BaseTest {
	
	public Homepage Hp;
	
	@BeforeClass
	public void initObject() {
		
		Hp= new Homepage(driver);
	}
  
	@Test
	public void Logout() {
		Hp.getProfileLinkElement().click();
		Hp.getProfileLinkElement().click();
	}
	
	
}
