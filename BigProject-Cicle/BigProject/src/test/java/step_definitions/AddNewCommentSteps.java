package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.BoardsPage;
import page_object.TeamsPage;

public class AddNewCommentSteps {
	
	private WebDriver driver;
	
	public AddNewCommentSteps()
	{
		super();
		this.driver = Hooks.driver;
	}

	@Given("^User want to add Comment in a board$")
	public void user_want_to_add_Comment_in_a_board() throws Throwable {
		AddCardNameSteps addcardnamesteps = new AddCardNameSteps();
		addcardnamesteps.user_on_the_Board_page();
	}

	@Given("^User choose cardname will be add to comment$")
	public void user_choose_cardname_will_be_add_to_comment() throws Throwable {
		TeamsPage teamspage = new TeamsPage(driver);
		teamspage.clickmenuBoard();
	    
	}

	@When("^User put \"([^\"]*)\" the comments$")
	public void user_put_the_comments(String comment) throws Throwable {
		BoardsPage boardspage = new BoardsPage(driver);
		boardspage.ClickItemCommentCard();
		boardspage.ClickAddNewComment();
		boardspage.inputComment(comment);
	    
	}

	@When("^User Click Save Button$")
	public void user_Click_Save_Button() throws Throwable {
		BoardsPage boardspage = new BoardsPage(driver);
		boardspage.saveComment();
	}

	@Then("^User get Message Success$")
	public void user_get_Message_Success() throws Throwable {
		BoardsPage boardspage = new BoardsPage(driver);
		Thread.sleep(3000);
		Assert.assertTrue(boardspage.getMessageSuccess().contains("Create comment is success"));
	}
}
