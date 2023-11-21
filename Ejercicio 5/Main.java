
public class Main {
    public static void main(String[] args) {
        Cuenta c1 =  new Cuenta(20500,"ES388388433883838388484");
        Cuenta c2 = new Cuenta(50000,"ES99090499388484889399");

        Hilo h1 = new Hilo("hilo 1",c1,c2);
        Hilo h2 = new Hilo("hilo 2",c1,c2);

        

    }
}
