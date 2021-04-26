package com.ipartek.ejercicios.poo.entidades.cuadro;

public class TamanhoLienzo {
	
	private float altura;
	private float anchura;
	
	public TamanhoLienzo(float altura, float anchura) {
		setAltura(altura);
		setAnchura(anchura);
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getAnchura() {
		return anchura;
	}
	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	@Override
	public String toString() {
		return "TamanhoLienzo [altura=" + altura + ", anchura=" + anchura + "]";
	}
	
}
