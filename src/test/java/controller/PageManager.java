package controller;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.ResultPage;



public class PageManager {
	private WebDriver driver;
	private HomePage homePage;
	private ResultPage resultPage;
	
	public PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public ResultPage getResultPage() {
		return (resultPage == null) ? resultPage = new ResultPage(driver) : resultPage;
	}
}
