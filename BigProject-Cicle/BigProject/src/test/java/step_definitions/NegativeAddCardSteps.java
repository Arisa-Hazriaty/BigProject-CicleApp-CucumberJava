package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import page_object.BoardsPage;
import page_object.DashboardPage;
import page_object.TeamsPage;

public class NegativeAddCardSteps {
	
	private WebDriver driver;
	
	public NegativeAddCardSteps()
	{
		super();
		this.driver = Hooks.driver;
	}
	
	@Given("^User on the Boards page$")
	public void user_on_the_Boards_page() throws Throwable {
		DashboardPage dashboardpage = new DashboardPage(driver);
		dashboardpage.clickGrupA();

	}

	@Given("^User Add Card Name but the name is Empty$")
	public void user_Add_Card_Name_but_the_name_is_Empty() throws Throwable {
		TeamsPage teamspage = new TeamsPage(driver);
		teamspage.clickmenuBoard();
		
		BoardsPage boardspage = new BoardsPage(driver);
		boardspage.Addcard();
		boardspage.btnAddCard();

	}

	@Then("^The User get message Card name cannot be empty$")
	public void the_User_get_message_Card_name_cannot_be_empty() throws Throwable {
		BoardsPage boardspage = new BoardsPage(driver);
		Thread.sleep(3000);
		Assert.assertTrue(boardspage.getSuccessAddCart().contains("Card name cannot be empty"));

	}
	
	

}
