package com.s4n.pruebaDanielaG.questions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Resultado implements Question<Integer> {

	private static WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

	@Override
	public Integer answeredBy(Actor actor) {
		Alert alert = driver.switchTo().alert();
		if (alert.getText().contains("Bienvenido"))
			return 1;
		else
			return 0;

	}

	public static Question<? extends Integer> is() {
		return new Resultado();
	}
}
