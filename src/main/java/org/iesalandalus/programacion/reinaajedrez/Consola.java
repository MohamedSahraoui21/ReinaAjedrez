package org.iesalandalus.programacion.reinaajedrez;

public class Consola {
	private Consola() {

	}

	public static void mostrarMenu() {
		System.out.println("1-crear reina por defecto");
		System.out.println("2-crear reina eligiendo el color");
		System.out.println("3-mover reina");
		System.out.println("4-salir");

	}

	public static void elegirOpcionMenu() {
		int opcion = 0;
		try {
			mostrarMenu();
			System.out.print("Elige una opcion: ");
			while (opcion != 4) {
				switch (opcion) {
				case 1:
					
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:
					
					break;

				default:
					System.out.println("Debe introducir un numero entre 1 y 4");
					break;
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}
	}
}
