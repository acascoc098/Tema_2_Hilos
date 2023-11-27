/**
 * Clase coche que queremos que funcione como un hilo para la simunlación
 */
class Coche extends Thread {
    private int peso;
    private int tiempoLlegada;
    private int tiempoPaso;
    private Puente puente;

    public Coche(int peso, int tiempoLlegada, int tiempoPaso, Puente puente) {
        this.peso = peso;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoPaso = tiempoPaso;
        this.puente = puente;
    }

    @Override
    public void run() {
        try {
            sleep(tiempoLlegada * 1000);
            puente.iniciarPaso(peso);
            sleep(tiempoPaso * 1000);
            puente.finalizarPaso(peso);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}