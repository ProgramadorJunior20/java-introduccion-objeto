//                   extiende de 
public class Gerente extends Funcionario { // Gerente es un Funcionario
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnLine";
	}
	
	// Sobre-escritura de metodo
	public double getBonificacion() {
		return super.getSalario() + super.getBonificacion();
	}
}
