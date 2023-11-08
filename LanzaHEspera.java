
import java.io.*;
import java.util.Random;

public class LanzaHEspera {

    public static void main(String[] args) {
        Thread hilo = new Thread(new Hilo("H23"));
        Thread hilo2 = new Thread(new Hilo("H2"));

        hilo.start();
        hilo2.start();

        try {
            hilo.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class Hilo implements Runnable{
    private String identificador;

    public Hilo(String id){
        identificador = id;
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            int pausa = 10 + new Random().nextInt(500-10);
            System.out.println("Hilo " + this.identificador + ", hace una espera de " + pausa + " milisegundos");
            try {
                 Thread.sleep(pausa);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}