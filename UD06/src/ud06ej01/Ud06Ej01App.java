package ud06ej01;

import java.util.Scanner;

public class Ud06Ej01App {

	public static void main(String[] args) {
		//Se crea una variable donde se guarda el resultado
		//de las funciones
		double area=0;
		
		//Se pide el tipo de area a calcular
		Scanner sc = new Scanner(System.in);
		System.out.print("Que tipo de figura desea calcular (solo se accepta círculo, triangulo o cuadrado): ");
		String figura = sc.nextLine();
		figura = figura.toUpperCase();
		switch(figura) {
			case "CIRCULO":
				//Instrucciones del case para evaluar el circulo
				System.out.print("Introduzca el radio del circulo: ");
				String radio_string = sc.nextLine();
				double radio = Double.parseDouble(radio_string);
				area = areaCirculo(radio);
				break;
			case "TRIANGULO":
				//Instrucciones del case para evaluar el triangulo
				System.out.print("Introduzca la base del triangulo: ");
				String base_string = sc.nextLine();
				double base = Double.parseDouble(base_string);
				System.out.print("Introduzca la altura del triangulo: ");
				String altura_string = sc.nextLine();
				double altura = Double.parseDouble(altura_string);
				area = areaTriangulo(base,altura);
				break;
			case "CUADRADO":
				//Instrucciones del case para evaluar el cuadrado
				System.out.print("Introduzca el lado del cuadrado: ");
				String lado_string = sc.nextLine();
				double lado = Double.parseDouble(lado_string);
				area = areaCuadrado(lado);
				break;
			default:
				System.out.println("No se ha introducido una figura correcta");
		}
		sc.close();
		
		if (area!=0) {
			System.out.println("El area de la figura "+figura+" es de "+area);
		}	
	}
	
	//funcion que calucla el area del circulo
	public static double areaCirculo(double radio) {
		double a_circulo = Math.PI*Math.pow(radio, 2);
		return a_circulo;
	}
	
	//funcion que calcula el area del triangulo
	public static double areaTriangulo(double base, double altura) {
		double a_triangulo = (base*altura)/2;
		return a_triangulo;
	}
	
	//funcion que calcula el area del cuadrado
	public static double areaCuadrado(double lado) {
		double a_cuadrado = lado*lado;
		return a_cuadrado;
	}

}
