package com.sebastian.ejercicios.poo.entidades.cuadro;

public class Cuadro {
	
	private String titulo;
	private Autor autor;
	private TamanhoLienzo tamanhoLienzo;
	private int anho;
	private boolean restaurado;
	private double precio;
	
	public Cuadro(String titulo, Autor autor, TamanhoLienzo tamanhoLienzo, int anho, boolean restaurado,
			double precio) {
		setTitulo(titulo);
		setAutor(autor);
		setTamanhoLienzo(tamanhoLienzo);
		setAnho(anho);
		setRestaurado(restaurado);
		setPrecio(precio);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public TamanhoLienzo getTamanhoLienzo() {
		return tamanhoLienzo;
	}
	public void setTamanhoLienzo(TamanhoLienzo tamanhoLienzo) {
		this.tamanhoLienzo = tamanhoLienzo;
	}
	public int getAnho() {
		return anho;
	}
	public void setAnho(int anho) {
		this.anho = anho;
	}
	public boolean isRestaurado() {
		return restaurado;
	}
	public void setRestaurado(boolean restaurado) {
		this.restaurado = restaurado;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cuadro [titulo=" + titulo + ", autor=" + autor.toString() + ", tamanhoLienzo=" + tamanhoLienzo.toString() + ", anho=" + anho
				+ ", restaurado=" + restaurado + ", precio=" + precio + "]";
	}
	
}
