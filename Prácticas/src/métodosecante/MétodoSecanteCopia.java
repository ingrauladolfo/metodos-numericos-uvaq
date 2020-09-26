package métodosecante;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Empleando el Método de la Secante. El programa deberá pedir los valores
 * iniciales y el error aproximado máximo. El programa deberá calcular y
 * desplegar los valores de la raíz, el valor de la función para esa raíz y el
 * número de iteraciones requerida para encontrar la raíz.
 *
 * @author Benny ID: 99664
 * Fecha: 13/09/2015
 */
public class MétodoSecanteCopia {

    /**
     * Pide e imprime los valores necesarios para las operaciones
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa obtiene la raíz mediante el método de la secante\ny obtinene el valor de la función f(x) = x^2(|cosx|^(1/2))-5\n");
        System.out.print("Dame el valor de x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Dame el valor de x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Dame el valor del error maximo: ");
        double eamax = scanner.nextDouble();
        DecimalFormat dc = new DecimalFormat("0.000000");
        double r = secante(x1, x2, eamax);
        System.out.println("La raiz es: " + dc.format(r));
        System.out.println("Sustitución en la función: " + dc.format(f(r)+5));
    }

    /**
     * Calcula el valor aproximado de la raiz mediante el método de la secante
     *
     * @param x1 es el primer valor
     * @param x2 el segundo valor
     * @param eamax es el error aproximado máximo permitido
     * @return el valor de la raíz
     */
    public static double secante(double x1, double x2, double eamax) {
    /*ALGORITMO
     * 1. Escójanse dos valores iniciales x1 y x2.
     * 2. La primera aproximación de la raíz es el valor xr para el que la recta que
     *    une a los puntos (x1,f(x1)) y (x2, f(x2) cruza el eje de las x
     * 3. Haga x1 = x2 y x2 = xr.
     * 4. Calcúlese una nueva aproximación a la raíz
     * 5. Decídase si la nueva aproximación es tan exacta como se desea. Si es así los cálculos 
     *    terminan, de otra manera regrese al paso 3.
     */
        //Declaración de la formula y variables
        
        double xr = (x2 - (((x1 - x2) / (f(x1) - f(x2))) * f(x2)));
        double xrv, ea;
        int i = 0;
        
        while (true) {
            i++;
            //Recorrer valores
            x1 = x2;
            x2 = xr;

            xrv = xr;
            xr = (x2 - (((x1 - x2) / (f(x1) - f(x2))) * f(x2)));
            //Obtener el error para la iteración
            ea = Math.abs((xr - xrv) / xr);

            //Verificar si el error aproximado es menor que el error aproximado maximo
            if (ea < eamax) {
                System.out.println("Iteraciones: " + i);
                return xr;
            }
            System.out.println("La iteración "+i+" y el error es de: "+xr);
        }
    }

    /**
     * Calcula el valor del a función f(x) = x^2(|cosx|^(1/2))-5
     *
     * @param x es el valor que se sustituye en la función
     * @return el valor de la funcion
     */
    public static double f(double x) {
        return (Math.pow(x,2)*Math.pow(Math.abs(Math.cos(Math.toRadians(x))), (1/2)))-5;
    }
}