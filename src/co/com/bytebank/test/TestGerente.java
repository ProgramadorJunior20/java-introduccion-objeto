package co.com.bytebank.test;

public class TestGerente {

	public static void main(String[] args) {
		co.com.bytebank.modelo.Gerente gerente = new co.com.bytebank.modelo.Gerente();
		//gerente.setSalario(1000);
		
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(5000);
		gerente.setClave("AluraCursosOnLine");
		
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));
	}
}
