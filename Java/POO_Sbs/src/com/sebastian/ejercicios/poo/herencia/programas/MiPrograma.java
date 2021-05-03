package com.sebastian.ejercicios.poo.herencia.programas;

import com.sebastian.ejercicios.poo.herencia.aves.DatosPersonales;
import com.sebastian.ejercicios.poo.herencia.aves.tropicales.Loro;
import com.sebastian.ejercicios.poo.herencia.estrellastv.Piolin;

public class MiPrograma {
	
	public static void main1(String[] args) {
		Piolin p = new Piolin('M', 4, 98);
		Loro l = new Loro('H', 7, 'O');
		
		p.altura();
		l.deDondeEres();
		p.setTamanho(16);
		p.altura();
		l.setRegion('E');
		p.getNumeroDeAvesCreadas();
	}
	
	public static void main(String[] args) {
		Piolin[] piolines = new Piolin[3];
		
		for (int i = 0; i < piolines.length; i++) 
			piolines[i] = new Piolin('M', 4 + i, 98 + i);
		
		DatosPersonales dp = new DatosPersonales("Piolin", "Silvestre");
		piolines[1].setNombresDeLaClase(dp);
		
		Loro l = new Loro('H', 7, 'O');
		
		
		l.cantar();
		
		for (Piolin piolin : piolines) 
			piolin.cantar();
		
		System.out.println(piolines[1].getNombresDeLaClase().toString());
	}
}
