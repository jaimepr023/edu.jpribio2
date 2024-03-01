package edu.jpribio.Servicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import edu.jpribio.Dtos.VentasDtos;

/**
 * Clase que esta los metodos implementacios de la interfaz
 * JPR-1/3/2024
 */
public class EmpleadoImplementacion implements EmpleadoInterfaz {

	@Override
	public void darDeAltaVenta(List<VentasDtos> listaVentas, Scanner sc) {
		VentasDtos ventas = new VentasDtos();
		ventas.setId(idAutonumerico(listaVentas));
		System.out.println("Dame la cantidad de la proxima venta");
		ventas.setCantidadVEntas(sc.nextInt());
		
		listaVentas.add(ventas);

	}
	/**
	 * Metodo privado que realiza soola el id autonumerico
	 * JPR-1/3/2024
	 * @param listaVentas
	 * @return
	 */

	private int idAutonumerico(List<VentasDtos> listaVentas) {

		int id;
		int tamanoLista = listaVentas.size();
		if (tamanoLista <= 0) {
			id = 1;
		} else {
			id = listaVentas.get(tamanoLista - 1).getId() + 1;
		}

		return id;
	}

	@Override
	public void calculoTotalVentasDiario(List<VentasDtos> listaVentas, Scanner sc) {

		LocalDate fechaReal = formatear(sc);
		float x = 0;
		for (VentasDtos recorrer : listaVentas) {
			if (fechaReal.getDayOfMonth() == recorrer.getFechaInstante().getDayOfMonth()
					& fechaReal.getMonth() == recorrer.getFechaInstante().getMonth()
					& fechaReal.getYear() == recorrer.getFechaInstante().getYear()) {
				x += recorrer.getCantidadVEntas();
			}
		}

		Period periodo = Period.between(fechaReal, listaVentas.get(listaVentas.size() - 1).getFechaHoy());
		float min = periodo.getDays() * 24 * 60;

		System.out.println(
				"La cantidad total del dia se trata de: " + x + " y la diferencia en minutos se trata de: " + min);

	}
	/**
	 * Metodo privado que formatea una fecha 
	 * JPR-1/3/2024
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

}
