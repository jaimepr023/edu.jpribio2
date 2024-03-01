package edu.jpribio.Servicios;

import java.util.Scanner;
/**
 * Interfaz donde se encuentra la cabecera de los metodos menu
 * JPR-1/3/2024
 */

public interface MenuInterfaz {
	
	/**
	 * Metodod que escribe por pantalla el menu principal
	 * JPR-1/3/2024
	 * @param sc
	 * @return
	 */
	
	public int menuPrincipal(Scanner sc);
	
	/**
	 * Metodod que escribe por pantalla el menu empleado
	 * JPR-1/3/2024
	 * @param sc
	 * @return
	 */
	public int menuEmpleado(Scanner sc);
	/**
	 * Metodod que escribe por pantalla el menu gerente
	 * JPR-1/3/2024
	 * @param sc
	 * @return
	 */
	
	public int menuGerente(Scanner sc);

}
