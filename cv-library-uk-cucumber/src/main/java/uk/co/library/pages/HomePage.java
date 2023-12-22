package uk.co.library.pages;
/**
 * 1.HomePage -
 *   Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
 *   Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
 *   enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
 *   clickOnFindJobsButton().
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy (id = "keywords")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(id = "location")
    WebElement location;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distance;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOption;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement minSalary;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement maxSalary;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsButton;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement selectSalaryType;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobType;






    public void enterJobTitle(String text){
        sendTextToElement(jobTitle, text);
    }

    public void enterLocation(String text){
        sendTextToElement(location, text);
    }

    public void selectDistance(String text){
        selectByVisibleTextFromDropDown(distance, text);
    }

    public void clickOnMoreSearchOption(){
        clickOnElement(moreSearchOption);
    }

    public void enterMinSalary(String text){
        sendTextToElement(minSalary, text);
    }

    public void enterMaxSalary(String text){
        sendTextToElement(maxSalary, text);
    }

    public void clickOnFindJobsButton(){
        clickOnElement(findJobsButton);
    }

    public void selectSalaryType(String text){
        selectByVisibleTextFromDropDown(selectSalaryType, text);
    }

    public void selectJobType(String text){
        selectByVisibleTextFromDropDown(jobType, text);
    }



}
