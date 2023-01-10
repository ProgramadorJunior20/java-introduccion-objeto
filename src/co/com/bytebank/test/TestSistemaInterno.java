package co.com.bytebank.test;

import co.com.bytebank.modelo.*;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		co.com.bytebank.modelo.Administrador admin = new co.com.bytebank.modelo.Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}
}
