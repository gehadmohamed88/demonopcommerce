package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register
{



    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));

    }



    public WebElement kind()
    {

        return Hooks.driver.findElement(By.id("gender-male"));

    }

    public WebElement firstname()
    {


        return Hooks.driver.findElement(By.id("FirstName"));


    }

    public WebElement lastname()

    {

        return Hooks.driver.findElement(By.id("LastName"));

    }


    public WebElement dateofbirthday()
    {

        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"] option[value=\"8\"]"));

    }


    public WebElement dateofbirthmonth()
    {

        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"] option[value=\"8\"]"));

    }



    public WebElement dateofbirthyears()
    {

        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"] option[value=\"1994\"]"));

    }


    public WebElement enteremail()
    {

        return Hooks.driver.findElement(By.id("Email"));

    }


    public WebElement enterpassword()
    {

        return Hooks.driver.findElement(By.id("Password"));

    }

    public WebElement enterpasswordconfirmation()
    {

        return Hooks.driver.findElement(By.id("ConfirmPassword"));

    }









}
