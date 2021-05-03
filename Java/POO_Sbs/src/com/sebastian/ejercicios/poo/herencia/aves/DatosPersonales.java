package com.sebastian.ejercicios.poo.herencia.aves;

public class DatosPersonales {

    private String nombreDelAve;
    private String nombreDelDuenho;

    public DatosPersonales(String nombreDelAve, String nombreDelDuenho) {
        this.setNombreDelAve(nombreDelAve);
        this.setNombreDelDuenho(nombreDelDuenho);
    }

    public String getNombreDelAve() {
        return nombreDelAve;
    }

    public void setNombreDelAve(String nombreDelAve) {
        this.nombreDelAve = nombreDelAve;
    }

    public String getNombreDelDuenho() {
        return nombreDelDuenho;
    }

    public void setNombreDelDuenho(String nombreDelDuenho) {
        this.nombreDelDuenho = nombreDelDuenho;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreDelAve == null) ? 0 : nombreDelAve.hashCode());
		result = prime * result + ((nombreDelDuenho == null) ? 0 : nombreDelDuenho.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DatosPersonales other = (DatosPersonales) obj;
		if (nombreDelAve == null) {
			if (other.nombreDelAve != null)
				return false;
		} else if (!nombreDelAve.equals(other.nombreDelAve))
			return false;
		if (nombreDelDuenho == null) {
			if (other.nombreDelDuenho != null)
				return false;
		} else if (!nombreDelDuenho.equals(other.nombreDelDuenho))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DatosPersonales [nombreDelAve=" + nombreDelAve + ", nombreDelDuenho=" + nombreDelDuenho + "]";
	}
    
    
}
