package com.tsoft.bot.frontend.pages.pages.compra;

import com.tsoft.bot.frontend.base.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.objects.AutomationPracticeObjects;
import com.tsoft.bot.frontend.pages.objects.McssObjects;
import com.tsoft.bot.frontend.utility.GenerateWord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomationPracticeWomenPage extends BaseClass {
    private WebDriver driver;
    Actions actions;
    private static GenerateWord generateWord = new GenerateWord();


    public AutomationPracticeWomenPage(WebDriver driver) {
        super(driver);
        this.driver = Hook.getDriver();
    }
    public void agregarCarritoFadedShortSleeve() throws Throwable {
        Thread.sleep(3000);
        scroll(driver,0,550);
        actions = new Actions(driver);
        Thread.sleep(500);;
        WebElement element = driver.findElements((AutomationPracticeObjects.IMG_ADDFADEDSHORTSLEEVE)).get(0);
        actions.moveToElement(element).perform();
        element.findElement(AutomationPracticeObjects.BTN_ADDFADEDSHORTSLEEVE).click();
        sleep(3000);
        click(driver, AutomationPracticeObjects.BTN_CONTINUARCOMPRANDO);
    }

    public void agregarCarritoBlouse() throws Throwable {
        Thread.sleep(3000);
        scroll(driver,0,550);
        actions = new Actions(driver);
        Thread.sleep(500);;
        WebElement element = driver.findElements(AutomationPracticeObjects.IMG_ADDBLOUSE).get(0);
        actions.moveToElement(element).perform();
        element.findElement(AutomationPracticeObjects.BTN_ADDBLOUSE).click();
        sleep(3000);
        click(driver, AutomationPracticeObjects.BTN_CONTINUARCOMPRANDO);
    }

    public void agregarCarritoPrintedDress() throws Throwable{
        Thread.sleep(3000);
        scroll(driver,0,550);
        actions = new Actions(driver);
        Thread.sleep(500);;
        WebElement element = driver.findElements(AutomationPracticeObjects.IMG_ADDPRINTEDRESS).get(0);
        actions.moveToElement(element).perform();
        element.findElement(AutomationPracticeObjects.BTN_ADDPRINTEDRESS).click();
        sleep(3000);
        click(driver, AutomationPracticeObjects.BTN_CONTINUARCOMPRANDO);
    }

    public void agregarCarritoPrintedSummer() throws Throwable{
        Thread.sleep(3000);
        scroll(driver,0,550);
        actions = new Actions(driver);
        Thread.sleep(500);;
        WebElement element = driver.findElements(AutomationPracticeObjects.IMG_ADDPRINTEDSUMMER).get(0);
        actions.moveToElement(element).perform();
        element.findElement(AutomationPracticeObjects.BTN_ADDPRINTEDSUMMER).click();
        sleep(3000);
        click(driver, AutomationPracticeObjects.BTN_IRCHECKOUT);
    }


}
