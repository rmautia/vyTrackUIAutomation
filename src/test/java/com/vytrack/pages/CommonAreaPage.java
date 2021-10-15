package com.vytrack.pages;

import com.vytrack.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonAreaPage {

    public CommonAreaPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[ @class='title title-level-1']")
    public List<WebElement> allModules;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(linkText = "My User")
    public WebElement myUser;

    @FindBy(linkText = "My Configuration")
    public WebElement myConf;

    @FindBy(linkText = "My Calendar")
    public WebElement myCalendar;

    @FindBy(css = "[title='Get help']")
    public WebElement getHelp;


    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement permissionAlert;


}
