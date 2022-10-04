package ud06ej08;

import java.util.Scanner;

public class Ud06Ej08App {

	public static void main(String[] args) {
		//Creo el array con 10 posiciones
		double a_posiciones[] = new double [10];
		//creo una variable con el vector lleno
		double v_lleno[]=rellenarValores(a_posiciones);
		mostrarValores(v_lleno);

	}
	
	//Metodo para rellenar valores
	public static double[] rellenarValores(double vector[]) {
		//preparo el comando para que entren por comando los valores
		Scanner sc = new Scanner(System.in);
		//con un for permito que introduzcan un valor por cada indice
		for (int i=0; i<vector.length;i++) {
			System.out.print("Introduzca el valor para el indice "+i+" del array ");
			String val=sc.nextLine();
			double val_num = Double.parseDouble(val);
			vector[i]=val_num;		
		}
		sc.close();
		return vector;
	}
	
	//Metodo para mostrar valores
	public static void mostrarValores(double vector[]) {
		for (int i=0; i<vector.length;i++) {
			System.out.println("El índice "+i+" del array, tiene el valor "+vector[i]);
		}
	}
	

}
