package edu.jpribio.Dtos;

import java.time.LocalDate;

/**
 * Clase donde se encuentra todos los atributos 
 * JPR-1/3/2024
 */
public class PedidosDtos {
	
	int id; 
	String nombreDelProducto="aaaaa";
	int cantidadDelProducto = 0;
	LocalDate fecha;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreDelProducto() {
		return nombreDelProducto;
	}
	public void setNombreDelProducto(String nombreDelProducto) {
		this.nombreDelProducto = nombreDelProducto;
	}
	public int getCantidadDelProducto() {
		return cantidadDelProducto;
	}
	public void setCantidadDelProducto(int cantidadDelProducto) {
		this.cantidadDelProducto = cantidadDelProducto;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public PedidosDtos(int id, String nombreDelProducto, int cantidadDelProducto, LocalDate fecha) {
		super();
		this.id = id;
		this.nombreDelProducto = nombreDelProducto;
		this.cantidadDelProducto = cantidadDelProducto;
		this.fecha = fecha;
	}
	
	public PedidosDtos() {
		super();
	}
	@Override
	public String toString() {
		return "Producto: " + nombreDelProducto + "\n Cantidad: " + cantidadDelProducto
				+ "\n Fecha entrega: " + fecha ;
	}
	
	
	

}
