
package métodoNewton;

import java.text.DecimalFormat;
import javax.swing.*;
import java.math.*;
public class NewtonPidiendoError
{
	public static DecimalFormat dc;	
	public static double xi,yi,eamax,r,xr,yr,ea,ea2,funciónx,funcióny,derivadax,derivaday,r2;
	public static int i;
	public static void main(String[] args)
	{
		xi = Double.parseDouble(JOptionPane.showInputDialog("Dame un número para x: "));
		yi = Double.parseDouble(JOptionPane.showInputDialog("Dame un número para y: "));
		eamax = Double.parseDouble(JOptionPane.showInputDialog("Dame un número para el error: "));
		System.out.println("["+xi+","+yi+"]");
		dc = new DecimalFormat("#0.000000");
		r = newtonRaphson(xi,eamax,yi);
		System.out.println("La raíz es: " + dc.format(r));
		System.out.println("Sustitución en la función: " + f(r));
	}
	public static double newtonRaphson(double xi,double eamax, double yi)
	{
		xr = Math.abs(xi-((f(xi))/(dfx(xi))));
		yr = Math.abs(yi-((f(yi))/(dfy(yi))));
		i = -1;
		while(true || false)
		{
	    		i++;
	    		ea = Math.abs((xr - xi) / (xr));
	    		if (ea < eamax) 
	    		{
	    			System.out.println("Iteraciones: " + i);
	    			return xr + yr;
	        }
	    		xi=xr;
	    		xr = (xi - (f(xi) / dfx(xi)));
	    		System.out.println("La iteración ("+i+")" + " en x es: "+xr+", y el valor de x de la sustitución en la función es: "+ea);
	    		ea = Math.abs((yr - yi) / (yr));
	    		yi = yr;
	    		yr = (yi - (fy(yi) / dfy(yi)));
	    		System.out.println("La iteración ("+i+")" + " en y es: "+yr+", y el valor de y de la sustitución en la función es: "+ea);
		}
	}
	public static double f(double x)
	{
		funciónx = Math.sin(x)-(Math.exp(-x));
		return funciónx;
	}
	public static double fy(double y)
	{
		funcióny = Math.sin(y)-(Math.exp(-y));
		return funcióny;
	}
	public static double dfx(double x)
	{
		derivadax = Math.cos(x)+(Math.exp(-x));
		return derivadax;
	}
	public static double dfy(double y)
	{
		derivaday = Math.cos(y)+(Math.exp(-y));
		return derivaday;
	}
}