import java.util.Random;

public class SimularPuente {
    public static void main(String[] args) {
        Puente puente = new Puente();
        Random rand = new Random();//Para generar un peso, tiempo de llegada y tiempo del paso aleatorios

        for (int i = 0; i < 6; i++) {//Probraremos con 6 coches
            String nombrecoche = "Coche " + (i+1);
            //Peso entre 1200 y 800
            int peso = rand.nextInt(1201) + 800;
            //Tiempo de llegada entre 1 y 30
            int tiempoLlegada = rand.nextInt(30) + 1;
            //Tiempo de paso entre 10 y 50
            int tiempoPaso = rand.nextInt(41) + 10;

            //Creamos el coche
            Coche coche = new Coche(nombrecoche,peso, tiempoLlegada, tiempoPaso, puente);
            //Inicializamos
            coche.start();
        }
    }
}