package pageObjects;



import static org.testng.Assert.assertTrue;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;






public class ComposePage {
	public WebDriver ldriver;

	public ComposePage(WebDriver rDriver)
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	@FindBy(xpath="//div[text()='Compose']")
	WebElement composeBtn;

	@FindBy (xpath="//div[@class='aYF']/span")
	WebElement newMessageTitle;
	
	@FindBy(xpath ="//div[@aria-label='Search Field']")
	WebElement toTxtFld;
    
	@FindBy(name ="subjectbox")
	WebElement emailSubjectTxtFld;
    
	@FindBy(className ="//div[@aria-label='Message Body']")
	WebElement emailBodyTxtFld;
	
	@FindBy (xpath="//div[text()='Send']")
	WebElement sendBtn;
	
	@FindBy(xpath ="//*[@class='btC']//div[@aria-label='Formatting options']")
	WebElement formattingOptionBtn;
	
	@FindBy(xpath ="//div[@aria-label='Attach files']")
	WebElement attachFilesBtn;

	@FindBy (xpath="//div[contains(@aria-label,'Insert link')]")
	WebElement insertLinkBtn;
	
	@FindBy(xpath ="//div[contains(@aria-label,'Insert emoji')]")
	WebElement insertEmojiBtn;
    
	@FindBy(xpath ="//div[@aria-label='Insert files using Drive']")
	WebElement insertFileUsingDriveBtn;

	@FindBy (xpath="//div[@aria-label='Insert photo']")
	WebElement insertPhotoBtn;
	
	@FindBy (xpath="//div[@aria-label='Toggle confidential mode']")
	WebElement toggleConfidentialModeBtn;
	
	@FindBy(xpath ="//div[@aria-label='Insert signature']")
	WebElement insertSignatureBtn;
    
	@FindBy(xpath ="//div[contains(@aria-label,'Discard draft')]")
	WebElement discardDraftBtn;
	

	
	public void clickOnComposeBtn()
	{
		composeBtn.click();
	}
	public String verifyLabelVisibleUnderComposeFunction()
	{
		return newMessageTitle.getText();
	}
	public void buttonsIsDisapledUnderComposeFunction()
	{
		 boolean sendBtnIsDisplayed=sendBtn.isDisplayed();
		 assertTrue(sendBtnIsDisplayed, "true");
		 
	     boolean formattingOptionIsDisplayed=formattingOptionBtn.isDisplayed();
	     assertTrue(formattingOptionIsDisplayed, "true");
	     
	     boolean attachFilesIsDisplayed=attachFilesBtn.isDisplayed();
		 assertTrue(attachFilesIsDisplayed, "true");
		 
	     boolean insertLinkIsDisplayed=insertLinkBtn.isDisplayed();
	     assertTrue(insertLinkIsDisplayed, "true");
	     
	     boolean insertEmojiIsDisplayed=insertEmojiBtn.isDisplayed();
		 assertTrue(insertEmojiIsDisplayed, "true");
		 
	     boolean insertFileUsingDriveIsDisplayed=insertFileUsingDriveBtn.isDisplayed();
	     assertTrue(insertFileUsingDriveIsDisplayed, "true");
	     
	     boolean insertPhotoIsDisplayed=insertPhotoBtn.isDisplayed();
		 assertTrue(insertPhotoIsDisplayed, "true");
		 
	     boolean toggleConfidentialModeIsDisplayed=toggleConfidentialModeBtn.isDisplayed();
	     assertTrue(toggleConfidentialModeIsDisplayed, "true");
	     
	     boolean insertSignatureIsDisplayed=insertSignatureBtn.isDisplayed();
		 assertTrue(insertSignatureIsDisplayed, "true");
		 
	     boolean discardDraftIsDisplayed=discardDraftBtn.isDisplayed();
	     assertTrue(discardDraftIsDisplayed, "true");
	     
	}
	public void txtFldsIsDisapledUnderComposeFunction()
	{
		 boolean toTxtFldUnderCompose=toTxtFld.isDisplayed();
		 assertTrue(toTxtFldUnderCompose, "true");
		 
	     boolean emailSubjectTxtFldIsDisplayed=emailSubjectTxtFld.isDisplayed();
	     assertTrue(emailSubjectTxtFldIsDisplayed, "true");
	     
	}
	public void enterReciptientsEmailAdress(String emailAdd)
	{
		toTxtFld.sendKeys(emailAdd);
	}
	public void enterEmailSubject(String emailSubject)
	{
		emailSubjectTxtFld.sendKeys(emailSubject);
	}
	public void enterEmailBody(String emailBody)
	{
		emailBodyTxtFld.sendKeys(emailBody);
	}
	
	public void clickOnSendBtn()
	{
		sendBtn.click();
	}
	
		 
}
