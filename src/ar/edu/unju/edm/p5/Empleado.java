package ar.edu.unju.edm.p5;

public class Empleado {

	private String nombre;
	private String fechaIngreso;
	private String email;
	private float horasTrabajadas;
	private int legajo;
	
	public Empleado (String nombre,int legajo,int horasTrabajadas)
	{
		this.nombre=nombre;
		this.legajo=legajo;
		this.horasTrabajadas=horasTrabajadas;
	}
	
	public Empleado()
	{
		
	}
	
	public void calcularSueldo() {
		if(horasTrabajadas<=160)
		{
			int aux1=4000;
			System.out.println("Sueldo: $ "+horasTrabajadas*aux1);
		}
		else 
		{
			int aux2=5500;
			System.out.println("Sueldo: $ "+horasTrabajadas*aux2);
		}
	}
	
	public void impimirDatosEmpleado() {
		System.out.println("NOMBRE:"+nombre);
		System.out.println("FECHA DE INGRESO:"+ fechaIngreso);
		System.out.println("LEGAJO:"+legajo);
		System.out.println("EMAIL:"+email);
		System.out.println("HORASTRABAJADAS:"+horasTrabajadas);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(float horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	
}
