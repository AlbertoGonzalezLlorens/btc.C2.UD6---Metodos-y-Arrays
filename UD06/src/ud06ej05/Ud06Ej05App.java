package ud06ej05;

import java.util.Scanner;

public class Ud06Ej05App {

	public static void main(String[] args) {
		
		//Introducimos el valor que queramos pasar a binario
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el valor que quiera pasar a binario: ");
		String num_string = sc.nextLine();
		sc.close();
		int num = Integer.parseInt(num_string);
		hacerBinario(num);
	}
	
	//método hacer binario
	public static void hacerBinario(int num) {
		StringBuilder bin =new StringBuilder();
		
		//para valores de numero 2 o superior 
		for (int n=num;n>=2;n=n/2) {
			//hace el modulo del numero entre 2, lo convierte a cadena y lo suma a una cadena inicializada al principio
			//lo añade al principio
			bin.insert(0,String.valueOf(n%2));
			num=n;
			}
		bin.insert(0,String.valueOf(num/2));
		System.out.println(bin);		
	}			
}