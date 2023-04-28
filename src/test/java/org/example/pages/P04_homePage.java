package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_homePage
{

    public WebElement productsname()
    {

        return Hooks.driver.findElement(By.id("small-searchterms"));


    }

    public WebElement search()
    {

        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));



    }



    public List<WebElement> listoftitle()
    {

        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));


    }


    public WebElement findsku()
    {

        return Hooks.driver.findElement(By.cssSelector("div[class=\"product-item\"] "));


    }


    public WebElement comparesku()
    {


        return Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]"));



    }






}
