package com.s4n.pruebaDanielaG.model;

import cucumber.api.DataTable;

public class DatosModel {

	private String nombre;
	private String apellido;
	private String correo;
	private String contrasena;
	private String fechanac;
	private String sexo;

	public DatosModel(DataTable dtDatos) {

		this.nombre = dtDatos.asList(String.class).get(0);
		this.apellido = dtDatos.asList(String.class).get(1);
		this.correo = dtDatos.asList(String.class).get(2);
		this.contrasena = dtDatos.asList(String.class).get(3);
		this.fechanac = dtDatos.asList(String.class).get(4);
		this.sexo = dtDatos.asList(String.class).get(5);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getFechanac() {
		return fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
