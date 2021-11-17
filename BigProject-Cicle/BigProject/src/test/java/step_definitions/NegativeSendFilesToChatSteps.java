package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.DashboardPage;
import page_object.GroupChatPage;
import page_object.TeamsPage;

public class NegativeSendFilesToChatSteps {
	
	private WebDriver driver;
	
	public NegativeSendFilesToChatSteps()
	{
		super();
		this.driver = Hooks.driver;
		
	}
	
	@Given("^User has the Dashboard Page$")
	public void user_has_the_Dashboard_Page() throws Throwable {
		DashboardPage dashboardpage = new DashboardPage(driver);
		dashboardpage.clickGrupA();

		TeamsPage teamspage = new TeamsPage(driver);
		teamspage.clickMenuGroupChat();

	}
	
	@When("^User Attached \"([^\"]*)\" as files in Group Chat$")
	public void user_Attached_as_files_in_Group_Chat(String files) throws Throwable {
		GroupChatPage groupchatpage = new GroupChatPage(driver);
		groupchatpage.getElementChatDisplay();
		groupchatpage.uploadPhoto(files);
		Thread.sleep(3000);

	}

	@Then("^User unssuccessfully send file to Group Chat$")
	public void user_unssuccessfully_send_file_to_Group_Chat() throws Throwable {
		GroupChatPage groupchatpage = new GroupChatPage(driver);
		Assert.assertTrue(groupchatpage.getSuccessNotif().contains("Format file not allowed."));
		

	}

}
