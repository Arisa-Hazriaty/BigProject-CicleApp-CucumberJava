package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.DashboardPage;
import page_object.GroupChatPage;
import page_object.TeamsPage;

public class SendFilesToChatSteps {

	private WebDriver driver;
	String expectedFileNames;
	
	public SendFilesToChatSteps()
	{
		super();
		this.driver = Hooks.driver;
	}
	
	@Given("^User access the Dashboard Page$")
	public void user_access_the_Dashboard_Page() throws Throwable {
		
		DashboardPage dashboardpage = new DashboardPage(driver);
		dashboardpage.clickGrupA();

		TeamsPage teamspage = new TeamsPage(driver);
		teamspage.clickMenuGroupChat();
	    
	}

	@When("^User Attached \"([^\"]*)\" as image in Group Chat$")
	public void user_Attached_as_image_in_Group_Chat(String files) throws Throwable {
		GroupChatPage groupchatpage = new GroupChatPage(driver);
		groupchatpage.getElementChatDisplay();
		groupchatpage.uploadPhoto(files);
		Thread.sleep(3000);
		

	   
	}

	@Then("^User success send image and see the last image$")
	public void user_success_send_image_and_see_the_last_image() throws Throwable {
		GroupChatPage groupchatpage = new GroupChatPage(driver);
		Assert.assertTrue(groupchatpage.getSuccessNotif().contains("Upload attachments is success"));
		Thread.sleep(3000);
		String expectedFileName = "testingfilePDF.pdf";
		String actualFileName = groupchatpage.getFileName();
		Assert.assertEquals(actualFileName, expectedFileName);
		
		if (actualFileName.contentEquals(expectedFileName))
		{
			System.out.println("Result as Expected: Actual File Name is equals to Expected Title ");
		}
		else
		{
			System.out.println("failed: Actual File Name is NOT equals to Expected Title ");
			System.out.println(actualFileName);
		}


		
		
	}

}
