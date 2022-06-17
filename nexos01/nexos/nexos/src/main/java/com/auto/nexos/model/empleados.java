package com.auto.nexos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity

@Table (name = "empleados")
public class empleados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String empleado;
	private int edad;
	public int getId() {
		return id;		
	}
	
	@ManyToOne
	@JoinColumn (name= "id_cargo")	
	private cargo cargo;
	
	@OneToMany
	@JoinColumn (name= "id_mercancia")
	private mercancia mercancia;
	
	public empleados(String empleado, int edad, int idCargo, String fechaIngreso) {
		super();
	
		this.empleado = empleado;
		this.edad = edad;
		this.idCargo = idCargo;
		this.fechaIngreso = fechaIngreso;
	}
	public void setId(int id) {
		this.id = id; 
	}
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	private int idCargo;
	private String fechaIngreso;
	
	
	}
