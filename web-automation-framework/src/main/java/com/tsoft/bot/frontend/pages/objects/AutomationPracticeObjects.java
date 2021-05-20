package com.tsoft.bot.frontend.pages.objects;

import org.openqa.selenium.By;

public class AutomationPracticeObjects {

    //Home Page
    public static final By BTN_SIGNIN = By.xpath("//a[contains(text(),'Sign in')]");

    //LOG IN PAGE
    //Inputs
    public static final By INPUT_EMAILADDRESS= By.xpath("//input[@id='email_create']");
    public static final By INPUT_FIRSTNAME= By.id("customer_firstname");
    public static final By INPUT_LASTNAME= By.id("customer_lastname");
    public static final By INPUT_PASSWORD= By.id("passwd");
    public static final By INPUT_ADDRESS= By.id("address1");
    public static final By INPUT_CITY= By.id("city");
    public static final By INPUT_ZIP= By.id("postcode");
    public static final By INPUT_PHONENUMBER= By.id("phone_mobile");
    public static final By INPUT_ALIAS= By.id("alias");
    //Dropdowns
    public static final By DROPDOWN_DAY = By.id("days");
    public static final By DROPDOWN_MONTH = By.id("months");
    public static final By DROPDOWN_YEAR = By.id("years");
    public static final By DROPDOWN_STATE = By.id("id_state");
    //ERROR
    public static final By DIV_ALERT = By.id("create_account_error");
    //Buttons
    public static final By BTN_CREATEACCOUNT = By.xpath("//button[@id='SubmitCreate']");
    public static final By BTN_REGISTER = By.xpath("//button[@id='submitAccount']");
    //Text
    public static final By HDR_CREATEANACCOUNT = By.xpath("//h1[contains(text(),'Create an account')]");
    public static final By HDR_CREATEACCOUNT = By.xpath("//h3[contains(text(),'Create an account')]");

    //RadioButtons
    public static final By RADIOBTN_MR = By.xpath("//label[@for='id_gender1']");

    //DATA USER PAGE
    public static final By HDR_MYACCOUNT = By.xpath("//h1[contains(text(),'My account')]");
    public static final By SPAN_NAME = By.xpath("//a[@class='account']/span");

    //ERROR PAGE
    public static final By HDR_RESOURCELIMIT = By.xpath("//h1[contains(text(),'Resource Limit Is Reached')]");

}
