package ar.edu.unju.edm.p4;
import ar.edu.unju.edm.p4.PAR;
import ar.edu.unju.edm.p4.Impar;
public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int limiteinferior=2;
      int limitesuperior=10;
      PAR numero1 =new PAR();
      Impar numero2 =new Impar();
      String cadena= "PAR";
      if (cadena=="PAR")
      {
    	  for(int i=limiteinferior+1; i<limitesuperior;i++)
    	  {
    		numero1.espar(i);  
    	  }
      }
      else 
      {
    	  for(int i=limiteinferior+1; i<limitesuperior;i++)
    	  {
    		numero2.esimpar(i);  
    	  }
      }
	} 

}

