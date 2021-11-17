package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.BoardsPage;
import page_object.DashboardPage;
import page_object.TeamsPage;

public class AddCardNameSteps {

	private WebDriver driver;

	public AddCardNameSteps() {
		super();
		this.driver = Hooks.driver;
	}

	@Given("^User on the Board page$")
	public void user_on_the_Board_page() throws Throwable {
			DashboardPage dashboardpage = new DashboardPage(driver);
			dashboardpage.clickGrupA();
	}

	@When("^User Added \"([^\"]*)\" as card name$")
	public void user_Added_as_card_name(String cardname) throws Throwable {
		
		TeamsPage teamspage = new TeamsPage(driver);
		teamspage.clickmenuBoard();
		
		BoardsPage boardspage = new BoardsPage(driver);
		boardspage.Addcard();
		boardspage.setCardName(cardname);
		boardspage.btnAddCard();

	}

	@Then("^The User get message Notification success$")
	public void the_User_get_message_Notification_success() throws Throwable {
		
		BoardsPage boardspage = new BoardsPage(driver);
		Thread.sleep(3000);
		Assert.assertTrue(boardspage.getSuccessAddCart().contains("Creating card is success"));
	}

}
