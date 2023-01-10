package co.com.bytebank.test;

import co.com.bytebank.modelo.*;

public class TestReferencias {
	
	public static void main(String[] args) {
		// Elemento mas generico puede ser adaptado al elemento mas especifico
		co.com.bytebank.modelo.Funcionario funcionario = new co.com.bytebank.modelo.Gerente();
		funcionario.setNombre("Jeffer");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Yuya");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		
	}
}
