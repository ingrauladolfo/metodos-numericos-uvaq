package puntofijo;

import javax.swing.JOptionPane;
import java.math.*;

public class PuntoFijoO3 
{
	public static double x, y, función,función_dos,función_alterna, función_alterna_dos;
	public static int iteraciones;
	public static double f(double x)
	{
		función = (5/(Math.pow(x, 2)))+2;
		return función;
	}
	/*public static double f2(double y)
	{
		función_dos = ((2-Math.exp(y)+Math.pow(y, 2))/(3));
		return función_dos;
	}*/
	public static double g(double x)
	{
		función_alterna = x-((5/(Math.pow(x, 2)))+2);
		return función_alterna;
	}
	/*public static double g2(double y)
	{
		función_alterna_dos = y-((2-Math.exp(y))/(3));;
		return función_alterna_dos;
	}*/
	public static void main(String[] args) 
	{
		iteraciones = 0;
		x = Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de x:\n"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de y:\n"));
		System.out.println("["+x+","+y+"]");
		
		while(Math.abs(f(x)) >= 0.00010 && iteraciones <= 5)
		{
			x = PuntoFijoO3.g(x);
			System.out.println("En la iteración "+ iteraciones + ", la raíz estimada es: "+ x);
			y = PuntoFijoO3.g(y);
			System.out.println("En la iteración "+ iteraciones + ", la raíz estimada en y es: "+ y);
			iteraciones++;
			
		}
		System.out.println("El número de iteraciones para x fueron: "+iteraciones);
		System.out.println("El número de iteraciones para y fueron: "+iteraciones);
	}

}
