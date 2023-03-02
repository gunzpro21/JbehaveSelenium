package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

	WebDriver driver;

	public ResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getTextFirstResult() {
		List<WebElement> lstResult = driver.findElements(By.cssSelector("div[id='search'] div>a>h3"));
		return lstResult.get(0).getText();
	}
}
