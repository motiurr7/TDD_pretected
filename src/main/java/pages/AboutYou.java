package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonWaits;

import static common.CommonActions.*;
import utils.data.AutoData;

public class AboutYou {
	
	WebDriver driver;
	CommonWaits waits;

	public AboutYou(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id = "driver-first-name-input")
	WebElement firstNamElement;
	@FindBy(id = "driver-last-name-input")
	WebElement lastNamElement;
	@FindBy(xpath="//div[@id='driver-name-section']//form[@id='driver-name-form']//button[@class='blue-btn']")
	WebElement nameContinue;
	@FindBy(xpath = "//input[@id='address-input']")
	WebElement addressHome;
	@FindBy(xpath = "//input[@id='email-input']")
	WebElement addressEmail;
	@FindBy(xpath = "//input[@id='phone-input']")
	WebElement phoneNumberElement;  
	@FindBy (id="contact-info-submit-button")
	WebElement viewRates;
	



	public void aboutYouSteps(String firstName, String lastName, String homeAddress, String emailAddress, String phoneNumber) {
		// TODO Auto-generated method stub
		input(firstNamElement, firstName);
		input(lastNamElement, lastName);
		click(nameContinue);
		input(addressHome, homeAddress);
		input(addressEmail, emailAddress);
		input(phoneNumberElement,phoneNumber);  // input number be like (999) 999-9999
		click(viewRates);
		
	}
	
	
	public void aboutYouSteps(AutoData autoData) {
		input(firstNamElement, autoData.getFirstName());
		input(lastNamElement, autoData.getLastName());
		click(nameContinue);
		input(addressHome, autoData.getHomeAddress());
		input(addressEmail, autoData.getEmailAddress());
		input(phoneNumberElement, autoData.getPhoneNumber());  // input number be like (999) 999-9999
		click(viewRates);
	}
}
