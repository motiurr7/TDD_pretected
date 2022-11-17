package auto;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import base.BaseClass;
//import pages.AboutCar;

public class AutoTest extends BaseClass{

	@Test
	public void autoQuote() {
		homePage.autoSteps("11203");
		aboutYou.aboutYouSteps("Motiur","Rahman","219 E42 ST", " mrahman7@ku.edu", "(307) 217-3087");
	}
	
	@Parameters({"zipCode","firstName", "lastName","homeAddress","emailAddress", "phoneNumber"})
	
	@Test
	public void autoQuoteParameter( String zipCode, String firstName, String lastName, String homeAddress, String emailAddress,String phoneNumber) {
		homePage.autoSteps(zipCode);
		aboutYou.aboutYouSteps(firstName,lastName,homeAddress,emailAddress, phoneNumber);
	}
	

}
