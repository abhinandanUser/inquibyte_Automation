package stepDefinations;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.ComposePage;
import pageObjects.LoginPage;



public class StepDef {
	
	public WebDriver driver;

	public LoginPage loginPg;
	public ComposePage composePg;
	
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	   System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Incubyte_Automation\\Drivers\\chromedriver.exe");
	   
	   driver= new ChromeDriver();
	   loginPg = new LoginPage(driver);
	   
	   
	   }

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	 }

	@Then("User enters Email as {string}")
	public void user_enters_email_as(String email) {
	    loginPg.enterEmail(email);
	}
	@Then("Click on next button by entring email")
	public void click_on_next_button_by_entring_email() {
		loginPg.clickOnNextBtnByEnteringEmail();
	}
    
	@Then("User enters Password as {string}")
	public void user_enters_password_as(String password) {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         loginPg.enterPassword(password);
	}
	
	@Then("Click on next button by entering pasword")
	public void click_on_next_button_by_entering_pasword() {
	   loginPg.clickOnNextBtnByEnteringPasswrd();
//	   composePg = new ComposePage(driver);
	}
	
	
	@Then("Click on Compose option")
	public void click_on_compose_option() {
		try {
			composePg.clickOnComposeBtn();
		}
		catch(Exception e){
			composePg.clickOnComposeBtn();
		}
		
	}

	@Then("Title should be visible {string}")
	public void title_should_be_visible(String title) {
	  assertEquals(composePg.verifyLabelVisibleUnderComposeFunction(), title);
	}

	@Then("Verify text fields must be visible - Recipients,Subject")
	public void verify_text_fields_must_be_visible_recipients_subject() {
		composePg.txtFldsIsDisapledUnderComposeFunction();
	}

	@Then("Verify buttons must be visible - Send,Formatting options,Attach files,Insert link, Insert emoji,Insert files using drive,Insert photo,Toggle confidential mode, Insert signature,Discard draft")
	public void verify_buttons_must_be_visible_send_formatting_options_attach_files_insert_link_insert_emoji_insert_files_using_drive_insert_photo_toggle_confidential_mode_insert_signature_discard_draft() {
		composePg.buttonsIsDisapledUnderComposeFunction();
	}
	@Then("Enter reciptients email adresss {string}")
	public void enter_reciptients_email_adresss(String emailAddress) {
		composePg.enterReciptientsEmailAdress(emailAddress);
	}

	@Then("Enter email subject {string}")
	public void enter_email_subject(String emailSubject) {
		composePg.enterEmailSubject(emailSubject);
	}

	@Then("Enter Email body {string}")
	public void enter_email_body(String emailBody) {
		composePg.enterEmailBody(emailBody);
	}

	@Then("Click on Send button")
	public void click_on_send_button() {
		composePg.clickOnSendBtn();
	}
	
	}
