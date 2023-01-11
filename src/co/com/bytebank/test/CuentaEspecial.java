package co.com.bytebank.test;

import co.com.bytebank.modelo.Cuenta;

public class CuentaEspecial extends Cuenta{


	@Override
	public void deposita(double valor) {
		super.saldo = 0.0;
	}

}
