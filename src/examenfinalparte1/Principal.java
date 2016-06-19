package examenfinalparte1;



public class Principal {

    public static void main(String[] args) {
        Sumas suma1 = new Sumas(10, 20);
        int resultadosuma1 = suma1.getResultado();
        System.out.println("Es: " + resultadosuma1);
        Sumas suma2 = new Sumas(10);
        int resultadosuma2 = suma2.getResultado();
        System.out.println("Es: " + resultadosuma2);
        Sumas suma3 = new Sumas();
        int resultadosuma3 = suma3.getResultado();
        System.out.println("Es: " + resultadosuma3);
    }
}
