package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.BlastPage;
import page_object.DashboardPage;
import page_object.TeamsPage;

public class NegativeCreateBlast {
	
	private WebDriver driver;
	
	public NegativeCreateBlast() {
		super();
		this.driver = Hooks.driver;
	}
	
	@Given("^User on Boards Page$")
	public void user_on_Boards_Page() throws Throwable {
		DashboardPage dashboardpage = new DashboardPage(driver);
		dashboardpage.clickGrupA();
	    
		TeamsPage teamspage = new TeamsPage(driver);
		teamspage.clickMenuBlast();

	}

	@When("^User Open the Blast Page$")
	public void user_Open_the_Blast_Page() throws Throwable {
		BlastPage blastpage = new BlastPage (driver);
		blastpage.clickBtnCreateBlast();


	}

	@Then("^User get message Field parameter not complete$")
	public void user_get_message_Field_parameter_not_complete() throws Throwable {
		BlastPage blastpage = new BlastPage (driver);
		blastpage.ClickBtnBlast();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Assert.assertTrue(blastpage.getSuccessBlast().contains("Field parameter not complete."));
	}

	
	
	

}
