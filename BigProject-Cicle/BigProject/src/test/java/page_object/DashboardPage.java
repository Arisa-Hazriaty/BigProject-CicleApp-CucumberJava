package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage extends BaseClass {

		public DashboardPage(WebDriver webDriver) {
			super(webDriver);
			PageFactory.initElements(webDriver, this);
		}
		
		@FindBy (xpath = "//h1[.='SQA']")
		private WebElement  companyName;
		
		@FindBy (xpath = "//div[.='Soal ASoal Untuk grup A']")
		private WebElement grupA;
		
		public void clickGrupA()
		{
			grupA.click();
		}
		
		public String getCompanyName()
		{
			return companyName.getText();
		}
		
		
}
