package com.vytrack.pages;

import com.vytrack.utility.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateContactPage {

    public CreateContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "oro_contact_form[firstName]")
    public WebElement firstName;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[1]")
    public WebElement owner;


    @FindBy(xpath = "(//div[@class='select2-result-label'])[10]")
    public WebElement ownerSelect;


    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;


    @FindBy(xpath = "//select[@name='oro_contact_form[method]']")
    public WebElement contactMethodDropDown;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[4]")
    public WebElement countryDropdown;

    @FindBy(className = "select2-result-label")
    public List<WebElement> allCountries;

    @FindBy(xpath = "//button[normalize-space()='Save and Close']")
    public WebElement saveAndClose;

    @FindBy(css = ".message")
    public WebElement successMessage;








}
