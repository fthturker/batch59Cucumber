package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage;
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
        Assert.assertTrue(exercisePage.page.isDisplayed());
    }


    @Then("Click on Signup \\/ Login button")
    public void clickOnSignupLoginButton() {
        exercisePage.login.click();
    }
}


