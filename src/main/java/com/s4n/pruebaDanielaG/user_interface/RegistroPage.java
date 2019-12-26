package com.s4n.pruebaDanielaG.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://3.87.50.247:3000/#/")

public class RegistroPage extends PageObject {

	public static final Target NOMBRE = Target.the("Nombre").locatedBy("//input[@id='id_nombre']");
	public static final Target APELLIDO = Target.the("Apellido").locatedBy("//input[@id='id_apellido']");
	public static final Target EMAIL = Target.the("Correo Electronico").locatedBy("//input[@id='id_email']");
	public static final Target CONTRASEÑA = Target.the("Contraseña").locatedBy("//input[@id='id_password']");
	public static final Target FECHANAC = Target.the("Fecha Nacimiento").locatedBy("//input[@name='birthdate']");
	public static final Target SEXO_FEMENINO = Target.the("Sexo Femenino").locatedBy("//input[@id='id_genero_mujer']");
	public static final Target SEXO_MASCULINO = Target.the("Sexo Masculino")
			.locatedBy("//input[@id='id_genero_hombre']");
	public static final Target BTN_CREAR = Target.the("Boton de crear")
			.locatedBy("//button[contains(text(),'Crear cuenta')]");

}
