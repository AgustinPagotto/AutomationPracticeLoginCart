package com.tsoft.bot.frontend.pages.pages.compra;

import com.tsoft.bot.frontend.base.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.objects.AutomationPracticeObjects;
import com.tsoft.bot.frontend.pages.objects.McssObjects;
import com.tsoft.bot.frontend.utility.GenerateWord;
import org.openqa.selenium.WebDriver;

public class AutomatinoPracticeSummary extends BaseClass {
    private WebDriver driver;
    private static GenerateWord generateWord = new GenerateWord();

    public AutomatinoPracticeSummary(WebDriver driver) {
        super(driver);
        this.driver = Hook.getDriver();
    }

    public void procederCheckout() throws Throwable {
        sleep(2500);
        click(driver, AutomationPracticeObjects.BTN_PROCEDERCHECKOUT);
        sleep(3000);
        driver.quit();
    }

    public void comprobarPrecio() throws Throwable{
        if(driver.findElement(AutomationPracticeObjects.TXT_PRECIOTOTAL).getText().equals("$100.49")){
            System.out.println("TEST COMPLETADO CON EXITO");
        } else{
            System.out.println("Se agregaron mal los productos");
        }
    }


}
