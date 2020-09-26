package puntofijo;

import javax.swing.JOptionPane;
import java.math.*;

public class PuntoFijoO2
{
	public static double número,función,x,vx,vgx,error,vxc,vgxc,fvgx;
	public static double r (double número)
	{
		función = x-((5/Math.pow(x, 2))+2);
		return función;
	}
	public static void main(String[]args)
	{
		vx = 0;
		vgx = 0;
		error = 0;
		vxc = 0;
		vgxc = 0;
		
		System.out.println("["+"x"+"]"+" "+"["+"g(x)"+"]"+" "+"["+"%error"+"]");
		
		x = Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de x:\n"));
		do
		{
			vgxc = (vgxc-vgxc) + vgx;
			if(vgxc == 0)
			{
				vx = (vx-vx) +x;
			}
			else
			{
				vx = (vx-vx) + vgx;
			}
			fvgx = (x*(x+3))+1;
			fvgx = PuntoFijoO2.r(fvgx);
			vgx = ((vgx-vgx)+fvgx);
			if(vgxc == 0)
			{
				error = (error - error) + 0;
			}
			else
			{
				error = ((vgx - vgxc)/vgxc)*100;
				error = PuntoFijoO2.r(error);
			}
			System.out.println("["+vx+"]"+" "+"["+vgx+"]"+" "+"["+error+"]");
		} while(vgx != vgxc);
		System.out.println("La raíz es igual a: "+ vgx);
	}
}