package puntofijo;

import javax.swing.JOptionPane;

public class MainPuntoFijoO1
{
	public static double raíz,xi,tole;
	public static int error;
	public static void main(String[] args) 
	{
		xi = Double.parseDouble(JOptionPane.showInputDialog("Dame un número: "));
		tole = Double.parseDouble(JOptionPane.showInputDialog("Dame un número: "));
		error = Integer.parseInt(JOptionPane.showInputDialog("Dame un número: "));
		PuntoFijoO1 c = new PuntoFijoO1(xi,tole,error);
		double raiz = c.calcularRaiz();
		System.out.println("La raíz es: "+raiz);
	}

}