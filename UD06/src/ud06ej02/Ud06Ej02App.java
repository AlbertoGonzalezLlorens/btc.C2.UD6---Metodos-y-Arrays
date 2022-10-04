package ud06ej02;

import java.util.Scanner;
import java.util.Random;

public class Ud06Ej02App {

	public static void main(String[] args) {
		
		//Creamos la cantidad de números random deseados
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número de valores random deseados: ");
		String num_rand_string = sc.nextLine();
		int num_rand = Integer.parseInt(num_rand_string);
		
		//Pide el valor mínimo del rango de valores random
		System.out.print("Introduce el valor mínimo del rango: ");
		String num_min_string = sc.nextLine();
		int num_min = Integer.parseInt(num_min_string);
		
		//Pide el valor máximo del rango de valores random 
		System.out.print("Introduce el valor máximo del rango: ");
		String num_max_string = sc.nextLine();
		int num_max= Integer.parseInt(num_max_string);
		
		sc.close();
		
		//se hace un for para que de tantos valores random como se piden al inicio
		for (int i=0;i<num_rand; i++) {
			
			int valor_random = genRandom(num_max,num_min);
			System.out.println("El valor random es " + valor_random);
			
		}
		
	}

	//creamos el metodo para devolver numeros random
	public static int genRandom(int num_max, int num_min) {
		Random rad = new Random();
		int valor_random = rad.nextInt(num_max-num_min+1)+num_max;
		return valor_random;
	}
}
