package ordenamientos;


public class Insercion 
{
	
	public void sort() 
	{
		int[] arreglo = { 30, 25, 20, 15, 10, 5 };
		int numero=0;
		int index=0;
		
		for(int i=0; i<arreglo.length; i++)
		{
			numero = arreglo[i];
			index = i - 1;
			
			while(index >= 0 && arreglo[index] > numero)
			{
				arreglo[index + 1] = arreglo[index];
				index--;
			}
			arreglo[index + 1]=numero;
		}
		
		for (int i = 0; i < arreglo.length; i++)
			System.out.print(arreglo[i] + " ");
	}


	public static void main(String[] arg) {
		new Insercion().sort();
	}
}
