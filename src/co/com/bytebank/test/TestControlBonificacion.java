package co.com.bytebank.test;

import co.com.bytebank.modelo.*;

public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario jeff = new Contador();
		jeff.setSalario(2000);
		
		//Cliente
		
		Gerente yuya = new Gerente();
		yuya.setSalario(10000);
		
		co.com.bytebank.modelo.Contador mariano = new co.com.bytebank.modelo.Contador();
		mariano.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(jeff);
		controlBonificacion.registrarSalario(yuya);
		controlBonificacion.registrarSalario(mariano);
	}
}
