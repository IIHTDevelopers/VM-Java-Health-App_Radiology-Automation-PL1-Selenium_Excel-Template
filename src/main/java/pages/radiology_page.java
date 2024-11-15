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
	 * @Test1.2 and @Test15.1 about this method scrollDownAndClickRadiologyTab()
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

	/**
	 * @Test9.1 about this method clickDateRangeDropdownAndSelect()
	 * 
	 * @param : String - Text of the value to select from dropdown
	 * @description : This method clicks on the date range button and selects a
	 *              value by its text
	 * @return : boolean - true if successfully selected the intended value and
	 *         false if the value is not selected
	 * @throws : Exception - if there is an issue finding the dropdown or its values
	 * @author : YAKSHA
	 */
	public boolean clickDateRangeDropdownAndSelect(String valueToSelect) throws Exception {
		return false;
	}

	/**
	 * @Test9.2 about this method
	 * verifyToDataRangeBySelectOneWeekOptionFromDropdown()
	 * 
	 * @param : String, String - from date - to date
	 * @description : This method verifies whether the "Requested On" dates for all
	 *              the result requisitions are within the specified date range.
	 * @return : boolean - true if the actual dates fall within the specified date
	 *         and false if they don't.
	 * @throws : Exception - if there is an issue finding the actual data
	 * @author : YAKSHA
	 */

	public boolean verifyToDataRangeBySelectOneWeekOptionFromDropdown(String fromDate, String toDate) throws Exception {

		return false;
		}

	/**
	 * @Test10 about this method
	 *         verifyDataFromTabelByEnteringDataXRAYInSearchField() Verifies that
	 *         all records in the table match the entered text in the dropdown.
	 * 
	 * @param dropDownValue - The text to select from the dropdown.
	 * @return boolean - Returns true if all records match the selected text,
	 *         otherwise false.
	 * @throws Exception - If there is an issue locating or interacting with
	 *                   elements.
	 */
	public boolean verifyDataFromTabelByEnteringDataXRAYInSearchField(String dropDownValue) throws Exception {
		return false;
		}

	/**
	 * @Test11 about this method verifyRadiologyWardBillingCancellationPopup()
	 * 
	 * @param radiologyExpectedData - A map containing the expected data for the
	 *                              radiology test, such as patient name and
	 *                              expected cancellation remarks message.
	 * @description This method verifies that the Radiology Ward Billing modal opens
	 *              upon searching for a patient and clicking on the view details
	 *              button. It then clicks the cancel button and verifies that the
	 *              appropriate popup message "Please Write Cancellation Remarks"
	 *              appears.
	 * @return String - The actual failed remarks message displayed in the popup.
	 * @throws Exception - If there is an issue locating or interacting with
	 *                   elements.
	 * @autor YAKSHA
	 */
	public String verifyRadiologyWardBillingCancellationPopup(Map<String, String> radiologyExpectedData) {
		return null;
	}

	/**
	 * @Test12 about this method verifyToolTipText() Verifies that all records in
	 *         the table match the entered text in the search field.
	 * 
	 * @param textToEnter - The text to enter in the search field.
	 * @return boolean - Returns true if all records match the entered text,
	 *         otherwise false.
	 * @throws Exception - If there is an issue locating or interacting with
	 *                   elements.
	 */
	public boolean verifyDataFromTableByEnteringDataInSearchField(String textToEnter) throws Exception {
		return false;
		}

	/**
	 * @Test13 and @Test14 about this method verifyImageOrderCreation() Verifies the
	 *         creation of an imaging order for a specific patient in the In Patient
	 *         Department.
	 *
	 * @param radiologyExpectedData        - A map containing the expected data for
	 *                                     radiology, including the patient name.
	 * @param doYouWantToCancelTheNewOrder - A boolean indicating whether to cancel
	 *                                     the new order.
	 * @return String - Returns the actual success message if the order is created
	 *         successfully, otherwise returns "true" or "false" based on the cancel
	 *         action verification.
	 * @throws Exception - If there is an issue locating or interacting with
	 *                   elements.
	 */
	public String verifyImageOrderCreation(Map<String, String> radiologyExpectedData,
			boolean doYouWantToCancelTheNewOrder) {
		return null;
	}

	/**
	 * @Test15.2 about this method verifyScanDonePopupAndRequiredFieldMessage()
	 * 
	 * @param patientName - The name of the patient for whom the action is to be
	 *                    performed.
	 * @param actionName  - The name of the action button to be clicked (e.g., "scan
	 *                    done").
	 * @description : This method verifies that the "Scan Done" popup opens for the
	 *              specified patient and that the required field message appears on
	 *              the film type field when the "Done" button is clicked without
	 *              entering any details.
	 * @return : String - The error message text displayed on the film type field if
	 *         it is required.
	 * @throws : Exception - if there is an issue locating or interacting with
	 *           elements.
	 * @author : YAKSHA
	 */
	public String verifyScanDonePopupAndRequiredFieldMessage(String patientName, String actionName) {
		return null;
		}
}
