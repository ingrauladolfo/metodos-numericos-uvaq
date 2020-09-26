package bisección;

import java.text.DecimalFormat;
import java.math.*;

import javax.swing.JOptionPane;

public class BisecciónSinPedirIteraciones 
{
	private static int i;
	private static double r,xi,xf,eamax,function,xr,xrv,ea,yi,yr,function2;
	private static DecimalFormat dc;
	public static void main(String[] args) 
	{
        xi = Double.parseDouble(JOptionPane.showInputDialog("Dame el primer parámetro: "));
        xf = Double.parseDouble(JOptionPane.showInputDialog("Dame el segundo parámetro: "));
        eamax = Double.parseDouble(JOptionPane.showInputDialog("Dame el error: "));
        function = (xi+2)*(xi+1)*(xi*Math.pow(xi-1,2))*(xi-2);
        System.out.println();
        dc = new DecimalFormat("#0.0000000");
        r = biseccion(xi, xf, eamax);
        BisecciónSinPedirIteraciones.mostrarDatos();
    }
	public static double biseccion(double xi, double xf, double eamax) 
	{
		xr = ((xi + xf) / 2);
		i = -1;
		while (true && i <  2) 
		{
			i++;
			yi = f(xi);
            yr = f(xr);
            if ((yi * yr) < 0) 
            {
            		xf = xr;
            	} 
            else if ((yi * yr) > 0) 
            {
            		xi = xr;
            } 
            else 
            {
            		System.out.println("El número total de iteraciones son: " + i);
            		return xr;
            }
            xrv = xr;
            xr = (xi + xf) / 2;
            ea = Math.abs((xr - xrv) / xr);
            if (ea < eamax)
            {
            		System.out.println("El número total de iteraciones son: " + i);
            		return xr;
            }
			System.out.println("La iteración "+i+ " es: "+xr+", y el valor de la sustitución en la función es: "+ ea);
		}
		return eamax;
	}
    public static double f(double x) 
    {
    		function = (x+2)*(x+1)*(x*Math.pow(x-1,2))*(x-2);
    		return function;
    }
    public static void mostrarDatos()
    {
    		System.out.println("El intervalo es de: "+"["+xi+","+xf+"]\n"+"Error: "+dc.format(eamax));
        System.out.println("La raíz es: " + dc.format(r));
        System.out.println("Sustitución en la función: " + dc.format(f(r)));
    }
}
