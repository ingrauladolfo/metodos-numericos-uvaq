package método_maya;

public class Método_Maya 
{
	public char [][] maya_fija;
	public char [][] maya_condicionada;
    public char usuario,letra;
    public int contador,posición;
	public char[][] aleatorio;
	public char []conjuntos;
	public Método_Maya()
	{
		conjuntos = new char[] {'a','b','c','d','e','f','g','h','i','j'};
		aleatorio = new char[8][5];
		maya_fija = new char[8][5];
		maya_condicionada = new char[8][5];
	}
	
	public void inicializarMatrizfija()
	{
		posición = 1;
		for(int i = 0;i < maya_fija.length;i++)
		{
			for(int j = 0;j < maya_fija.length;j++)
			{
				maya_fija[i][j] = Integer.toString(posición).charAt(0);
				aleatorio[i][j] = maya_fija[(int) (Math.random()*8)][(int) (Math.random()*5)];
				posición++;
			}
		}
	}
	public void imprimirMatrizfija()
	{
		for(int i = 0;i < maya_fija.length;i++)
		{
			for(int j = 0;j < maya_fija.length;j++)
			{
				if(j < maya_fija.length -1)
				{
					System.out.print(" " + maya_fija[i][j] + " |");
				}
                    
     
                    
                    else
                            
                            System.out.print(" " + tablero[i][j] + " ");
                                                            
            }
            
            if(i<2)
                    
                    System.out.println("\n-----------");                                                                    
    }
	}
	
	public static void main(String[] args)
	{
		
	}

}
