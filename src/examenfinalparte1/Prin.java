package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        Sumas obj = new Sumas(10, 20);
        int n = obj.resultado;
        System.out.println("Es: " + n);
        Sumas nm = new Sumas(10);
        int m = nm.resultado;
        System.out.println("Es: " + m);
        Sumas mn = new Sumas();
        int nn = mn.resultado;
        System.out.println("Es: " + nn);
    }
}
