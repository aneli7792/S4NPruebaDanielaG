package com.s4n.pruebaDanielaG.step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.s4n.pruebaDanielaG.questions.Resultado;
import com.s4n.pruebaDanielaG.task.AbrirPagina;
import com.s4n.pruebaDanielaG.task.IngresarInformacion;
import com.s4n.pruebaDanielaG.user_interface.RegistroPage;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CreacionCuentaStep_Definitions {

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor user = Actor.named("User");
	RegistroPage page;

	@Before
	public void setup() {
		user.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^yo quiero crear mi cuenta$")
	public void yo_quiero_crear_mi_cuenta() throws Exception {
		user.wasAbleTo(AbrirPagina.at(page));
	}

	@When("^yo ingrese mis datos y seleccione crear cuenta$")
	public void yo_ingrese_mis_datos_y_seleccione_crear_cuenta(DataTable dtDatos) throws Exception {
		user.attemptsTo(IngresarInformacion.con(dtDatos));
	}

	@Then("^yo deberia quedar con una cuenta creada$")
	public void yo_deberia_quedar_con_una_cuenta_creada() throws Exception {
		user.should(seeThat(Resultado.is(), equalTo(1)));
	}
}
