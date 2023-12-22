package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NewAndUsedCarSearchPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//*[@class='search-type-all active']")
    WebElement clickOnAllNewAndUsedCars;

    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCarButton;


    public void clickOnAllNewAndUsedCarsLink(){
        clickOnElement(clickOnAllNewAndUsedCars);
    }

    public void findMyNextCarButton(){
        clickOnElement(findMyNextCarButton);
    }



}
