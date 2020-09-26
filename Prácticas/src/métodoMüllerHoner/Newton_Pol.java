package métodoMüllerHoner;

public class Newton_Pol 
{
	public static double p,tolerancia,a[],f = 1,d;
	Newton_Pol(double []a1, double xo_1, double tolerancia_1)
	{
		p = xo_1;
		a = a1;
		tolerancia = tolerancia_1;
	}
	public double resuelveNewtonPol()
	{
		Horner horner = new Horner (a);
		while(f > tolerancia)
		{
			horner.evalua(p);
			f = horner.val();
			d = horner.der();
			p = p -(f/d);
			System.out.println(p);
		}
		return p;
	}
}
