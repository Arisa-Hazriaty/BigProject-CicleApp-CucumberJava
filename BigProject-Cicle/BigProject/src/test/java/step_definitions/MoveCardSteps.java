package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.BoardsPage;
import page_object.TeamsPage;

public class MoveCardSteps {

	private WebDriver driver;

	public MoveCardSteps() {
		super();
		this.driver = Hooks.driver;
	}

	@Given("^User on the Board Page$")
	public void user_on_the_Board_Page() throws Throwable {

		AddCardNameSteps addcardnamesteps = new AddCardNameSteps();
		addcardnamesteps.user_on_the_Board_page();

	}

	@When("^User select Card will be move$")
	public void user_select_Card_will_be_move() throws Throwable {
		TeamsPage teamspage = new TeamsPage(driver);
		teamspage.clickmenuBoard();

	}

	@When("^User move the card to Todo list board$")
	public void user_move_the_card_to_Todo_list_board() throws Throwable {
		BoardsPage boardspage = new BoardsPage(driver);
		Thread.sleep(3000);
		boardspage.clickItemCard();
		boardspage.btnMoveCard();
		Thread.sleep(3000);
		boardspage.clickListBoard();
		boardspage.clickTestingBoard();
		boardspage.clickMoveCard();

	}

	@Then("^User successfully to Moved Card$")
	public void user_successfully_to_Moved_Card() throws Throwable {
		BoardsPage boardspage = new BoardsPage(driver);
		Thread.sleep(3000);
		Assert.assertTrue(boardspage.getSuccessAddCart().contains("Moving card is success"));
		boardspage.clickCloseIcon();
	}

}
