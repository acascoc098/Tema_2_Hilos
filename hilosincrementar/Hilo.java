package hilosincrementar;

public class Hilo implements Runnable {
    private int num;
    private int incremento;
    private int numIncremento;

    private Contador contador;

    public Hilo(int num, int incremento, Contador contador) {
        this.num = num;
        this.incremento = incremento;
        this.contador = contador;
    }

    public int getNumIncrem(){
        return this.numIncremento;
    }

    public void run(){
        for (int i = 0; i < this.incremento; i++) {
            contador.incrementaCont();
            this.numIncremento++;
        }
        System.out.printf("Hilo %s, incrementos: %d\n",this.num,this.getNumIncrem());
    }
    
}
