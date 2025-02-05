package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class radiology_page extends StartupPage {

	public By getUsernameTextfieldLocator() {
		return By.id("  ");
	}

	public By getPasswordTextboxLocator() {
		return By.xpath("  ");
	}

	public By getSignInButtonLocator() {
		return By.xpath("  ");
	}

	public By getRadiologyLocator() {
		return By.xpath("  ");
	}

	public By getDoctorLocator() {
		return By.xpath("  ");
	}

	public By getPageBarFixedLocator(String navBarName) {
		if (navBarName.equalsIgnoreCase("  ")) {
			navBarName = "  ";
		} else if (navBarName.equalsIgnoreCase("  ")) {
			navBarName = "ImagingReportsList";
		} else if (navBarName.equalsIgnoreCase("  ")) {
			navBarName = "EditDoctors";
		} else if (navBarName.equalsIgnoreCase("  ")) {
			navBarName = "  ";
		}
		return By.xpath("  ");
	}

	public By getAnchorTagLocatorByText(String anchorTagName) {
		return By.xpath("  ");
	}

	public By getButtonLocatorsBytext(String buttonName) {
		return By.xpath("  ");
	}

	public By calendarFromDropdown() {
		return By.xpath("  ");
	}

	public By calendarToDropdown() {
		return By.xpath("  ");
	}

	public By getOkButtonLocator() {
		return By.xpath("  ");
	}

	public By searchBarId() {
		return By.id("  ");
	}

	public By searchBarIdAtDoctorModule() {
		return By.xpath("  ");
	}

	public By getDateRangeButton() {
		return By.cssSelector("  ");
	}

	public By getFilterDropdownLocator() {
		return By.xpath("  ");
	}

	public By getStarIconLocator() {
		return By.xpath("  ");
	}

	public By favouriteOrStarIcon() {
		return By.xpath("  ");
	}

	public By getActionColumnButton(String patientName, String actionName) {
		return By.xpath("  ");
	}

	public By getFilmTypeErrorMessage() {
		return By.xpath("  ");
	}

	public By getFilmTypeInputField() {
		return By.cssSelector("  ");
	}

	public By getQuantityInputField() {
		return By.xpath("  ");
	}

	public By getPopUpMessageText(String msgStatus, String messageText) {
		return By.xpath("  ");
	}

	public By getAddReportHeading() {
		return By.xpath("  ");
	}

	public By getSaveButtonLocator() {
		return By.cssSelector("  ");
	}

	public By getTextEditorLocator() {
		return By.xpath("  ");
	}

	public By getBodyTextLocator() {
		return By.cssSelector("  ");
	}

	public By popupCloseButton() {
		return By.cssSelector("  ");
	}

	public By getImagingName() {
		return By.xpath("  ");
	}

	public By getFirstLabIcon() {
		return By.cssSelector("  ");
	}

	public By getOrderFilterDropdown() {
		return By.xpath("  ");
	}

	public By getInputFieldByPlaceholder(String placeholder) {
		return By.xpath("  ");
	}

	public By getListElementWithText(String listElementText) {
		return By.xpath("  ");
	}

	public By getCurrentPage() {
		return By.xpath("  ");
	}

	public By getFirstPatientName() {
		return By.xpath("  ");
	}

	public By getOrderSection() {
		return By.xpath("  ");
	}

	public By getSelectDateRangeDropDown() {
		return By.xpath("  ");
	}

	public By getActualRequestedOnDates() {
		return By.xpath("  ");
	}

	public By getImagingTypeName() {
		return By.xpath("  ");
	}

	public By wardBillingViewDetailsbutton() {
		return By.cssSelector("  ");
	}

	public By wardBillingModal() {
		return By.xpath("  ");
	}

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
		
	}

	/**
	 * @Test1.3 about this method verifyRadiologyPageUrl()
	 * 
	 * @param : null
	 * @description : verify radiology page url
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyRadiologyPageUrl() throws Exception {
		return null;
	}

	/**
	 * @Test2 @Test4.2 @Test4.3 @Test4.4 @Test4.5 @Test4.6
	 * about this method highlightAndVerifyWhetherElementIsDisplayed
	 * 
	 * @param element : By - Locator of the element to be highlighted and verified
	 * @description : This method verifies whether an element is displayed on the
	 *              page, highlights it if displayed, and returns true if displayed.
	 * @return : boolean - true if the element is displayed, otherwise false
	 * @author : YAKSHA
	 */
	public boolean highlightAndVerifyWhetherElementIsDisplayed(By element) {
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
		return null;
	}

	/**
	 * @Test4.1 about this method applyDateFilter()
	 * 
	 * @param : String, String
	 * @description : Applies the date filter with date range
	 * @return : void
	 * @throws : Exception - if there is an issue finding or filling the date fields
	 * @author : YAKSHA
	 */
	public boolean applyDateFilter(String fromDate, String toDate) throws Exception {
		
		return false;
	}

	/**
	 * @Test4.7 about this method verifySearchBarIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the search bar is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the search bar or it is
	 *           not visible
	 * @author : YAKSHA
	 */
	public boolean verifySearchBarIsDisplayed() {
		return false;
	}

	/**
	 * @Test4.8 about this method verifyDateRangeButtonIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the date range button is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the date range button or
	 *           it is not visible
	 * @author : YAKSHA
	 */
	public boolean verifyDateRangeButtonIsDisplayed() {
		return false;
	}

	/**
	 * @Test4.9 about this method verifyFilterDropdownIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the filter dropdown is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the filter dropdown or it
	 *           is not visible
	 * @author : YAKSHA
	 */
	public boolean verifyFilterDropdownIsDisplayed() {
		return false;
	}

	/**
	 * @Test4.10 about this method verifyFromDateFieldIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the "from date" field is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the "from date" field or
	 *           it is not visible
	 * @author : YAKSHA
	 */
	public boolean verifyFromDateFieldIsDisplayed() {
		return false;
	}

	/**
	 * @Test4.11 about this method verifyToDateFieldIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the "to date" field is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the "to date" field or it
	 *           is not visible
	 * @author : YAKSHA
	 */
	public boolean verifyToDateFieldIsDisplayed() {
		return false;
	}

	/**
	 * @Test4.12 about this method verifyStarIconIsDisplayed()
	 * 
	 * @param : null
	 * @description : This method verifies if the start icon is visible
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the start icon or it is
	 *           not visible
	 * @author : YAKSHA
	 */
	public boolean verifyStarIconIsDisplayed() {
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
		return false;
	}

	/**
	 * @Test6 about this method performScrollOperation()
	 * @param : null
	 * @description : Scrolls till Radiology tab, selects it, and clicks "List
	 *              Requests" tab
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding the tab
	 * @author : YAKSHA
	 */
	public boolean performScrollOperation() {
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
		return null;
	}

	/*
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
				return false;
	}


}
