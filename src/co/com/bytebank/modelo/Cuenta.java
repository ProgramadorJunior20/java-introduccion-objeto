package co.com.bytebank.modelo;

/**
 * Cuenta va a crear nuevas instacias de CuentaCorriente y CuentaAhorro.
 * 
 * @version 1.0
 * @author JeffersonMurillo
 * 
 */
public abstract class Cuenta {
	
	// public  // Accesible desde cualquier parte
	// --default  // Accesible dentro del paquete
	// --protected // default + clases hijas
	// ---private  // solo desde la clase misma

	protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;
    
    /**
     * Instancia una nueva cuenta sin parametros.
     */
    public Cuenta() {
        
    }
    
    /**
     * Instacia una cuenta utilizando como parametros agencia y numero.
     * @param agencia
     * @param numero
     */
    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }
    
    public abstract void deposita(double valor);
    
    /**
     * Este metodo retira dinero de la cuenta y si ocurre un error, 
     * devuelve una excepción. 
     * @param valor espera un valor.
     * @throws SaldoInsuficienteException devuelve un error si el saldo es insuficiente.
     */
    public void saca(double valor) throws SaldoInsuficienteException {
    	if (this.saldo < valor) {
    		throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
    	}
    	this.saldo -= valor;
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            try {
				this.saca(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
    
    @Override
    public String toString() {
    	String cuenta = "Numero: " + this.numero + ", Agencia: " + this.agencia; 
    	return cuenta;
    }

}
