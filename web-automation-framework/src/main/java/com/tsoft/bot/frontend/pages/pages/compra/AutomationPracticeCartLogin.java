package com.tsoft.bot.frontend.pages.pages.compra;


import com.tsoft.bot.frontend.base.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.objects.AutomationPracticeObjects;
import com.tsoft.bot.frontend.pages.objects.McssObjects;
import com.tsoft.bot.frontend.utility.GenerateWord;
import org.openqa.selenium.WebDriver;

public class AutomationPracticeCartLogin extends BaseClass {
    private WebDriver driver;
    private static GenerateWord generateWord = new GenerateWord();

    public AutomationPracticeCartLogin(WebDriver driver) {
        super(driver);
        this.driver = Hook.getDriver();
    }

    public void IngresarCorreoyContraseña() throws Throwable {
        sleep(2500);
        typeText(driver, AutomationPracticeObjects.TB_EMAIL, "luc7@gmail.com");
        typeText(driver, AutomationPracticeObjects.TB_PASS, "123123");
    }

    public void clickSignIn() throws Throwable {
        click(driver, AutomationPracticeObjects.BTN_SIGIN2);
    }

}
