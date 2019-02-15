package ordenamientos;


public class Seleccion 
{

	public void sort() 
	{
		int[] arreglo = { 30, 15, 25, 5, 20, 10 };

		for (int index = 0; index < arreglo.length; index++) 
		{
			int menor = index;
			for (int j = index + 1; j < arreglo.length; j++) 
			{
				if (arreglo[j] < arreglo[menor]) 
				{
					menor = j;
				}
			}
			if (index != menor) 
			{
				int aux = arreglo[index];
				arreglo[index] = arreglo[menor];
				arreglo[menor] = aux;
			}
		}
		for (int i = 0; i < arreglo.length; i++)
			System.out.print(arreglo[i] + " ");
	}
	
	public static void main(String[] arg){
		new Seleccion().sort();
	}
	
}
