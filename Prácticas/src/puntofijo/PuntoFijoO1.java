package puntofijo;

import java.math.*;

class PuntoFijoO1
{
	public static double p0, tol,r,x,p = p0;
	public static int ni,i = 1;
	public PuntoFijoO1(double xi, double tole, int error)
	{
		p0 = xi; tol = tole; ni = error;
	}
	private double f(double x)
	{
		r = x-((5/Math.pow(x, 2))+2);
	  	return r;
	}
	public double calcularRaiz()
	{
		while(i<=ni)
		{
			p = f(p0);
		    if(Math.abs(p0-p)<tol)
		    {
		    		return p;
		    }
		    i += 1;
		    p0 = p;
		    System.out.println("La iteración "+ i+ " es: "+ p0);
		}
		return p;
	}	
}