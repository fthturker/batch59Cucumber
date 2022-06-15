package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//select[@name='car']")
    public WebElement select;
    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUp;
    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement DropOff;
    @FindBy(xpath = "//input[@name='pickUpDate']")
    public WebElement pickUpDate;
    @FindBy(xpath = "//input[@name='pickUpTime']")
    public WebElement pickUpTime;
    @FindBy(xpath = "//input[@name='dropOffDate']")
    public WebElement dropOffDate;
    @FindBy(xpath = "//input[@name='dropOffTime']")
    public WebElement dropOffTime;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueReservation;
    @FindBy(xpath = "//*[text()='Please first login']")
    public WebElement pleaseFirstLogin;
}
