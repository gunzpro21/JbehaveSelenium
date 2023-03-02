package action;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Then;

import controller.Boss;
import pages.ResultPage;

public class Result_Steps {
	ResultPage resultPage;
	Boss theBoss;
	public Result_Steps(Boss theBoss) {
		this.theBoss = theBoss;
		resultPage = theBoss.getPageObjectManager().getResultPage();
	}
	
	@Then("Result page show $keywordResult")
	public void findStepsPageIsShown(String keywordResult) {
		System.out.println(keywordResult  +" vs " +resultPage.getTextFirstResult());
		assertEquals(keywordResult, resultPage.getTextFirstResult());
	}
}
