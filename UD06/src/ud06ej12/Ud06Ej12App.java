package ud06ej12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ud06Ej12App {

	public static void main(String[] args) {
		
		
		//creo el objeto sc de la clase Scanner para coger valores por teclado
		Scanner sc = new Scanner(System.in);
		//Se pide el tamaño del array por teclado
		System.out.print("Introduzca el tamaño del array: ");
		int t_array = Integer.parseInt(sc.nextLine());
		
		//creo el array con el tamaño
		int array_a[] = new int [t_array];
		
		//se añaden los valores random
		array_a = rellenarValores(array_a);
		System.out.println("Array a: "+Arrays.toString(array_a));
		
		//Se pide el numero con el que ha de acabar
		System.out.print("Introduzca el número del final(ha de ser entero de 0-9): ");
		int num = Integer.parseInt(sc.nextLine());
		int a = comprobarNúmero(num,array_a);
		while (a==0) {
			System.out.print("No hay ningún número que acabe con ese digito, introduzca otro: ");
			num = Integer.parseInt(sc.nextLine());
			a = comprobarNúmero(num,array_a);
		}
		sc.close();
		
		//Se pasa al metodo que añade los numeros especificos
		newArray(num,array_a);
	}
	
	//Metodo para rellenar valores
	public static int[] rellenarValores(int vector[]) {
		//creo la variable para obtener los valores random
		Random rad = new Random();
		//con un for permito que introduzcan un valor por cada indice
		for (int i=0; i<vector.length;i++) {
					vector[i]=rad.nextInt(301);		
		}
		//System.out.println("Array : "+Arrays.toString(vector));
		return vector;
	}
		
	//Metodo para imprimir los valores acabados en el soilictado
	public static void newArray(int numero, int vector[]) {
		//Creo un vector vacio donde guardo los valroes
		int[] vector_b= {};
		//chequeo con un for todos los valroes del vector madre
		for (int i=0; i<vector.length;i++) {
			//Agrego únicamente los valores que restando el número final son divisibles entre 10
			if ((vector[i]-numero)%10==0) {
				vector_b=Arrays.copyOf(vector_b, vector_b.length+1);
				vector_b[vector_b.length-1]=vector[i];
			}
		}
		System.out.println("El nuevo array: "+Arrays.toString(vector_b));		
	}
	
	public static int comprobarNúmero(int numero, int vector[]) {
		//Creo un contador 
		int j=0;
		//chequeo con un for todos los valroes del vector madre
		for (int i=0; i<vector.length;i++) {
			//Cuenta únicamente los valore que restando el número final son divisibles entre 10
			if ((vector[i]-numero)%10==0) {
				j++;
			}
		}
		return j;		
	}
}
