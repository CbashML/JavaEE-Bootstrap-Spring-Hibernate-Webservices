package com.ipartek.ejercicios.poo.entidades.cuadro;

import java.time.LocalDate;

public class Autor {

	private String nombre;
	private String apellidos;
	private boolean fallecido;
	private LocalDate anhoDeNacimiento;
	
	public Autor(String nombre, String apellidos, boolean fallecido, LocalDate anhoDeNacimiento) {
		setNombre(nombre);
		setApellidos(apellidos);
		setFallecido(fallecido);
		setAnhoDeNacimiento(anhoDeNacimiento);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public boolean isFallecido() {
		return fallecido;
	}
	public void setFallecido(boolean fallecido) {
		this.fallecido = fallecido;
	}
	public LocalDate getAnhoDeNacimiento() {
		return anhoDeNacimiento;
	}
	public void setAnhoDeNacimiento(LocalDate anhoDeNacimiento) {
		this.anhoDeNacimiento = anhoDeNacimiento;
	}
	
}
