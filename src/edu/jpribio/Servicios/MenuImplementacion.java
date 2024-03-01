package edu.jpribio.Servicios;

import java.util.Scanner;

/**
 * Clase de implementacion donde se encuentra los metodos de la interfaz menu
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int menuPrincipal(Scanner sc) {
		int opcion;
		System.out.println("------------------------------");
		System.out.println("Opcion 0. Cerrar menu");
		System.out.println("Opcion 1. Version empleado.");
		System.out.println("Opcion 2. Version gerente");
		System.out.println("------------------------------");
		System.out.println("Elija una opcion por favor");
		opcion = sc.nextInt();
		return opcion;
	}

	@Override
	public int menuEmpleado(Scanner sc) {
		System.out.println("Se ha activado la version del empleado.");
		int opcion;
		System.out.println("------------------------------");
		System.out.println("Opcion 0. Volver al menu principal.");
		System.out.println("Opcion 1. Añadir venta.");
		System.out.println("Opcion 2. Calcular las ventas diarias.");
		System.out.println("------------------------------");
		System.out.println("Elija una opcion por favor");
		opcion = sc.nextInt();
		return opcion;
	}

	@Override
	public int menuGerente(Scanner sc) {
		System.out.println("Se ha activado la version del gerente.");
		int opcion;
		System.out.println("------------------------------");
		System.out.println("Opcion 0. Volver al menu principal.");
		System.out.println("Opcion 1. Mostrar ventas del dia");
		System.out.println("Opcion 2. Crear pedido para los proveedores.");
		System.out.println("------------------------------");
		System.out.println("Elija una opcion por favor");
		opcion = sc.nextInt();
		return opcion;
	}

}
