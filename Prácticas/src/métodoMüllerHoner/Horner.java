package métodoMüllerHoner;

public class Horner 
{
	public static int n;
	public static double a[],y,z,xo;
	Horner(double a1[])
	{
		n = a1.length;
		a = a1;
	}
	public double val()
	{
		return y;
	}
	public double der()
	{
		return z;
	}
	public static void evalua(double xo)
	{
		y = a[n-1];
		z = a[n-1];
		for(int i = n-1;i >= 0;i--)
		{
			y = (xo * y) + (a[i]);
			z = (xo * z) + y;
			System.out.println(z);
		}
		y = (xo * y) + a[0];
	}
}
