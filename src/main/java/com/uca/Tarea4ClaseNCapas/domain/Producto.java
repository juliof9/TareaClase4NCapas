package com.uca.Tarea4ClaseNCapas.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(min=12, max=12, message="El codigo del producto tiene que ser de 12 digitos")
	String codProducto;
	
	@Size(min=1, max=100, message="El campo debe tener longitud entre 1 y 100 caracteres")
	String nombre, marca;
	
	@Size(min=1, max=500, message="El campo debe tener longitud entre 1 y 500 caracteres")
	String descripcion;
	
	@Pattern(regexp="^[0-9]*", message="El campo no debe tener decimales y debe ser un numero entero")
	String existencias;
	
	@Pattern(regexp="^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$", 
			message="La fecha tiene que seguir el siguiente formato: (dd-mm-yyyy)")
	String fecha;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExistencias() {
		return existencias;
	}
	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}
	public String getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha (String fecha) {
		this.fecha = fecha;
	}
	

}
