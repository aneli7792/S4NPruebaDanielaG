package com.s4n.pruebaDanielaG.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/CreacionCuenta.feature", glue = {
		"com.s4n.pruebaDanielaG.step_definitions" })
///S4NPruebaDanielaG/src/test/resources/features/CreacionCuenta.feature
public class CreacionCuentaRunner {

}
