package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class TeamsPage extends BaseClass {

	public TeamsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy (xpath = "//div[.='Board']")
	private WebElement menuBoard;
	
	@FindBy (xpath = "//div[.='Group Chat']")
	private WebElement menuGroupChat;
	
	@FindBy (xpath = "//div[.='Blast!']")
	private WebElement menuBlast;
	
	public void clickmenuBoard()
	{
		menuBoard.click();
	}
	
	public void clickMenuGroupChat()
	{
		menuGroupChat.click();
	}
	
	public void clickMenuBlast()
	{
		WaitUntilElementIsVisible(menuBlast);
		WaitUntilElementIsClickable(menuBlast);
		menuBlast.isDisplayed();
		menuBlast.click();
	}
	
}
