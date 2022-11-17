package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import utils.data.AutoData;

import static common.CommonActions.*;


public class HomePage {

	WebDriver driver;
	CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}

	// pretected
	@FindBy(xpath = "//img[@alt='Car Insurance']")
	WebElement autoProductElement;
	@FindBy(xpath = "//img[@alt='Home Insurance']")
	WebElement homeProductElement;
	//@FindBy(xpath = "(//div[@class='main-form__group main-form__group--zip']//input[@class='zip'])[2]")
	@FindBy(xpath = "//form[@class='main-form']//div[@class='main-form__group main-form__group--zip']//input[@class='zip']")
	WebElement zipCodElement;
	//@FindBy(xpath = "(//div[@class='main-form__group']//button[@class='btn btn--big'])[2]")
	@FindBy(xpath = "//form[@class='main-form']//div[@class='main-form__group']//button[@class='btn btn--big']")
	WebElement startMyQuotElement;

	@FindBy(xpath = "//a[@data-value='Toyota']")
	WebElement carCompany;
	@FindBy(xpath = "//a[@data-value='2017']")
	WebElement makeYear;
	@FindBy(xpath = "//a[starts-with(@class,'car-model-button') and contains(.,'CAMRY')]")
	// @FindBy(xpath="//a[@data-value='COROLLA']")
	WebElement modelOfCar;

	// @FindBy(xpath="//a[@data-value='Pleasure']")
//	@FindBy(xpath = "//a[starts-with(@class,'primary-use-button') and contains(.,'Commute')]")
	@FindBy(xpath = "//div[@class='col-sm-4 col-xs-12']//a[@class='primary-use-button' and contains(.,'Commute')]")
