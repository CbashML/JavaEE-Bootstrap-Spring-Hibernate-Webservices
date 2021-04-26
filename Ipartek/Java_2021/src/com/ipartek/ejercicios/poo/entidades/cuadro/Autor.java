package com.ipartek.ejercicios.poo.entidades.cuadro;

import com.ipartek.ejercicios.poo.entidades.Fecha;

public class Autor {

	private String nombre;
	private String apellidos;
	private boolean fallecido;
	private Fecha anhoDeNacimiento;
	
	public Autor(String nombre, String apellidos, boolean fallecido, Fecha anhoDeNacimiento) {
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
	public Fecha getAnhoDeNacimiento() {
		return anhoDeNacimiento;
	}
	public void setAnhoDeNacimiento(Fecha anhoDeNacimiento) {
		this.anhoDeNacimiento = anhoDeNacimiento;
	}
	
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellidos=" + apellidos + ", fallecido=" + fallecido
				+ ", anhoDeNacimiento=" + anhoDeNacimiento + "]";
	}
	
}
