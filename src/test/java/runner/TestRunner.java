package runner;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import action.HomePage_Steps;
import action.Result_Steps;
import controller.Boss;

public class TestRunner extends JUnitStories {
	Boss theBoss= new Boss();
	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration()
				.useStoryParser(
						new RegexStoryParser(new ExamplesTableFactory(new LoadFromClasspath(this.getClass()), null)))
				.useStoryReporterBuilder(new StoryReporterBuilder()
						.withCodeLocation(CodeLocations.codeLocationFromClass(this.getClass())));
	}
	
	@Override
	public InjectableStepsFactory stepsFactory() {
		
		return new InstanceStepsFactory(configuration(), new HomePage_Steps(theBoss), new Result_Steps(theBoss));
	}

	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("aTest.story");
	}
	
    @AfterStory
    public void tearDownAfterTestCase() {
    	theBoss.getDriverManager().closeDriver();
    }
}
