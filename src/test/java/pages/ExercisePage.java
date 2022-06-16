package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExercisePage {
    public ExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "img[alt='Website for automation practice']")
    public WebElement page;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement login;
}
