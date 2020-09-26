package métodoMüllerHoner;

import javax.swing.JOptionPane;

public class MulleryHonner
{
	public static double x4 = 0,x3 = 1,x2 = 0,x1 = -2,x0 = -5, x00 = 1,a,b0,y3,y2,y1,y0,y00,ec=0,o=0,x,r=0,ori=0, tol = 0;
	public static int n = 1;
	public static void main(String[] args)
	{
		System.out.println("x5 + "+x4+"x4 + "+x3+"x3 + "+x2+"x2 + "+x1+"x1 + "+x0+" + "+x00);
		a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su raíz:\n"));
		y3=x4;           System.out.println("x3: "+y3);
		y2=x4*a+x3;      System.out.println("x2: "+y2);
		y1=(y2*a)+x2;    System.out.println("x1: "+y1);
		y0=(y1*a)+x1;    System.out.println("lineal: "+y0);
		b0=(y0*a)+x0;    System.out.println("B0: "+b0);
		y00=(b0*a)+x00;  System.out.println("y00: "+y00);
		System.out.println(y3+"x3 "+y2+"x2 +"+y1+"x "+y0+" +"+b0);
		System.out.println("El valor de x inicial es: "+a);
		x=(double) (a-((Math.pow(a,5)-Math.pow(a,4)+x2*Math.pow(a,3)+x1*Math.pow(a,2)+x0*a+x00)/(Math.pow(a,4)+Math.pow(a,3)+y1*Math.pow(a,2)+y0*a+b0)));
		while(n <= 100)
		{
			x=(double) (x-((Math.pow(x,5)-Math.pow(x,4)+x2*Math.pow(x,3)+x1*Math.pow(x,2)+x0*x+x00)/(Math.pow(x,4)+Math.pow(x,3)+y1*Math.pow(x,2)+y0*x+b0)));
			System.out.println(n+". "+x);
			n++;
			if(n%2!=0)
			{
				o=x;
			}
			else if(n%2==0)
			{
				r=x;
				ec=o-x;
				System.out.println("Resultado de suma: "+ec);
			}
			if(ec<=0.01&&ec>-.01) 
			{
				System.out.println("El número de veces que lo hizo fue: "+n);
				ori= (Math.pow(x,5)-Math.pow(x,4)+x2*Math.pow(x,3)+x1*Math.pow(x,2)+x0*x+x00);
				System.out.println("Sustitución de x en original: "+ori);
				System.out.print("La raíz es: " + x+" y la sustitución de x en la original es: "+ori);
				n = 990;
			}
		}
	}
}

