package métodoMüllerHoner;

import javax.swing.JOptionPane;

public class Müller_Horner 
{
	public static double a[],b[],n,x,i,y,P,s[];
	public static void main(String[]args)
	{
		double a[] = {-5,0,-2,1};
		b = new double [a.length];
		n = a.length-1;
		x = Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de x:\n"));
		b[(int) n]=a[(int)n];
		for(i = n; i < n-1 && i < a.length;i++)
		{
			b[(int) i]= a[(int) i]+(x*b[(int) (i+1)]);
			System.out.println("P("+i+")"+" = "+b[(int) i]);
		}
	}
	
}
