package edu.jpribio.Servicios;

import java.util.List;
import java.util.Scanner;

import edu.jpribio.Dtos.VentasDtos;

/**
 * Interfaz donde se encuentra la cabecera de los metodos empleado
 * JPR-1/3/2024
 */
public interface EmpleadoInterfaz {
	
	/**
	 * metodod de dar de alta una venta 
	  * JPR-1/3/2024
	 * @param listaVentas
	 * @param sc
	 */
	
	public void darDeAltaVenta(List<VentasDtos> listaVentas, Scanner sc);
	
	/**
	 * Metodo del calculo total diario de ventas 
	 * JPR-173/2024
	 * @param listaVentas
	 * @param sc
	 */
	
	public void calculoTotalVentasDiario(List<VentasDtos> listaVentas,Scanner sc);

}
