package bisección;

import javax.swing.JOptionPane;

public class MainBisecciónPidiendoIteraciones implements BisecciónPidiendoIteraciones
{
	public static double a,b,error,resultado,c,fa,fb,fc;
	public static int iteraciones,iteración;
	public static void main(String[] args) 
	{
		MainBisecciónPidiendoIteraciones.pedirDatos();
		MainBisecciónPidiendoIteraciones  biseccion = new MainBisecciónPidiendoIteraciones ();
		biseccion.setIntervalo(a,b);
		biseccion.setIteraciones(iteraciones);
		biseccion.setError(error);
		biseccion.solucion();
	}
	public static void pedirDatos()
	{
		a = Double.parseDouble(JOptionPane.showInputDialog("Dame el primer parámetro: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Dame el segundo parámetro: "));
		error = Double.parseDouble(JOptionPane.showInputDialog("Dame el márgen de error: "));
		iteraciones = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de iteraciones: "));
	}
	public double funcion(double x) 
	{
		resultado = (x)-(Math.pow(2,-x));
		return resultado;
	}
	public void solucion() 
	{
		System.out.println("Intervalo : [" + a + ", " + b + "]");
		System.out.println("Error : " + error);
		System.out.println("Iteraciones : " + iteraciones);
		System.out.println("------------------------------------------------ \n");
		c = 0;
		fa = 0;
		fb = 0;
		fc = 0;
		iteración = 0;
		do 
		{
			c = (a + b) / 2;
			System.out.println("Iter (" + iteración + ") : " + c);
			fa = funcion(a);
			fb = funcion(b);
			fc = funcion(c);
			if (fc * fa < 0) 
			{
				b = c;
	            fa = funcion(a);
	            fb = funcion(b);
	            c = (a + b) / 2;
	            fc = funcion(c);
	         } 
			else 
			{
				a = c;
	            fa = funcion(a);
	            fb = funcion(b);
	            c = (a + b) / 2;
	            fc = funcion(c);
	         }
	         iteración++;
	         
		} 
		while (iteración <= iteraciones && Math.abs(fc) >= error);
	 
	   }
	public void setIntervalo(double a, double b) 
	{
		this.a = a;
		this.b = b;
	}
	public void setIteraciones(int iteraciones) 
	{
		this.iteraciones = iteraciones;	
	}
	public void setError(double error) 
	{
		this.error = error;
	}
}
