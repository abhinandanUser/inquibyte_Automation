package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}

	@FindBy(id ="identifierId")
	WebElement email;

	@FindBy(xpath ="//span[text()='Next']")
	WebElement nextBtn;

	@FindBy (name="Passwd")
	WebElement paswrd;

	public void enterEmail(String emailAdd)
	{
		email.sendKeys(emailAdd);
	}
	public void clickOnNextBtnByEnteringEmail()
	{
		nextBtn.click();
	}
	public void enterPassword(String pwd)
	{
		paswrd.sendKeys(pwd);
	}
	public void clickOnNextBtnByEnteringPasswrd()
	{
		nextBtn.click();
	}
    
}
