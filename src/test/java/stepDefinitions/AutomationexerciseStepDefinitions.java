package stepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationexerciseStepDefinitions {
    ExercisePage exercisePage = new ExercisePage();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("autoexerciseUrl"));
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(exercisePage.homepage.isDisplayed());
    }

    @Then("login butonuna tiklar")
    public void loginButonunaTiklar() {
        exercisePage.login.click();
    }


    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue(exercisePage.SignupView.isDisplayed());
    }

    @Then("Enter name and email address")
    public void enterNameAndEmailAddress() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(exercisePage.name).sendKeys("fatih").perform();
        actions.click(exercisePage.email).sendKeys("fthturker80@gmail.com").perform();


    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        exercisePage.kaydol.click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(exercisePage.InformationView.isDisplayed());
    }


    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(exercisePage.gender)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("1")
                .sendKeys(Keys.TAB)
                .sendKeys("April")
                .sendKeys(Keys.TAB)
                .sendKeys("1981")
               .perform();
    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        exercisePage.newsletter.click();
    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        exercisePage.partners.click();
    }

    @Then("Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(exercisePage.firstName).sendKeys("fatih")
                .sendKeys(Keys.TAB)
                .sendKeys("turker")
                .sendKeys(Keys.TAB)
                .sendKeys("ABA")
                .sendKeys(Keys.TAB)
                .sendKeys("ksksdfuıuıfd")
                .perform();
    }
}






