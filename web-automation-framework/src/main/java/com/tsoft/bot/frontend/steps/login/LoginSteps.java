package com.tsoft.bot.frontend.steps.login;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.pages.compra.*;
import com.tsoft.bot.frontend.pages.pages.login.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private final LoginPage login = new LoginPage(driver);
    private final AutomationPracticeHomePage atHomePage = new AutomationPracticeHomePage(driver);
    private final AutomationPracticeCartLogin atCartLogin = new AutomationPracticeCartLogin(driver);
    private final AutomatinoPracticeSummary atSummary = new AutomatinoPracticeSummary(driver);
    private final AutomationPracticeCartAddress atCartAddress = new AutomationPracticeCartAddress(driver);
    private final AutomationPracticeWomenPage atWomenPage = new AutomationPracticeWomenPage(driver);

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

    @Then("^Se valida el inicio de sesion \"([^\"]*)\"$")
    public void seValidaElInicioDeSesion(String setNumberCredentials) throws Throwable {
        login.validarLogin(setNumberCredentials);
    }

    @And("^Ingreso en la categoria Women$")
    public void ingresoEnLaCategoriaWomen() throws Throwable {
        atHomePage.clickButtonWomen();
    }

    @And("^Agrego cuatro productos al carrito$")
    public void agregoCuatroProductosAlCarrito() throws Throwable {
        atWomenPage.agregarCarritoFadedShortSleeve();
        atWomenPage.agregarCarritoBlouse();
        atWomenPage.agregarCarritoPrintedDress();
        atWomenPage.agregarCarritoPrintedSummer();

    }

    @And("^Valido que esten los cuatro productos seleccionados$")
    public void validoQueEstenLosCuatroProductosSeleccionados() throws Throwable {
        atSummary.comprobarPrecio();
        atSummary.procederCheckout();
    }
}
