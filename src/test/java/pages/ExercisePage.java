package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExercisePage {
    public ExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[normalize-space()='Home']")
    public WebElement homepage;
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement login;
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    public WebElement SignupView;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement kaydol;
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    public WebElement InformationView;
    @FindBy(xpath = "(//input[@id='id_gender2'])[1]")
    public WebElement gender;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "(//input[@id='newsletter'])[1]")
    public WebElement newsletter;
    @FindBy(xpath = "(//input[@id='optin'])[1]")
    public WebElement partners;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;
    @FindBy(xpath ="//input[@id='last_name']" )
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;
    @FindBy(xpath ="//input[@id='address1']" )
    public WebElement adres1;
    @FindBy(xpath ="(//input[@id='address2'])[1]" )
    public WebElement adres2;

    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    public WebElement createButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement account;

    @FindBy (xpath = "//a[normalize-space()='Continue']")
    public WebElement devam;

    @FindBy (xpath = "//header[@id='header']//li[1]")
    public WebElement logged;

    @FindBy (xpath = "a[href='/delete_account']")
    public WebElement delete;

    @FindBy (xpath = "a[href='/delete_account']")
    public WebElement deleteview;

    @FindBy (xpath = "//button[normalize-space()='OPTIONS']")
    public WebElement devam2;

}
