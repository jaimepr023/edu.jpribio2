package edu.jpribio.Servicios;

import java.util.List;
import java.util.Scanner;

import edu.jpribio.Dtos.PedidosDtos;
import edu.jpribio.Dtos.VentasDtos;

/**
 * Interfaz donde se encuentra la cabecera de los metodos del gerente JPR-
 * 1/3/2024
 */

public interface GerenteInterfaz {

	/**
	 * Cabecera del metodo de mostrar ventas JPR-1/3/2024
	 * 
	 * @param listaVentas
	 * @param sc
	 */

	public void mostrarventasDia(List<VentasDtos> listaVentas, Scanner sc);

	/**
	 * Cabecera del metodo de crear un pedido 
	 * JPR-1/3/2024
	 * @param listaPedidos
	 * @param sc
	 */

	public void crearPedido(List<PedidosDtos> listaPedidos, Scanner sc);
}
