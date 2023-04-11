package ar.edu.unju.edm.p3;

public class Primo {
	public void esPrimo(int numero)
	{
 		int cont=0;
		for (int i=1;i<=numero;i++)
		{
			if(numero%i==0)
			{
				cont++;
			}
		}
		if (cont==2)
		{
			System.out.println(numero);
		}
	}

}
