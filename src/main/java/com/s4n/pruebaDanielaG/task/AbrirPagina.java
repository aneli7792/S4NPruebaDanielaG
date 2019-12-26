package com.s4n.pruebaDanielaG.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

	PageObject page;

	public AbrirPagina(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.wasAbleTo(Open.browserOn(page));

	}

	public static AbrirPagina at(PageObject page) {
		return instrumented(AbrirPagina.class, page);
	}

}
