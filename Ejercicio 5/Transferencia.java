
public class Transferencia {
    public static boolean transferencia(Cuenta c1, Cuenta c2, int cantidad){
		Cuenta cuentaOrdenMenor, cuentaOrdenMayor;
		
		if (c1.getNumeroCuenta().compareTo(c2.getNumeroCuenta()) <0 ){
			//por orden la cuenta1 está antes que c2
			cuentaOrdenMenor = c1;
			cuentaOrdenMayor = c2;
		//	System.out.println("C1 es menor que C2\n");
		}else{
			cuentaOrdenMenor = c2;
			cuentaOrdenMayor = c1;
		//	System.out.println("C2 es menor que C1\n");
		}
		
		synchronized (cuentaOrdenMenor){
			synchronized (cuentaOrdenMayor){
				if (cuentaOrdenMenor.getSaldo() >= cantidad){
					cuentaOrdenMenor.sacarCantidad(cantidad);
					cuentaOrdenMayor.ingresarCantidad(cantidad);
					return true;
				}
				return false;  //no hay saldo suficiente en la cuenta Menor
			}
		}
		
	}
}
