package examenfinalparte1;

/**
 * esta clase si recibe un numero el atributo resultado almacenará el doble,
 * si recibe dos números devuelve la suma, y si no recibe números devolverá -1
 * @author propa
 */
public class Sumas {

    private int resultado;

    public int getResultado() {
        return resultado;
    }
    

    public Sumas(int num1, int num2) {
        resultado = sumar(num1, num2);
    }

    public Sumas(int num) {
        resultado = sumar(num, num);
    }

    public Sumas() {
        resultado = -1;
    }
    
    /**
     * Devuelve la suma de los números recibidos
     * @param numero1 Un operando entero
     * @param numero2 Un operando entero
     * @return 
     */
    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
