package com.generation.clases;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Jonathan Quino
 * @Description Clase que servira de contador de empleados
 *
 */
public class Empresa {
	private Set<Empleado> contador;
	
	public Empresa() {
		this.contador = new HashSet<Empleado>();
	}
	/**
	 * @Description Metodo para agregar nuevo empleado a traves de la clase empresa
	 * @param empleado
	 */
	public void agregarNuevoEmpleado(Empleado empleado) {
		this.contador.add(empleado);
	}
	
	/**
	 * @Description Metodo para regresar el numero de empleados registrados
	 * @return
	 */
	public int contarEmpleados() {
		return this.contador.size();
	}

	public Set<Empleado> getContador() {
		return contador;
	}

	public void setContador(Set<Empleado> contador) {
		this.contador = contador;
	}
	
	
}
