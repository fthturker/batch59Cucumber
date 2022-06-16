package stepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
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

        actions.click(exercisePage.name).sendKeys("alirmm").perform();
        actions.click(exercisePage.email).sendKeys("fthturker080@gmail.com").perform();


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
                .sendKeys(Keys.TAB)
                .sendKeys("izmir")
                .sendKeys(Keys.TAB)
                .sendKeys("Canada").click()
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Marmara")
                .sendKeys(Keys.TAB)
                .sendKeys("Istanbul")
                .sendKeys(Keys.TAB)
                .sendKeys("350986")
                .sendKeys(Keys.TAB)
                .sendKeys("05423830774")
                .perform();
    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        exercisePage.createButton.click();

    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertTrue(exercisePage.account.isDisplayed());
    }

    @Then("Click Continue button")
    public void clickContinueButton() {
        exercisePage.devam.click();
    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(exercisePage.logged.isDisplayed());
    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() {
        exercisePage.delete.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        Assert.assertTrue(exercisePage.deleteview.isDisplayed());
        exercisePage.devam2.click();
    }
}






