package com.auto.nexos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "mercancia")

public class mercancia {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombreProducto;
	private int cantidad;
	public int getId() {
		return id;
		
		
		
	}
	public mercancia(String nombreProducto, int cantidad, String fechaIngreso, int idEmpleado) {
		super();
		
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.fechaIngreso = fechaIngreso;
		this.idEmpleado = idEmpleado;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	private String fechaIngreso;
	private int idEmpleado;

}
