package src1.tareas;

import libs.Input;

public class Botellas_agua {
	public static void main(String[]args) {
		//preguntar cuantos minutos se toma en la ducha
		int minutos;
		System.out.println("¿Cuántos minutos te tomas para ducharte?");
		minutos=Input.get_int();
		//Conversion de minutos a botellas de agua
		System.out.println("Los " + minutos + " minutos que usas para ducharte equivalen a " + (12 * minutos) + " botellas de agua");
	}

}
