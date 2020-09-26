package métodoNewton;
import javax.swing.*;
import java.math.*;
import java.math.*;
public class MétodoNewtonSinPedirError
{
	public static double función,funcióny,x,derivada,derivaday,tempo,error,y,tempo2,error2;
	public static int i = 0;
	public static double funciónDada(double x)
	{
		función = (2*Math.pow(x, 2))+(9*x);
		return función;
	}
	public static double derivadafunciónDada(double x)
	{
		derivada = (4*x)+9;
		return derivada;
	}
	
	public static double funciónDadaenY(double y)
	{
		funcióny = (2*Math.pow(y, 2))+(9*y);
		return funcióny;
	}
	public static double derivadafunciónDadaenY(double y)
	{
		derivaday = (4*y)+9;
		return derivaday;
	}
	
	public static void main(String[] args)
	{
		x = Double.parseDouble(JOptionPane.showInputDialog("Dame de favor el valor de x:\n"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Dame de favor el valor de y:\n"));
		System.out.println("["+x+","+y+"]");
		while((x != tempo && (i >= 0 && i < 100))&&(y != tempo && (i >= 0 && i < 50)&&(error <= 0.00010 && error2 <= 0.00010)))
		{
			tempo = x;
			x = (x - funciónDada(x))/(derivadafunciónDada(x));
			error = Math.abs((x-tempo)/(x));
			System.out.println("La iteración "+i+" es de "+x+" y el error en x es de: "+error);
			y = (y - funciónDadaenY(y))/(derivadafunciónDadaenY(y));
			error2 = Math.abs((y-tempo)/(y));
			System.out.println("La iteración "+i+" en y es de "+y+" y el error en y es de: "+error2);
			i++;
		}
		if(i == x)
		{
			System.out.println("\n No converge");
		}
		else
		{
			System.out.println("Solución de x: "+x);
		}
		if(i == y)
		{
			System.out.println("\n No converge");
		}
		else
		{
			System.out.println("Solución de y: "+y);
		}
	}
}
