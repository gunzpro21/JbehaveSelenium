package pages;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driverKing;
	
    @Before //Before each test case, use BeforeClass for before each test class
    public static void setUpBeforeTestCase() {
		if (driverKing == null) {
			WebDriverManager.chromedriver().setup();
			driverKing = new ChromeDriver();
			driverKing.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driverKing.manage().window().maximize();
			driverKing.get("https://www.google.com/");
		}
    }
	
    @After
    public static void tearDownAfterTestCase() {
    	driverKing.quit(); 
    }
}
