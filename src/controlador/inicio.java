/**
 * 
 */
package controlador;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dtos.citasDto;
import servicios.menuInterface;

/**
 * 
 */
public class inicio {

	/**
	 * @param args
	 */
	public static List<citasDto> citaLista = new ArrayList<citasDto>();
    static LocalTime fechaActual = LocalTime.now();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static String fechaFormateada = fechaActual.format(formatter);
    static String ficheroLog = fechaFormateada + "ficheroLog.txt";
	public static void main(String[] args) {

		menuInterface mi = new menuImplementacion();
		int opcionSeleccionada;
		boolean esCerrado = false;

		try {

			do {

				opcionSeleccionada = mi.MenuPrincipal();

				switch (opcionSeleccionada) {

				case 0:
					esCerrado = true;
					System.out.println("El menu se ha cerrado");
					break;
				case 1:

					break;
				case 2:
					break;

				default:
					System.out.println("La opcion no es valida");
					break;
				}

			} while (!esCerrado);
			
		} catch (Exception e) {
			System.out.println("No se ha podido leer/escribir" + e.getMessage());
			e.printStackTrace();

		}

	}

}
