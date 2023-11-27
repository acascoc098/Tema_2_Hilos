class Puente {
    private static final int MAX_COCHES = 3;
    private static final int PESO_MAXIMO = 5000;
    private int cochesEnPuente = 0;
    private int pesoEnPuente = 0;

    public synchronized boolean sePermitePaso(int peso) {
        return cochesEnPuente < MAX_COCHES && (pesoEnPuente + peso) <= PESO_MAXIMO;
    }

    public synchronized void finalizarPaso(int peso) {
        cochesEnPuente--;
        pesoEnPuente -= peso;
        System.out.println("Coche salió del puente. Coches en el puente: " + cochesEnPuente + ", Peso en el puente: " + pesoEnPuente);
        notifyAll();
    }

    public synchronized void iniciarPaso(int peso) throws InterruptedException {
        while (!sePermitePaso(peso)) {
            wait();
        }
        cochesEnPuente++;
        pesoEnPuente += peso;
        System.out.println("Coche entró en el puente. Coches en el puente: " + cochesEnPuente + ", Peso en el puente: " + pesoEnPuente);
    }
}