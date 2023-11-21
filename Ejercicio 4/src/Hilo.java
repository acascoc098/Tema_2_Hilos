public class Hilo extends Thread {

    private String nombre;
    private int numpro = (int) (Math.random()*10+1);
    private NumeroOculto numeroOculto;

    public Hilo(String nombre, NumeroOculto numeroOculto) {
        this.nombre = nombre;
        this.numeroOculto = numeroOculto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void run(){

        if (!numeroOculto.isCondicion()){
            if (numeroOculto.verSi(numpro) == 1){
                System.out.println("Hilo " + getNombre() + ", mi número propuesto es el " + numpro + " y es el correcto es " + numeroOculto.getNumAdivinar());
            }else {
                System.out.println("Hilo " + getNombre() + ", mi número propuesto es el " + numpro + " y NO es el correcto es " + numeroOculto.getNumAdivinar());
            }
        }else {
            Thread.currentThread().interrupt();
        }

    }
}
