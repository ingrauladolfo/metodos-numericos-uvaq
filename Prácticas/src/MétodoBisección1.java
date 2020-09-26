import javax.swing.JOptionPane;
import java.lang.Math;
public class MétodoBisección1 
{
	public static double x,a,x1,b,ecuación, ecuación1, ecuación2, rx,rx1,multiplicación,evaluar,r,r1;
	public static int intento;
	public static String nombre, fija;
	public static void main(String[] args)
	{
		fija = " f(x) = x^2 + x - 12";
		nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?: ");
		System.out.println("Bienvenido(a) " + nombre +" : " +" en esta ocasión sacarás las raíces de la siguiente ecuación: "+ fija);

		a = Double.parseDouble(JOptionPane.showInputDialog("Dame el primer parámetro: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Dame el segundo parámetro: "));
		
		x = a;
		ecuación = Math.pow(x,2) +(x) - 12;
		rx = ecuación;
		System.out.println(rx);
			
		x1 = b;
		ecuación1 = Math.pow(x1, 2)+(x1)-12;
		rx1 = ecuación1;
		System.out.println(rx1);
			
		multiplicación = rx*rx1;
		while(multiplicación <= 0)
		{
			if(multiplicación <= 0)
			{
				evaluar = (x+x1)/(2);
				r = evaluar;
				ecuación2 = Math.pow(r, 2)+r-12;
				r1 = ecuación2;
				if(r1 == 0)
				{
					System.out.println(r1 + " es una raíz");
				}
				else
				{
					System.out.println(r1 + " no es una raíz");
				}
			}
			else
			{
				System.out.println("ERROR");
			}
			intento = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres intentar de nuevo?: 0 - no, 1- sí" + intento));
			break;
		}
		switch(intento)
		{
			case 0:
				System.out.println("Gracias");
				break;
			case 1:
				a = Double.parseDouble(JOptionPane.showInputDialog("Dame el primer parámetro: "));
				b = Double.parseDouble(JOptionPane.showInputDialog("Dame el segundo parámetro: "));
				
				x = a;
				ecuación = Math.pow(x,2) +(x) - 12;
				rx = ecuación;
				System.out.println(rx);
					
				x1 = b;
				ecuación1 = Math.pow(x1, 2)+(x1)-12;
				rx1 = ecuación1;
				System.out.println(rx1);
					
				multiplicación = rx*rx1;
				while(multiplicación <= 0)
				{
					if(multiplicación <= 0)
					{
						evaluar = (x+x1)/(2);
						r = evaluar;
						ecuación2 = Math.pow(r, 2)+r-12;
						r1 = ecuación2;
						if(r1 == 0)
						{
							System.out.println(r1 + " es una raíz");
						}
						else
						{
							System.out.println(r1 + " no es una raíz");
						}
					}
					else
					{
						System.out.println("ERROR");
					}
					intento = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres intentar de nuevo?: 0 - no, 1- sí" + intento));
					break;
				}
		}
	}
}
