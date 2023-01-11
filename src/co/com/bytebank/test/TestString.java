package co.com.bytebank.test;

import co.com.bytebank.modelo.CuentaAhorros;

public class TestString {
	
	public static void main(String[] args) {
		
		String nombre = "Alura"; //Inmutable
		//No utilizada en el mundo real
		//String nombre2 = new String("Alura");
		
		System.out.println("Antes de metodo: " + nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" " + "Latam");
		nombre = nombre.toUpperCase();
		//nombre = nombre.toLowerCase();
		
		char letra = nombre.charAt(4);
		int indice = nombre.indexOf("M");
		
		Object cuenta = new CuentaAhorros(11, 1000);
		
		printLine(nombre);
		printLine(letra);
		printLine(indice);
		printLine(new CuentaAhorros(200, 300));
		//nombre = nombre.toLowerCase();
		//System.out.println("Despues de metodo: " + nombre);
		
	}
	

	public static void printLine(Object valor) {
		System.out.println(valor.toString());
	}
	
	//public static void printLine(String valor) {
	//	System.out.println(valor);
	//}
	
	//public static void printLine(char valor) {
	//	System.out.println(valor);
	//}
	
	//public static void printLine(CuentaAhorros cuentaAhorros) {
	//	System.out.println(valor);
	//}

}