//@FindBy(xpath="//a[contains(.,'Commute')]")
	WebElement purposeOfUse;
	@FindBy(xpath = "//a[@data-value='15000']")
	WebElement annualMileage;

	// @FindBy(xpath="//a[@data-value='Lower']")
	// @FindBy(xpath = "//div[@class='col-sm-3
	// col-xs-12']//a[@class='desired-coverage-button' and contains(.,'Standard')]")
	@FindBy(xpath = "//a[@data-value='Typical']")
	WebElement coverageLevel;

	@FindBy(xpath = "//a[@data-value='Owned']")
	WebElement ownership;
	@FindBy(xpath = "//a[@class='add-another-car-button' and contains(.,'No')]")
	WebElement noMoreVehicle;
	@FindBy(id = "insurance-company-select")
	WebElement insuranceInfo;
	@FindBy(xpath = "//option[text()='Not Currently Insured']")
	WebElement currentInsurancElement;

	@FindBy(xpath = "//button[@type='submit'][1]")
	WebElement continueNextElement;

	@FindBy(xpath = "//span[@data-checked='true'][1]")
	WebElement activeLicensElement;

	@FindBy(id = "ticket-or-claim-switch-yes")
	WebElement ticketElement;

	@FindBy(id = "sr22-switch-yes")
	WebElement fillElement;
	@FindBy(xpath = "//button[@type='submit' and @class='blue-btn' and @style]")
	WebElement continueNextElement2;

	@FindBy(id = "homeowner-switch-no")
	WebElement noHomElement;
	@FindBy(id = "married-switch-single")
	WebElement singlePersonElement;
	@FindBy(xpath = "//input[@id='gender']/..//span[@class='alert alert-light']//span[@data-checked='true']")
	WebElement genderElement;
	@FindBy(xpath = "//form[@id='driver-details-form']//div[@class='mini-container']//button[@class='blue-btn']")
	WebElement continueNextElement3;

	@FindBy(id = "education-select")
	WebElement eductionElement;

	@FindBy(xpath = "//option[text()='Masters Degree']")
	WebElement degreeElement;

	@FindBy(id = "credit-select")
	WebElement creditElement;

	@FindBy(xpath = "//option[text()='Excellent']")
	WebElement creditlevelElement;
	@FindBy(xpath = "//form[@id='education-credit-form']//div[@class='mini-container']//button[@class='blue-btn']")
	WebElement continueNextElement4;

	@FindBy(id = "driver-birthday-month-select")
	WebElement monthElement;
	@FindBy(xpath = "//option[text()='May']")
	WebElement monthSelectedElement;

	@FindBy(id = "driver-birthday-day-select")
	WebElement dayElement;
	@FindBy(xpath = "//option[text()='21']")
	WebElement daySelectedElement;

	@FindBy(xpath = "//select [@id='driver-birthday-year-select']")
	WebElement birthYearElement;
	
	@FindBy(xpath = "//select [@id='driver-birthday-year-select']//option[text()='1994']")
	WebElement birthYearSelectedElement;

	@FindBy(xpath = "//div[@id='driver-birthday-section']//form[@id='birthday-form']//button[@class='blue-btn']")
	WebElement continueNextElement5;

	public void autoSteps(String zipCode) {
		click(autoProductElement);

		waits.waitUntilVisible(zipCodElement);
		if (isPresent(zipCodElement) && isDisplayed(zipCodElement)) {
			input(zipCodElement, zipCode);
			click(startMyQuotElement);
		}

		waits.waitUntilVisible(carCompany);
		if (isPresent(carCompany) && isDisplayed(carCompany)) {
			click(carCompany);
		}

		waits.waitUntilVisible(makeYear);
		if (isPresent(makeYear) && isDisplayed(makeYear)) {
			click(makeYear);
		}

		waits.waitUntilVisible(modelOfCar);
		if (isPresent(modelOfCar) && isDisplayed(modelOfCar)) {
			click(modelOfCar);
		}

		waits.waitUntilVisible(purposeOfUse);
		if (isPresent(purposeOfUse) && isDisplayed(purposeOfUse)) {
			click(purposeOfUse);
		}

		click(annualMileage);
		waits.waitUntilVisible(coverageLevel);
		if (isPresent(coverageLevel) && isDisplayed(coverageLevel)) {
			click(coverageLevel);
		}

		waits.waitUntilVisible(ownership);
		if (isPresent(ownership) && isDisplayed(ownership)) {
			click(ownership);
		}

		waits.waitUntilVisible(noMoreVehicle);
		if (isPresent(noMoreVehicle) && isDisplayed(noMoreVehicle)) {
			click(noMoreVehicle);
		}
		waits.waitUntilVisible(insuranceInfo);
		if (isPresent(insuranceInfo) && isDisplayed(insuranceInfo)) {
			click(insuranceInfo);
			click(currentInsurancElement);
			click(continueNextElement);
		}

		waits.waitUntilVisible(activeLicensElement);
		if (isPresent(activeLicensElement) && isDisplayed(activeLicensElement)) {
			click(activeLicensElement);
			click(ticketElement);
			click(fillElement);
			click(continueNextElement2);
		}

		waits.waitUntilVisible(continueNextElement3);
		if (isPresent(continueNextElement3) && isDisplayed(continueNextElement3)) {
			click(noHomElement);
			click(singlePersonElement);
			click(genderElement);
			click(continueNextElement3);

		}

		waits.waitUntilVisible(continueNextElement4);
		if (isPresent(continueNextElement4) && isDisplayed(continueNextElement4)) {
			click(eductionElement);
			click(degreeElement);
			click(creditElement);
			click(creditlevelElement);
			click(continueNextElement4);

		}

		waits.waitUntilVisible(continueNextElement5);
		if (isPresent(continueNextElement5) && isDisplayed(continueNextElement5)) {
			click(monthElement);
			click(monthSelectedElement);
			click(dayElement);
			click(daySelectedElement);
			click(birthYearElement);
			click(birthYearSelectedElement);
			click(continueNextElement5);

		}

	}
	
	
	public void autoSteps(AutoData autoData) {
		click(autoProductElement);

		waits.waitUntilVisible(zipCodElement);
		if (isPresent(zipCodElement) && isDisplayed(zipCodElement)) {
			input(zipCodElement, autoData.getZipCode());
			click(startMyQuotElement);
		}

		waits.waitUntilVisible(carCompany);
		if (isPresent(carCompany) && isDisplayed(carCompany)) {
			click(carCompany);
		}

		waits.waitUntilVisible(makeYear);
		if (isPresent(makeYear) && isDisplayed(makeYear)) {
			click(makeYear);
		}

		waits.waitUntilVisible(modelOfCar);
		if (isPresent(modelOfCar) && isDisplayed(modelOfCar)) {
			click(modelOfCar);
		}

		waits.waitUntilVisible(purposeOfUse);
		if (isPresent(purposeOfUse) && isDisplayed(purposeOfUse)) {
			click(purposeOfUse);
		}

		click(annualMileage);
		waits.waitUntilVisible(coverageLevel);
		if (isPresent(coverageLevel) && isDisplayed(coverageLevel)) {
			click(coverageLevel);
		}

		waits.waitUntilVisible(ownership);
		if (isPresent(ownership) && isDisplayed(ownership)) {
			click(ownership);
		}

		waits.waitUntilVisible(noMoreVehicle);
		if (isPresent(noMoreVehicle) && isDisplayed(noMoreVehicle)) {
			click(noMoreVehicle);
		}
		waits.waitUntilVisible(insuranceInfo);
		if (isPresent(insuranceInfo) && isDisplayed(insuranceInfo)) {
			click(insuranceInfo);
			click(currentInsurancElement);
			click(continueNextElement);
		}

		waits.waitUntilVisible(activeLicensElement);
		if (isPresent(activeLicensElement) && isDisplayed(activeLicensElement)) {
			click(activeLicensElement);
			click(ticketElement);
			click(fillElement);
			click(continueNextElement2);
		}

		waits.waitUntilVisible(continueNextElement3);
		if (isPresent(continueNextElement3) && isDisplayed(continueNextElement3)) {
			click(noHomElement);
			click(singlePersonElement);
			click(genderElement);
			click(continueNextElement3);

		}

		waits.waitUntilVisible(continueNextElement4);
		if (isPresent(continueNextElement4) && isDisplayed(continueNextElement4)) {
			click(eductionElement);
			click(degreeElement);
			click(creditElement);
			click(creditlevelElement);
			click(continueNextElement4);

		}

		waits.waitUntilVisible(continueNextElement5);
		if (isPresent(continueNextElement5) && isDisplayed(continueNextElement5)) {
			click(monthElement);
			click(monthSelectedElement);
			click(dayElement);
			click(daySelectedElement);
			click(birthYearElement);
			click(birthYearSelectedElement);
			click(continueNextElement5);

		}

	}
	
	
	public void homeSteps(String zipCode) {
		click(homeProductElement);

		waits.waitUntilVisible(zipCodElement);
		if (isPresent(zipCodElement) && isDisplayed(zipCodElement)) {
			input(zipCodElement, zipCode);
			click(startMyQuotElement);
		}
		
	
	}
	
}
