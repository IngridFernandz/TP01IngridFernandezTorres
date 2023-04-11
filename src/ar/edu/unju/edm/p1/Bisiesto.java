package ar.edu.unju.edm.p1;

public class Bisiesto {

	public void esBisiesto(int año) {
		if (año%4 ==0 && año%100!=0 || año%400 ==0)
		{
			System.out.println("EL AÑO ES BISIESTO");
		}
		else 
		{
			System.out.println("EL AÑO NO ES BISIESTO");
		}
	}
	
}
