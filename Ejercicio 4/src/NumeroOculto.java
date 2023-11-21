public class NumeroOculto {
    private int numAdivinar = (int) (Math.random()*10+1);
    private boolean condicion = false;

    public NumeroOculto() {
    }

    public int getNumAdivinar() {
        return numAdivinar;
    }

    public boolean isCondicion() {
        return this.condicion;
    }

    synchronized public int verSi(int numAMirar){
        int num = 0;
        if (this.numAdivinar == numAMirar){
            this.condicion = true;
            num = 1;
        }
        return num;
    }
}
