import javax.swing.JOptionPane;

public class Imprimir_pares 
{
	public static int n = 2, límite;
	public static void main(String[] args) 
	{
		while (límite <= límite)
		{
			try
			{
				límite = Integer.parseInt(JOptionPane.showInputDialog("Dame un límite: "));
				while((n <= límite))
				{
					if (n % 2 == 0)
					{
						System.out.println(n);
					}
					n++;
				}
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Intenta de nuevo");
			}
		}	
	}
}
