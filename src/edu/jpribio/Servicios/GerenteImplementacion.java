package edu.jpribio.Servicios;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import edu.jpribio.Dtos.PedidosDtos;
import edu.jpribio.Dtos.VentasDtos;

/**
 * Clase que se encuentra la implementacion de la interfaz de la parte gerente 
 * JPR-1/3/2024
 */

public class GerenteImplementacion implements GerenteInterfaz {

	@Override
	public void mostrarventasDia(List<VentasDtos> listaVentas, Scanner sc) {

		LocalDate fechaReal = formatear(sc);

		for (VentasDtos recorrer : listaVentas) {
			if (fechaReal.getDayOfMonth() == recorrer.getFechaInstante().getDayOfMonth()
					& fechaReal.getMonth() == recorrer.getFechaInstante().getMonth()
					& fechaReal.getYear() == recorrer.getFechaInstante().getYear()) {
				System.out.println(recorrer.toString());
			}
		}

	}

	/**
	 * Metodo privado que formatea una fecha JPR-1/3/2024
	 * 
	 * @param sc
	 * @return
	 */
	private LocalDate formatear(Scanner sc) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Dame la fecha que quieres recibir el importe total del dia");
		String fechaString = sc.next();

		LocalDate fechaReal = LocalDate.parse(fechaString, formato);
		return fechaReal;
	}

	@Override
	public void crearPedido(List<PedidosDtos> listaPedidos, Scanner sc) {
		String afirmacion;
		do {
			int id = idAutonumerico(listaPedidos);

			System.out.println("Dame el nombre del producto");
			String nombre = sc.next();
			System.out.println("Dame la cantidad del producto");
			int cantidad = sc.nextInt();
			LocalDate fecha = formatear(sc);
			
			PedidosDtos pedidos = new PedidosDtos(id,nombre,cantidad,fecha);
			
			System.out.println("¿Quieres volver a añadir otro pedido? (s/n)");
			afirmacion = sc.next();
		} while (afirmacion.equals("s"));
		
		for(PedidosDtos pedir : listaPedidos) {
			System.out.println(pedir.toString());
		}

	}

	/**
	 * Metodo privado que realiza soola el id autonumerico JPR-1/3/2024
	 * 
	 * @param listaVentas
	 * @return
	 */

	private int idAutonumerico(List<PedidosDtos> listaPedidos) {

		int id;
		int tamañoLista = listaPedidos.size();
		if (tamañoLista <= 0) {
			id = 1;
		} else {
			id = listaPedidos.get(tamañoLista - 1).getId() + 1;
		}

		return id;
	}

}
