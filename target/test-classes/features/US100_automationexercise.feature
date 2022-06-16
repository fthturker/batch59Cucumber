Feature: US100 Kullanici automationexercise sayfasinda arama yapar

@exercise
  Scenario: TC01 kullanici Register User yapar

    Given Navigate to url "autoexerciseUrl"
    Then Verify that home page is visible successfully
    Then login butonuna tiklar
    Then Verify New User Signup! is visible
    Then Enter name and email address
    Then Click Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
  Then Fill details: Title, Name, Email, Password, Date of birth
  Then Select checkbox Sign up for our newsletter!
  Then  Select checkbox Receive special offers from our partners!
  Then Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
