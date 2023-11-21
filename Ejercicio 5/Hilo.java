
public class Hilo extends Thread {
    private String nombre;
    private Cuenta cuenta1, cuenta2;
	
	
	public Hilo(String nombre,Cuenta c1, Cuenta c2){
		this.nombre = nombre;
        this.cuenta1 = c1;
		this.cuenta2 = c2;
	}
	
	public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void run(){
		
		int cantidadATransferir = 10;
		if (Transferencia.transferencia(cuenta1, cuenta2, cantidadATransferir))
			System.out.println("Transferencia realizada correctamente");
		
		String msg = "Fin transferencia de la cuenta " + this.cuenta1.getNumeroCuenta() + 
					" a la cuenta " + this.cuenta2.getNumeroCuenta() +
					" Realizada por el hilo " + this.getNombre();
		System.out.println(msg);
	}
}
