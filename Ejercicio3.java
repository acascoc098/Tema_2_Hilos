import java.util.Random;

class Hilo1 implements Runnable{
    private final String nombre;

    Hilo1(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.printf("Hola soy el hilo %s, de la clase Hilo1\n", this.nombre);
        Random r = new Random();

        //for (int i=0; i<5; i++){
            int pausa = 10 + r.nextInt(500-10);
            System.out.printf("Hilo: %s , hace una pausa de %d milisegundos\n", this.nombre, pausa);
            try {
                Thread.sleep(pausa);
            }catch (InterruptedException e){
                System.out.printf("Hilo %s interrumpido \n,", this.nombre);
            }
        //}
        System.out.printf("Hilo %s terminado \n", this.nombre);
    }
}

class Hilo2 implements Runnable{
    private final String nombre;

    Hilo2(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.printf("Hola soy el hilo %s, de la clase Hilo2\n", this.nombre);
        Random r = new Random();

        //for (int i=0; i<5; i++){
            int pausa = 10 + r.nextInt(500-10);
            System.out.printf("Hilo: %s , hace una pausa de %d milisegundos\n", this.nombre, pausa);
            try {
                Thread.sleep(pausa);
            }catch (InterruptedException e){
                System.out.printf("Hilo %s interrumpido \n,", this.nombre);
            }
        //}
        System.out.printf("Hilo %s terminado \n", this.nombre);
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("acascoc098 Andrea Castilla Cocera");
        
        System.out.println(eligehilo());

        for (int i = 0; i < 4; i++) {
            boolean elige = eligehilo();
            String nombre = "H" + (i+1);
            Thread hilo = null;

            if (elige) {
                hilo = new Thread(new Hilo1(nombre));
            } else {
                hilo = new Thread(new Hilo2(nombre));
            }

            hilo.start();

            try {
                hilo.join();
            } catch (InterruptedException e) {
                System.out.println("Hilo principal interrumpido");            
            }
        }

        //Thread h1 = new Thread(new Hilo1("H1"));
        //Thread h2 = new Thread(new Hilo2("H2"));

        /*h1.start();
        h2.start();
        try{
            h1.join();
            h2.join();
        }catch (InterruptedException e){
            System.out.println("Hilo principal interrumpido");
        }*/
        System.out.println("Hilo principal terminado.");
    }

    public static boolean eligehilo(){
        return Math.random() < 0.5;
    }
}