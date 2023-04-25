package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef
{

    P04_homePage searching = new P04_homePage();


    @When(": search using the {string}")
    public void searchUsingThe(String productname)
    {

        searching.productsname().sendKeys(productname);
        searching.search().click();


    }


    @Then(": the results will appear successfully using the {string}")
    public void theResultsWillAppearSuccessfullyUsingThe(String productname)
    {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains(productname));


        for (int i = 0; i < searching.listofraw().size(); i++)
        {


            softAssert.assertTrue(searching.listoftitle().get(i).getText().toLowerCase().contains(productname));

            System.out.println(searching.listoftitle().get(i).getText().toLowerCase()        );
            System.out.println(productname);


        }
        softAssert.assertAll();



    }






}
