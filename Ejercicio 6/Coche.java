/**
 * Clase coche que queremos que funcione como un hilo para la simunlación
 */
class Coche extends Thread {
    private String nombre;
    private int peso;
    private int tiempoLlegada;
    private int tiempoPaso;
    private Puente puente;

    public Coche(String nombre,int peso, int tiempoLlegada, int tiempoPaso, Puente puente) {
        this.nombre = nombre;
        this.peso = peso;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoPaso = tiempoPaso;
        this.puente = puente;
    }

    @Override
    public void run() {
        try {
            sleep(tiempoLlegada * 1000);
            //System.out.println("Coche/hilo: " + nombre + " con un peso de: " + peso);
            puente.iniciarPaso(peso,nombre);
            sleep(tiempoPaso * 1000);
            puente.finalizarPaso(peso,nombre);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}