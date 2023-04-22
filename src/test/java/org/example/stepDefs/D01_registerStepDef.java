package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_register register = new P01_register();

    @Given("user go to register page")
    public void goRegisterPage()
    {
       // System.out.println("This is a test before start coding");

        register.registerlink().click();

        //WebElement registerBtn = Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
        //registerBtn.click();

    }

    @When("user select gender type")
    public void userSelectGenderType()
    {

        register.kind().click();

    }


    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1)
    {
        register.firstname().sendKeys("automation");

        register.lastname().sendKeys("tester");


    }


    @And("user enter date of birth")
    public void userEnterDateOfBirth()
    {
        Select selectday = new Select(register.dateofbirthday());
        selectday.selectByValue("8");

        Select selectmonth = new Select(register.dateofbirthmonth());
        selectmonth.selectByValue("8");

       Select selectyear = new Select(register.dateofbirthyears());
       selectyear.selectByValue("1994");




    }


    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0)
    {


        register.enteremail().sendKeys("test@example1.com");

    }


    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1)
    {

        register.enterpassword().sendKeys("P@ssw0rd");

        register.enterpasswordconfirmation().sendKeys("P@ssw0rd");


    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton()
    {

        register.clickregisterbutton().click();

    }


    @Then("success message is displayed")
    public void successMessageIsDisplayed()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(register.sucessmessagedisplayed().getText().contains("completed"));

        String actualcolor = register.sucessmessagedisplayed().getCssValue("color");

        softAssert.assertEquals(Color.fromString(actualcolor).asHex(),"#4cb17c");




        softAssert.assertAll();


    }



}
