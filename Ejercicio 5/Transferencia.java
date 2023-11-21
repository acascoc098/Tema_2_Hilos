
public class Transferencia {
    public static boolean transferencia(Cuenta c1, Cuenta c2, int cantidad){
		Cuenta cuentaOrdenMenor, cuentaOrdenMayor;
		
		if (c1.getNumeroCuenta().compareTo(c2.getNumeroCuenta()) <0 ){
			cuentaOrdenMenor = c1;
			cuentaOrdenMayor = c2;
		}else{
			cuentaOrdenMenor = c2;
			cuentaOrdenMayor = c1;
		}
		
		synchronized (cuentaOrdenMenor){
			synchronized (cuentaOrdenMayor){
				if (cuentaOrdenMenor.getSaldo() >= cantidad){
					cuentaOrdenMenor.sacarCantidad(cantidad);
					cuentaOrdenMayor.ingresarCantidad(cantidad);
					return true;
				}
				return false;
			}
		}
		
	}
}
