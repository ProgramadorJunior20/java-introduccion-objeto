package co.com.bytebank.test;

public class TestFuncionario {

	public static void main(String[] args) {
		co.com.bytebank.modelo.Funcionario jefferson = new co.com.bytebank.modelo.Contador();
		jefferson.setNombre("Jefferson Murillo");
		jefferson.setDocumento("122-234-233-543");
		jefferson.setSalario(1000);
		
		System.out.println(jefferson.getNombre());
		System.out.println(jefferson.getDocumento());
		System.out.println(jefferson.getSalario());
		System.out.println(jefferson.getBonificacion());
	}
}
