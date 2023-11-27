class Puente {
    private static final int MAX_COCHES = 3;
    private static final int PESO_MAXIMO = 5000;
    private int cochesEnPuente = 0;
    private int pesoEnPuente = 0;

    /**
     * Método para saber si puede pasar el coche
     * @param peso El peso del coche para saber si puede pasar
     * @return boolean
     */
    public synchronized boolean sePermitePaso(int peso) {
        return cochesEnPuente < MAX_COCHES && (pesoEnPuente + peso) <= PESO_MAXIMO;
    }

    /**
     * Método para modificar el estado del puente una vez haya salido un coche
     * @param peso EL peso del coche
     */
    public synchronized void finalizarPaso(int peso) {
        cochesEnPuente--;
        pesoEnPuente -= peso;
        System.out.println("Coche salió del puente. Coches en el puente: " + cochesEnPuente + ", Peso en el puente: " + pesoEnPuente);
        notifyAll();
    }

    /**
     * Método que empieza el paso del coche si este tienen el paso permitido
     * @param peso Peso del coche
     * @throws InterruptedException
     */
    public synchronized void iniciarPaso(int peso) throws InterruptedException {
        while (!sePermitePaso(peso)) {
            wait();
        }
        cochesEnPuente++;
        pesoEnPuente += peso;
        System.out.println("Coche entró en el puente. Coches en el puente: " + cochesEnPuente + ", Peso en el puente: " + pesoEnPuente);
    }
}