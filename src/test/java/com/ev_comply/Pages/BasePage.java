package com.ev_comply.Pages;

import com.ev_comply.Utilities.Driver;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    @FindBy(xpath = "//h1")
    public static WebElement h1HeaderMessage;

    @FindBy(xpath = "(//*[.='Register interest'])[1]")
    public static WebElement registerInterestBtn1;

    @FindBy(xpath = "//img[@data-target='#myModal']")
    public static WebElement watchOurIntro;

    @FindBy(className = "button-store")
    public static List<WebElement> linkForMobileApps;

    @FindBy(xpath = "(//a[@href='https://www.ev-comply.com'])[2]/../ul/li")
    public static List<WebElement> footLink2;

    @FindBy(xpath = "//div[@class='col']/a")
    public static List<WebElement> privacyTermsCookiesList;

    @FindBy(xpath = "//*[.='Login']")
    public static WebElement loginBtn;


    public BasePage(){PageFactory.initElements(Driver.get(),this);}

    public static void findElementIfDisplayed(String expectedElementName) {
        switch (expectedElementName) {
            case "Simplifying your EV Charger installations":
                assertTrue(h1HeaderMessage.getText().contains("Simplifying"));
                assertTrue(h1HeaderMessage.getText().contains("your EV Charger installations"));
                break;
            case"Register interest":
               assertEquals(expectedElementName,registerInterestBtn1.getText());
               break;
            case "Watch Our Intro":
                assertEquals(expectedElementName,watchOurIntro.getText());
                break;
        }
    }
}
