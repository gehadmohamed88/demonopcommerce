package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef
{

 P03_homePage currency = new P03_homePage();

 @When(": Select Euro currency from the dropdown list on the top left of home page")
 public void choosecurrency()
 {

     Select select = new Select(currency.eurocurrency());

     select.selectByVisibleText("Euro");



 }


    @Then(": the currency is changed successfully on products in Home page")
    public void theCurrencyIsChangedSuccessfullyOnProductsInHomePage()
    {

        for (int i = 0; i < currency.listofraw().size(); i++)
        {

            Assert.assertTrue(currency.listofraw().get(i).getText().contains("€"));



        }


    }



}
