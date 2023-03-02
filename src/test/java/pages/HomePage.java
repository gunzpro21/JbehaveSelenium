package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class HomePage  {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	  public void navigateToHomePage() {
			driver.get("https://www.google.com/");
	  }
	 

	public void searchTxtQuestion(CharSequence... keysToSend) {
		WebElement vegetable = driver.findElement(By.cssSelector("input[name='q']"));
		vegetable.sendKeys(keysToSend);
		vegetable.sendKeys(Keys.ENTER);
	}
}
