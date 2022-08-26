package com.generation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.clases.Empleado;
import com.generation.clases.Empresa;

/**
 * 
 * @author Jonathan Quino
 * @Description Test para la clase empleado
 *
 */
class EmpleadoTest {

	@Test
	void testEmpleado() {
		//Se instancian la clase de contados y dos empleados
		Empresa empresa = new Empresa();
		Empleado empleadoTest1 = new Empleado("Nombre1","Apellido1",12500.0);
		
		//Una vez se crea un empleado1, se agrega al contador de empresa
		empresa.agregarNuevoEmpleado(empleadoTest1);
		
		Empleado empleadoTest2 = new Empleado("Nombre2","Apellido2",2500.0);
		
		//Una vez se crea un empleado1, se agrega al contador de empresa
		empresa.agregarNuevoEmpleado(empleadoTest2);
		
		//El salario anual de ambos empleados antes del aumento
		System.out.println("El salario anual del empleadoTest1 es = "+ empleadoTest1.getSalarioAnual());
		System.out.println("El salario anual del empleadoTest2 es = "+ empleadoTest2.getSalarioAnual());
		
		//	Se aumenta el salario en ambos empleados
		
		empleadoTest1.aumentoSalario();
		empleadoTest2.aumentoSalario();
		
		//Verificar que el salario mensual haya aumentado en 10%
		assertEquals(empleadoTest1.getSalarioMensual(), 13750.0);
		assertEquals(empleadoTest2.getSalarioMensual(), 2750.0);
		
		//Verificar que el salario anual incluya el 10%
		assertEquals(empleadoTest1.getSalarioAnual(), 165000.0);
		assertEquals(empleadoTest2.getSalarioAnual(), 33000.0);
		
		//El salario anual de ambos empleados despues del aumento
		System.out.println("El salario anual del empleadoTest1 despues del aumento es = "+ empleadoTest1.getSalarioAnual());
		System.out.println("El salario anual del empleadoTest2 despues del aumento es = "+ empleadoTest2.getSalarioAnual());
		
		//Mostrar el numero de empleados que tiene el contador 
		System.out.println("El número de empleados registrados en la empresa han sido = "+ empresa.contarEmpleados());
		
	}

}
