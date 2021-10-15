package com.vytrack.pages;

import com.vytrack.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateVehicleCosts{
    public CreateVehicleCosts() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css = ".select2-chosen")
    public WebElement typeDropdown;

    @FindBy(css = ".select2-result-label")
    public List<WebElement> typesOfCosts;

    @FindBy(name = "custom_entity_type[TotalPrice]")
    public WebElement totalPrice;

    @FindBy(className = "datepicker-input")
    public WebElement datePicker;

    @FindBy(xpath = "//button[normalize-space()='Save and Close']")
    public WebElement saveAndClose;

    @FindBy(className = "message")
    public WebElement successMessage;



}
