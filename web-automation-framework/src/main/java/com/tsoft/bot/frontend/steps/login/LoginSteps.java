package com.tsoft.bot.frontend.steps.login;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.pages.compra.*;
import com.tsoft.bot.frontend.pages.pages.login.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private final LoginPage login = new LoginPage(driver);
    private final AutomationPractice atPage = new AutomationPractice (driver);

    public LoginSteps() {
        this.driver = Hook.getDriver();
    }

    @Given("^Usuario ingresa url selecciona sign in ingresa su mail y selecciona Create an account \"([^\"]*)\"$")
    public void UsuarioIngresaUrlSeleccionaSignInIngresaSuMailySeleccionaCreateAnAccount(String setNumberUrl) throws Throwable {
        login.enterUrl(setNumberUrl);
    }

    @When("^Usuario ingresa sus datos \"([^\"]*)\"$")
    public void usuarioIngresaSusDatos(String setNumberCredentials) throws Throwable {
        login.login(setNumberCredentials);
    }

    @And("^Agrego cuatro productos al carrito$")
    public void agregoCuatroProductosAlCarrito() throws Throwable {
        atPage.agregarCarritoFadedShortSleeve();
        atPage.agregarCarritoBlouse();
        atPage.agregarCarritoPrintedDress();
        atPage.agregarCarritoPrintedSummer();

    }

    @And("^Se valida el inicio de sesión \"([^\"]*)\"$")
    public void seValidaElInicioDeSesión(String setNumberCredentials) throws Throwable {
        login.validarLogin(setNumberCredentials);
    }

    @And("^Ingreso en la categoría Women$")
    public void ingresoEnLaCategoríaWomen() throws Throwable{
        atPage.clickButtonWomen();
    }

    @Then("^Valido que estén los cuatro productos seleccionados$")
    public void validoQueEsténLosCuatroProductosSeleccionados() throws Throwable{
        atPage.comprobarPrecio();
        atPage.procederCheckout();
    }
}
