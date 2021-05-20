package com.tsoft.bot.frontend.pages.pages.compra;

import com.tsoft.bot.frontend.base.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.objects.AutomationPracticeObjects;
import com.tsoft.bot.frontend.pages.objects.McssObjects;
import com.tsoft.bot.frontend.utility.GenerateWord;
import org.openqa.selenium.WebDriver;

public class AutomationPracticeCartAddress extends BaseClass {
    private WebDriver driver;
    private static GenerateWord generateWord = new GenerateWord();

    public AutomationPracticeCartAddress(WebDriver driver) {
        super(driver);
        this.driver = Hook.getDriver();
    }

    public void validarPosicion() {
        if(driver.findElement(AutomationPracticeObjects.TDELIVERYADDRES).equals("YOUR DELIVERY ADDRESS")){
            System.out.println("se valido con exito");
        }
    }
}
