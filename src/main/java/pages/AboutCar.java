package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
//import static common.CommonActions.*;

public class AboutCar {

	

	WebDriver driver;
	CommonWaits waits;

	public AboutCar(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(xpath="//a[@data-value='Toyota']")
	WebElement carCompany;
	@FindBy(xpath="//a[@data-value='2017']")
	WebElement makeYear;
	@FindBy(xpath="//a[@data-value='CAMRY']")
	WebElement modelOfCar;
	@FindBy(xpath="//a[@data-value='Pleasure']")
	WebElement purposeOfUse;
	@FindBy(xpath="//a[@data-value='15000']")
	WebElement annualMileage;
	@FindBy(xpath="//a[@data-value='Lower']")
	WebElement coverageLevel;
	@FindBy(xpath="//a[@data-value='Owned']")
	WebElement ownership;
	@FindBy(xpath="//a[@class='add-another-car-button' and contains(.,'No')]")
	WebElement addMoreVehicle;
	/*
	public static  void aboutCarSteps() {
		click(carCompany);
		click(makeYear);
		click(modelOfCar);
		click(purposeOfUse);
		click(annualMileage);
		click(coverageLevel);
		click(ownership);
		click(addMoreVehicle);
	}*/
}
