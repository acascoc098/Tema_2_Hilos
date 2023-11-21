public class Ejercicio2 {
    public static void main(String[] args) {
        Thread hilo = Thread.currentThread();
        
        System.out.println("Prioridad del hilo: " + hilo.getPriority());
        System.out.println("Para saber la máxima priporidad de un hilo: " + Thread.MAX_PRIORITY + " (Thread.MAX_PRIORITY)");
        System.out.println("Para saber la máxima priporidad de un hilo: " + Thread.MIN_PRIORITY + " (Thread.MIN_PRIORITY)");
        System.out.println("acascoc098 Andrea Castilla Cocera");
    }
}
