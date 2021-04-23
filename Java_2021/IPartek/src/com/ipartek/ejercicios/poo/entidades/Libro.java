package com.ipartek.ejercicios.poo.entidades;

public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	public Libro() {}
	
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public int getPrestados() {
		return prestados;
	}
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + "]";
	}
	
	public boolean prestamo() {
		boolean prestamoCorrecto = false;
		if(getEjemplares() > 0) {
			setPrestados(getPrestados() + 1);
			setEjemplares(getEjemplares() - 1);
			
		}
		return prestamoCorrecto;
	}
}
