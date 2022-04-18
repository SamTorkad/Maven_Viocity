package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page.LoginPage;

public class LoginTest extends BaseTest {
	public LoginPage Lp;
	

	@BeforeClass
	public void Initialize() {
		
		Lp = new LoginPage(driver);

	}

	@Test
	public void Login() {
		Lp.getusernameTab().sendKeys("Admi1n");
		Lp.getpasswordTab().sendKeys("admin123");
		Lp.getloginbutton().click();
	}

	
}
