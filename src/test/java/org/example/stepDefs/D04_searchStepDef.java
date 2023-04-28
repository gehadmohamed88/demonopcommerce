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


        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(productname));


        for (int i = 0; i < searching.listoftitle().size(); i++)
        {


            Assert.assertTrue(searching.listoftitle().get(i).getText().toLowerCase().contains(productname));

            System.out.println(searching.listoftitle().get(i).getText().toLowerCase()        );
            System.out.println(productname);


        }





    }


    @When(": search using thee {string}")
    public void searchUsingThee(String productsku)
    {

        searching.productsname().sendKeys(productsku);
        searching.search().click();
        searching.findsku().click();



    }


    @Then(": the results will appear successfullyy using the {string}")
    public void theResultsWillAppearSuccessfullyyUsingThe(String productsku)
    {

        Assert.assertTrue(searching.comparesku().getText().contains(productsku));


    }


}
