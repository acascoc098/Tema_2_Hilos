
public class Main {
    public static void main(String[] args) {
        Cuenta c1 =  new Cuenta(20500,"ES388388433883838388484");
        Cuenta c2 = new Cuenta(50000,"ES99090499388484889399");

        Hilo h1 = new Hilo("Castilla",c1,c2);
        Hilo h2 = new Hilo("Castilla Andrea",c1,c2);

        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
