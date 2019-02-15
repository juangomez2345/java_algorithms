package busquedas;


public class Lineal 
{

	public void search(int numero) 
	{
		int[] arreglo = {5, 10, 15, 20, 25, 30};
		
		for (int index = 0; index <= (arreglo.length - 1); index++)
		{
			if (arreglo[index] == numero) 
			{
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");
	}
	
	
	public static void main(String[] args) 
	{
		new Lineal().search(25);
	}

}
