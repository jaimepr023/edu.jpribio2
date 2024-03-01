package edu.jpribio.Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.jpribio.Dtos.PedidosDtos;
import edu.jpribio.Dtos.VentasDtos;
import edu.jpribio.Servicios.EmpleadoImplementacion;
import edu.jpribio.Servicios.EmpleadoInterfaz;
import edu.jpribio.Servicios.GerenteImplementacion;
import edu.jpribio.Servicios.GerenteInterfaz;
import edu.jpribio.Servicios.MenuImplementacion;
import edu.jpribio.Servicios.MenuInterfaz;

/**
 * Clase que se encuentra en la implementacion y es el inicio de esta misma ya que es el main(principal)
 * JPR-1/3/2024
 */
public class InicioApp {

	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();
		EmpleadoInterfaz ep = new EmpleadoImplementacion();
		GerenteInterfaz ge = new GerenteImplementacion();
		List<VentasDtos> ventas = new ArrayList<VentasDtos>();
		List<PedidosDtos> pedidos = new ArrayList<PedidosDtos>();
		Scanner sc = new Scanner(System.in);

		int opcionMenu;
		boolean cerrarMenu = false;

		while (!cerrarMenu) {
			opcionMenu = mi.menuPrincipal(sc);
			switch (opcionMenu) {

			case 0:
				System.out.println("Se cerrara el menu");
				cerrarMenu = true;
				break;
			case 1:
				int opcion1;
				opcion1 = mi.menuEmpleado(sc);
				switch (opcion1) {
				case 0:
					break;
				case 1:
					System.out.println("A continuacion podras añadir una venta nueva:");
					ep.darDeAltaVenta(ventas, sc);
					break;
				case 2:
					System.out.println("A continuacion podras ver LAs ventas diarias");
					ep.calculoTotalVentasDiario(ventas, sc);
					break;
				default:
					System.out.println(
							"Volvera al menu principal por no haber elegido ninguna de las opciones correctamente");
					break;
				}
				break;
			case 2:
				int opcion2;
				opcion2 = mi.menuGerente(sc);
				switch (opcion2) {
				case 0:
					break;
				case 1:
					ge.mostrarventasDia(ventas, sc);
					break;
				case 2:
					ge.crearPedido(pedidos, sc);
					break;
				default:
					System.out.println(
							"Volvera al menu principal por no haber elegido ninguna de las opciones correctamente");
					break;
				}
				break;
			default:
				System.out.println(
						"Volvera al menu principal por no haber elegido ninguna de las opciones correctamente");
				break;
			}
		}

	}

}
