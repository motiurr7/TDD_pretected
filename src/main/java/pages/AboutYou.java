package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;
import utils.data.AutoData;

public class AboutYou {

	public AboutYou(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*
	@FindBy(xpath = "//input[starts-with(@id, 'Id_GiveDateOfBirth')]")
	WebElement dobElement;
	@FindBy(xpath = "//button[starts-with(@id,'Id_GiveDateOfBirth')]")
	WebElement nextElement;
	@FindBy(xpath = "//div[starts-with(@id,'Id_AskIfCustomerWantsLexisNexisPrefillMainWidgets_Container')]")
	WebElement letsSpeedUpElement;
	@FindBy(id = "labelForNo")
	WebElement noElement;
	@FindBy(xpath = "//button[starts-with(@id,'Id_AskIfCustomerWantsLexisNexisPrefill')]")
	WebElement nextElement2;
	*/
	
	@FindBy(id = "driver-first-name-input")
	WebElement firstNamElement;
	@FindBy(id = "driver-last-name-input")
	WebElement lastNamElement;
	@FindBy(xpath="//button[@class='blue-btn' and contains(.,'Continue')]")
	WebElement nameContinue;
	@FindBy(xpath = "//input[@id='address-input']")
	WebElement addressHome;
	@FindBy(xpath = "//input[@id='email-input']")
	WebElement addressEmail;
	@FindBy(xpath = "//input[@id='phone-input']")
	WebElement phoneNumber;  
	@FindBy (id="contact-info-submit-button")
	WebElement viewRates;
	private AutoData autoData;
	/*
	public void aboutYouSteps(AutoData autoData) {
		input(firstNamElement, autoData.getFirstName());
		input(lastNamElement, autoData.getLastName());
		click(nameContinue);
		input(addressHome, autoData.getHomeAddress());
		input(addressEmail, autoData.getEmailAddress());
		input(phoneNumber, autoData.getPhoneNumber());  // input number be like (999) 999-9999
		click(viewRates);



	}*/

	public void aboutYouSteps(String firstName, String lastName, String homeAddress, String emailAddress,
			WebElement phoneNumber) {
		// TODO Auto-generated method stub
		input(firstNamElement, autoData.getFirstName());
		input(lastNamElement, autoData.getLastName());
		click(nameContinue);
		input(addressHome, autoData.getHomeAddress());
		input(addressEmail, autoData.getEmailAddress());
		input(phoneNumber, autoData.getPhoneNumber());  // input number be like (999) 999-9999
		click(viewRates);
		
	}



	
	
	
}
