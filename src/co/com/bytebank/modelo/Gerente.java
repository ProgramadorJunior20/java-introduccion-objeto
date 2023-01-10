package co.com.bytebank.modelo;

//                   extiende de 
public class Gerente extends Funcionario implements Autenticable { // Gerente es un Funcionario

	// Sobre-escritura de metodo
	@Override
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		// return super.getSalario() + super.getSalario() * 0.05;
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
