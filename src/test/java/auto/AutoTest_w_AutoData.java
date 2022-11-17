package auto;

import org.testng.annotations.Test;
import base.BaseClass;
import utils.data.AutoData;

public class AutoTest_w_AutoData extends BaseClass{

	AutoData autoData = new AutoData("11203","Motiur","Rahman","219 E42 ST", " mrahman7@ku.edu", "(307) 217-3087");
	
	@Test(priority = 1)
	public void autoQuoteWithAutoData() {
		homePage.autoSteps(autoData.getZipCode());
		aboutYou.aboutYouSteps(autoData.getFirstName(), autoData.getLastName(),autoData.getHomeAddress(),autoData.getEmailAddress(),autoData.getEmailAddress());
	}
	
	@Test(priority = 0)
	public void autoQuoteWithAutoDataNoParam() {
		homePage.autoSteps(autoData);
		aboutYou.aboutYouSteps(autoData);
	}
}
