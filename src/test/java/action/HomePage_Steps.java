package action;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

import controller.Boss;
import pages.HomePage;

public class HomePage_Steps {

	
	Boss theBoss;
	HomePage homePage;
	
	public HomePage_Steps(Boss theBoss) {
		this.theBoss = theBoss;
		homePage = theBoss.getPageObjectManager().getHomePage();
	}
	
	@Given("user is on Home page")
	public void userIsOnHomePage() {
		homePage.navigateToHomePage();		
	}

	@When("user search $keyword")
	public void userClicksOnFindSteps(String keyword) {
		homePage.searchTxtQuestion(keyword);
	}



}
