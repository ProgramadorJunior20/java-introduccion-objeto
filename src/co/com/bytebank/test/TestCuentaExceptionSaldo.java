package co.com.bytebank.test;

import co.com.bytebank.modelo.*;

public class TestCuentaExceptionSaldo {
	
	public static void main(String[] args) {
		co.com.bytebank.modelo.Cuenta cuenta = new co.com.bytebank.modelo.CuentaAhorros(123, 456);
		cuenta.deposita(1100);
		try {
			cuenta.saca(1100);
			cuenta.saca(10);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}

}
