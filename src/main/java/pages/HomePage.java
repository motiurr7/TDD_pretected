package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import static common.CommonActions.*;

public class HomePage {

	WebDriver driver;
	CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}
/*
	@FindBy(id = "ssp-service-zip")
	WebElement zipCodElement;
	@FindBy(xpath = "//div[@class='product-cards']/div[@class='card' and contains(.,'Auto')]")
	WebElement autoProductElement;
	@FindBy(id = "bundleModalBtn")
	WebElement startMyQuotElement;
	@FindBy(xpath = "(//input[@value='Continue'])[1]")
	WebElement continuElement;
*/
	/*
	 * By continuElementBy = By.xpath("(//input[@value='Continue'])[1]");
	 * driver.findElement(continuElementBy) ==
	 * driver.findElement(By.xpath("(//input[@value='Continue'])[1]"))
	 */
	/*
	 //MutualLIberty
	 
	//@FindBy(xpath = "//input[@data-testid='lob-Auto']")
	@FindBy(xpath = "//div[@class='lm-Col lm-Col--base-3']//div[@value='auto']")

	WebElement autoProductElement;
	//@FindBy(id="quote-zipCode-input")  //Don't know why it's not working
	@FindBy(xpath = "//input[@id='quote-zipCode-input']")
	WebElement zipCodElement;
	@FindBy(xpath = "//button[starts-with(@class,'lmig-Button lmig-Button--large lmig-Button--primary lmig-Button--dynamicWidth jsx')]")
	WebElement startMyQuotElement;
*/
	
	
	//pretected
	@FindBy (xpath = "//img[@alt='Car Insurance']")
	WebElement autoProductElement;
	@FindBy(xpath="(//div[@class='main-form__group main-form__group--zip']//input[@class='zip'])[2]")
	WebElement zipCodElement;
	@FindBy(xpath="(//div[@class='main-form__group']//button[@class='btn btn--big'])[2]")
	WebElement startMyQuotElement;
	

	@FindBy(xpath="//a[@data-value='Toyota']")
	WebElement carCompany;
	@FindBy(xpath="//a[@data-value='2017']")
	WebElement makeYear;
	@FindBy(xpath = "//a[starts-with(@class,'car-model-button') and contains(.,'CAMRY')]")
	//@FindBy(xpath="//a[@data-value='COROLLA']")
	WebElement modelOfCar;
	
	
	//@FindBy(xpath="//a[@data-value='Pleasure']")
//	@FindBy(xpath = "//a[starts-with(@class,'primary-use-button') and contains(.,'Commute')]")
	@FindBy(xpath = "//div[@class='col-sm-4 col-xs-12']//a[@class='primary-use-button' and contains(.,'Commute')]")
//@FindBy(xpath="//a[contains(.,'Commute')]")
	WebElement purposeOfUse;
	@FindBy(xpath="//a[@data-value='15000']")
	WebElement annualMileage;
	
	//@FindBy(xpath="//a[@data-value='Lower']")
	//@FindBy(xpath = "//div[@class='col-sm-3 col-xs-12']//a[@class='desired-coverage-button' and contains(.,'Standard')]")
	@FindBy(xpath="//a[@data-value='Typical']")
	WebElement coverageLevel;
	
	@FindBy(xpath="//a[@data-value='Owned']")
	WebElement ownership;
	@FindBy(xpath="//a[@class='add-another-car-button' and contains(.,'No')]")
	WebElement addMoreVehicle;	
	@FindBy(xpath="//select[@id='insurance-company-select' and contains(.,'Not Currently Insured')]")
	WebElement insuranceInfo;	
	
	
	
	public void autoSteps() {
		click(autoProductElement);
		input(zipCodElement, "11203");
		click(startMyQuotElement);

		click(carCompany);
		click(makeYear);
		click(modelOfCar);
		/*
		click(purposeOfUse);
		click(annualMileage);
		click(coverageLevel);
		click(ownership);
		click(addMoreVehicle);*/
		

/*

		waits.waitUntilVisible(continuElement);
		if (isPresent(continuElement) && isDisplayed(continuElement)) {
			click(continuElement);
		}*/
	}
}
