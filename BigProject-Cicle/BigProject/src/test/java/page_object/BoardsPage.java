package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class BoardsPage extends BaseClass {
	
	private WebDriver driver;

	public BoardsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy (css = "[data-rbd-draggable-id='61610a7ab37d9ab368e98122'] .ListContainer_ListContainer__buttonBottom__2kZAI")
	private WebElement addCard;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnAddCard;
	
	@FindBy (css = "[placeholder='Card name']")
	private WebElement  inputCardName;
	
	@FindBy (id = "notistack-snackbar" )
	private WebElement successAddCart;
	
	@FindBy (xpath = "//a[@href='/cards/616963219ef51bd37e56b36b']")
	private WebElement cardList;
	
	@FindBy (id = "editCardMenu")
	private WebElement editCard;
	
	@FindBy (xpath = "//div[.='Quick Comment']")
	private WebElement quickComment;
	
	@FindBy (css = "[placeholder='Add new comment...']")
	private WebElement addNewComment;
	
	@FindBy (css = ".fr-element")
	private WebElement inputComment;
	
	@FindBy (css = ".btn-success")
	private WebElement btnSuccess;
	
	@FindBy (xpath = "//span[.='×']")
	private WebElement closeButton;
	
	@FindBy (css = "[href='/cards/61695acc9ef51bbe3256a772']")
	private WebElement itemAddCard;
	
	@FindBy (css = "[href='/cards/61695de59ef51b545556a851']")
	private WebElement itemCommentCard;
	
	@FindBy (xpath = "//div[@class='CardDetailContainer_CardDetailContainer__sideColumn__3hzRV col-lg-2 col-md-3']//div[@class='CardDetailContainer_buttonAction__2Sfwo']//div[contains(.,'Move')]")
	private WebElement btnMoveCard;
	
	@FindBy (css = ".ManageMoveCard_listSection__listName__TN7R2")
	private WebElement listBoard;
	
	@FindBy (xpath = "//div[@class='ListNameOption_mainSection__3QQi6']/div[.='Testing']")
	private WebElement testingList;
	
	@FindBy (xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnMove;
	
	@FindBy (css = ".btn-success")
	private WebElement clickButtonMove;
	
	@FindBy (css = ".btn")
	private WebElement clickAddList;
	
	@FindBy (name = "name")
	private WebElement InputListName;
	
	@FindBy (css = ".Button_container__1WNuB")
	private WebElement btnCreate;
	
	@FindBy (id = "notistack-snackbar")
	private WebElement getSuccessAddList;

	 
	
	public void Addcard()
	{
		addCard.click();
	}
	
	public void setCardName(String cardname)
	{
		inputCardName.sendKeys(cardname);
	}

	
	public void btnAddCard()
	{
		btnAddCard.click();
	}
	public String getSuccessAddCart()
	{
		return successAddCart.getText();
	}
	
	public void clickItemCard()
	{
		itemAddCard.click();
	}
	
	public void btnMoveCard()
	{
		btnMoveCard.click();
	}
	
	public void clickListBoard()
	{
		listBoard.click();
	}

	public void clickTestingBoard()
	{
		testingList.click();
	}
	public void clickMoveCard()
	{
		clickButtonMove.click();
	}
	public void clickCloseIcon()
	{
		closeButton.click();
	}
	public void ClickItemCommentCard()
	{
		itemCommentCard.click();
	}
	public void ClickAddNewComment()
	{
		addNewComment.click();
	}
	public void inputComment(String comment)
	{
		inputComment.sendKeys(comment);
	}
	public void saveComment()
	{
		btnSuccess.click();
	}
	public void clickAddList()
	{
		clickAddList.click();
	}
	
	public void inputListName(String addlist)
	{
		InputListName.sendKeys(addlist);
	}
	public void clickCreateButton()
	{
		WaitUntilElementIsClickable(btnCreate);
		btnCreate.isDisplayed();
		btnCreate.click();
	}
	public String getMessageSuccess()
	{
		return getSuccessAddList.getText();
	}
}
