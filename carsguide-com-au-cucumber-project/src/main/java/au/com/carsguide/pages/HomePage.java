package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//*[@class='uhf-top']")
    WebElement buyAndSellTopMenuLink;

    @CacheLookup
    @FindBy(linkText = "/buy-a-car/new-and-used-car-search")
    WebElement clickOnSearchCars;

    @CacheLookup
    @FindBy(linkText = "/buy-a-car/used-car-search")
    WebElement clicOnUsedLink;

    public void buyAndSellNewAndUsedLinkText(){
        mouseHoverToElement(buyAndSellTopMenuLink);
    }

    public void clickOnSearchCarslink(){
        clickOnElement(clickOnSearchCars);
    }

    public void clickOnUsedLinkText(){
        clickOnElement(clicOnUsedLink);
    }


}
