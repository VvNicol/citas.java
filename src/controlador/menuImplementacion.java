/**
 * 
 */
package controlador;

import java.util.Scanner;

import servicios.menuInterface;

/**
 * 
 */
public class menuImplementacion implements menuInterface {

	Scanner sc = new Scanner(System.in);
	@Override
	public int MenuPrincipal() {
		System.out.println("-----------------------------");
		System.out.println("Menu principal");
		System.out.println("0. Cerrar");
		System.out.println("1. Consultar cita");
		System.out.println("2. Listado registro");
		System.out.println("-----------------------------");

		int opcionElegir = sc.nextInt();
		
		return opcionElegir;
	}

}
