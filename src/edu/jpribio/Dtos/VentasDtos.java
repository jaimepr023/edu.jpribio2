package edu.jpribio.Dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Clase donde se encuentra todos los atributos relacionados con las ventas
 * JPR-1/3/2024
 */

public class VentasDtos {

	int id;
	float cantidadVEntas = 0;
	LocalDateTime fechaInstante = LocalDateTime.now();
	LocalDate fechaHoy = LocalDate.now();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getCantidadVEntas() {
		return cantidadVEntas;
	}

	public void setCantidadVEntas(int cantidadVEntas) {
		this.cantidadVEntas = cantidadVEntas;
	}

	public LocalDateTime getFechaInstante() {
		return fechaInstante;
	}

	public void setFechaInstante(LocalDateTime fechaInstante) {
		this.fechaInstante = fechaInstante;
	}

	public LocalDate getFechaHoy() {
		return fechaHoy;
	}

	public void setFechaHoy(LocalDate fechaHoy) {
		this.fechaHoy = fechaHoy;
	}

	public VentasDtos(int id, float cantidadVEntas) {
		super();
		this.id = id;
		this.cantidadVEntas = cantidadVEntas;
		this.fechaInstante = fechaInstante;
		this.fechaHoy = fechaHoy;
	}

	public VentasDtos() {
		super();
	}

	@Override
	public String toString() {
		return " Venta número: " + id + "\n ,Euros: " + cantidadVEntas + "euros" + "\n , Instante de compra:"
				+ fechaInstante;
	}

}
