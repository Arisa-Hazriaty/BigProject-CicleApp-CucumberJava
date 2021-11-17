package page_object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class BlastPage extends BaseClass {

	private WebDriver driver;

	public BlastPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
	private WebElement btnCreateBlast;

	@FindBy(xpath = "//div[@class='CreateBlastPage_inputTitleSection__3vhfz']/textarea[1]")
	private WebElement inputTitleBlast;

	@FindBy(css = ".fr-element")
	private WebElement inputStoryBlast;

	@FindBy(css = ".btn-success")
	private WebElement btnPublish;

	@FindBy(id = "notistack-snackbar")
	private WebElement getSuccess;

	@FindBy(id = "date-picker-dialog-start")
	private WebElement setDuedate;

	@FindBy(id = "time-picker")
	private WebElement timePicker;

	@FindBy(xpath = "//div[@class='CreateBlastPage_plusButton__26Vtt']")
	private WebElement setNotified;

	@FindBy(xpath = "//div[@class='ManageSubscribersContainer_ManageSubscribersContainer__body__3lbqx']/div[.='Wira Putrawan Pakpahan']")
	private WebElement setMember1;

	@FindBy(xpath = "//p[.='Muhammad Fakhri Abdillah']")
	private WebElement setMember2;

	@FindBy(xpath = "//p[.='Taufik Maulana']")
	private WebElement setMember3;

	public void clickBtnCreateBlast() {
		WaitUntilElementIsVisible(btnCreateBlast);
		WaitUntilElementIsClickable(btnCreateBlast);
		btnCreateBlast.isDisplayed();
		btnCreateBlast.click();
	}

	public void setTitleBlast(String title) {
		inputTitleBlast.sendKeys(title);
	}

	public void setStoryBlast(String story) {
		inputStoryBlast.sendKeys(story);
	}

	public void ClickBtnBlast() {
		btnPublish.click();
	}

	public String getSuccessBlast() {
		return getSuccess.getText();
	}

//	public void clearDuedate()
//	{
//		setDuedate.clear();
//		timePicker.clear();
//	}
	public void setDuedate(String duedate) {
//		((JavascriptExecutor) webDriver).executeScript(
//                "arguments[0].removeAttribute('readonly','readonly')",setDuedate);
//	 ((JavascriptExecutor) webDriver).executeScript(
//                "arguments[0].removeAttribute('readonly','readonly')",timePicker);
//		setDuedate.sendKeys(duedate);
		setDuedate.click();
		setDuedate.sendKeys(Keys.BACK_SPACE);
		setDuedate.sendKeys(Keys.BACK_SPACE);
		setDuedate.sendKeys(Keys.BACK_SPACE);
		setDuedate.sendKeys(Keys.BACK_SPACE);
		setDuedate.sendKeys(Keys.BACK_SPACE);
		setDuedate.sendKeys(Keys.BACK_SPACE);
		setDuedate.sendKeys(Keys.BACK_SPACE);
		setDuedate.sendKeys(Keys.BACK_SPACE);
		setDuedate.clear();
		setDuedate.sendKeys(duedate);
	}
	
	public void setTime(String time)
	{
		timePicker.click();
		timePicker.clear();
		timePicker.sendKeys(time);
	}

	public void setMember() {
		WaitUntilElementIsClickable(setNotified);
		setNotified.isDisplayed();
		setNotified.click();
//		WaitUntilElementIsVisible(setMember1);
//		WaitUntilElementIsClickable(setMember1);
//		setMember1.isDisplayed();
//		WaitUntilElementIsVisible(setMember2);
//		WaitUntilElementIsClickable(setMember2);
//		setMember2.isDisplayed();
//		WaitUntilElementIsVisible(setMember3);
//		WaitUntilElementIsClickable(setMember3);
//		setMember3.isDisplayed();
	}

	public void selectNotified() {
		WaitUntilElementIsClickable(setMember1);
		setMember1.isDisplayed();
		setMember1.click();
//		WaitUntilElementIsClickable(setMember2);
//		setMember2.isDisplayed();
//		setMember2.click();
//		WaitUntilElementIsClickable(setMember3);
//		setMember3.isDisplayed();
//		setMember3.click();


	}

}
