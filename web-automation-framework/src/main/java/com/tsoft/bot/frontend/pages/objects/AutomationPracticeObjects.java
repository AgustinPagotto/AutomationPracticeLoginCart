package com.tsoft.bot.frontend.pages.objects;

import org.openqa.selenium.By;

public class AutomationPracticeObjects {

    //Home Page
    public static final By BTN_SIGNIN = By.xpath("//a[contains(text(),'Sign in')]");

    //LOG IN PAGE
    //Inputs
    public static final By INPUT_EMAILADDRESS= By.xpath("//input[@id='email_create']");
    public static final By INPUT_EMAILLOGIN= By.xpath("//input[@id='email']");
    public static final By INPUT_PASSWORDLOGIN= By.xpath("//input[@id='passwd']");
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
    public static final By BTN_LOGIN = By.xpath("//button[@id='SubmitLogin']");
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

    ///////////////////////////////

    //HomePage
    public static final By BTN_WOMEN = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    //CartLogin
    public static final By TB_EMAIL = By.xpath("//*[@id=\"email\"]");
    public static final By TB_PASS = By.xpath("//*[@id=\"passwd\"]");
    public static final By BTN_SIGIN2 = By.xpath("//*[@id=\"SubmitLogin\"]/span");
    //WomenPage
    public static final By IMG_ADDFADEDSHORTSLEEVE = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
    public static final By IMG_ADDBLOUSE  = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]");
    public static final By IMG_ADDPRINTEDRESS = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[1]/img[1]");
    public static final By IMG_ADDPRINTEDSUMMER = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[1]/div[1]/a[1]/img[1]");
    public static final By BTN_ADDFADEDSHORTSLEEVE = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span");
    public static final By BTN_ADDBLOUSE  = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span");
    public static final By BTN_ADDPRINTEDRESS = By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]/span");
    public static final By BTN_ADDPRINTEDSUMMER = By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span");
    public static final By BTN_CONTINUARCOMPRANDO = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span");
    public static final By BTN_IRCHECKOUT = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
    //CartAddress
    public static final By TDELIVERYADDRES = By.xpath("//*[@id=\"address_delivery\"]/li[1]/h3");
    //Summary
    public static final By BTN_PROCEDERCHECKOUT = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
    public static final By TXT_PRECIOTOTAL = By.id("total_price");

}
