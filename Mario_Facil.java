package src1.tareas;

//import libs.Input;

public class Mario_Facil {
	
	public static void main(String[]args) {
		//    ##
		//   ###
		//  ####
		// #####
		//######
		String espacio =" ";
		String gato = "#";
		int control=5;
		int numero_esp;
		int numero_gato;
		int x=4;
		int z=2;
while(control>0) {
	
		
for(numero_esp=x; numero_esp > 0 ; numero_esp -= 1) {
			
			System.out.print(espacio);
}
for(numero_gato=0; numero_gato < z; numero_gato +=1) {
			System.out.print(gato);
}
System.out.println();

control -=1;
x -=1;

z +=1;


		}
		
		
		
	}
}


		
		
	
	


