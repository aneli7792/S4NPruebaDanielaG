package com.s4n.pruebaDanielaG.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.s4n.pruebaDanielaG.model.DatosModel;
import com.s4n.pruebaDanielaG.user_interface.RegistroPage;
import com.s4n.pruebaDanielaG.util.WaitResponse;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarInformacion implements Task {

	DatosModel datosModel;

	public IngresarInformacion(DataTable dtDatos) {
		this.datosModel = new DatosModel(dtDatos);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(datosModel.getNombre()).into(RegistroPage.NOMBRE),
				Enter.theValue(datosModel.getApellido()).into(RegistroPage.APELLIDO),
				Enter.theValue(datosModel.getCorreo()).into(RegistroPage.EMAIL),
				Enter.theValue(datosModel.getContrasena()).into(RegistroPage.CONTRASEÑA),
				Enter.theValue(datosModel.getFechanac()).into(RegistroPage.FECHANAC));
		if (datosModel.getSexo().contains("femenino"))
			actor.attemptsTo(Click.on(RegistroPage.SEXO_FEMENINO));
		else if (datosModel.getSexo().contains("masculino"))
			actor.attemptsTo(Click.on(RegistroPage.SEXO_MASCULINO));
		actor.attemptsTo(Click.on(RegistroPage.BTN_CREAR));
		WaitResponse.forAWhile(2000);
	}

	public static IngresarInformacion con(DataTable dtDatos) {
		return instrumented(IngresarInformacion.class, dtDatos);
	}
}
