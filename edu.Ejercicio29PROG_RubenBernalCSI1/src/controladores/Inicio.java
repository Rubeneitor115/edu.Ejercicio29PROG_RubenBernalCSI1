/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Clase controladora de la aplicacion
 * rbr - 151224
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 151224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Obtengo la fecha actual
		LocalDate fecha = LocalDate.now();
		
		//Obtengo la fecha y hora actual para despues extraer y mostrar por consola solo la hora
		LocalDateTime fechaYHora = LocalDateTime.now();
		
		//Muestro por consola la fecha actual
		System.out.println("La fecha actual es: " + fecha);
		
		//Muestro por consola la hora actual
		System.out.println("La hora actual es: " + fechaYHora.getHour() + ":" + fechaYHora.getMinute() + ":" + fechaYHora.getSecond());

	}

}
