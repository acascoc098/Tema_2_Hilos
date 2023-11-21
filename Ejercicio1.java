public class Ejercicio1 {
    public static void main(String[] args) {
        Thread hilo = Thread.currentThread();
        System.out.println(hilo.getId());
        System.out.println(hilo.getName());
        System.out.println(hilo.getState());
        System.out.println(hilo.getStackTrace());
        
        boolean vivo = hilo.isAlive();
        if (vivo) {
            System.out.println("Vivito y coleando");
        } else {
            System.out.println("DEP");
        }

        boolean demonio = hilo.isDaemon();
        if (demonio) {
            System.out.println("Lucifer");
        } else {
            System.out.println("San Juan");
        }
    }
}
