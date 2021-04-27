package com.sebastian.ejercicios.poo.entidades;

public class Fecha {

	private int dia;
	private int mes;
	private int anho;

	public Fecha() {
		super();
	}

	public Fecha(int dia, int mes, int anho) {
		setDia(dia);
		setMes(mes);
		setAnho(anho);
		if (!fechaCorrecta()) {
			System.out.println("Fecha invalida");
			setDia(1);
			setMes(1);
			setAnho(1);
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	public boolean fechaCorrecta() {
		boolean anhoCorrecto, mesCorrecto, diaCorrecto;
		anhoCorrecto = getAnho() > 0;
		mesCorrecto = 1 <= getMes() && getMes() <= 12;
		switch (getMes()) {
		case 2:
			if (esBisiesto())
				diaCorrecto = getDia() >= 1 && getDia() <= 29;
			else
				diaCorrecto = getDia() >= 1 && getDia() <= 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = getDia() >= 1 && getDia() <= 30;
			break;
		default:
			diaCorrecto = getDia() >= 1 && getDia() <= 31;
		}
		return anhoCorrecto && mesCorrecto && diaCorrecto;
	}

	private boolean esBisiesto() {
		if ((anho % 4 == 0 && anho % 100 != 0) || (anho % 100 == 0 && anho % 400 == 0))
			return true;
		return false;
	}

	public boolean diaSiguiente() {
		int dia = getDia();
		int mes = getMes();
		int anho = getAnho();
		if (getMes() == 2) {
			if (esBisiesto()) {
				if (getDia() == 29) {
					setMes(3);
					setDia(1);
				}
			} else if (getDia() == 28) {
				setMes(3);
				setDia(1);
			}
		}else if (getMes() == 12) {
			setAnho(anho + 1);
			setMes(1);
			setDia(1);
		}else if (getDia() == 31){

			setMes(mes + 1);
			setDia(1);
		} else 
			setDia(dia + 1);
		
		
		if (fechaCorrecta())
			return true;
		rollback(dia, mes, anho);
		return false;
	}

	private void rollback(int dia, int mes, int anho) {
		setDia(dia);
		setMes(mes);
		setAnho(anho);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if (getDia() < 10)
			sb.append("0");
		sb.append(getDia()).append('-');
		if (getMes() < 10)
			sb.append("0");
		sb.append(getMes()).append('-');
		sb.append(getAnho());
		return sb.toString();
	}

}
