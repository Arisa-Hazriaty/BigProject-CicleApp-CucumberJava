package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SigninPage extends BaseClass  {

	public SigninPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy (xpath = "//span[.='Sign in with Google']")
	private WebElement googleSignIn;
	
	@FindBy (id = "identifierId")
	private WebElement inputEmail;
	
	@FindBy (name = "password")
	private WebElement inputPassword;
	
	
	
	public void clickgoogleSignIn()
	{
		googleSignIn.click();
	}
	public void inputEmailAddress(String email)
	{
		inputEmail.sendKeys(email);
	}
	public void inputPassword(String password)
	{
		inputPassword.sendKeys(password);
	}
	
	
}
