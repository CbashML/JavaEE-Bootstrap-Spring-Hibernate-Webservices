package com.sebastian.ejercicios.poo.entidades;

public class Cuenta {

	private String nombre;
	private String numeroCuenta;
	private double tipoDeInteres;
	private double saldo;

	public Cuenta() {
	}

	public Cuenta(String nombre, String numeroDeCuenta, double tipoDeInteres, double saldo) {
		setNombre(nombre);
		setNumeroCuenta(numeroDeCuenta);
		setTipoInteres(tipoDeInteres);
		setSaldo(saldo);
	}

	public Cuenta(final Cuenta c) {
		setNombre(c.nombre);
		setNumeroCuenta(c.numeroCuenta);
		setTipoInteres(c.tipoDeInteres);
		setSaldo(c.saldo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroDeCuenta) {
		this.numeroCuenta = numeroDeCuenta;
	}

	public double getTipoInteres() {
		return tipoDeInteres;
	}

	public void setTipoInteres(double tipoDeInteres) {
		this.tipoDeInteres = tipoDeInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean ingreso(double cantidad) {
		boolean ingresoCorrecto = false;
		if (cantidad >= 0) {
			ingresoCorrecto = true;
			setSaldo(getSaldo() + cantidad);
		}
		return ingresoCorrecto;
	}

	public boolean reintegro(double cantidad) {
		boolean reintegroCorrecto = false;
		if (cantidad >= 0)
			if (getSaldo() - cantidad >= 0) {
				reintegroCorrecto = true;
				setSaldo(getSaldo() - cantidad);
			}
		return reintegroCorrecto;
	}
	
	public boolean transferencia(Cuenta cuentaDestino, double importe) {
		boolean transferenciaCorrecta = false;
		if (importe < getSaldo()) {
			transferenciaCorrecta = true;
			setSaldo(getSaldo() - importe);
			cuentaDestino.setSaldo(cuentaDestino.getSaldo() + importe);
		}
		return transferenciaCorrecta;
	}
	
}
