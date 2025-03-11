package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class radiology_page extends StartupPage {

//	TC-1 Locator
	public By getUsernameTextfieldLocator = null;
	public By getPasswordTextboxLocator = null;
	public By getSignInButtonLocator = null;
	public By getRadiologyLocator = null;
//	TC-2 Locator
//	Please write the locators here	
//	TC-3 Locator
	public By getPageBarFixedLocator = null;
//	TC-4 Locators
	public By searchBarId = null;
	public By getDateRangeButton = null;
	public By getFilterDropdownLocator = null;
//	TC-5 Locator
//	Please write the locators here
//	TC-6 Locators
	public By getButtonLocatorsBytext = null;
//	TC-7 Locators
	public By favouriteOrStarIcon = null;
	
//	TC-8 Locators
	public By getOkButtonLocator = null;
	public By calendarFromDropdown = null;
	public By calendarToDropdown = null;	
	public By getStarIconLocator = null;
	
	
	public radiology_page(WebDriver driver) {
		super(driver);
	}

	/**
	 * @Test1.1 about this method loginTohealthAppByGivenValidCredetial()
	 * 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in
	 *              button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		//Write your logic here
		return false;
	}

	/**
	 * @Test1.2 about this method scrollDownAndClickRadiologyTab()
	 * 
	 * @param : null
	 * @description : verify the radiology tab, scroll to it, and click it
	 * @return : String
	 * @author : YAKSHA
	 */
	public void scrollDownAndClickRadiologyTab() throws Exception {
		//Write your logic here
	}

	/**
	 * @Test1.3 about this method verifyRadiologyPageUrl()
	 * 
	 * @param : null
	 * @description : verify radiology page url
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyRadiologyPageTitle() throws Exception {
		// Write your logic here
		return null;

	}

	/**
	 * @Test2
	 * about this method highlightAndVerifyWhetherElementIsDisplayed
	 * 
	 * @param element : By - Locator of the element to be highlighted and verified
	 * @description : This method verifies whether an element is displayed on the
	 *              page, highlights it if displayed, and returns true if displayed.
	 * @return : boolean - true if the element is displayed, otherwise false
	 * @author : YAKSHA
	 */
	public boolean verifyRadiologySubModules(By element) {
		//Write your logic here
		return false;
	}

	/**
	 * @Test3 about this method verifyUrlRadiologyModule()
	 * 
	 * @description This method verifies that the "List Requests" tab is present in
	 *              the Radiology module and returns the current URL of the page.
	 * @return String - The current URL of the page after verifying the "List
	 *         Requests" tab.
	 * @throws Exception - If there is an issue locating the "List Requests" tab or
	 *                   verifying its text.
	 * @autor YAKSHA
	 */
	public String verifyUrlRadiologyModule() throws Exception {
		//Write your logic here
				return null;
	}



	/**
	 * @Test4 about this method verifyListRequestsComponents()
	 * 
	 * @param : null
	 * @description : This method verifies if the search bar is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the search bar or it is
	 *           not visible
	 * @author : YAKSHA
	 */
	public boolean verifyListRequestsComponents() {
		//Write your logic here
				return false;
	}


	/**
	 * @Test5 about this method
	 * verifySelectedTabIsActiveOrNot()
	 * 
	 * @param : element - the locator of the tab to be verified
	 * @description : This method verifies if the specified tab is displayed, clicks
	 *              it, and returns whether its "class" attribute contains "active".
	 *              This can be used to determine if the tab is active based on its
	 *              class attributes.
	 * @return : boolean - true if the "class" attribute of the tab contains
	 *         "active", false otherwise
	 * @throws : Exception - if there is an issue locating, highlighting, clicking
	 *           the tab, or getting its attribute
	 * @author : YAKSHA
	 */
	public boolean verifySelectedTabIsActiveOrNot(By element) throws Exception {
		//Write your logic here
				return false;
	}

	/**
	 * @Test6 about this method verifyNextButtonIsDisplayed()
	 * @param : null
	 * @description : Scrolls till Radiology tab, selects it, and clicks "List
	 *              Requests" tab
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the tab
	 * @author : YAKSHA
	 */
	public boolean verifyNextButtonIsDisplayed() {
		//Write your logic here
				return false;
	}

	/**
	 * @Test7 about this method verifyToolTipText()
	 * @param : null
	 * @description : Verify the text of the tooltip
	 * @return : String
	 * @throws : Exception - if there is an issue finding the text
	 * @author : YAKSHA
	 */
	public String verifyToolTipText() {
		//Write your logic here
				return null;
	}

	/**
	 * @Test8 about this method verifyDatesAreRememberedCorrectly()
	 * 
	 * @param fromDate - the expected "from" date in the format "dd-MM-yyyy"
	 * 
	 * @param toDate - the expected "to" date in the format "dd-MM-yyyy"
	 * 
	 * @description : This method selects the "from" and "to" dates in the calendar,
	 * clicks the OK button, navigates away to another tab, returns to the original
	 * tab, and verifies if the dates are remembered correctly.
	 * 
	 * @return : boolean - true if the dates are remembered correctly, false
	 * otherwise
	 * 
	 * @throws : Exception - if there is an issue locating, highlighting, or
	 * clicking elements, or if there is an issue with date selection or
	 * verification
	 * 
	 * @author : YAKSHA
	 * 
	 * @throws Exception
	 */
	public boolean verifyDatesAreRememberedCorrectly(String fromDate, String toDate) throws Exception {
		//Write your logic here
				return false;
	}


}
