public class Main {
    public static void main(String[] args) throws InterruptedException {
        NumeroOculto num = new NumeroOculto();

        Hilo hilo1 = new Hilo("H1", num);
        Hilo hilo2 = new Hilo("H2", num);
        Hilo hilo3 = new Hilo("H3", num);
        Hilo hilo4 = new Hilo("H4", num);
        Hilo hilo5 = new Hilo("H5", num);
        Hilo hilo6 = new Hilo("H6", num);
        Hilo hilo7 = new Hilo("H7", num);
        Hilo hilo8 = new Hilo("H8", num);
        Hilo hilo9 = new Hilo("H9", num);
        Hilo hilo10 = new Hilo("H10", num);

        //Iniciamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();

        System.out.println("@author: acascoc098 Andrea Castilla Cocera");
        //Lanzamos hilos
        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        hilo5.join();
        hilo6.join();
        hilo7.join();
        hilo8.join();
        hilo9.join();
        hilo10.join();

    }
}