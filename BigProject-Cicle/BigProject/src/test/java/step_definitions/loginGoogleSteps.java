package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.DashboardPage;
import page_object.SigninPage;

public class loginGoogleSteps {
	
	private WebDriver driver;
	
	String companyName;

	public loginGoogleSteps() {
		super();
		this.driver = Hooks.driver;
	}

	@Given("^User on the Sign In page$")
	public void user_on_the_Sign_In_page() throws Throwable {
//	    SigninPage signin = new SigninPage (driver);
//	    signin.clickgoogleSignIn();
	    
	}

	@When("^User choose signin Google$")
	public void user_choose_signin_Google() throws Throwable {
	    DashboardPage dashboardpage = new DashboardPage(driver);
	    companyName = dashboardpage.getCompanyName();
	    Assert.assertEquals(companyName, dashboardpage.getCompanyName());
	}

	@Then("^Board Staging Cicle displayed$")
	public void board_Staging_Cicle_displayed() throws Throwable {
		DashboardPage dashboardpage = new DashboardPage(driver);
	    dashboardpage.clickGrupA();
	}

}
