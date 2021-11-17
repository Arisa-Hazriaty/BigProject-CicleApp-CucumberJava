package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.BlastPage;
import page_object.DashboardPage;
import page_object.TeamsPage;

public class CreateBlastsSteps {
	
	private WebDriver driver;
	String successBlast;
	
	public CreateBlastsSteps()
	{
		super();
		this.driver = Hooks.driver;
		
	}
	
	@When("^User go to Blast Page$")
	public void user_go_to_Blast_Page() throws Throwable {
		
		DashboardPage dashboardpage = new DashboardPage(driver);
		dashboardpage.clickGrupA();
	    
		TeamsPage teamspage = new TeamsPage(driver);
		teamspage.clickMenuBlast();
	}

	@When("^User type a \"([^\"]*)\" as Title and User set \"([^\"]*)\" as Story$")
	public void user_type_a_as_Title_and_User_set_as_Story(String title, String story) throws Throwable 
	{		
		BlastPage blastpage = new BlastPage (driver);
		blastpage.clickBtnCreateBlast();
		blastpage.setTitleBlast(title);
		blastpage.setStoryBlast(story);

	}
	
	@Then("^User set \"([^\"]*)\" and set  \"([^\"]*)\" time$")
	public void user_set_and_set_time(String duedate, String time) throws Throwable {
		BlastPage blastpage = new BlastPage (driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		blastpage.setDuedate(duedate);
		Thread.sleep(5000);
//		blastpage.setTime(time);
//		Thread.sleep(5000);
	    
	}

	@When("^User Publish the Blast Message$")
	public void user_Publish_the_Blast_Message() throws Throwable {
		BlastPage blastpage = new BlastPage (driver);
		blastpage.ClickBtnBlast();

		
	}

	@Then("^User see List Blast$")
	public void user_see_List_Blast() throws Throwable {
	{
		
		BlastPage blastpage = new BlastPage (driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Assert.assertTrue(blastpage.getSuccessBlast().contains("Create post successful"));

	}
	

}
}
