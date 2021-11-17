package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class GroupChatPage extends BaseClass {

	public GroupChatPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy (xpath = "//div[@class='fr-element fr-view']/p[1]")
	private WebElement inputMessage;
	
	@FindBy (css= ".rounded-circle")
	private WebElement btnSend;
	
	@FindBy (xpath = "//div[@class='infinite-scroll-component ']//div[@class='Message_mainContainer__BuB70']/div")
	private WebElement verifyChat;
	
	@FindBy (xpath = "//div[contains(@Class,'CreateGroupMessage_actionSection')]/div/input")
	private WebElement btnAttachFile;
	
	@FindBy (id = "notistack-snackbar" )
	private WebElement getSuccessNotif;
	
	@FindBy (css = ".jss96")
	private WebElement failedUpload;
	
	@FindBy (xpath = "//div[@class='infinite-scroll-component ']/div[1]//h1[.='testingfilePDF.pdf']")
	private WebElement VerifyFileName;
	
	
	

	public void inputMessages(String message)
	{
		WaitUntilElementIsClickable(inputMessage);
		inputMessage.sendKeys(message);
	}
	
	public void clickBtnSend()
	{
		btnSend.click();
	}
	public boolean getElementChatDisplay()
	{
		WaitUntilElementIsClickable(inputMessage);
		WaitUntilElementIsVisible(inputMessage);
		inputMessage.isDisplayed();
		return true;
	}
	
	public String verifyChat()
	{
		return verifyChat.getText();
	}
	
	public void uploadPhoto(String files) {
		String projectLocation = System.getProperty("user.dir");
		String path = projectLocation + "//lib//gambar//";
		path = path + files;
		btnAttachFile.sendKeys(path);
		
		
	}
	
	public String getFileName()
	{
		return VerifyFileName.getText();
	}
	
	public String getSuccessNotif()
	{
		WaitUntilElementIsVisible(getSuccessNotif);
		getSuccessNotif.isDisplayed();
		return getSuccessNotif.getText();
	}
	
	public String failedUpload()
	{
		return failedUpload.getText();
	}

	
}
