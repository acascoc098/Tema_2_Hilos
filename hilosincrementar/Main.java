package hilosincrementar;

public class Main {
    private static final int numh = 10;
    private static final int cuentamax = 100000;

    public static void main(String[] args) {
        Contador cont = new Contador();
        Thread hilos [] = new Thread[numh];

        for (int i = 0; i < numh; i++) {
            hilos[i] = new Thread(new Hilo(i, cuentamax, cont));
            hilos[i].start();
        }

        for (int i = 0; i < numh; i++) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }

        System.out.printf("Hay un total de %d incrementos\n", cont.getContador());
    }
}
