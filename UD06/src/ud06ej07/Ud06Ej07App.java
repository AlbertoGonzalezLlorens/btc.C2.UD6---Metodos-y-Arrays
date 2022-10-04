package ud06ej07;

import java.util.Scanner;

public class Ud06Ej07App {

	public static void main(String[] args) {
		
		//solicito la cantidad de euros a convertir
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantos euros quier convertir? ");
		String euros_string = sc.nextLine();
		double euros = Double.parseDouble(euros_string);
		
		//solicito a que moneda quiere convertir los euros
		System.out.print("A que moneda quiere cambiar (dolares, libras o yenes)? ");
		String moneda = sc.nextLine();
		sc.close();
		
		cambioMoneda(euros,moneda);
		
	}
	
	//Metodo para el cambio de divisa
	public static void cambioMoneda(double euros, String moneda) {
		//Declaro las constantes para el cambio de divisa
		final double CB_DIVISA_LIBRA = 0.86;
		final double CB_DIVISA_DOLAR = 1.28611;
		final double CB_DIVISA_YEN = 129.852;
		//declaro una variable donde se guardara el cambio de euros
		double ct_otra_moneda=0.0;
		//Paso el texto a mayusculas para evitar problemas dado que Java es case sensitive
		moneda = moneda.toUpperCase();
		//Hago un switch que valore la opcio¡ón según la moneda introducida
		switch(moneda) {
			case "LIBRAS":
				ct_otra_moneda=euros*CB_DIVISA_LIBRA;
				System.out.println("Tienes "+ct_otra_moneda+" libras.");
				break;
			case "DOLARES":
				ct_otra_moneda=euros*CB_DIVISA_DOLAR;
				System.out.println("Tienes "+ct_otra_moneda+" dolares.");
				break;
			case "YENES":
				ct_otra_moneda=euros*CB_DIVISA_YEN;
				System.out.println("Tienes "+ct_otra_moneda+" yenes.");
				break;
			default:
				System.out.println("No has introducido una moneda correcta");
				
		}
	}

}
