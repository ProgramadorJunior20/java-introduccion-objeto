package co.com.bytebank.test;

public class TestCuenta {
	
	public static void main(String[] args) {
		co.com.bytebank.modelo.CuentaCorriente cc = null; //new CuentaCorriente(1, 1);
		co.com.bytebank.modelo.CuentaAhorros ca = new co.com.bytebank.modelo.CuentaAhorros(2, 3);
		
		//int num = 1;
		//int resultado = 30/num;
		//System.out.println(resultado);
		
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		System.out.println("Cuenta Corriente: " + cc.getSaldo());
		System.out.println("Cuenta Ahorros: " + ca.getSaldo());
	}

}
