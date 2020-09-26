package métodoMüllerHoner;

import javax.swing.JOptionPane;

public class HornerMain
{
	public static double x, exactitud;
	public static void main(String[] args)
	{
		double pol[] = new double [4];
		pol[0] = -5;
		pol[1] = 0;
		pol[2] = -2;
		pol[3] = 1;
		
		x = Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de x:\n"));
		exactitud = Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de la exactitud:\n"));
		Newton_Pol horner = new Newton_Pol(pol,x,exactitud);
		System.out.println("La raíz es: "+horner.resuelveNewtonPol());
	
	}
	
}
