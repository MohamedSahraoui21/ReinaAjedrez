package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	private Posicion posicion;
	private Color color;
public Reina() {
	posicion= new Posicion(1, 'd');
	color=color.BLANCO;
}

public Reina(Color color) {
	if (color==color.BLANCO) {
		posicion= new Posicion(1, 'd');
	}
	if (color==color.NEGRO) {
		posicion= new Posicion(8, 'd');
	}
    
}
public Posicion getPosicion() {
	return posicion;
}
public Color getColor() {
	return color;
}
private void setPosicion(Posicion posicion) {
	this.posicion = posicion;
}
private void setColor(Color color) {
	this.color = color;
}
 

}
