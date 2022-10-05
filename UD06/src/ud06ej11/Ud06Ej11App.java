package ud06ej11;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ud06Ej11App {

	public static void main(String[] args) {
		// Se crea la entrada del usuario para el tamaño del array
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el tamaño de las array: ");
		int tamaño = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el valor maximo del boundary del random: ");
		int max = Integer.parseInt(sc.nextLine());
		sc.close();
		//Se crea el array a del tamaño especificado
		int ar_a[] = new int [tamaño];
		//Se llena el vector y se asocia un vector b a este primero
		ar_a = rellenarValores(ar_a, max);
		int ar_b[] = Arrays.copyOf(ar_a, ar_a.length);
		int ar_mult[] = ar_a;
		ar_b = rellenarValores(ar_b, max);
		System.out.println("Array a: "+Arrays.toString(ar_a));
		System.out.println("Array b: "+Arrays.toString(ar_b));
		
		ar_mult = multiplicarArrays(ar_a, ar_b);
		System.out.println("Array multip: "+Arrays.toString(ar_mult));

	}
	
	//Metodo para rellenar valores
	public static int[] rellenarValores(int vector[], int max) {
		//Creo una variable de la clase array para que los valores random que entraran sean diferentes para cada vector
		//int vector_a[] = new int [vector.length];
		//creo la variable para obtener los valores random
		Random rad = new Random();
		//con un for permito que introduzcan un valor por cada indice
		for (int i=0; i<vector.length;i++) {
				vector[i]=rad.nextInt(max+1);		
		}
		//System.out.println("Array : "+Arrays.toString(vector));
		return vector;
	}
	
		
		//metodo para multiplicar los arrays
	public static int[] multiplicarArrays(int vector_a[], int vector_b[]) {
		int vector[] = vector_a;
		for (int i=0; i<vector_a.length;i++) {
			vector[i]=vector_a[i]*vector_b[i];
			}
		return vector;
	}

}
