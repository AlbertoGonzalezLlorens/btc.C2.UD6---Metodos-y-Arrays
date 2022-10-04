package ud06ej04;

import java.util.Scanner;

public class Ud06Ej04App {

	public static void main(String[] args) {
		
		//pedimos que número desea calcular el factorial
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número que deseas calcular el factorial:");
		String num_fact_string = sc.nextLine();
		sc.close();
		int num_fact = Integer.parseInt(num_fact_string);
		calcularFactorial(num_fact);
		
	}
	
	//Hacemos el metodo para calcular el factorial
	public static void calcularFactorial(int num) {
		//iniciamos la variable donde se guardara el resultado del factorial con uno asi no afecta al resultado de las multiplicaciones
		int factorial=1;
		//hacemos un for, que va desde el numero dado hasta 1 en cuenta atras, y por cada iteracion multiplica es valor en la variabla factorial
		for (int i=num;i>0;i--) {
			System.out.println(i);
			factorial=factorial*i;
		}
		System.out.println("El resultado del factorial es: "+factorial);
	}
}
