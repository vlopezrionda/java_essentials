package src1.tareas;

import libs.Input;

public class Minimo_monedas {
	

	public static void main(String[] args) {
    double cambio;
	int contador=4;
	double monedas;
	double residuo;
    String Z;
	
	String x;
	
	
	//pregunta cuanto cambio te debo 
	System.out.println("¿Cuanto cambio te debo?");
	cambio=Input.get_float();
	
	cambio= Math.round(cambio * 100) / 100d;
	
	if (cambio>1) {
		
		Z="$";
		System.out.println(String.format("%.2f",cambio) + Z);	
		
	}
	if (cambio<1) {
		
		Z="c";
		System.out.println(Math.round(cambio*100) + Z);	
		
	}
	
	;
		while (contador>0) {
	
	
	//dividir por la moneda de mayor a menor
		if (contador == 4) {
			monedas = (cambio)/(0.25);
			residuo= (cambio) % (0.25);
			residuo= Math.round(residuo * 100) / 100d;
			x ="25c";
			
		}
       else if (contador ==3) {
 
		   monedas = (cambio)/(0.10);
		   residuo= (cambio) % (0.10);
		   residuo= Math.round(residuo * 100) / 100d;
		    x = "10c";
		   
       }
       else if (contador ==2) {

    	   monedas = (cambio)/(0.05);
    	   residuo= (cambio) % (0.05);
    	   residuo= Math.round(residuo * 100) / 100d;
    	   x = "5c";
    	 
       }
       else  {
    	   
    	   monedas = (cambio)/(0.01);
    	   residuo= (cambio) % (0.01);
    	   residuo= Math.round(residuo * 100) / 100d;
    	   x="1c";
    	 
       }

		System.out.println( x + " - "+ (int)monedas + " - " + (int)residuo);
		contador -=1;
		cambio= residuo;
 
	
	}
		
	
	}
	
	

	
	}


