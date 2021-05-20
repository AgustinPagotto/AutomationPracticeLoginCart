package com.tsoft.bot.frontend.pages.pages.compra;
import com.tsoft.bot.frontend.base.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.objects.AutomationPracticeObjects;
import com.tsoft.bot.frontend.pages.objects.ExcelDataObjects;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.GenerateWord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;

public class AutomationPractice extends BaseClass {
    private WebDriver driver;
    private static GenerateWord generateWord = new GenerateWord();
    Actions actions;
    String mensaje;

    public AutomationPractice(WebDriver driver) {
        super(driver);
        this.driver = Hook.getDriver();
    }

    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME);
    }

    public void clickButtonSignIn() throws Throwable {
        mensaje = "Realizamos click en el boton SIGN IN";
        try {
            click(driver, AutomationPracticeObjects.BTN_SIGNIN);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void clickButtonWomen() throws Throwable {
        mensaje = "Hacemos click en la pestaña WOMEN";
        try {
            click(driver,AutomationPracticeObjects.BTN_WOMEN);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }

    }

    public void agregarCarritoFadedShortSleeve() throws Throwable {
        mensaje = "Agregamos al carrito el articulo Faded Short Sleeve";
        try {
            Thread.sleep(3000);
            scroll(driver,0,550);
            actions = new Actions(driver);
            Thread.sleep(500);;
            WebElement element = driver.findElements((AutomationPracticeObjects.IMG_ADDFADEDSHORTSLEEVE)).get(0);
            actions.moveToElement(element).perform();
            element.findElement(AutomationPracticeObjects.BTN_ADDFADEDSHORTSLEEVE).click();
            sleep(3000);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            click(driver, AutomationPracticeObjects.BTN_CONTINUARCOMPRANDO);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void agregarCarritoBlouse() throws Throwable {
        mensaje = "Agregamos al carrito el articulo Blouse";
        try{
            Thread.sleep(3000);
            scroll(driver,0,50);
            actions = new Actions(driver);
            Thread.sleep(500);;
            WebElement element = driver.findElements((AutomationPracticeObjects.IMG_ADDBLOUSE)).get(0);
            actions.moveToElement(element).perform();
            element.findElement(AutomationPracticeObjects.BTN_ADDBLOUSE).click();
            sleep(3000);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            click(driver, AutomationPracticeObjects.BTN_CONTINUARCOMPRANDO);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void agregarCarritoPrintedDress() throws Throwable{
        mensaje = "Agregamos al carrito el producto Printed Dress";
        try{
            Thread.sleep(3000);
            scroll(driver,0,50);
            actions = new Actions(driver);
            Thread.sleep(500);;
            WebElement element = driver.findElements((AutomationPracticeObjects.IMG_ADDPRINTEDRESS)).get(0);
            actions.moveToElement(element).perform();
            element.findElement(AutomationPracticeObjects.BTN_ADDPRINTEDRESS).click();
            sleep(3000);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            click(driver, AutomationPracticeObjects.BTN_CONTINUARCOMPRANDO);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void agregarCarritoPrintedSummer() throws Throwable{
        mensaje = "Agregamos al carrito el producto Printed Summer";
        try{
            Thread.sleep(3000);
            scroll(driver,0,50);
            actions = new Actions(driver);
            Thread.sleep(500);;
            WebElement element = driver.findElements((AutomationPracticeObjects.IMG_ADDPRINTEDSUMMER)).get(0);
            actions.moveToElement(element).perform();
            element.findElement(AutomationPracticeObjects.BTN_ADDPRINTEDSUMMER).click();
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            sleep(3000);
            click(driver, AutomationPracticeObjects.BTN_IRCHECKOUT);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void procederCheckout() throws Throwable {
        mensaje = "Luego de verificar que el precio sea el correcto hacemos click en checkout";
        try {
            sleep(2500);
            click(driver, AutomationPracticeObjects.BTN_PROCEDERCHECKOUT);
            sleep(3000);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
        driver.quit();
    }

    public void comprobarPrecio() throws Throwable{
        mensaje = "Verificamos que el precio sea de $100.49";
        try {
            scroll(driver,0,800);
            if(driver.findElement(AutomationPracticeObjects.TXT_PRECIOTOTAL).getText().equals("$100.49")){
                System.out.println("El precio total es de 100.49");
            } else{
                System.out.println("Se agregaron mal los productos");
            }
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }
}
