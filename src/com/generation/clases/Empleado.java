package com.generation.clases;

/**
 * 
 * @author Jonathan Quino
 * @Descripcion Clase Empleado s
 *
 */
public class Empleado {

	private String nombre;
	private String apellido;
	private double salarioMensual;
	
	
	public Empleado(String nombre, String apellido, double salarioMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioMensual = salarioMensual;
	}
	
	public void aumentoSalario() {
		this.salarioMensual += this.salarioMensual*0.10;
	}
	
	public double getSalarioAnual() {
		return this.salarioMensual*12;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	
}
