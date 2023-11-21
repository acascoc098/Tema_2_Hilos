
class Cuenta {
    int saldo;
	final String numeroCuenta;
	
	Cuenta (int saldo, String nCuenta){
		this.saldo = saldo;
		this.numeroCuenta = nCuenta;
	}
	
	public synchronized void sacarCantidad (int cantidad){
		this.saldo -= cantidad;
	}
	
	public synchronized void ingresarCantidad (int cantidad){
		this.saldo += cantidad;
	}
	
	public int getSaldo(){
		return this.saldo;
	}
	
	public String getNumeroCuenta(){
		return this.numeroCuenta;
	}
	
	@Override
	public String toString(){
		return "Saldo actual de la cuenta " + this.numeroCuenta + " es de " + this.saldo + "\n"; 
	}
}
