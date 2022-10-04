package ud06ej09;

import java.util.Random;

import java.util.Scanner;

public class UD06Ej09App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el tamaño del array: ");
		int tamaño = Integer.parseInt(sc.nextLine());
		//Creo el array
		int a_posiciones[] = new int [tamaño];
		sc.close();
		//creo una variable con el vector lleno
		int v_lleno[]=rellenarValores(a_posiciones);
		mostrarValores(v_lleno);

	}
	
	//Metodo para rellenar valores
	public static int[] rellenarValores(int vector[]) {
		//creo la variable para obtener los valores random
		Random rad = new Random();
		//con un for permito que introduzcan un valor por cada indice
		for (int i=0; i<vector.length;i++) {
			vector[i]=rad.nextInt(10);		
		}
		return vector;
	}
	
	//Metodo para mostrar valores
	public static void mostrarValores(int vector[]) {
		int suma = 0;
		for (int i=0; i<vector.length;i++) {
			System.out.println("El índice "+i+" del array, tiene el valor "+vector[i]);
			suma+=vector[i];
		}
		System.out.println("El valor de la suma es de: "+suma);
	}
	

}
