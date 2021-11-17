package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import page_object.BoardsPage;
import page_object.TeamsPage;

public class AddListSteps {
	
	private WebDriver driver;
	
	public AddListSteps()
	{
		super();
		this.driver = Hooks.driver;
	}
	
	@Given("^User access Board page$")
	public void user_access_Board_page() throws Throwable {
		AddCardNameSteps addcardnamesteps = new AddCardNameSteps();
		addcardnamesteps.user_on_the_Board_page();
		
		TeamsPage teamspage = new TeamsPage(driver);
		teamspage.clickmenuBoard();
	
	}

	@Given("^User Add List \"([^\"]*)\" Board$")
	public void user_Add_List_Board(String list) throws Throwable {
		BoardsPage boardspage = new BoardsPage(driver);
		boardspage.clickAddList();
		boardspage.inputListName(list);

 
	}

	@Given("^User Click Save button$")
	public void user_Click_Save_button() throws Throwable {
		BoardsPage boardspage = new BoardsPage(driver);
		Thread.sleep(3000);
		boardspage.clickCreateButton();

	}

	@Then("^User successfully to Add list Board$")
	public void user_successfully_to_Add_list_Board() throws Throwable {
		BoardsPage boardspage = new BoardsPage(driver);
		Thread.sleep(5000);
		Assert.assertTrue(boardspage.getSuccessAddCart().contains("Creating list is success"));

	}

	

}
