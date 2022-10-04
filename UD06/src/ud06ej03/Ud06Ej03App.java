package ud06ej03;

import javax.swing.JOptionPane;

public class Ud06Ej03App {

	public static void main(String[] args) {
		boolean es_primo;
		String numero_string = JOptionPane.showInputDialog("Introduce un número");
		int numero = Integer.parseInt(numero_string);	
		es_primo=esNumeroPrimo(numero);
		
		if (es_primo==false) {
			System.out.println("El numero no es primo");
		} else {
			System.out.println("El numero si es primo");
		}
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

}
