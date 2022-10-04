package ud06ej06;

import java.util.Scanner;

public class Ud06Ej06App {

	public static void main(String[] args) {
		//Solicito el numero que desea el usuario
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero positivo: ");
		String num = sc.nextLine();
		sc.close();
		//lo convierto en entero para asegurarme que sea un valor entero positivo
		int num_num = Integer.parseInt(num);
		
		if (num_num>0) {
			numeroCifras(num);	
		} else {
			System.out.println("Número incorrecto");
		}

	}
	
	//método para calcular el numero de cifras
	public static void numeroCifras(String num) {
		//paso la cadena introducida por el usuario y saco lalongitud de esta cadena, será lo mismo que el número de cifras
		System.out.println("El número tiene "+num.length()+" cifras.");
	}

}
