package busquedas;


public class Binaria 
{
	public void search(int numero){
		int[] arreglo = {5, 10, 15, 20, 25, 30};
		
		int iInicial = 0;
		int iFinal = 0;
		int iMedio = 0;
		
		iFinal = (arreglo.length-1);
		for(int i=0; i<arreglo.length; i++)
		{
			iMedio = (iInicial + iFinal)/2;
			if(numero == arreglo[iMedio])
			{
				System.out.println("yes");
				return;
			}
			else if(numero > arreglo[iMedio])
			{
				iInicial = iMedio+1;
			}
			else if(numero < arreglo[iMedio])
			{
				iFinal = iMedio-1;
			}
		}
		System.out.println("no");
	}

	
	public static void main(String[] arg) 
	{
		new Binaria().search(15);
	}

}
