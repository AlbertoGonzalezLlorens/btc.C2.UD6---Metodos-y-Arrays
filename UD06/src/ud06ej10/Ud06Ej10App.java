package ud06ej10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ud06Ej10App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el tamaño del array: ");
		int tamaño = Integer.parseInt(sc.nextLine());
		//Creo el array
		int a_posiciones[] = new int [tamaño];
		//declara valor máximo del random
		System.out.print("Introduce el valor maximo del rango de random a generar: ");
		int val_maximo = Integer.parseInt(sc.nextLine());
		//declara valor mínimo del random
		System.out.print("Introduce el valor minimo del rango de random a generar: ");
		int val_minimo = Integer.parseInt(sc.nextLine());
		sc.close();
		//creo un metodo que me identifique si hay algun número primo en el rango
		if (hayPrimo(val_maximo,val_minimo)==1) {
			//creo una variable con el vector lleno
			int v_lleno[]=rellenarValores(a_posiciones, val_maximo, val_minimo);
			System.out.println("El vector es: "+Arrays.toString(v_lleno));
			maxArray(v_lleno);
		}else {
			System.out.println("No hay valor primo, seleccione otro rango");
		}
		
	}
	
	public static int hayPrimo(int max, int min) {
		int k=0;
		for (int i=min;i<max+1;i++) {
			if (esNumeroPrimo(i)==true) {
				i=max;
				k=1;
			}
		}
		return k;
	}
	
	//Metodo para rellenar valores
	public static int[] rellenarValores(int vector[], int max, int min) {
		//creo la variable para obtener los valores random
		Random rad = new Random();
		//variable para poder salir del bucle while
		int i=0;
		while (i<vector.length) {
			//se añade el valor random al indice del vector
			vector[i]=rad.nextInt(max-min+1)+min;
			//Se crea una condición, únicamente se suma 1 a i si el valor random es primo, en caso contrario el proximo valor random se guardara en el mismo lugar
			if (esNumeroPrimo(vector[i])==true) {
				i++;
			}
		}
		
		return vector;
	}
	
	//Se mira si es numero primo
	public static boolean esNumeroPrimo(int numero) {
		//descarta el numero 1
		if (numero<2) {
			return false;
		} else {
			//Revisa si es divisible por todos los numeros que hay detras suyo
			for (int i=2;i<numero;i++) {
				if (numero%i==0) {
					return false;
				}
			}
		}
	return true;
	}
	
	//Metodo para mostrar valores
	public static void maxArray(int vector[]) {
		//creo una variable donde se guardara el valor maximo del array
		int val_max_vector=0;
		for (int i=0; i<vector.length;i++) {
			if (val_max_vector<vector[i]) {
				val_max_vector=vector[i];
			}
		}
		System.out.println("El valor máximo del array es "+val_max_vector);			
	}

	

}
