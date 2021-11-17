package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.DashboardPage;
import page_object.GroupChatPage;
import page_object.TeamsPage;

public class ChatGroupSteps {

	private WebDriver driver;

	public ChatGroupSteps() {
		super();
		this.driver = Hooks.driver;

	}

	@Given("^User already on the Dashboard Page$")
	public void user_already_on_the_Dashboard_Page() throws Throwable {

		DashboardPage dashboardpage = new DashboardPage(driver);
		dashboardpage.clickGrupA();

		TeamsPage teamspage = new TeamsPage(driver);
		teamspage.clickMenuGroupChat();

	}

	@When("^User Input \"([^\"]*)\" in Group Chat$")
	public void user_Input_in_Group_Chat(String message) throws Throwable {

		GroupChatPage groupchatpage = new GroupChatPage(driver);
		groupchatpage.getElementChatDisplay();
		groupchatpage.inputMessages(message);

	}

	@When("^User click Send Button$")
	public void user_click_Send_Button() throws Throwable {
		GroupChatPage groupchatpage = new GroupChatPage(driver);
		groupchatpage.clickBtnSend();

	}

	@Then("^User success send chat and see the last chat$")
	public void user_success_send_chat_and_see_the_last_chat() throws Throwable {
		GroupChatPage groupchatpage = new GroupChatPage(driver);
		Thread.sleep(3000);
		Assert.assertTrue(groupchatpage.verifyChat().contains("Halo Ini Arisa testing Lagi"));
	}
}
