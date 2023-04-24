package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login
{

 public WebElement enterloginpage()
 {

     return Hooks.driver.findElement(By.className("ico-login"));


 }


    public WebElement enteremail()
    {

        return Hooks.driver.findElement(By.id("Email"));

    }



    public WebElement enterpassword()
    {

        return Hooks.driver.findElement(By.id("Password"));

    }


    public WebElement clickloginbutton()
    {

        return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"][class=\"button-1 login-button\"]"));

    }

    public WebElement myaccountdisplayed()
    {


        return Hooks.driver.findElement(By.className("ico-account"));

    }


    public String getactualurl()
    {
        return Hooks.driver.getCurrentUrl();

    }

    public WebElement enterwrongemail()
    {

        return Hooks.driver.findElement(By.id("Email"));

    }

    public  WebElement cannotlogin()
    {

        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));


    }





}
