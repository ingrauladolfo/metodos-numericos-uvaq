package interpolación_Lagrange;
import java.util.Scanner;
public class Lagrange 
{
	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		int piv1 = 0;
		int var = 0;
		int piv = 0;
		float matriz[][];
		System.out.println("Metodo de Interpolacion Lagrange");
		System.out.println();
		System.out.println("Numero de Valores: ");
		int va = leer.nextInt();
		System.out.println();
		
		double ax[] = new double[va];
		double ay[] = new double[va];
		double ax2[] = new double[va];
		double xv[] = new double [va];
		
		double ty = 0;
		double t2y = 0;
		double t3y = 0; 
		double r = 0;
		double h = 0;
		for(int i=0; i<ax.length; i++)
		{
			System.out.println("Valor X("+i+")"+": ");
			double x = leer.nextDouble();
			ax[i] = x;
			
			System.out.println("Valor Y("+i+")"+": ");
			double y = leer.nextDouble();
			ay[i] = y;
        }
		System.out.println();
		System.out.println("Valor X a calcular: ");
		float vy = leer.nextFloat();
		System.out.println();
		
		System.out.println();
		System.out.println();
		System.out.println("Valores X: " );
		for(int i = 0; i<ax.length; i++)
		{
			System.out.println("Valor X: "+ax[i]);
        }
		
		System.out.println();
		System.out.println();
		System.out.println("Valores Y: ");
		for(int i = 0; i<ax.length; i++)
		{
			System.out.println("Valor Y: "+ay[i]);
        }
		System.out.println();
		System.out.println();
		System.out.println("Valor Y: "+r);
	}
	static void muestramatriz(float matriz[][], int var)
	{
		int in = 0;
		if(in%2!=0)
		{
			
		}
		for(int x=0; x < var; x++)
		{
			for(int y = 0; y < (var + 1); y++)
			{
				
			}
		}
	}
	static void pivote(float matriz[][], int piv, int var)
	{
		float temp = 0;
		temp = matriz[piv][piv];
		for(int y = 0; y < (var+1); y++)
		{
			matriz[piv][y] = (matriz[piv][y])/(matriz[piv][var]);
        }
	}
	static void hacerceros(float matriz[][], int piv, int var)
	{
		for(int x = 0; x < var; x++)
		{
			if(x!= piv)
			{
				float c = matriz[x][piv];
				for(int z = 0; z<(var+1); z++)
				{
					matriz[x][z] = ((-1*c))*(matriz[x][var]);
				}
			}
		}
	}
}
