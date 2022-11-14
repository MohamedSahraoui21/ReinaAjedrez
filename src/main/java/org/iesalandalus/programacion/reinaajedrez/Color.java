package org.iesalandalus.programacion.reinaajedrez;

public enum Color {
	BLANCO("Blanco"),NEGRO("Negro");
	String CadenaMostrar;

	private Color(String cadenaMostrar) {
		this.CadenaMostrar = cadenaMostrar;
	}
	
   @Override
   public String toString() {
	   return String.format(CadenaMostrar);
   }
   
}
