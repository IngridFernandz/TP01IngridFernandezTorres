package ar.edu.unju.edm.p5;
import ar.edu.unju.edm.p5.*;
public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Empleado Empleado1=new Empleado();
		Empleado Empleado2 =new Empleado("Ingrid",122,162);
		
		Empleado1.setNombre("Flabio");
		Empleado1.setFechaIngreso("22/12/2023");
		Empleado1.setLegajo(234);
		Empleado1.setEmail("Flabio@gmail.com");
		Empleado1.setHorasTrabajadas(124);
		
		System.out.println("EMPLEADO 1: ");
		Empleado1.impimirDatosEmpleado();
		Empleado1.calcularSueldo();
		
		System.out.println("EMPLEADO 2: ");
		Empleado2.impimirDatosEmpleado();
		Empleado2.calcularSueldo();
		
	}

}
