package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef
{

  P02_login login = new P02_login();


  @Given(": user go to login page")
  public void userGoToLoginPage()
  {

    login.enterloginpage().click();

  }


  @When(": user login with {string} {string} and {string}")
  public void userLoginWithAnd(String arg0, String arg1, String arg2)
  {

     login.enteremail().sendKeys("test@example.com");

     login.enterpassword().sendKeys("P@ssw0rd");



  }

  @And(": user press on login button")
  public void userPressOnLoginButton()
  {

    login.clickloginbutton().click();


  }


  @Then(": user login to the system successfully")
  public void userLoginToTheSystemSuccessfully()
  {

    SoftAssert softAssert = new SoftAssert();
    softAssert.assertTrue(login.myaccountdisplayed().isDisplayed());

    String expectedurl= "https://demo.nopcommerce.com/";
    softAssert.assertEquals(login.getactualurl(),expectedurl);




    softAssert.assertAll();



  }


}
