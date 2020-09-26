package métodosecante;
import javax.swing.*;
import java.math.*;
import java.text.*;
public class MétodoSecantePidiendoError 
{
	public static double x1,x2,eamax,r,xr,xrv,ea,function;
	public static int i = -1;
	public static DecimalFormat dc;
	public static void main(String[] args)
	{
		x1 = Double.parseDouble(JOptionPane.showInputDialog("Dame el primer parámetro:\n"));
		x2 = Double.parseDouble(JOptionPane.showInputDialog("Dame el segundo parámetro:\n"));
		eamax = Double.parseDouble(JOptionPane.showInputDialog("Dame la exactitud:\n"));
		System.out.println("["+x1+","+x2+"]");
		dc = new DecimalFormat("0.0000");
		r = secante(x1, x2, eamax);
		System.out.println("La raíz es: " + dc.format(r));
		System.out.println("Sustitución en la función: " + dc.format(f(r)));
	}
	public static double secante(double x1, double x2, double eamax)
	{
		 xr = (x2 - (((x1 - x2) / (f(x1) - f(x2))) * f(x2)));
		 while(true)
		 {
			 i++;
			 x1 = x2;
			 x2 = xr;
			 xrv = xr;
			 xr = (x2-((x1-x2)/(f(x1)-f(x2)))*f(x2));
			 ea = Math.abs((xr-xrv)/(xr));
			 if(ea < eamax)
			 {
				 System.out.println("El número de veces que se hace la operación es: "+i);
				 return xr;
			 }
			 System.out.println("La "+i+" vez que se corre "+ "la raíz es: "+xr+" y el valor de " +xr + " evaluado en la función es de: "+ea);
		 }
	}
	public static double f(double x)
	{
		function = Math.pow(x,3)+(4*x)-4;
		return function;
	}
}
